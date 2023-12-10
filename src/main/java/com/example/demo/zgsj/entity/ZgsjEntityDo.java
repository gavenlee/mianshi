package com.example.demo.zgsj.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@ExcelIgnoreUnannotated
public class ZgsjEntityDo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 职工id
     */
    @ColumnWidth(20)
    @ExcelIgnore
    private String id;
    /**
     * 员工姓名
     */
    @ColumnWidth(20)
    @ExcelProperty(value = {"员工姓名"}, index = 0)
    private String empName;
    /**
     * 性别：男；女
     */
    @ColumnWidth(20)
    @ExcelProperty(value = {"性别"}, index = 1)
    private String sex;
    /**
     * 年龄
     */
    @ColumnWidth(20)
    @ExcelProperty(value = {"年龄"}, index = 2)
    private String age;
    /**
     * 部门名称
     */
    @ColumnWidth(20)
    @ExcelProperty(value = {"部门名称"}, index = 3)
    private String deptName;
    /**
     * 学历【大专、本科、研究生】
     */
    @ColumnWidth(20)
    @ExcelProperty(value = {"学历"}, index = 4)
    private String empDegreeName;
}
