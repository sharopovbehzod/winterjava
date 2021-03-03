package day08stringmethodsmethodcreation;

public class StringMethods01 {
	
	
	

	public static void main(String[] args) {

		
		String str = " Java is Java ";
		
		//19) trim() method is used to delete space character from beginning and from end of the String.
		System.out.println(str.length());//" Java is Java ";==>14
		System.out.println(str.trim().length()); //"Java is Java";==>12-----Method Chane - if you use multiple methods
		
		
		
		/*
		  By using String methods change the String "  Ali123 can?!@   " to "Ali CAN"
		 */
        String str1 = "  Ali123 can?!@   ";
        
		//Bek way
        System.out.println(str1.trim().substring(0,10).replaceAll("\\d", "").replaceAll("can", "CAN"));
		
        //1way
        System.out.println(str1.replaceAll("\\W", "").replace("123", " ").replace("can", "CAN"));
        
        //2way
        String firstName = str1.substring(2,5);
        String lastName = str1.substring(9,12).toUpperCase();
        
        System.out.println(firstName + " " +  lastName);
        
        //20) concat() is used to join two Strings. "+" and concat() do the same job. But I recommend to use concat() instead of "+".
        System.out.println(firstName.concat(" ").concat(lastName));
        
        //3 way
        
        System.out.println(str1.trim().replaceAll("\\d", "").replace("can?!@", "CAN"));
        
        
        /*
          Strings str2 = "$12.99";
          Strings str3 = "$8.00";
          Find the sum of str2 and str3.
          
         */
        
        String str2 = "$12.99";
        String str3 = "$8.00";
        
        String s2 = str2.replace("$", "").replace(".", "");
        String s3 = str3.replace("$", "").replace(".", "");
        
        System.out.println(s2);
        System.out.println(s3);
        //parseInt() convert Strings to Int, if and only if the String is created by digits.
        System.out.println((Integer.parseInt(s2) + Integer.parseInt(s3))/100.0);
        
      //valueOf() convert Strings to Int, if and only if the String is created by digits.
        System.out.println((Integer.valueOf(s2) + Integer.valueOf(s3))/100.0);
        
        //How to convert String to a decimal
        
        String str4 = "$13.99";
        String str5 = "$9.00";
        
        String s4 = str4.replace("$", "");
        String s5 = str5.replace("$", "");
        
        System.out.println(s4);//13.99
        System.out.println(s5);//9.00
        
        System.out.println(Double.parseDouble(s4) + Double.parseDouble(s5));//22.99
        System.out.println(Double.valueOf(s4) + Double.valueOf(s5));//22.99
        
        
		

	}

}
