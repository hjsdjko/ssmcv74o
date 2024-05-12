package com.dao;

import com.entity.DianliangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianliangxinxiVO;
import com.entity.view.DianliangxinxiView;


/**
 * 电量信息
 * 
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
public interface DianliangxinxiDao extends BaseMapper<DianliangxinxiEntity> {
	
	List<DianliangxinxiVO> selectListVO(@Param("ew") Wrapper<DianliangxinxiEntity> wrapper);
	
	DianliangxinxiVO selectVO(@Param("ew") Wrapper<DianliangxinxiEntity> wrapper);
	
	List<DianliangxinxiView> selectListView(@Param("ew") Wrapper<DianliangxinxiEntity> wrapper);

	List<DianliangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DianliangxinxiEntity> wrapper);
	
	DianliangxinxiView selectView(@Param("ew") Wrapper<DianliangxinxiEntity> wrapper);
	

}
