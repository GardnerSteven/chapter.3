package youDoIt;

public class SpaService 
{
private static String serviceDescription;
		private double price;	
public void setServiceDescription(String service)


		{
			serviceDescription = service;
		}
		public void setPrice(double pr)
		{
			price = pr;
		}
		public String getServiceDescription()
		{
			return serviceDescription;
		}
		public double getPrice()
		{
			return price;
		}
	}

