/**
 * 
 */

/**
 * @author Adrien
 *"super class"
 */
//parent class 

public abstract class Person {
	
	//defining attributes
	private String nid;
	private String name;
	private double height;
	private double weight;
	/**
	 * default constructor 
	 */
	public Person() {

	}
	/**
	 * overloaded constructor
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Person(String nid, String name, double height, double weight) {
		super();
		this.nid = nid;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	/**
	 * @return the nid
	 */
	public String getNid() {
		return nid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param nid the nid to set
	 */
	public void setNid(String nid) {
		this.nid = nid;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double calculateBmi () {
		return(weight/(Math.pow(height/100, 2)));
		
	}
	/**
	 * compare if two persons are the same 
	 * @param p
	 * @return
	 */
	public boolean equals(Person p ) {
		if (this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false ; 
		}
	}
	
	public abstract String toString();
	public abstract double calculateSalary(double hoursWorked, double rate);
}


