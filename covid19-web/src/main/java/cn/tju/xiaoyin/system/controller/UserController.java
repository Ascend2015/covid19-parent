package cn.tju.xiaoyin.system.controller;


import cn.tju.xiaoyin.common.exception.BusinessException;
import cn.tju.xiaoyin.common.response.ResponseCode;
import cn.tju.xiaoyin.common.response.ResponseObj;
import cn.tju.xiaoyin.system.entity.User;
import cn.tju.xiaoyin.system.service.UserService;
import cn.tju.xiaoyin.system.vo.UserVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author xiaoyin
 * @since 2021-01-05
 */
@RestController
@RequestMapping("/system/user")
@Api(value = "系统用户模块", tags = "系统用户接口")
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/findUserList")
    public ResponseObj findUserList(@RequestParam(defaultValue = "1")Integer current,@RequestParam(defaultValue = "7")Integer size){
        Page<User> page = new Page<>(current,size);
        Page<User> userPage = userService.page(page);
        List<User> records = userPage.getRecords();
        long total = userPage.getTotal();
        return ResponseObj.ok().data("total",total).data("records",records);
    }

    @PostMapping("/findUserPage")
    public ResponseObj findUserPage(@RequestParam(defaultValue = "1")Integer current,
                                    @RequestParam(defaultValue = "7")Integer size,
                                    @RequestBody UserVo userVo){
        Page<User> page = new Page<>(current,size);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (userVo!=null){
            if (!StringUtils.isEmpty(userVo.getDepartmentId())){
                queryWrapper.eq("department_id",userVo.getDepartmentId());
            }
            if (!StringUtils.isEmpty(userVo.getUsername())){
                queryWrapper.eq("username",userVo.getUsername());
            }
            if (!StringUtils.isEmpty(userVo.getEmail())){
                queryWrapper.eq("email",userVo.getEmail());
            }
            if (!StringUtils.isEmpty(userVo.getSex())){
                queryWrapper.eq("sex",userVo.getSex());
            }
            if (!StringUtils.isEmpty(userVo.getNickname())){
                queryWrapper.eq("nickname",userVo.getNickname());
            }
        }
        IPage<User> userPage = userService.findUserPage(page,queryWrapper);
        List<User> records = userPage.getRecords();
        long total = userPage.getTotal();
        return ResponseObj.ok().data("total",total).data("records",records);
    }

    @GetMapping("/findUsers")
    @ApiOperation(value = "查询所有的用户信息", notes = "查询所有的用户信息")
    public ResponseObj findUsers() {
        List<User> users = userService.list();
        return ResponseObj.ok().data("users", users);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询用户",notes = "根据id查询用户")
    public ResponseObj getUserById(@PathVariable("id") Long id){
        User user = userService.getById(id);
        if (user!=null){
            return ResponseObj.ok().data("user",user);
        }else {
            throw new BusinessException(ResponseCode.USER_NOT_FOUND_EXCEPTION.getCode(),ResponseCode.USER_NOT_FOUND_EXCEPTION.getMsg());
        }
    }

}

