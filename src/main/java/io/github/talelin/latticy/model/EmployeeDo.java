package io.github.talelin.latticy.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@TableName("employee")
public class EmployeeDo {
    @Id
    private Integer id;

    private String name;

    private String gender;

    private String birthday;

    private String contactInformation;

    private String education;

    private Integer idNumber;

    private String major;

    private String workExperience;

}
