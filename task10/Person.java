package task10;

public class Person {


	//Data members for the class Person
	
	private int age;
	String name;
	
	//Creating constructor for the class Person
	
	Person()
	{
		System.out.println("Below is the Name & age of a person");
	}
	
			
	//Creating getter method for the attribute name
	
		public String getName()
		{
			return name;
		}
		
	//Creating getter method for the attribute age
		
		public int getAge()
		{
			return age;
		}
		
	//Creating setter method for the attribute name
		
		public void setName(String n)
		{
			name= n;
		}
		
	//Creating setter method for the attribute age
		
		public void setAge(int a)
		{
			age=a;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person();
		p1.setName("Thilaga");
		p1.setAge(30);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

	}

}
