package dog;
public class dog {
	
	String name,breed;
	
	dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	void updated(String name,String breed) {
		this.breed=breed;
		this.name=name;
	}
	void display() {
		System.out.println("Dog name:"+name);
		System.out.println("Dog breed:"+breed);
	}
//1234
	public static void main(String[] args) {
		
		dog d = new dog("Tyson","German Shepard");
		d.display();
	}
//12345
}