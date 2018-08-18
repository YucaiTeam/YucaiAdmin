package com.hyg.yucai.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 实现转换日期串到日期格式
 * Converter<String, Date>
 * 泛型里是--字符串--和--日期--格式
 */
public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		//实现
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		try {
			//如果绑定成功返回日期类型
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		///如果参数绑定失败就返回空
		return null;
	}

}
