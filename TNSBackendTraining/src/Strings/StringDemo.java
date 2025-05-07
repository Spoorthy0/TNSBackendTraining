package Strings;

public class StringDemo {
    public static void main(String args[]){
    	String s1="Spoorthy";
    	String s2="Spoorthy";
    	String s3=new String("Spoorthy");
    	System.out.println(s1==s2);
    	System.out.println(s1==s3);
    	System.out.println(s1.equals(s3));
    	System.out.println(s1.equals(s2));
    	System.out.println(s2.equals(s3));
    	
    }
}
