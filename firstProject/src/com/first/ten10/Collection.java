package com.first.ten10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection implements MakeLove{
	
	
	
	public static void main(String[] args) {
		
		//泛型
		//多态（父类指向子类，接口指向实现该接口的类）
		//集合
		List<String> list   =new ArrayList<String>();
		//向集合里面添加东西
		list.add("sdfs");
		list.add("ddddd");
		list.add("dsf");
	
		System.out.println("集合："+list);
		
		
		
		for (int i = 0; i < list.size(); i++) {
			//从集合中取出的方法
			String str=list.get(i); 
			System.out.println("角标：         "   +   i    +"    结果：    "+str);
		}
		for (String str : list) {
			System.out.println("foreach:           "+str);
		}
		
		
		
		
		//map
		Map<String, Object> map=new HashMap<String, Object>();
		//put装东西
		
		//key是唯一的（钥匙）      value就是你自己的东西（值）
		map.put("key", "value");
		map.put("jier", "heheda");
		//第二次的key会把第一次的key值覆盖
		map.put("key", "鸡巴");
		
		System.out.println("map的值：    "+map.get("key"));
		
		//循环后续教
		
		
	}

	@Override
	public void makeLove() {
		System.out.println("我已经日了");
	}

}
