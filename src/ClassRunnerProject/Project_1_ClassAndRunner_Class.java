package ClassRunnerProject;

public class Project_1_ClassAndRunner_Class
{
	private String gravesite;
	private int occupied;
	//Constructor
	public Project_1_ClassAndRunner_Class(String gravesite, int occupied)
	{
		this.gravesite = gravesite;
		this.occupied = occupied;
	}
	public int division(int div)
	{
		int remainder = (int) occupied / div;
		return remainder;
	}
	// Set Method
	public void setGravesite(String Gravesite)
	{
		this.gravesite = Gravesite; 
	}
	// get method
	public String getGravesite()
	{
		return gravesite;
	}
	public int getOccupied()
	{
		return occupied;
	}
}
