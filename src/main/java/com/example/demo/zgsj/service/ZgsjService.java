package com.example.demo.zgsj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.zgsj.entity.ZgsjEntity;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 测试表
 *
 * @author gavenlee
 * @email
 * @date 2023-12-08 08:28:18
 */
public interface ZgsjService extends IService<ZgsjEntity> {

    /**
     * 是否能登陆
     */
    Boolean ifCanLogin(Map<String, Object> params);


    /**
     * 列表
     */
    List<ZgsjEntity>  queryPage(Map<String, Object> params);

    /**
	 * 数据列表
	 * @param params
	 * @return
	 */
    List<ZgsjEntity> list(Map<String, Object> params);

    /**
     * 信息
     * @return ZgsjEntity
     */
    ZgsjEntity getInfo(String id);

    /**
     * 保存
     */
    void saveData(ZgsjEntity zgsj);

    /**
     * 修改
     */
    void updateData(ZgsjEntity zgsj);

    /**
      * 删除单条数据
      * @param id
     */
    void deleteOneData(String id);

    /**
     * 删除
     */
    void deleteData(List<String> ids);

}

