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
        System.exit(0);
    }
}