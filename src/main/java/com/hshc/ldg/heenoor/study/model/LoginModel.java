package com.hshc.ldg.heenoor.study.model;

import com.hshc.hshccommons.plugins.excel.export.anno.ExportField;
import lombok.Data;

/**
 * @Description:
 * @Author: lidongge
 * @Date: 2019/8/28 15:06
 */
@Data
public class LoginModel {

    private String sysCode;

    private String loginIp;

    private String loginTime;

    @ExportField(name = "用户代码")
    private String userCode;

    @ExportField(name = "用户名称")
    private String userName;

    private String unitSys;

    private String flag;

    private String remark;

}
