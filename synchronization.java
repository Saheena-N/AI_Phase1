class Table{
	 synchronized public void printtable(int n ) {
		for(int i =1;i<=5;i++) {
			System.out.println(n*i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class exception_handling{
	public static void main (String args[]) {
		Table t = new Table();
		
		Thread t3 = new Thread() {
			public void run() {
				t.printtable(5);
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				t.printtable(10);
			}
		};
		
		t3.start();
		if (t3.isAlive()) {
			System.out.println("gadfu");
		}
		t4.start();
		
		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("End of the program");
					
	}
}
