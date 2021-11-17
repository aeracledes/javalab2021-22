package mainPacket;
import randomize.*;
import enumerations.*;
import employee.*;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("HELLO PROJECT WEEK 4");
		createRandomizedEmployees(100);
	}
	public static void createRandomizedEmployees(int k) {
		System.out.println("Creating"+k+"Randomized Employees");
		for(int i=1;i<=k;i++) {
			StaffType staff=Randomize.Staff();
			if (staff==StaffType.Permanent) {
				PermanentStaff pstaff = new PermanentStaff(i);
				pstaff.CalculateMonthlySalary();
				pstaff.printInfo();
			}
			if (staff==StaffType.HourlyBased) {
				HourlyBasedStaff hstaff=new HourlyBasedStaff(i);	
				hstaff.CalculateMontlySalary();
				hstaff.printInfo();
			}
		}
	}
}
