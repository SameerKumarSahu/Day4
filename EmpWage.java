public class EmpWage {

	int isFullTime, isPartTime;
	double empCheck;
	static int empRatePerHr;
	static int empFullTimeHrs;
	static int empPartTimeHrs;
	static int empDailyWage ;

	public EmpWage(int f,int p, double c ,int r,int h1,int h2)
	{
		this.isFullTime=f;
		this.isPartTime=p;
		this.empCheck=c;
		this.empRatePerHr=r;
		this.empFullTimeHrs=h1;
		this.empPartTimeHrs=h2;
	}

	public static void main(String[] args) {

	EmpWage s1= new EmpWage (1,2,Math.floor(Math.random()*10)%3,20,8,4);

		if (s1.isFullTime == s1.empCheck) {
			System.out.println("Employee is Present");
			 empDailyWage = empRatePerHr * empFullTimeHrs;
			 System.out.println("Employee Fullday wage is "+empDailyWage);

			}
		else if (s1.isPartTime == s1.empCheck) {
			System.out.println("Employee is Present");
			 empDailyWage = empRatePerHr * empPartTimeHrs;
			 System.out.println("Employee Part time wage is "+empDailyWage);

		}
		else {
			System.out.println("Employee is Absent");
		}
	}

}


