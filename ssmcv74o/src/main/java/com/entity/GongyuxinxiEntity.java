package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 公寓信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
@TableName("gongyuxinxi")
public class GongyuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongyuxinxiEntity() {
		
	}
	
	public GongyuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 公寓名称
	 */
					
	private String gongyumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：公寓名称
	 */
	public void setGongyumingcheng(String gongyumingcheng) {
		this.gongyumingcheng = gongyumingcheng;
	}
	/**
	 * 获取：公寓名称
	 */
	public String getGongyumingcheng() {
		return gongyumingcheng;
	}
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
