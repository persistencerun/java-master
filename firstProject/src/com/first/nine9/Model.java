package com.first.nine9;


/**
 *     人的特征类（父类）
 * @author Administrator
 *
 */
public class Model {
	//封装   继承   多态                                    
	
	//封装提现就是类和方法                 //继承   就是你老汉的东西你都有（代码重用性）             //多态

	
	//无法调用和赋值
	//private是私有的
	
	//get（获取）    set（赋值）方法
	private String id;
	
	private String age;
	
	private String name;
	
	//脚
	//public共有的
	public  String foot;

	
	//get得到ID
	public String getId() {
		//方法返回值
		return id;
	}

	//set就是给ID赋值
	public void setId(String id) {
		//this当前对象
		this.id = id;
		//没有返回值
	}

	

	
	//get   set     右键选择sourse，选择getset   
	
	
	//toString
	@Override
	public String toString() {
		return "吉尔吉斯来得及佛山大家佛设计费 [id=" + id + ", age=" + age + ", name=" + name + ", foot=" + foot + "]";
	}



}
