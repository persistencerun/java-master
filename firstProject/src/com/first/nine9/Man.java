package com.first.nine9;

/**
 * 男人
 * @author Administrator
 * extends继承的关键字
 */

public class Man extends Model{
	
	//鸡儿
	private String jj;

	public String getJj() {
		return jj;
	}

	public void setJj(String jj) {
		this.jj = jj;
	}
	
	//重写父类的方法
	public String getId(){
		return "wocao";
	}
	
	

}
