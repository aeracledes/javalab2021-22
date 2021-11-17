package employee;
import enumerations.*;
import randomize.*;

final public class HourlyBasedStaff extends Academic {
		private WorkingExperience experience;
		private int workedhours;
		private int monthlySalary;
		
		public HourlyBasedStaff(int id){
			super(id);
			experience = Randomize.WorkingExperience();
			workedhours = Randomize.MonthlyWorkingHours();	
		}
		
		public int CalculateMonthlySalary(){
		int onTopSalary=0;
		int rate=0;
		if (experience==WorkingExperience.uptoFiveYears) {rate = 10;}
		if (experience==WorkingExperience.FiveToTenYears) {rate = 20;}
		if (experience==WorkingExperience.morethanTenYears) {rate = 30;}
		onTopSalary = workedhours*rate;
		monthlySalary = baseMonthlySalary + onTopSalary;
		return monthlySalary;
		}
		public WorkingExperience getWorkingExperience() {return experience;}
		public int getSalary() {return monthlySalary;}
		public void printInfo(){
			System.out.println("");
			System.out.println("EmployeeID:"+super.getEmployeeID()+"is hourly");
			System.out.println("Working Experience:"+experience);
			System.out.println("Worked Hours:"+workedhours);
			System.out.println("Hourly based employee salary:"+getSalary());
		}
		 
	}


