package com.road.lesson1;

public class TestSwitch {
	
	public static void main(String[] args) {
		String s = "a";
		switch (s) {
		case "a":
			System.out.println("a");
			break;
		case "b":
			System.out.println("b");
			break;
		default:
			System.out.println("break");
			break;
		}
		
		int code = 200;
		switch (code) {
		case 200:
		case 201:
		case 202:
		case 203:
			System.out.println("200+");
			break;
		case 300:
		case 301:
		case 302:
		case 303:
			System.out.println("300+");
			break;
		default:
			break;
		}
		
	}

}
