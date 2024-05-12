package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyuxuanzeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyuxuanzeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyuxuanzeView;


/**
 * 公寓选择
 *
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
public interface GongyuxuanzeService extends IService<GongyuxuanzeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyuxuanzeVO> selectListVO(Wrapper<GongyuxuanzeEntity> wrapper);
   	
   	GongyuxuanzeVO selectVO(@Param("ew") Wrapper<GongyuxuanzeEntity> wrapper);
   	
   	List<GongyuxuanzeView> selectListView(Wrapper<GongyuxuanzeEntity> wrapper);
   	
   	GongyuxuanzeView selectView(@Param("ew") Wrapper<GongyuxuanzeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyuxuanzeEntity> wrapper);
   	

}

