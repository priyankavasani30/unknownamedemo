package unknowname;

public class Student {

	private String name;

    public Student(String name) 
    {
        if (name == null || name.isEmpty())
        {
            this.name = "Unknown";
        } 
	    else
	    {
            this.name = name;
        }
    }

    public String getName() 
     {
        return name;
    }

	public static void main(String[] args) 
	{	
		Student student1 = new Student("priyanka");
        System.out.println("Student 1 name: " + student1.getName());  

        Student student2 = new Student("");  // unknown
        System.out.println("Student 2 name: " + student2.getName());  

        Student student3 = new Student(null);  // unknown
        System.out.println("Student 3 name: " + student3.getName());  

	}

}
