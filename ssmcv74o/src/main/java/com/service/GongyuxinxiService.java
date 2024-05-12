package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyuxinxiView;


/**
 * 公寓信息
 *
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
public interface GongyuxinxiService extends IService<GongyuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyuxinxiVO> selectListVO(Wrapper<GongyuxinxiEntity> wrapper);
   	
   	GongyuxinxiVO selectVO(@Param("ew") Wrapper<GongyuxinxiEntity> wrapper);
   	
   	List<GongyuxinxiView> selectListView(Wrapper<GongyuxinxiEntity> wrapper);
   	
   	GongyuxinxiView selectView(@Param("ew") Wrapper<GongyuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyuxinxiEntity> wrapper);
   	

}

