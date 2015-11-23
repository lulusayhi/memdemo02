package com.liululu.memcacheddemo;

public class test {

	public static void main(String[] args)  
    {  
		MemcacheManagerForGwhalin cache = MemcacheManagerForGwhalin.getInstance();  
	       StudentDO stuDO=new StudentDO();  
	       stuDO.setId(10);  
	       stuDO.setAge(28);  
	       stuDO.setName("sunney");  
	       stuDO.setAddress("广东省深圳市福田区梅华路105号多丽科技楼9楼");   
	       cache.add("stu", stuDO);  
	       StudentDO stuDO1=(StudentDO)cache.get("stu");  
	       System.out.println("id:"+stuDO1.getId());  
	       System.out.println("name:"+stuDO1.getName());  
	       System.out.println("age:"+stuDO1.getAge());  
	       System.out.println("adress:"+stuDO1.getAddress());  
	       System.out.println("+++++++++++++++++++++++ok++++++++++++++++++++++++");  
              
    }

}
