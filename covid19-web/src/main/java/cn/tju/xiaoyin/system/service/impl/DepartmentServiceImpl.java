package cn.tju.xiaoyin.system.service.impl;

import cn.tju.xiaoyin.system.entity.Department;
import cn.tju.xiaoyin.system.mapper.DepartmentMapper;
import cn.tju.xiaoyin.system.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoyin
 * @since 2021-01-06
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    @Override
    public List<Department> findDeptAndCount() {
        return this.baseMapper.findDeptAndCount();
    }
}
