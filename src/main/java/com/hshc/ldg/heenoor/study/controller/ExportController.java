package com.hshc.ldg.heenoor.study.controller;

import com.hshc.hshccommons.plugins.excel.ExcelFactory;
import com.hshc.hshccommons.plugins.excel.commons.enums.ExcelEnum;
import com.hshc.hshccommons.plugins.excel.export.Exporter;
import com.hshc.ldg.heenoor.study.baseEnums.ListUtil;
import com.hshc.ldg.heenoor.study.model.LoginModel;
import com.hshc.ldg.heenoor.study.service.JdbcService;
import com.hshc.ldg.heenoor.study.util.ErrorPageUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 导出excel
 * @Author: lidongge
 * @Date: 2019/3/12 14:53
 */
@Slf4j
@Controller
@RequestMapping("/export")
public class ExportController {

    @Value("${server.context-path}")
    private String contextPath;

    @Autowired
    private JdbcService jdbcService;

    @RequestMapping("/exportFile")
    public void doExport(HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        try {


            List<LoginModel> list = new ArrayList<>();
            LoginModel loginModel = new LoginModel();
            loginModel.setUserCode("ldg");
            loginModel.setUserName("理葵");
            list.add(loginModel);
            if (ListUtil.isEmpty(list)){
                list.add(new LoginModel());//传入一条空数据，用来生成表头
            }else if (list.size() > 2000){
                throw new RuntimeException("所导出数据超出限制，请分批导出");
            }

            List<String> columns = this.buildExportColumns();

            // 实例化导出组件并初始化
            Exporter exporter = ExcelFactory.initExporter(list, ExcelEnum.EXCEL_2007,columns);
            Workbook workbook = exporter.generalExport();

            response.setContentType("application/x-download");
            String fileName = "demo.xlsx";

            response.setHeader("Content-disposition", "attachment;filename="  + fileName);
            OutputStream os = response.getOutputStream();
            workbook.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            log.error("二手车信息批量导出异常", e);
            try {
                response.getWriter().print(
                        ErrorPageUtil.showErrorTips(e.getMessage(),
                                contextPath + "/car/index")
                );
            } catch (IOException e1) {
                log.error("二手车信息批量导出响应异常",e1);
            }
        }
    }

    /**
     * 构建导出字段
     * @param
     * @return
     */
    public List<String> buildExportColumns() {

        List<String> columnList = new ArrayList();
        columnList.add("userCode");
        columnList.add("userName");

        return columnList;
    }

}
