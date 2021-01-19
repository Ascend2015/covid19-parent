package cn.tju.xiaoyin.system.vo;

import lombok.Data;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-07 00:37
 */
@Data
public class UserVo {

    private String username;

    private String nickname;

    private String email;

    private Integer sex;

    private Long departmentId;
}
