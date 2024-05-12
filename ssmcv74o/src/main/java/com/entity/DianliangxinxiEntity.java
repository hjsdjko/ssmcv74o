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
 * 电量信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-09 12:09:29
 */
@TableName("dianliangxinxi")
public class DianliangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianliangxinxiEntity() {
		
	}
	
	public DianliangxinxiEntity(T t) {
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
	 * 用电量
	 */
					
	private Float yongdianliang;
	
	/**
	 * 电费单价
	 */
					
	private Float dianfeidanjia;
	
	/**
	 * 金额
	 */
					
	private Float jine;
	
	/**
	 * 月份
	 */
					
	private String yuefen;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：用电量
	 */
	public void setYongdianliang(Float yongdianliang) {
		this.yongdianliang = yongdianliang;
	}
	/**
	 * 获取：用电量
	 */
	public Float getYongdianliang() {
		return yongdianliang;
	}
	/**
	 * 设置：电费单价
	 */
	public void setDianfeidanjia(Float dianfeidanjia) {
		this.dianfeidanjia = dianfeidanjia;
	}
	/**
	 * 获取：电费单价
	 */
	public Float getDianfeidanjia() {
		return dianfeidanjia;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(Float jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public Float getJine() {
		return jine;
	}
	/**
	 * 设置：月份
	 */
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
