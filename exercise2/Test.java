package exercise2;

public class Test {

	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.setAuthor("Enid Blyton");
		myBook.setTitle("The Famous Five");
		
		Email myEmail = new Email();
		myEmail.setAuthor("UlatBuku");
		myEmail.setSubjects("Order Details");
		myEmail.setTo("Juliana");
		
		System.out.println("Subject: " + myEmail.getSubject());
		System.out.println("Dear " + myEmail.getTo() + ", Thank you for your purchase on the book title " + myBook.getTitle()
		 + "\nby " + myBook.getAuthor() + ". We are from " + myEmail.getAuthor() + " would like to wish you happy reading!");

	}

}
