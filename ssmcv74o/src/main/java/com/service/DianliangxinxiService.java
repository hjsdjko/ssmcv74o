package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianliangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianliangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianliangxinxiView;


/**
 * 电量信息
 *
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
public interface DianliangxinxiService extends IService<DianliangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianliangxinxiVO> selectListVO(Wrapper<DianliangxinxiEntity> wrapper);
   	
   	DianliangxinxiVO selectVO(@Param("ew") Wrapper<DianliangxinxiEntity> wrapper);
   	
   	List<DianliangxinxiView> selectListView(Wrapper<DianliangxinxiEntity> wrapper);
   	
   	DianliangxinxiView selectView(@Param("ew") Wrapper<DianliangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianliangxinxiEntity> wrapper);
   	

}

