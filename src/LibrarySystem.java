import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystem 
{
	
	public static void main(String[] args) 
	{
		LibrarySystem ls = new LibrarySystem();
		ls.loadLibrarySystem();
	} // end main method
	
	private Scanner scan = new Scanner(System.in);
	private int numberOfBooks;
	private ArrayList<Book> books = new ArrayList<>();
	
	public void displayHeader()
	{
		System.out.println("\t\t\tNew Library System\n\n");
	} // end displayHeader method
	
	public void addBook()
	{
		
		for(int i = 0; i < numberOfBooks; i++)
		{	
			Book temp = new Book();
			
			System.out.print("\nEnter book title: ");
			temp.setBookTitle(scan.nextLine());
			
			System.out.print("Enter book year: ");
			temp.setBookYear(Integer.parseInt(scan.nextLine()));
						
			books.add(i, temp);
			
			System.out.printf("Title '%s' added to the library.\n", temp.getBookTitle());
		}
		
		System.out.println("\nAdding books complete. Press Enter to continue.\n");
		scan.nextLine();
				
	} // end addBook method

	public void displayBookList()
	{
		displayHeader();
		System.out.println("Title\t\t\tYear");
		for(Book b : books)
		{
			System.out.println(b.getBookTitle() + "\t\t\t" + b.getBookYear());
		}
	} // end displayBookList method
	
	public void loadLibrarySystem()
	{
		displayHeader();
		System.out.print("How many new books do you want to add to the library? ");
		numberOfBooks = Integer.parseInt(scan.nextLine());
		addBook();
		displayBookList();
	} // end loadLibrarySystem method
	
} // end class
