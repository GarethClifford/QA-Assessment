import java.util.Calendar;
import java.util.Date;

public abstract class DiscountDay
{
	public void Discount(int DiscountPrice)
	{
		if (isWednesday())
			DiscountPrice = 2;
		
		else 
			DiscountPrice = 0;
	}
	private boolean isWednesday()
	{
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
	}
}