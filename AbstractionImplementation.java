public abstract class AbstractionImplementation{
	public abstract void eat(int quantity);
	public abstract void sleep(int hr);
	public void  fly(){
		System.out.println("i am flying");
	}
	AbstractionImplementation()
	{
		System.out.println("i am abstract class ,i cannot have any object");
	}

}
