package employee;


public class Academic {
	private int id;
	static final int baseMonthlySalary=500;
	Academic(int id){this.id=id;}
	public int CalculateMontlySalary(){return baseMonthlySalary;}
	public int getEmployeeID(){return id;}
}
