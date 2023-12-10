package com.example.demo.zgsj.controller;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.zgsj.entity.ZgsjEntity;
import com.example.demo.zgsj.entity.ZgsjEntityDo;
import com.example.demo.zgsj.mapper.ZgsjMapper;
import com.example.demo.zgsj.service.ZgsjService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 测试表
 *
 * @author sx
 * @email
 * @date 2023-12-08 08:28:18
 */
@Api(value = "职工管理",tags = "职工管理")
@RestController
@RequestMapping("/api/zgsj")
public class ZgsjController {

    @Autowired
    private ZgsjService zgsjService;

    @Autowired
    private ZgsjMapper zgsjMapper;

    /**
     * 列表
     */
    @RequestMapping("/ifCanLogin")
    @ApiOperation(value = "登录检查",notes = "登录检查")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "username",value ="用户名",dataType ="String",required = true),
            @ApiImplicitParam(paramType = "query",name = "passward",value ="密码",dataType ="String",required = true)
    })
    @CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
    public Map<String,Object> ifCanLogin(@ApiIgnore @RequestParam Map<String, Object> params){
        Map<String,Object> map = new HashMap<>();
        Boolean page = zgsjService.ifCanLogin(params);
        map.put("code","20000");
        map.put("result",page.toString());
        map.put("message","success");
        return map;
    }


    /**
     * 列表
     */
    @RequestMapping("/page")
    @ApiOperation(value = "查询职工信息",notes = "传参对象包含{empName,deptName,empDegreeName}均可为空")
    @CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
    public Map<String,Object> page(@RequestParam Map<String, Object> params){
        Map<String,Object> map = new HashMap<>();
        List<ZgsjEntity> list = zgsjService.queryPage(params);
        map.put("code","20000");
        map.put("result",list);
        return map;
    }




    /**
     * 信息
     */
    @RequestMapping("/find/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",value ="id",dataType ="String",required = true),
    })
    @ApiOperation(value = "根据id查询职工详情",notes = "id为职工信息实体类 id")
    @CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
    public Map<String,Object> find(@PathVariable("id") String id){
        Map<String,Object> map = new HashMap<>();
		ZgsjEntity zgsj = zgsjService.getInfo(id);
        map.put("code","20000");
        map.put("result",zgsj);
        return map;
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @ApiOperation(value = "新增职工信息",notes = "传参对象为不包含id的 职工信息实体类 对象")
    @CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
    public Map<String,Object> save(@RequestBody ZgsjEntity zgsj){
        Map<String,Object> map = new HashMap<>();
		zgsjService.saveData(zgsj);
        map.put("code","20000");
        map.put("result","ok");
        return map;
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @ApiOperation(value = "更新职工信息",notes = "传参对象为包含id的 职工信息实体类 对象")
    @CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
    public Map<String,Object> update(@RequestBody ZgsjEntity zgsj){
        Map<String,Object> map = new HashMap<>();
        zgsjService.updateData(zgsj);
        map.put("code","20000");
        map.put("result","ok");
        return map;
    }


    /**
     * 删除单个
     */
    @RequestMapping("/delete/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",value ="id",dataType ="String",required = true)
    })
    @ApiOperation(value = "删除职工信息",notes = "id 为职工信息实体类 id")
    @CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
    public Map<String,Object> deleteOne(@PathVariable("id") String id){
        Map<String,Object> map = new HashMap<>();
        zgsjService.deleteOneData(id);
        map.put("code","20000");
        map.put("result","ok");
        return map;
    }


    @GetMapping("/export")
    @ApiOperation(value = "导出所有职工信息",notes = "直接开窗口跳转链接下载就行")
    @CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
    public String exportData(HttpServletResponse response){

        try {
            // 设置响应体内容
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");

            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String fileName = URLEncoder.encode("职员信息", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
            EasyExcel.write(response.getOutputStream()
                    , ZgsjEntityDo.class).sheet().doWrite(zgsjMapper.selectForExport());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "导入";
    }

}



