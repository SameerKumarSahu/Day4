public class EmpWage {

	int isFullTime;
	double empCheck;

	public EmpWage(int i, double s)
	{
		this.isFullTime=i;
		this.empCheck=s;
	}


	public static void main(String[] args) {

	EmpWage s1= new EmpWage (1,Math.floor(Math.random()*10)%2);

		if (s1.isFullTime == s1.empCheck) {

			System.out.println("Employee is Present");
			}

		else {

			System.out.println("Employee is Absent");
		     }
	}

}

