package constructor;

public class Assign4 {
     public void m1() {
         System.out.println("Default Method");
     }
     public void m2(int a1) {
    	 System.out.println("One Parmaeterized Method");
     }
     public void m3(int a1,int a2) {
    	 System.out.println("Two Parmaeterized Method");
     }
     public void m4(int a1,int a2,int a3) {
    	 System.out.println("Three Parmaeterized Method");
    	 this.m1();
    	 this.m5(1, 2, 3, 4);
    	 this.m3(1,2);
    	 this.m2(1);
     }
     public void m5(int a1,int a2,int a3,int a4) {
    	 System.out.println("Four Parmaeterized Method");
     }
     public static void main(String[] args) {
    	 Assign4 a=new Assign4();
    	 a.m4(1,2,3);
	}
}
