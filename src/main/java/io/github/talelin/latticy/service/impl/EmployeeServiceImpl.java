package io.github.talelin.latticy.service.impl;

import io.github.talelin.latticy.mapper.EmployeeMapper;
import io.github.talelin.latticy.model.EmployeeDo;
import io.github.talelin.latticy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pedro@TaleLin
 * @author Juzi@TaleLin
 * 图书服务实现类
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDo> findAll() {
        return employeeMapper.selectList(null);
    }

}
