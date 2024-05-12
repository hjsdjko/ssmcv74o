package com.entity.view;

import com.entity.GongyuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公寓信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
@TableName("gongyuxinxi")
public class GongyuxinxiView  extends GongyuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongyuxinxiView(){
	}
 
 	public GongyuxinxiView(GongyuxinxiEntity gongyuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gongyuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
