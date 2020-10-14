package com.momo.finance.Util;



/*
 * @Author jiaqili
 * @Date 2020/4/22 11:30
 * @Param
 * @return
 * @Description
 **/
public class ResultTool {
    public static JsonResult success() {
        return new JsonResult(true);
    }

    public static <T> JsonResult<T> success(T data) {
        return new JsonResult<T>(true, data);
    }

    public static JsonResult fail() {
        return new JsonResult(false);
    }
    public static JsonResult fail(ResultCode resultEnum) {
        return new JsonResult(false, resultEnum);
    }


}
