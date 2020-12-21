package Drama;

/** MUHAMMAD HAFIZ BIN SUKHRI 
 * (275414)**/
import java.util.Scanner;
public class MainDrama {

	public static void main(String[] args) {
	Scanner Keyboard = new Scanner (System.in);
	
	System.out.println ("Please Select The Drama Genre Keyword: (R=Romance) (A=Action): "); 
	 char choice = Keyboard.nextLine().charAt(0);
	 
	 
	 
	 
	 
	 
      
	if (choice == 'R'|| choice == 'r'){
		
	Romance r = new Romance();
	r.setDramaName ("Dr.Stranger (2014)");
	r.setLanguage ("Korean");
	r.setSubstitle ("Malay/English/Mandarin");
	

	
	System.out.println ("This is the Drama List of Romance Genre");
	System.out.println ("Name: "+r.getDramaName());
    System.out.println ("Language : "+r.getLanguage());
    System.out.println ("Substitle : "+r.getSubstitle());
    System.out.println();
    
	Romance r2 = new Romance();
	r2.setDramaName ("7 Hari Mencintaiku (2016)");
	r2.setLanguage ("Bahasa Melayu");
	r2.setSubstitle ("Malay/English/Mandarin");
	

	System.out.println ("Name: "+r2.getDramaName());
    System.out.println ("Language : "+r2.getLanguage());
    System.out.println ("Substitle : "+r2.getSubstitle());
    
    
    
 
    
	}
	
	
	
	
	else if (choice == 'A' || choice == 'a'){
		
		
	Action a = new Action();
	a.setDramaName ("The Flash (2014)");
	a.setLanguage ("English");
	a.setSubstitle ("Malay/English/Mandarin");
	
	
	System.out.println ("This is the Drama List of Action Genre");
	System.out.println ("Name: "+a.getDramaName());
    System.out.println ("Language : "+a.getLanguage());
    System.out.println ("Substitle : "+a.getSubstitle());
    System.out.println ();
	
	Action a2 = new Action();
	a2.setDramaName ("Arrow (2012)");
	a2.setLanguage ("English");
	a2.setSubstitle ("Malay/English/Mandarin");
	
	

	System.out.println ("Name: "+a2.getDramaName());
    System.out.println ("Language : "+a2.getLanguage());
    System.out.println ("Substitle : "+a2.getSubstitle());
    
    
    
   

    
    
    
    
    
    
    
    
	

		
	}

		
}
}
	


