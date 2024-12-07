
public class Student {

	private int ID;
	//This attribute holds the student’s age

	private int english;
	//This attribute holds the student’s English result

	private int irish;
	//This attribute holds the student’s Irish result

	private int maths;
	//This attribute holds the student’s 
	
	public Student(int ID, int english, int irish, int maths)
	{
		this.ID = ID;
		this.irish = irish;
		this.english = english;
		this.maths = maths;
	}
	//This constructor method allows the class attributes to be set. 
		
	public int getMax()
	{
		if(Math.max(maths, irish)==irish)
		{
			return Math.max(irish, english);
		}
		
		else
		{
			return Math.max(maths, english);
		}
	}
	//This method return the max result achieve in either of the subject. For example, if a student achieves 80 in English, 75 in Irish and 90 in maths, then the method returns 90.

	public int getMin ()
	{
		if(Math.min(maths, irish)==irish)
		{
			return Math.min(irish, english);
		}
		
		else
		{
			return Math.min(maths, english);
		}
	}
	//This method return the min result achieve in either of the subject. For example, if a student achieves 80 in English, 75 in Irish and 90 in maths, then the method returns 75.

	public int average()
	{
		float average;
		
		average = (float) ((irish+english+maths)/3.0);
		
		return (int) Math.ceil(average);
		
	}
	//This method return the average result achieved by the student. For example, if a student achieves 80 in English, 75 in Irish and 90 in maths, then the method returns 82. (Note the average is always rounded upwards to the next Integer Value)

	public int getID()
	{
	
		return this.ID;
	}
	//The ID() method returns the Student’s ID as an integer


	public void setID(int newID)
	{
		this.ID = newID;
		
	}
	//The setID() method changes the ID attribute to the newID value


}