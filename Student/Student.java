public class Student extends Person{
	private int id;
	private float cgpa;
	
	public Student(){System.out.println("Empty cons Student");}
	public Student(String name,int nid, int id, float cgpa){
		super(name,nid);
		this.id = id;
		this.cgpa = cgpa;
		System.out.println("Para cons Student");
	}
	public void show(){
		super.show();
		System.out.println("Id: "+id);
		System.out.println("cgpa: "+cgpa);
	}
}