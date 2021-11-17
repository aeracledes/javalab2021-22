package employee;
import enumerations.Bathmida;
import randomize.*;

final public class PermanentStaff extends Academic {
		private Bathmida rank;
		private int monthlySalary;
		
		public PermanentStaff(int id){
			super(id);
			rank = Randomize.Bathmida();
		}
		
		public int CalculateMonthlySalary() {
			int onTopSalary=0;
			if (rank==Bathmida.Lecturer) onTopSalary=1000;
			if (rank==Bathmida.Assistant) onTopSalary=1200;
			if (rank==Bathmida.Associate) onTopSalary=1400;
			if (rank==Bathmida.Professor) onTopSalary=1500;
			monthlySalary=baseMonthlySalary+onTopSalary;
			return monthlySalary;
		}
		
		public Bathmida getBathmida() {return rank;}
		
		public void printInfo() {
			System.out.println("");
			System.out.println("EmployeeID:"+super.getEmployeeID()+" is permanent.");
			System.out.println("Academic rank:"+rank);
			System.out.println("Permanent employee salary:"+monthlySalary);
		}
	}
