package io.github.talelin.latticy.controller.v1;

import io.github.talelin.latticy.model.EmployeeDo;
import io.github.talelin.latticy.service.EmployeeService;
import io.github.talelin.latticy.vo.PageResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("all")
    @ResponseBody
    public PageResponseVO getAllEmployee() {
        List<EmployeeDo> employees =  employeeService.findAll();
        return new PageResponseVO<>(1, employees, 1, 1);

    }

}
