package testimine;

import java.util.Timer;
import java.util.TimerTask;

public class Stopper {
	private int hour;
	private int minute;
	private int second;
	
	private Timer myTimer = new Timer();
	TimerTask startTimer = new TimerTask(){
		public void run(){
			if(second < 59){ //59
				second++;
				System.out.println("Seconds passed: " + second);
			} else {
				second = 0;
				if (minute < 59){ //59
					minute++;
					System.out.println("Minutes passed: " + minute);
				} else {
					minute = 0;
					hour++;
					System.out.println("Hours passed: " + hour);
				}
			}
		}
	};
	
	public void start(){
		myTimer.scheduleAtFixedRate(startTimer, 1000, 1000);
	}
}
