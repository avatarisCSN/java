package lab3;

public class Start {
    public static void main(String[] args) {
        String s = "Hello434 1 10 2 3 Nov5";
        String[] myArgs = s.split("\\s+");
        
        parse(myArgs);
    }
    
    public static void parse(String[] args) {
        int ctr = 0;
        
        for (String arg: args) {
            try {
                int tmp = Integer.parseInt(arg);
                
                ctr = ctr + tmp;
                
            } catch (Exception e) {
                if (arg.matches(".*\\d+.*")) {
                    System.out.println(arg + " - soderjit cifry");                  
                } else {
                    System.out.println(arg + " - NE soderjit cifr");
                }
            }           
        }
        
        System.out.println("Summa: " + ctr);
    }
 
}