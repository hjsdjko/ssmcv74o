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


import com.dao.GongyuxuanzeDao;
import com.entity.GongyuxuanzeEntity;
import com.service.GongyuxuanzeService;
import com.entity.vo.GongyuxuanzeVO;
import com.entity.view.GongyuxuanzeView;

@Service("gongyuxuanzeService")
public class GongyuxuanzeServiceImpl extends ServiceImpl<GongyuxuanzeDao, GongyuxuanzeEntity> implements GongyuxuanzeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyuxuanzeEntity> page = this.selectPage(
                new Query<GongyuxuanzeEntity>(params).getPage(),
                new EntityWrapper<GongyuxuanzeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyuxuanzeEntity> wrapper) {
		  Page<GongyuxuanzeView> page =new Query<GongyuxuanzeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyuxuanzeVO> selectListVO(Wrapper<GongyuxuanzeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyuxuanzeVO selectVO(Wrapper<GongyuxuanzeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyuxuanzeView> selectListView(Wrapper<GongyuxuanzeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyuxuanzeView selectView(Wrapper<GongyuxuanzeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
