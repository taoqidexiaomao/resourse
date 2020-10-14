package com.momo.finance.Util;

/*
 * @Author jiaqili
 * @Date 2020/4/22 11:29
 * 规定:
 * #1表示成功
 * #1001～1999 区间表示参数错误
 * #2001～2999 区间表示用户错误
 * #3001～3999 区间表示接口异常
 **/
public enum ResultCode {
    /* 成功 */
    SUCCESS(200, "操作成功"),

    /* 默认失败 */
    COMMON_FAIL(400, "操作失败");
    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 根据code获取message
     *
     * @param code
     * @return
     */
    public static String getMessageByCode(Integer code) {
        for (com.momo.finance.Util.ResultCode ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }
}
