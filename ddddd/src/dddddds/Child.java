package dddddds;

/* Parent 클래스 */
class Parent {
	public Parent() {
		System.out.println("Parent의 생성자");
	}
}

/* Child 클래스 */
public class Child extends Parent {
    public Child() {
    	super();
	}
	
    public void print() {
    	System.out.println("부모 클래스의 print() 메소드");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
    }
}