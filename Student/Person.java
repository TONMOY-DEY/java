public class Person{
	private String name;
	private int nid;

	public Person(){
		System.out.println("Empty cons Person");
	}
	public Person(String name, int nid){
		this.name = name;
		this.nid = nid;
		System.out.println("Para cons Person");
	}
	public void show(){
		System.out.println("Name is: "+name);
		System.out.println("Nid is: "+nid);
	}
}