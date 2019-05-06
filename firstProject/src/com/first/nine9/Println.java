package com.first.nine9;

public class Println {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Model mo=new Model();
         mo.foot="中和";
         mo.setId("ddd");
         
         System.out.println(mo.foot);
         //toString实现之后就不会打印地址
         System.out.println("mo对象："+mo);
         
         
         mo.setId("jier");
         //方法的返回值
         String id=mo.getId();
         System.out.println(id);
         
         
         //子类拥有父类东西(变量和方法)
         Man man=new Man();
         man.getId();
         //多态：父类指向子类
         
         Model moDemo=new Man();
         System.out.println("moDemo:"+moDemo);
         System.out.println(moDemo.getId());
	}

}
