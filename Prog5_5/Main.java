package Prog5_5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Computer computer1=new Computer("Dell","Core 5",4,2.75);
	    Computer computer2=new Computer("Dell","Core 5",4,2.75);
	    Computer computer3=new Computer("HP","Core 7",8,3.75);
	    
	    System.out.println("Computer1:" +computer1);
	    System.out.println("Computer2:" +computer2);
	    System.out.println("Computer3:" +computer3);
	    
	    System.out.println("The equality of Computer1 and Computer2 is: "+computer1.equals(computer2));//prints true
	    System.out.println("Computer1:"+computer1.hashCode());
	    
	    System.out.println("The equality of Computer1 and Computer3 is: "+computer1.equals(computer3));//prints false
	    System.out.println("Computer2:"+computer2.hashCode());
	}

}
