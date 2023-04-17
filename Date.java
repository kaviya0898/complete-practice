package ghj;

public class Date {
	private int day;
	private int month;
	private int year;

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public int compareTo(Date date) {
     
		if(this.year<date.getYear())
		{
			return -1;
		}
		else if(this.year==date.getYear())
		{
			if(this.month<date.getMonth())
			{
				return -1;
			}
			else if(this.month==date.getMonth())
			{
				if(this.day<date.getDay())
				{
					return -1;
				}
				
			}
		}
		
		return 0;
	}

	public String print() {
		String day=(this.day<10?"0":"")+this.day;
		String month=(this.month<10?"0":"")+this.month;
		return day+"/"+month+"/"+this.year;
	}

}
