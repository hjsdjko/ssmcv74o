package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DianliangxinxiEntity;
import com.entity.view.DianliangxinxiView;

import com.service.DianliangxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 电量信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
@RestController
@RequestMapping("/dianliangxinxi")
public class DianliangxinxiController {
    @Autowired
    private DianliangxinxiService dianliangxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DianliangxinxiEntity dianliangxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			dianliangxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DianliangxinxiEntity> ew = new EntityWrapper<DianliangxinxiEntity>();
		PageUtils page = dianliangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianliangxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DianliangxinxiEntity dianliangxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			dianliangxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DianliangxinxiEntity> ew = new EntityWrapper<DianliangxinxiEntity>();
		PageUtils page = dianliangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianliangxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DianliangxinxiEntity dianliangxinxi){
       	EntityWrapper<DianliangxinxiEntity> ew = new EntityWrapper<DianliangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dianliangxinxi, "dianliangxinxi")); 
        return R.ok().put("data", dianliangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DianliangxinxiEntity dianliangxinxi){
        EntityWrapper< DianliangxinxiEntity> ew = new EntityWrapper< DianliangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dianliangxinxi, "dianliangxinxi")); 
		DianliangxinxiView dianliangxinxiView =  dianliangxinxiService.selectView(ew);
		return R.ok("查询电量信息成功").put("data", dianliangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DianliangxinxiEntity dianliangxinxi = dianliangxinxiService.selectById(id);
        return R.ok().put("data", dianliangxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DianliangxinxiEntity dianliangxinxi = dianliangxinxiService.selectById(id);
        return R.ok().put("data", dianliangxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DianliangxinxiEntity dianliangxinxi, HttpServletRequest request){
    	dianliangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianliangxinxi);

        dianliangxinxiService.insert(dianliangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DianliangxinxiEntity dianliangxinxi, HttpServletRequest request){
    	dianliangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianliangxinxi);
    	dianliangxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        dianliangxinxiService.insert(dianliangxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DianliangxinxiEntity dianliangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dianliangxinxi);
        dianliangxinxiService.updateById(dianliangxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dianliangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DianliangxinxiEntity> wrapper = new EntityWrapper<DianliangxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = dianliangxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
