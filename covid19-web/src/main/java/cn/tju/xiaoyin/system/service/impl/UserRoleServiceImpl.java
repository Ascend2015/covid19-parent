package cn.tju.xiaoyin.system.service.impl;

import cn.tju.xiaoyin.system.entity.UserRole;
import cn.tju.xiaoyin.system.mapper.UserRoleMapper;
import cn.tju.xiaoyin.system.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author xiaoyin
 * @since 2021-01-05
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
