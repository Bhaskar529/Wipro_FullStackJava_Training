package com.wipro.app;
public class UpperBoundedExample {
  
	// Generic method with upper bounded type parameter
   public static <T extends Number> void printDoubleValue(T value) {
       System.out.println(value.doubleValue());
   }
  
   // Generic method with upper bounded type parameter
   //T can be only String since there is no sub type for String
   public static <T extends String> void printStringValue(T value) {
       System.out.println(value);
   }
   public static void main(String[] args) {
       printDoubleValue(10);       // Integer
       printDoubleValue(3.14);     // Double
       printDoubleValue(5.67f);    // Float
       printDoubleValue(5L);		// Long
      
       /*
        * The method printDoubleValue(T) in the
        * type UpperBoundedExample is not applicable for the arguments (String)
        */
//        printDoubleValue("Hello");
      
       printStringValue("Hello");
       /*
        * StringBuffer is not a sub class of String
        */
//        printStringValue(new StringBuffer("Hello"));
   }
}
