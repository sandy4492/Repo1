package variousProgramInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {

    String st ="sandeepkumarsingh";
    
      char[] str = st.toCharArray();
      
    for(int i=0;i<str.length;i++){
    	int count=0;
    	
    	for(int j=0;j<str.length;j++){
    		if(str[i]==str[j]){
    			count++;
    			
    		}
    	}
    	
    	
    	if(count>1){
    		System.out.print(str[i]+" " +count);
    	}
    }
    
    
    
	}

}
