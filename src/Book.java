public class Book 
{

	private String bookTitle;
	private int bookYear;
	
	
	public Book()
	{
		
	} // end Book constructor
	
	public Book(String bookTitle, int bookYear)
	{
		this.bookTitle = bookTitle;
		this.bookYear = bookYear;
	} // end Book constructor
	
	public String getBookTitle()
	{
		return this.bookTitle;
	} // end getBookTitle method
	
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	} // end setBookTitle method
	
	public int getBookYear()
	{
		return this.bookYear;
	} // end getBookYear method
	
	public void setBookYear(int bookYear)
	{
		if(bookYear >= 1100 && bookYear <= 2017)
		{
			this.bookYear = bookYear;
		}
		else
		{
			this.bookYear = 1900;
		}
	} // end setBookYear method
	
} // end class
