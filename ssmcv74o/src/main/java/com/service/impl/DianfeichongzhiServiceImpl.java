package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DianfeichongzhiDao;
import com.entity.DianfeichongzhiEntity;
import com.service.DianfeichongzhiService;
import com.entity.vo.DianfeichongzhiVO;
import com.entity.view.DianfeichongzhiView;

@Service("dianfeichongzhiService")
public class DianfeichongzhiServiceImpl extends ServiceImpl<DianfeichongzhiDao, DianfeichongzhiEntity> implements DianfeichongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianfeichongzhiEntity> page = this.selectPage(
                new Query<DianfeichongzhiEntity>(params).getPage(),
                new EntityWrapper<DianfeichongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianfeichongzhiEntity> wrapper) {
		  Page<DianfeichongzhiView> page =new Query<DianfeichongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianfeichongzhiVO> selectListVO(Wrapper<DianfeichongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianfeichongzhiVO selectVO(Wrapper<DianfeichongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianfeichongzhiView> selectListView(Wrapper<DianfeichongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianfeichongzhiView selectView(Wrapper<DianfeichongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
