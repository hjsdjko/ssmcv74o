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


import com.dao.GongyuxinxiDao;
import com.entity.GongyuxinxiEntity;
import com.service.GongyuxinxiService;
import com.entity.vo.GongyuxinxiVO;
import com.entity.view.GongyuxinxiView;

@Service("gongyuxinxiService")
public class GongyuxinxiServiceImpl extends ServiceImpl<GongyuxinxiDao, GongyuxinxiEntity> implements GongyuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyuxinxiEntity> page = this.selectPage(
                new Query<GongyuxinxiEntity>(params).getPage(),
                new EntityWrapper<GongyuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyuxinxiEntity> wrapper) {
		  Page<GongyuxinxiView> page =new Query<GongyuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyuxinxiVO> selectListVO(Wrapper<GongyuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyuxinxiVO selectVO(Wrapper<GongyuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyuxinxiView> selectListView(Wrapper<GongyuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyuxinxiView selectView(Wrapper<GongyuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
