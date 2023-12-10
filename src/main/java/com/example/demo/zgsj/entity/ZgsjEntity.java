package com.example.demo.zgsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 测试表
 *
 * @author gavenlee
 * @email
 * @date 2023-12-08 08:28:18
 */
@Data
@ApiModel(value = "职工信息实体类", description = "用来存放职工信息")
@TableName("zgsj")
public class ZgsjEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 职工id
     */
    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    /**
     * 员工姓名
     */
    @ApiModelProperty("员工姓名")
    private String empName;
    /**
     * 性别：男；女
     */
    @ApiModelProperty("性别")
    private String sex;
    /**
     * 年龄
     */
    @ApiModelProperty("年龄")
    private String age;
    /**
     * 部门名称
     */
    @ApiModelProperty("部门名称")
    private String deptName;
    /**
     * 学历【大专、本科、研究生】
     */
    @ApiModelProperty("学历")
    private String empDegreeName;
}
