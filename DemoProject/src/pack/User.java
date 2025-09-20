package pack;

public class User {

	public static void main(String[] args) {
		//Student s = new Student();
		/*s.setRollno(4);
		s.setBranch("CAI");
		s.setName("Neelasa");
		
		System.out.println("Roll no is"+s.getRollno());
		System.out.println("Name is "+s.getName());
		
		System.out.println("Branch is "+s.getBranch());
		*/
		
		Student s = new Student(4,"CAI","Neelasa");
		System.out.println(s);

	}

}
