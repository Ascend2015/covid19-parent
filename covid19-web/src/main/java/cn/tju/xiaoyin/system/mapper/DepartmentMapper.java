package cn.tju.xiaoyin.system.mapper;

import cn.tju.xiaoyin.system.entity.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaoyin
 * @since 2021-01-06
 */
public interface DepartmentMapper extends BaseMapper<Department> {
    public List<Department> findDeptAndCount();
}
