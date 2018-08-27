
public class Total extends Prices
{
		public String FinalAmount(int Cost)
		{
			Cost = (getStandard()*this.number_standard) + (getStudent()*this.number_student) + (getOAP()*this.number_oap) + (getChild()*this.number_child) - (getDiscount()*this.number_discount);;
			return("The total amount for the tickets, inlcuding relevant discounts will be £" + Cost);
		}
}
