package cn.tju.xiaoyin.system.mapper;

import cn.tju.xiaoyin.system.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author xiaoyin
 * @since 2021-01-05
 */
public interface UserMapper extends BaseMapper<User> {

    IPage<User> findUserPage(Page<User> page,@Param(Constants.WRAPPER) QueryWrapper<User> wrapper);

}
