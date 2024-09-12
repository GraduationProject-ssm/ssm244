package com.entity.view;

import com.entity.ShangjiaguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 商家管理员
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-20
 */
@TableName("shangjiaguanli")
public class ShangjiaguanliView extends ShangjiaguanliEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 商家的值
		*/
		private String shangjiaValue;



	public ShangjiaguanliView() {

	}

	public ShangjiaguanliView(ShangjiaguanliEntity shangjiaguanliEntity) {
		try {
			BeanUtils.copyProperties(this, shangjiaguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 商家的值
			*/
			public String getShangjiaValue() {
				return shangjiaValue;
			}
			/**
			* 设置： 商家的值
			*/
			public void setShangjiaValue(String shangjiaValue) {
				this.shangjiaValue = shangjiaValue;
			}










}