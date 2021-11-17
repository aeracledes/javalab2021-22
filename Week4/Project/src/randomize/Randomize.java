package randomize;
import java.util.Random;

import enumerations.Bathmida;
import enumerations.StaffType;
import enumerations.WorkingExperience;
public class Randomize {
	
	static Random random  = new Random();
	
	public static StaffType Staff() { 
		int res = random.nextInt(2);
	    if(res==0) return StaffType.Permanent;
	    else return StaffType.HourlyBased;
	}
	
	public static Bathmida Bathmida() { 
		int res = random.nextInt(4);
		
	    if(res==0) return Bathmida.Lecturer;
	    else if(res==1)return Bathmida.Assistant;
	    else if(res==2)return Bathmida.Associate;
	    else return Bathmida.Professor;   
	}
	
	public static WorkingExperience WorkingExperience() { 
		int res = random.nextInt(3);
	    if(res==0) return WorkingExperience.uptoFiveYears;
	    else if(res==1)return WorkingExperience.FiveToTenYears;
	    else return WorkingExperience.morethanTenYears;   
	}
	
	public static int MonthlyWorkingHours() { 
		int res = random.nextInt(41);
	    return res;  
	}
	
}
