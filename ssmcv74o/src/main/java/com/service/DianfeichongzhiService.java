package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianfeichongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianfeichongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianfeichongzhiView;


/**
 * 电费充值
 *
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
public interface DianfeichongzhiService extends IService<DianfeichongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianfeichongzhiVO> selectListVO(Wrapper<DianfeichongzhiEntity> wrapper);
   	
   	DianfeichongzhiVO selectVO(@Param("ew") Wrapper<DianfeichongzhiEntity> wrapper);
   	
   	List<DianfeichongzhiView> selectListView(Wrapper<DianfeichongzhiEntity> wrapper);
   	
   	DianfeichongzhiView selectView(@Param("ew") Wrapper<DianfeichongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianfeichongzhiEntity> wrapper);
   	

}

