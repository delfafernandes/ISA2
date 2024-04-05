package Assign__;

class dog {
	private String name;
    private String breed;
    
  public dog (String name, String breed) {
	this.name=name;
	this.breed=breed;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name=name;
  }
  public String getbreed() {
    return breed;
  }
  public void setbreed(String breed) {
    this.breed=breed;
  }
}

 public class dogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog D1=new dog("Kookie","Rhodesian Ridgeback");
		dog D2=new dog("Tophy","Kangal Shepherd");
		System.out.println("Roll No: R/BCA-22-126");
		System.out.println();
		System.out.println(D1.getName()+" is a "+ D1.getbreed()+".");
		System.out.println(D2.getName()+" is a "+ D2.getbreed()+".");
		System.out.println("\nSet the new Breed of dog1 and new name of dog2:\n");
		D1.setbreed("Pug");
		D2.setName("German Sheperd");
		System.out.println(D1.getName() + " is now a " + D1.getbreed() + ".");
		System.out.println(D2.getName() + " is now a " + D2.getbreed() + ".");

	}
	
}