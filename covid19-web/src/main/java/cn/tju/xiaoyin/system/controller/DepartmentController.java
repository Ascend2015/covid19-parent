package cn.tju.xiaoyin.system.controller;


import cn.tju.xiaoyin.common.exception.BusinessException;
import cn.tju.xiaoyin.common.response.ResponseCode;
import cn.tju.xiaoyin.common.response.ResponseObj;
import cn.tju.xiaoyin.system.entity.Department;
import cn.tju.xiaoyin.system.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xiaoyin
 * @since 2021-01-06
 */
@CrossOrigin
@RestController
@RequestMapping("/system/department")
@Api(value = "部门相关接口", tags = "部门相关业务")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/findDeptAndCount")
    @ApiOperation(value = "查询部门及其人数", notes = "查询各部门人数")
    public ResponseObj findDeptAndCount() {
        List<Department> departments = departmentService.findDeptAndCount();
        if (departments.size() > 0) {
            return ResponseObj.ok().data("departments", departments);
        } else {
            throw new BusinessException(ResponseCode.DEPT_NOT_FOUND_EXCEPTION.getCode(), ResponseCode.DEPT_NOT_FOUND_EXCEPTION.getMsg());
        }
    }

}

