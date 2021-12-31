public class App {
	public String getGreeting() {
        System.out.println("start");
        try {
    		Thread.sleep(30000);
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
        stringBuilder();
        try {
        	Thread.sleep(1 * 1000);
        	} catch (InterruptedException ie) {
        	Thread.currentThread().interrupt();
        	}
        return "Hello World!";
    }
	
	public void stringBuilder() {
		System.out.println("stringBuilder");
		StringBuilder sb = new StringBuilder();
		sb.append(new char[1_000_000]);
		for( int i=0; i< 300000; i++) {
			sb.append(12345);
			sb.delete(0, 5);
		}
	}

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
