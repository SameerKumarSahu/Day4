import java.util.Random;

public class EmpWage {

	static int isFullTime, isPartTime;
	static int empRatePerHr;
	static int empHrs;

	public EmpWage(int f,int p,int r)
	{
		this.isFullTime=f;
		this.isPartTime=p;
		this.empRatePerHr=r;
	}

	public static void main(String[] args) {

		Random num = new Random ();
		int empCheck =num.nextInt(3);
		EmpWage s1= new EmpWage (1,2,20);

		switch (empCheck) {
			case 1:
				empHrs=8;
				System.out.println("Employee is present for Full day..");
				break;
			case 2:
				empHrs=4;
				System.out.println("Employee is present for half day..");
				break;
			default:
				empHrs=0;
		}
		int empWage=empHrs*empRatePerHr;
		System.out.println("Employee Salary is "+empWage);

	}

}


