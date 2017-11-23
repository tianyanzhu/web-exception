package com.july.tools;

import com.july.enums.AjaxStatus;

/**
 * Created by Administrator on 2017/11/23.
 * @author july
 */
public class JsonResult {

    AjaxStatus status;

    String resultstr;

    Object bean;

    public JsonResult(AjaxStatus status, String resultstr) {
        this.status = status;
        this.resultstr = resultstr;
    }

    JsonResult(AjaxStatus status) {
        this.status = status;
        this.resultstr = "";
    }

    JsonResult(AjaxStatus status, Object bean) {
        this.status = status;
        this.bean = bean;
    }
}
