package com.entity.vo;

import com.entity.KeshijieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 科室介绍
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-05 11:21:12
 */
public class KeshijieshaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 科室主任
	 */
	
	private String keshizhuren;
		
	/**
	 * 护士长
	 */
	
	private String hushizhang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 科室简介
	 */
	
	private String keshijianjie;
				
	
	/**
	 * 设置：科室
	 */
	 
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
				
	
	/**
	 * 设置：科室主任
	 */
	 
	public void setKeshizhuren(String keshizhuren) {
		this.keshizhuren = keshizhuren;
	}
	
	/**
	 * 获取：科室主任
	 */
	public String getKeshizhuren() {
		return keshizhuren;
	}
				
	
	/**
	 * 设置：护士长
	 */
	 
	public void setHushizhang(String hushizhang) {
		this.hushizhang = hushizhang;
	}
	
	/**
	 * 获取：护士长
	 */
	public String getHushizhang() {
		return hushizhang;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：科室简介
	 */
	 
	public void setKeshijianjie(String keshijianjie) {
		this.keshijianjie = keshijianjie;
	}
	
	/**
	 * 获取：科室简介
	 */
	public String getKeshijianjie() {
		return keshijianjie;
	}
			
}
