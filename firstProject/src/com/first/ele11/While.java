package com.first.ele11;

public class While {

	public static void main(String[] args) {
		//六月初 到十一月底
		//c#+            毕业拓展   半个月		
		//j2se+sql+GUI  两个月		
		//web一个月		
		//j2ee一个月（水）
		
		
		//sql+j2se  半个月
		//培训项目+web   半个月
		//项目    半个月
		//面试知识    半个月
		
		
		
		
		//了解GUI
		
		//建表     左联     右联      

		
		
		foreach();
	}
	
	

	
	public static  String foreach(){
		for (int i = 0; i < 6; i++) {
			System.out.println("****************************i:"+i);
			for (int j = 0; j < 6; j++) {
				if(j==3) {
//				System.out.println("结束里面的这次循环，执行下一次");
//				continue;
				
//				System.out.println("跳过里面的循环");
//				break;
					
				System.out.println("结束全部");	
				return null;
			  }
				System.out.println("i:"+i+"; j:"+j);
			}
		}
		
		return null;
	}

}
