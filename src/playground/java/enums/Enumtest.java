package playground.java.enums;

public class Enumtest{
	public enum FRIENDS{BARNEY,BJ,BABYBOP,MANU}
	
	public static void main(String args[]){
		System.out.println("enum.element.toString() is "+FRIENDS.BARNEY.toString());
		System.out.println("enum.element.toString() is "+FRIENDS.MANU.toString());
	}


}
