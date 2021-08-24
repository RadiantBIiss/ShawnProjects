package CounterAceHardware;

public class RunnerAceHarware 
{
	public static void main(String[] args)
	{
		AceHardwareListing list = new AceHardwareListing("Shawn Murray",
				"Young Man", 22000.02, 1 );
		String employee = list.getEmployee();
		String occupation = list.getOccupation();
		double salary = list.getSalary();
		int yearsWorked = list.getYearsWorked();
		System.out.println("The employee " + employee + " of " +
		occupation + " gets paid " + salary + " per year, and has"
				+ " worked here for " + yearsWorked + " year(s)");
	}

}
