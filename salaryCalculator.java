package unitOne;

public class salaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Apsara";
		double salary=40000;
		
		 double hra = 0.20 * salary;  
	     double da = 0.10 * salary;   
	     double pf = 0.05 * salary;   
	     double tax = 0.08 *salary;
	     
	     double grossSalary = salary + hra + da;
	     double netSalary = grossSalary - (pf + tax);
	     
	     System.out.println("-----Salary Details for "+name);
	     System.out.println("Salary- ₹"+salary);
	     System.out.println("HRA - ₹"+hra);
	     System.out.println("DA- ₹"+da);
	     System.out.println("Gross- ₹"+grossSalary);
	     System.out.println("PF-₹"+pf);
	     System.out.println("Tax-₹"+tax);
	     System.out.println("Net- ₹"+netSalary);

	}

}
