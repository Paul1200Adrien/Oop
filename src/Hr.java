/**
 * 
 */

/**
 * @author Adrien
 *
 */
public class Hr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Jsmith = new Student ("J1253301922585", "John Smith", 175, 59, "ghh5484845", "Big Data", "John Donald" );
		Lecturer lol = new Lecturer ("l1256396854" , "Fhtrs" , 178, 69 , "kass fess" , "pml" , 750 , 1.5);
		
		System.out.println(Jsmith.calculateBmi());
		System.out.println("Name of student "+ Jsmith.getName() + " has a salary of : " +Jsmith.calculateSalary(0, 0) );
		System.out.println(Jsmith.toString());
		
		System.out.println(lol.toString());
		System.out.println(lol.calculateSalary(750, 1.5));
		
	}

}
