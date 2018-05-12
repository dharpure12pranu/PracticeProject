package com.ram;

import java.util.HashMap;
import java.util.Map;
import com.ram.*;

class Test 
{
	public static void main(String[] args) {    
	    //Creating map of Books    
	    Map<Integer,TestThreads> map=new HashMap<Integer,TestThreads>();    
	    //Creating Books    
	    TestThreads b1=new TestThreads(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    TestThreads b2=new TestThreads(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    TestThreads b3=new TestThreads(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);  
	    System.out.println(7 & 6);
	      
	    //Traversing map  
	    for(Map.Entry<Integer, TestThreads> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        TestThreads b=entry.getValue();  
	          
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
}
}
