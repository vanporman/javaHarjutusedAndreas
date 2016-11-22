package testimine;

import java.util.Timer;
import java.util.TimerTask;

public class Harjutus2 {
//	private int hour;
//	private int minute;
	private int second;
	
	private Timer myTimer = new Timer();
	TimerTask startTimer = new TimerTask(){
		public void run(){
			if (second >= 25 && second <= 29 || second >= 115 && second <= 119 || second >= 200){
				second++;
				System.out.println(second + " BEEEP!");
				if(second == 205){//205
					System.out.println("STOPP");
					myTimer.cancel();
				}
			}
			else if (second >= 85 && second <= 89 || second >= 175 && second <= 179){
				second++;
				System.out.println(second + " BEEEP!");
			}
			else if (second == 30 || second == 120){
				second++;
				System.out.println(second + " PAUSE!");
			}
			else if (second == 90 || second == 180){
				second++;
				System.out.println(second + " START!");
			}
			else {
				second++;
				System.out.println("Seconds passed: " + second);
			}				
		}
	};
	
	public void start(){
		myTimer.scheduleAtFixedRate(startTimer, 1000, 1000);
	}
}
