package javaassignment;

public class Singleton {
	public static void main(String[]args) {
		Book obj =new Book();
	}

}
class Book{
	private static final Book Book=null;
	static Book obj=new Book();
	Book(){
	}
	public static Book getObject() {
		return Book;
	}
}
