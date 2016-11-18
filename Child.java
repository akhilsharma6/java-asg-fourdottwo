/* 4.2 assignment will test your knowledge on Access Specifiers, Inheritance and Method
Overriding.*/

class Parent{
	private void method1()	// private method internal to class Parent.
	{
 		System.out.println ("Parent's method1()");
	}
	public void method2()	// method2 to print line and invoke private method1.
	{
		System.out.println ("Parent's method2()");
		method1();
	}
}

class Child extends Parent {	// Child class inherits Parent properties.
 	public void method1()
	{
 		System.out.println ("Child's method1()");
	} 

	public static void main(String args[]) 
	{
		Parent p = new Child();	// object p of Parent class but initialized using Child class constructor, but should work as Child extends Parent class.
		p.method2();	// Invokes method2 of parent class which further invokes private method1.
	}
}


/* Output: C

C:\Users\Akhil Sharma\acadgild\java-rookie\src>java Child
Parent's method2()
Parent's method1()

C:\Users\Akhil Sharma\acadgild\java-rookie\src>
*/