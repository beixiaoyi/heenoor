package com.hshc.ldg.heenoor.study.util;

/**
 * @Description: 异常返回信息页面
 * @Author : yong.cheng
 * @Date : 2018/8/30 17:29
 */
public class ErrorPageUtil {

    private ErrorPageUtil() {}

    /**
     *显示错误信息
     * @param msg 错误信息
     * @param callBackUrl 返回链接地址
     * @return
     */
    public static String showErrorTips(String msg,String callBackUrl){
        StringBuilder html = new StringBuilder();

        html.append("<div style=\"width: 820px; padding-right: 15px; padding-left: 15px;\n" +
                "margin-right: auto; margin-left: auto;> <div style=\"margin-bottom: 20px; " +
                "background-color: #fff; border: 1px solid transparent; border-radius: 4px;" +
                "border-color: #ddd;> <div style=\"text-align: center;\"><div style=\"margin-top: 20px;" +
                "margin-bottom: 20px;\">" );

        html.append(msg);

        html.append("</div><div style=\"margin-top: 20px; margin-bottom: 20px;\">" +
                "<a style=\"text-decoration: none; color: #fff;\n" +
                "background-color: #337ab7; border-color: #2e6da4; display: inline-block;\n" +
                "padding: 6px 12px; font-size: 14px; font-weight: 400; line-height: 1.42857143;\n" +
                "text-align: center; white-space: nowrap; vertical-align: middle; user-select: none;\n" +
                "background-image: none; border: 1px solid transparent; border-radius: 4px;\" href=\"");

        html.append(callBackUrl);
        html.append("\">返回</a></div></div></div></div>");

        return html.toString();
    }

}
