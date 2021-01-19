package cn.tju.xiaoyin.system.service;

import cn.tju.xiaoyin.system.entity.Department;
import cn.tju.xiaoyin.system.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author xiaoyin
 * @since 2021-01-05
 */
public interface UserService extends IService<User> {

    IPage<User> findUserPage(Page<User> page, @Param(Constants.WRAPPER) QueryWrapper<User> wrapper);
}
