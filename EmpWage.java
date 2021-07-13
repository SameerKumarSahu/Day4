public class EmpWage {

	int isFullTime;
	double empCheck;
	static int empRatePerHr;
	static int empHrs;
	static int empDailyWage ;


	public EmpWage(int i, double c ,int r,int h)
	{
		this.isFullTime=i;
		this.empCheck=c;
		this.empRatePerHr=r;
		this.empHrs=h;
	}

	public static void main(String[] args) {

	EmpWage s1= new EmpWage (1,Math.floor(Math.random()*10)%2,20,8);

		if (s1.isFullTime == s1.empCheck)
		{

			System.out.println("Employee is Present");
			empDailyWage = empRatePerHr * empHrs;
			System.out.println("Employee Daily wage is "+empDailyWage);
		}

		else {

			System.out.println("Employee is Absent");
		     }
	}



}
