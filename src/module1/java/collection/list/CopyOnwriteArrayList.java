package module1.java.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class CopyOnwriteArrayList {
     public static void runExample(){
    	 
    	 List<String> shoppingList = new CopyOnWriteArrayList<>();
    	
//    	 List<String> shoppingList = new ArrayList<>();
    	 shoppingList.add("Milk");
    	 shoppingList.add("Eggs");
    	 shoppingList.add("bread");
    	 System.out.println("Initial shopping List : "+shoppingList);
    	 
    	  for(String item: shoppingList) {
   		  System.out.println(item);
    		  if(item.equals("Eggs")) {
    			  shoppingList.add("Butter");
    			  System.out.println("Added Butter while reading");
    		  }
    	  }
    	  System.out.println("UpdatedShopping List: "+ shoppingList);
    	 
    	  List<String> sharedList = new CopyOnWriteArrayList<>();
    	  sharedList.add("item1");
    	  sharedList.add("item2");
    	  sharedList.add("item3");
    	  Thread readerThread = new Thread(()->{
    		  try {
        		  
        			  for(String item : sharedList) {
        				  System.out.println("rading item: "+ item);
        				  Thread.sleep(100);
        			  }
        		  
        	  }
        	  catch (Exception e) {
        		  System.out.println("Exception in reader thread:" +e );
        	  }
    	  
    			  });
    	  Thread writerThread = new Thread(()->{
    		  try {
    			  		Thread.sleep(500);
    			  		sharedList.add("item4");
        				  System.out.println("Added item4 to the List ");
        				  
        				  Thread.sleep(500);
        				  sharedList.remove("item1");
        				  System.out.println("Removed item1 to the List ");
        				  
        			
        	  }
        	  catch (InterruptedException e) {
        		  e.printStackTrace();
        	  }
    	  
    			  });
    	    
    	 readerThread.start();
    	 writerThread.start();
    	 
    	     }
}
