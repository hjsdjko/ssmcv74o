package com.dao;

import com.entity.DianfeichongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianfeichongzhiVO;
import com.entity.view.DianfeichongzhiView;


/**
 * 电费充值
 * 
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
public interface DianfeichongzhiDao extends BaseMapper<DianfeichongzhiEntity> {
	
	List<DianfeichongzhiVO> selectListVO(@Param("ew") Wrapper<DianfeichongzhiEntity> wrapper);
	
	DianfeichongzhiVO selectVO(@Param("ew") Wrapper<DianfeichongzhiEntity> wrapper);
	
	List<DianfeichongzhiView> selectListView(@Param("ew") Wrapper<DianfeichongzhiEntity> wrapper);

	List<DianfeichongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<DianfeichongzhiEntity> wrapper);
	
	DianfeichongzhiView selectView(@Param("ew") Wrapper<DianfeichongzhiEntity> wrapper);
	

}
