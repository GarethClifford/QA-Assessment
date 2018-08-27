
public abstract class Prices extends TicketNumber
{
	private int Standard = 8;
	private int Student = 6;
	private int OAP = 6;
	private int Child = 4;
	private int DiscountPrice;
	
	public int getStandard()
	{
		return this.Standard;
	}
	public int getStudent()
	{
		return this.Student;
	}
	public int getOAP()
	{
		return this.OAP;
	}
	public int getChild()
	{
		return this.Child;
	}
	public int getDiscount()
	{
		return this.DiscountPrice;
	}
}
