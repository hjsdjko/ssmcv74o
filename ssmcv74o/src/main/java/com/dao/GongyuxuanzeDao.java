package com.dao;

import com.entity.GongyuxuanzeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyuxuanzeVO;
import com.entity.view.GongyuxuanzeView;


/**
 * 公寓选择
 * 
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
public interface GongyuxuanzeDao extends BaseMapper<GongyuxuanzeEntity> {
	
	List<GongyuxuanzeVO> selectListVO(@Param("ew") Wrapper<GongyuxuanzeEntity> wrapper);
	
	GongyuxuanzeVO selectVO(@Param("ew") Wrapper<GongyuxuanzeEntity> wrapper);
	
	List<GongyuxuanzeView> selectListView(@Param("ew") Wrapper<GongyuxuanzeEntity> wrapper);

	List<GongyuxuanzeView> selectListView(Pagination page,@Param("ew") Wrapper<GongyuxuanzeEntity> wrapper);
	
	GongyuxuanzeView selectView(@Param("ew") Wrapper<GongyuxuanzeEntity> wrapper);
	

}
