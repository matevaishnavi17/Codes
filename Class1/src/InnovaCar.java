

	public  class InnovaCar implements Car {
		
		public  InnovaCar() {
			
		}
		
		
		public static void main(String args[]) {
			
			InnovaCar ic=new InnovaCar();
			
			ic.start();
			ic.stop();
		}
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("The car is started");
		}

		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("The car has Stopped");
		}


		


		/*@Override
		public void start() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void stop() {
			// TODO Auto-generated method stub
			
		}*/
		

	}
	

