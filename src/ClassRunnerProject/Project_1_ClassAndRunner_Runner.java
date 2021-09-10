package ClassRunnerProject;

public class Project_1_ClassAndRunner_Runner 
{
	public static void main(String[] args)
	{
		Project_1_ClassAndRunner_Class RR = new Project_1_ClassAndRunner_Class("# of graves NOT robbed: ", 12);
		String gravesite = RR.getGravesite();
		int occupied = RR.getOccupied();
		System.out.println(gravesite + occupied);
		int div = RR.division(2); 
		System.out.println("# of graves NOT robbed: " + div);
		System.out.println("WAIT THATS NOT GOOD SOMEONE CALL THE POLICE");
	}
}
