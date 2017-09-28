
//************************************************************************************************************************
// DNU 09-27-2017
// Program Name: Revwords.java
//
// Description: The Revwords.java application returns strings in the reverse order in which they were written.
//
// Methods: void main(String args[]), String transpose(String word)
//
// Class Variable/Objects: StringBuffer result
// 
// Test Scenarios: see reports.
// 
//************************************************************************************************************************
public class Revwords {
    
    public static void main(String args[]) 
    {
    	// Test phrase to be reversed here.  This can be replaced with actual screen input.
        Revwords obj = new Revwords();
        String tstphrase = "987654321";
        
    //test to display original message.
        System.out.println("The Original message is:" + tstphrase);   
    //test method to catch reversal..add try/catch for err handling.
        System.out.println("The New message is:" + obj.transpose(tstphrase));
    }
//************************************************************************************************************************
// transpose(String): This method accepts a string and if there is more than one character in the string will return the string characters
// in reverse order.  
//************************************************************************************************************************
    //Class variable to store reversed string.
    private StringBuffer result = new StringBuffer();
    
    public String transpose(String word){
        //Set limit for first character to exit method.
	//Initially, the method has a constraint is set so when the cursor’s index is the first character it will exit the method.

        if(word.length() == 1){
        	  result.append(word.charAt(word.length()-1));
          
        	return result.toString();
        }

	//Next, it recursively calls the transpose() method and appends the characters in reverse order until the last character
	//which is handled by the first ‘if’ condition.  The string is then returned for screen output.

        else{
        	result.append(word.charAt(word.length()-1));
        	transpose(word.substring(0,word.length()-1));
        	            
        return result.toString();
        }
    }
    
}