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


import com.dao.DianliangxinxiDao;
import com.entity.DianliangxinxiEntity;
import com.service.DianliangxinxiService;
import com.entity.vo.DianliangxinxiVO;
import com.entity.view.DianliangxinxiView;

@Service("dianliangxinxiService")
public class DianliangxinxiServiceImpl extends ServiceImpl<DianliangxinxiDao, DianliangxinxiEntity> implements DianliangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianliangxinxiEntity> page = this.selectPage(
                new Query<DianliangxinxiEntity>(params).getPage(),
                new EntityWrapper<DianliangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianliangxinxiEntity> wrapper) {
		  Page<DianliangxinxiView> page =new Query<DianliangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianliangxinxiVO> selectListVO(Wrapper<DianliangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianliangxinxiVO selectVO(Wrapper<DianliangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianliangxinxiView> selectListView(Wrapper<DianliangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianliangxinxiView selectView(Wrapper<DianliangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
