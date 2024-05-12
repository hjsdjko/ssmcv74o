package com.entity.view;

import com.entity.GongyuxuanzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公寓选择
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
@TableName("gongyuxuanze")
public class GongyuxuanzeView  extends GongyuxuanzeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongyuxuanzeView(){
	}
 
 	public GongyuxuanzeView(GongyuxuanzeEntity gongyuxuanzeEntity){
 	try {
			BeanUtils.copyProperties(this, gongyuxuanzeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
