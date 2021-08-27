package CounterAceHardware;

public class AceHardwareListing
{
	//instance variables yoo
	private String employee;
	private String occupation;
	private double salary;
	private int yearsWorked;
	//constructor
	public AceHardwareListing(String employee, String occupation,
			double salary, int yearsWorked)
	{
		this.employee = employee;
		this.occupation = occupation;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}
	//set methods
	public void setEmployee(String employee)
	{
		this.employee = employee;
	}
	//get methods 
	public String getEmployee()
	{
		return employee;
	}
	public String getOccupation()
	{
		return occupation;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getYearsWorked()
	{
		return yearsWorked; 
	}
}
