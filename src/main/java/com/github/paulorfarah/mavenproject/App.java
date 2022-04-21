package com.github.paulorfarah.mavenproject;

import java.io.File;
import java.io.IOException;

public class App {

	public String getGreeting() {
        System.out.println("start getGreeting");
//        countSetBits(1);
        
        try {
    		Thread.sleep(30000);
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
        justPrintMessage();
        createFile();
//        stringBuilder();
//        try {
//        	Thread.sleep(1 * 1000);
//    	} catch (InterruptedException ie) {
//        	Thread.currentThread().interrupt();
//    	}
        return "Hello World!";
    }
	
//	public void stringBuilder() {
//		System.out.println("stringBuilder");
//		StringBuilder sb = new StringBuilder();
//		sb.append(new char[1_000_000]);
//		for( int i=0; i< 3000000; i++) {
//			sb.append(12345);
//			sb.delete(0, 5);
//		}
//	}
//
//	static int countSetBits(int n)
//    {
//        int count = 0;
//        while (n > 0) {
//            count += n & 1;
//            n >>= 1;
//        }
//        return count;
//    }
//	
//	public void cpuUsage() {
//		Random random = new Random();
//		BigDecimal bigDecimal = BigDecimal.ZERO;
//		int i = 0;
//        while (i < 1000) {
//            double value = Math.atan(Math.sqrt(Math.pow(random.nextInt(10), random.nextDouble())));
//            if (random.nextInt(10) > 5) {
//                bigDecimal = bigDecimal.add(BigDecimal.valueOf(value));
//            } else {
//                bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(value));
//            }
//            i++;
//        }
//	}
	
	public void justPrintMessage() {
		System.out.println("testing 1 2 3...");
		System.out.println("testing 1 2 3...");
		System.out.println("testing 1 2 3...");
		System.out.println("testing 1 2 3...");
		System.out.println("testing 1 2 3...");
		System.out.println("testing 1 2 3...");
	}
	
	public void createFile() {
	    try {
	      File myObj = new File("filename.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	
	
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
