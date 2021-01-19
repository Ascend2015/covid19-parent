package cn.tju.xiaoyin.system.service;

import cn.tju.xiaoyin.system.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoyin
 * @since 2021-01-06
 */
public interface DepartmentService extends IService<Department> {
    public List<Department> findDeptAndCount();
}
