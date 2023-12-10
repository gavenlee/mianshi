package com.example.demo.zgsj.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.zgsj.entity.ZgsjEntity;
import com.example.demo.zgsj.entity.ZgsjEntityDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 测试表
 *
 * @author gavenlee
 * @email
 * @date 2023-12-08 08:28:18
 */
@Mapper
public interface ZgsjMapper extends BaseMapper<ZgsjEntity> {

    int getuserNum(@Param("params") Map<String,Object> params);
    List<ZgsjEntity> selectPageVo(@Param("params") Map<String,Object> age);

    List<ZgsjEntityDo> selectForExport();


}
