package com.first.seven7;

import java.util.Date;

/**
 * 异常类
 * @author Administrator
 *
 */
public class ExceptionDemo {
	
	private String studentName;
	
	/**
	 * 程序入口
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//静态方法里面的东西必须是静态
		//jiero();
		//调用静态方法
		//变量和方法名都是小写开头的驼峰
		heheda();
			
		//静态方法里面用普通方法，通过对象来调用
		Date date = null;
		//Date date = new Date();
		//调用方法有横线表示过时
		//date.getDay();
		//报错   空指针
		
		
		//处理异常
//		try{
//			
//		}catch(Exception eddg){
//			
//		}
		
//		try {
//			System.out.println("报错前");
//			//报错
//			date.getDay();
//			System.out.println("没报错");
//		}catch(Exception e) {
//				System.out.println("报错的时候");
//		        System.out.println("解决了一个异常，程序接着执行");
//		}
		
		cuowu();
		
		System.out.println("程序结束");
	}
	
	
	/**
	 * 静态方法
	 */
	@Deprecated
	public static void heheda() {
		System.out.println("调用了我");
	}
	
	/**
	 * 普通方法
	 */
	public  void jiero() {
		System.out.println("错误");
	}
	
	
	/**
	 * 自定义抛出错误
	 * @throws Exception 
	 */
	public static void cuowu() throws Exception{
		System.out.println("抛出错误");
		throw new Exception("我屁股痛");
		
	}
	
	
	/**
	 * 自定义抛出错误
	 * @throws Exception 
	 */
	public static void cuowu121() {
		System.out.println("抛出错误");
		try {
			throw new Exception("我屁股痛");
		} catch (Exception e) {
			//没有必要
			e.printStackTrace();
		}
	}

}
