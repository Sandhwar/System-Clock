import java.time.*;
public class Clock
{
	public static void main(String[] args)
	{
		LocalDateTime currentTime;
		int nowSec;
		int i=0;
		int prevSec=0;
		for(;;)
		{   
			currentTime=LocalDateTime.now();
			nowSec=currentTime.getSecond();
			if(nowSec!=prevSec)
			{
				System.out.println(currentTime.getHour()+"."+currentTime.getMinute()+"."+currentTime.getSecond());
				prevSec=nowSec;
			}
		}
	}
}
	
		
