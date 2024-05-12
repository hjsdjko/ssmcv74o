package com.entity.model;

import com.entity.GongyuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 公寓信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
public class GongyuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公寓图片
	 */
	
	private String gongyutupian;
		
	/**
	 * 公寓楼号
	 */
	
	private String gongyulouhao;
		
	/**
	 * 公寓位置
	 */
	
	private String gongyuweizhi;
		
	/**
	 * 公寓状态
	 */
	
	private String gongyuzhuangtai;
		
	/**
	 * 公寓详情
	 */
	
	private String gongyuxiangqing;
				
	
	/**
	 * 设置：公寓图片
	 */
	 
	public void setGongyutupian(String gongyutupian) {
		this.gongyutupian = gongyutupian;
	}
	
	/**
	 * 获取：公寓图片
	 */
	public String getGongyutupian() {
		return gongyutupian;
	}
				
	
	/**
	 * 设置：公寓楼号
	 */
	 
	public void setGongyulouhao(String gongyulouhao) {
		this.gongyulouhao = gongyulouhao;
	}
	
	/**
	 * 获取：公寓楼号
	 */
	public String getGongyulouhao() {
		return gongyulouhao;
	}
				
	
	/**
	 * 设置：公寓位置
	 */
	 
	public void setGongyuweizhi(String gongyuweizhi) {
		this.gongyuweizhi = gongyuweizhi;
	}
	
	/**
	 * 获取：公寓位置
	 */
	public String getGongyuweizhi() {
		return gongyuweizhi;
	}
				
	
	/**
	 * 设置：公寓状态
	 */
	 
	public void setGongyuzhuangtai(String gongyuzhuangtai) {
		this.gongyuzhuangtai = gongyuzhuangtai;
	}
	
	/**
	 * 获取：公寓状态
	 */
	public String getGongyuzhuangtai() {
		return gongyuzhuangtai;
	}
				
	
	/**
	 * 设置：公寓详情
	 */
	 
	public void setGongyuxiangqing(String gongyuxiangqing) {
		this.gongyuxiangqing = gongyuxiangqing;
	}
	
	/**
	 * 获取：公寓详情
	 */
	public String getGongyuxiangqing() {
		return gongyuxiangqing;
	}
			
}
