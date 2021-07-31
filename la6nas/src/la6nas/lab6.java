package la6nas;


import javax.swing.*;
public class lab6 {
	    public static void main(String[] args) {
	        String name = JOptionPane.showInputDialog( "What's your name of company?");
	        String info = JOptionPane.showInputDialog( "What's your information of company and plus?");
	        
	        companyTourist someoneCompany = new companyTourist(name, info);
	        
	        String name2 = JOptionPane.showInputDialog( "What's your name of company?");
	        String info2 = JOptionPane.showInputDialog( "What's your information of company and plus?");
	        
	        companyVisitor someoneCompany2 = new companyVisitor(name2, info2);
	        
	      
	        
	        System.out.println("Company name - "+someoneCompany.nameOfCompany);
	        System.out.println("Company Information- "+ someoneCompany.info);
	        System.out.println();
	        System.out.println("Company name - "+someoneCompany2.nameOfCompany);
	        System.out.println("Company Information- "+ someoneCompany2.info2);
	       
	        System.exit(0);
	    }
	}

	
	
	
	
	



