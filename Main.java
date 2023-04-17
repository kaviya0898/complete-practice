package ghj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of dates");
		int size=scanner.nextInt();
		scanner.nextLine();
		Date date[]=new Date[size];
		for(int index=0;index<size;index++)
		{
			System.out.print("enter the date"+" "+(index+1)+":");
			String dates=scanner.nextLine();
			String parts[]=new String[3];
			int arrayIndex=0;
			for(int i=0;i<dates.length();)
			{
				String temp="";
				while( i< dates.length()&&dates.charAt(i)!='/')
				{
					temp+=dates.charAt(i);
					i++;
				}
				parts[arrayIndex++]=temp;
				i++;
			}
			int day=findNumber(parts[0]);
			int month=findNumber(parts[1]);
			int year=findNumber(parts[2]);
			
			date[index]=new Date(day,month,year);
		}
		
		sortDates(date);
		for(int i=0;i<date.length;i++)
		{
			System.out.println(date[i].print());
		}
//		for(Date dates:date)
//		{
//			System.out.println(dates.print());
//		}
		
	}
   
	private static void sortDates(Date[] date) 
	{
		int len=date.length;
		for(int first=0;first<len;first++)
		{
			int minimum=first;
			for(int second=first+1;second<len;second++)
			{
				if(date[second].compareTo(date[minimum])<0)
				{
					minimum=second;
				}
			}
			Date temp=date[minimum];
			date[minimum]=date[first];
			date[first]=temp;
			
		}
		
		
	}

	private static int findNumber(String string) {
		int number=0;
		for(int index=0;index<string.length();index++)
		{
			number=number*10+((int)(string.charAt(index)-48));
		}
		return number;
	}

}
