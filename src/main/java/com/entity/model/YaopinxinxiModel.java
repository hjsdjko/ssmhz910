package com.entity.model;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 药品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-06-05 11:21:12
 */
public class YaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 剂型
	 */
	
	private String jixing;
		
	/**
	 * 批次号
	 */
	
	private String picihao;
		
	/**
	 * 生产日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanriqi;
		
	/**
	 * 药品说明
	 */
	
	private String yaopinshuoming;
		
	/**
	 * 生产单位
	 */
	
	private String shengchandanwei;
		
	/**
	 * 生产地址
	 */
	
	private String shengchandizhi;
		
	/**
	 * 药品图片
	 */
	
	private String yaopintupian;
		
	/**
	 * 保质期
	 */
	
	private String baozhiqi;
		
	/**
	 * 药品价格
	 */
	
	private Integer yaopinjiage;
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：剂型
	 */
	 
	public void setJixing(String jixing) {
		this.jixing = jixing;
	}
	
	/**
	 * 获取：剂型
	 */
	public String getJixing() {
		return jixing;
	}
				
	
	/**
	 * 设置：批次号
	 */
	 
	public void setPicihao(String picihao) {
		this.picihao = picihao;
	}
	
	/**
	 * 获取：批次号
	 */
	public String getPicihao() {
		return picihao;
	}
				
	
	/**
	 * 设置：生产日期
	 */
	 
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
				
	
	/**
	 * 设置：药品说明
	 */
	 
	public void setYaopinshuoming(String yaopinshuoming) {
		this.yaopinshuoming = yaopinshuoming;
	}
	
	/**
	 * 获取：药品说明
	 */
	public String getYaopinshuoming() {
		return yaopinshuoming;
	}
				
	
	/**
	 * 设置：生产单位
	 */
	 
	public void setShengchandanwei(String shengchandanwei) {
		this.shengchandanwei = shengchandanwei;
	}
	
	/**
	 * 获取：生产单位
	 */
	public String getShengchandanwei() {
		return shengchandanwei;
	}
				
	
	/**
	 * 设置：生产地址
	 */
	 
	public void setShengchandizhi(String shengchandizhi) {
		this.shengchandizhi = shengchandizhi;
	}
	
	/**
	 * 获取：生产地址
	 */
	public String getShengchandizhi() {
		return shengchandizhi;
	}
				
	
	/**
	 * 设置：药品图片
	 */
	 
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
				
	
	/**
	 * 设置：保质期
	 */
	 
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
				
	
	/**
	 * 设置：药品价格
	 */
	 
	public void setYaopinjiage(Integer yaopinjiage) {
		this.yaopinjiage = yaopinjiage;
	}
	
	/**
	 * 获取：药品价格
	 */
	public Integer getYaopinjiage() {
		return yaopinjiage;
	}
			
}
