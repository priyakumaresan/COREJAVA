package Abstractclass;

abstract class Bike {
	abstract void run();
}
class Honda4 extends Bike{
	void run() {
		System.out.println("Running safely...");
		System.out.println("Execution in run method");
	}
public static void main(String[] args) {
		Honda4 obj=new Honda4();
		obj.run();

	}

}
