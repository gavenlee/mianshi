package com.example.demo.zgsj.service.impl;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.zgsj.entity.ZgsjEntity;
import com.example.demo.zgsj.entity.ZgsjEntityDo;
import com.example.demo.zgsj.mapper.ZgsjMapper;
import com.example.demo.zgsj.service.ZgsjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Service("zgsjService")
public class ZgsjServiceImpl extends ServiceImpl<ZgsjMapper, ZgsjEntity> implements ZgsjService {

    @Autowired
    private ZgsjMapper zgsjMapper;

    @Override
    public Boolean ifCanLogin(Map<String, Object> params) {
        Boolean iflogin =false;
        int hasnum = zgsjMapper.getuserNum(params);
        if (hasnum>0){
            iflogin = true;
        }
        return iflogin;
    }

    /**
     * 列表
     */
    @Override
    public List<ZgsjEntity> queryPage(Map<String, Object> params) {
        return zgsjMapper.selectPageVo(params);
    }

    /**
	 * 数据列表
	 * @param params
	 * @return
	 */
    @Override
    public List<ZgsjEntity> list(Map<String, Object> params) {
        List<ZgsjEntity> entityList = zgsjMapper.selectList(null);
        return entityList;
    }

    /**
     * 信息
     * @return ZgsjEntity
     */
    @Override
    public ZgsjEntity getInfo(String id){
        return getById(id);
    }

    /**
     * 保存
     */
    @Override
    public void saveData(ZgsjEntity zgsj){
        save(zgsj);
    }

    /**
     * 修改
     */
    @Override
    public void updateData(ZgsjEntity zgsj){
        updateById(zgsj);
    }

    /**
     * 删除单条数据
     * @param id
     */
    @Override
    public void deleteOneData(String id){
        removeById(id);
    }

    /**
     * 删除
     */
    @Override
    public void deleteData(List<String> ids){
        removeByIds(ids);
    }



}
