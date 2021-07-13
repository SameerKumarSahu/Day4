import java.util.Random;

public class EmpWage {

	static int isFullTime, isPartTime;
	static int empRatePerHr;
	static int empHrs;
	static int numberOfWorkingDays;

	public EmpWage(int f,int p,int r,int n)
	{
		this.isFullTime=f;
		this.isPartTime=p;
		this.empRatePerHr=r;
		this.numberOfWorkingDays=n;
	}

	public static void main(String[] args) {

		Random num = new Random ();
		int totalSalary=0;
		int Fullday=0;
		int Halfday=0;
		int Absent=0;
		EmpWage s1= new EmpWage (1,2,20,20);
		for (int day =0; day<20; day++) 
		{
			int empCheck =num.nextInt(3);
			switch (empCheck) 
			{
			case 1:
				empHrs=8;
				Fullday++;
				break;
			case 2:
				empHrs=4;
				Halfday++;
				break;
			default:
				empHrs=0;
				Absent++;
			}
		int empWage=empHrs*empRatePerHr;
		 totalSalary = totalSalary+ empWage;
		}
		System.out.println( "Number of days Absent is " + Absent );

		System.out.println( "Number of Fulldays present is  " + Fullday );

		System.out.println( "Number of Halfdays present is " +Halfday );

		System.out.println("Employee's Monthly Salary is "+totalSalary);

	}

}


