public class Sportsman extends Student{
	private String category;
	private int rank;
	private int jn;
	
	public Sportsman(String name,int nid, int id, float cgpa,String category,int rank,int jn){
		super(name,nid,id,cgpa);
		this.category = category;
		this.rank = rank;
		this.jn = jn;
		System.out.println("para cons of Sportsman");
		
	};
	public void show(){
		super.show();
		System.out.println("Category: "+category);
		System.out.println("Rank: "+rank);
		System.out.println("Jn: "+jn);
	}
	
}