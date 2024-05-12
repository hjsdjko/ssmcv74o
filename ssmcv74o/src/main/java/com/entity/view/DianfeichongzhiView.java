package com.entity.view;

import com.entity.DianfeichongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电费充值
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
@TableName("dianfeichongzhi")
public class DianfeichongzhiView  extends DianfeichongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianfeichongzhiView(){
	}
 
 	public DianfeichongzhiView(DianfeichongzhiEntity dianfeichongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, dianfeichongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
