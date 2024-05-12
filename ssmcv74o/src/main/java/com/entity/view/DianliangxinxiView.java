package com.entity.view;

import com.entity.DianliangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电量信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
@TableName("dianliangxinxi")
public class DianliangxinxiView  extends DianliangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianliangxinxiView(){
	}
 
 	public DianliangxinxiView(DianliangxinxiEntity dianliangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, dianliangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
