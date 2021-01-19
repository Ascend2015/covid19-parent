package cn.tju.xiaoyin.common.response;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-05 00:59
 */
public enum ResponseCode {

    SUCCESS(20000, "success"), ERROR(20001, "error"),

    /**
     * 3005:"密码不正确!"
     */
    PASS_NOT_CORRECT(3005,"密码不正确!请重新尝试!"),

    /**
     * 3006:"算数异常"
     */
    ARITHMETIC_EXCEPTION(3006,"算术异常"),

    /**
     * 3007:"用户不存在"
     */
    USER_NOT_FOUND_EXCEPTION(3007,"用户不存在"),

    DEPT_NOT_FOUND_EXCEPTION(3008,"未查询到部门信息"),

    /**
     * 3006:"尚未登录!"
     */
    NOT_LOGIN(3006,"尚未登录!"),

    /**
     * 2005:"没有找到这一条历史信息!有人侵入数据库强制删除了!"
     */
    INTRODUCTION_NOT_FOUND(2005,"没有找到这一条历史信息!有人侵入数据库强制删除了!"),

    /**
     * 404:没有找到对应的请求路径
     */
    PAGE_NOT_FOUND(404,"你要请求的页面好像暂时飘走了...要不试试请求其它页面?"),

    /**
     * 500:服务端异常
     */
    INTERNAL_SERVER_ERROR(500,"服务器冒烟了...要不等它降降温后再来访问?"),

    /**
     * 2001:未知异常
     */
    UNKNOW_SERVER_ERROR(2001,"未知异常,请联系管理员!");



    private Integer code;

    private String msg;

    ResponseCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
    }
