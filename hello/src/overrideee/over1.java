package overrideee;

public class over1
{
	public static void main(String[] args) {
		over1 a=new over1();
		a.account();
	}
	public void account()
	{
		Thread t1=new Thread(new Runnable(){
			public void run(){
				add();
			}
		});
		Thread t2=new Thread(new Runnable(){
			public void run()
			{
			sub();
			}
		});
		t1.start();
		t2.start();
		
	try{
		t1.join();
		t2.join();
	}
	catch(Exception e){
	System.out.println(e);
	}
}
	public void add()
	{
		
	}
}


	