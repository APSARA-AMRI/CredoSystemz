package day2;

public class dayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =15;
		if(age>=18) {
			System.out.println("Vote Eligible");
		}
		else {
			System.out.println("Not Vote Eligible");
		}
		
		//Student - pass or fail
		int marks=40;
		if(marks>=35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//Number - odd or even
		int num=7;
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		//Largest of two numbers
		int a=10;
		int b=5;
		if(a>b) {
			System.out.println("A is Biggest Value");
		}
		else {
			System.out.println("B is biggest Value");
		}
		
		//Leap or not a leap year
		int year=2025;
		if(year%4==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
		
		//Vowel or consonant
		char c='b';
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("Vowel Letter");
		}
		else {
			System.out.println("Consonant Letter");
		}
		
		//Largest of 3 numbers
		int d=10;
		int e=50;
		int f=30;
		if(d>e && d>f) {
			System.out.println("d is biggest value");
		}
		else if(e>f && e>d) {
			System.out.println("e is biggest value");
		}
		else if(f>d && f>e) {
			System.out.println("f is biggest value");
		}
		else {
			System.out.println("d,e,f are having same values");
		}
		
		//positive, negative or zero
		int number=-10;
		if(number>0) {
			System.out.println("It is a positive number");
		}
		else if(number<0) {
			System.out.println("It is a negative number");
		}
		else {
			System.out.println("Zero");
		}
		
		//Nested - if else
		//Largest 3 numbers
		if(a>b) {
			if(a>c) {
				System.out.println("A is biggest value");
			}
			else {
				System.out.println("C is Biggest Value");
			}
		}
		else {
			if(b>c) {
				System.out.println("B is biggest value");
			}
			else {
				System.out.println("C is biggest value");
			}
		}
		
		//SWITCH CASE - DAYS OF THE WEEK
		int day=8;
		switch(day) {
		case 1:{
			System.out.println("Mon");
			break;
		}
		case 2:{
			System.out.println("Tues");
			break;
		}
		case 3:{
			System.out.println("Wed");
			break;
		}
		case 4:{
			System.out.println("Thurs");
			break;
		}
		case 5:{
			System.out.println("Fri");
			break;
		}
		case 6:{
			System.out.println("Sat");
			break;
		}
		case 7:{
			System.out.println("Sun");
			break;
		}
		default:{
			System.out.println("Enter values from 1 to 7 only");
			break;
		}
	   }
		
		//Pattern program
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
				
			}
			System.out.println("");
		}
		System.out.println("----");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
				
			}
			System.out.println("");
		}
		System.out.println("----");
		for(int i=1;i<=5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(((i + j*5)+ " "));
			}
			System.out.println("");
		}
		
		//Character printing
		char cb='A';
		for(char i='E';i>='A';i--) {
			for(char j='E';j>='A';j--) {
				System.out.print(cb+" ");
				cb++;
			}
			System.out.println("");
		}
		
		// * pattern printing
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
		System.out.println("----");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
					
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
