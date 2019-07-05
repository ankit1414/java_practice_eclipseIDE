package package1;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		//Student s1 = new Student();
		s.setName("ankit");
		s.setAge(19);
		s.setId(1);
		System.out.println(s.getName()+" is "+s.getAge()+" years old.");
		
		Student s1 = new Student();
		s1.setName("deepak");
		s1.setAge(20);
		s1.setId(2);
		System.out.println(s1.getName()+" is "+s1.getAge()+" years old.");
		
	}

}
