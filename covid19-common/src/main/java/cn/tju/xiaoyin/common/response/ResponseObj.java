package cn.tju.xiaoyin.common.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-05 00:59
 */
@Data
public class ResponseObj {

    @ApiModelProperty(value = "是否成功")
    private boolean success;

    @ApiModelProperty(value = "是否成功")
    private Integer code;

    @ApiModelProperty(value = "是否成功")
    private String msg;

    @ApiModelProperty(value = "数据集")
    private Map<String, Object> data = new HashMap<>();

    private ResponseObj() {

    }

    public static ResponseObj ok() {
        ResponseObj responseObj = new ResponseObj();
        responseObj.setCode(ResponseCode.SUCCESS.getCode());
        responseObj.setMsg(ResponseCode.SUCCESS.getMsg());
        responseObj.setSuccess(true);
        return responseObj;
    }

    public static ResponseObj error() {
        ResponseObj responseObj = new ResponseObj();
        responseObj.setCode(ResponseCode.ERROR.getCode());
        responseObj.setMsg(ResponseCode.ERROR.getMsg());
        responseObj.setSuccess(false);
        return responseObj;
    }

    public ResponseObj success(boolean success) {
        this.setSuccess(success);
        return this;
    }

    public ResponseObj msg(String msg) {
        this.setMsg(msg);
        return this;
    }

    public ResponseObj code(Integer code) {
        this.setCode(code);
        return this;
    }

    public ResponseObj data(String key, Object val) {
        this.data.put(key, val);
        return this;
    }

    public ResponseObj data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

}
