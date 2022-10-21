 class ThreadSchedular extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread n1=new Thread(new ThreadSchedular());
	
		n1.start();

		for(int i=0;i<10;i++) {
			System.out.println(currentThread().getName()+" :"+i);
				try {
					n1.join(1000);
					
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
		System.out.println("Is Alive? " + n1.isAlive()); 
		
		
	}
	
	
	public void run(){
		Thread t = Thread.currentThread(); 
		System.out.println("Thread  " + t.getName()+" running...");
		 System.out.println("Is Alive? " + t.isAlive()); 
	}

}
