
public abstract class TicketNumber extends DiscountDay
{
	int number_standard;
	int number_student;
	int number_oap;
	int number_child;
	int number_discount;
	
	
	public void setValues(int Stand, int Stud, int OAP, int Ch)
	{
		this.number_standard = Stand;
		this.number_student = Stud;
		this.number_oap = OAP;
		this.number_child = Ch;
		this.number_discount = Stand + Stud + OAP + Ch;
	}

}
