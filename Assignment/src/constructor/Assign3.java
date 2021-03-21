package constructor;

public class Assign3 {
	public Assign3() {
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}
    public Assign3(int a1) {
    	this();
		System.out.println("One Parameterized constructor");
	}
    public Assign3(int a1, int a2) {
    	this(1,2,3);
    	System.out.println("Two Parameterized constructor");
}
    public Assign3(int a1, int a2, int a3) {
    	this(1);
    	System.out.println("Three Parameterized constructor");
    }
    public Assign3(int a1, int a2, int a3, int a4) {
    	System.out.println("Four Parameterized constructor");
    }
    public static void main(String[] args) {
		Assign3 obj=new Assign3(1,2);
	}


}
