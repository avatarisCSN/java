package ru.java.online;



public class MainPackage 
{
    public MainPackage()
    {
        BaseClass bc = new BaseClass();
       

        System.out.println (bc.toString());
        
    }
	
    public static void main(String[] args) 
    {
        new MainPackage();
     String s="hello";
     s+=" abababa"+"sasasasattgtgtgtgt!";
    s =s.substring(0, s.length()-1);
     System.out.println(s);
    }
}