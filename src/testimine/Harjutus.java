package testimine;

import java.util.Timer;
import java.util.TimerTask;


public class Harjutus {
//	private int hour;
//	private int minute;
	private int second;
	
	private Timer myTimer = new Timer();
	TimerTask startTimer = new TimerTask(){
		public void run(){
			if (second >= 55 && second <= 59 || second >= 175 && second <= 179 || second >= 295){
				second++;
				System.out.println(second + " BEEEP!");
				if(second == 300){//300
					System.out.println("STOPP");
					myTimer.cancel();
				}
			}
			else if (second >= 115 && second <= 119 || second >= 235 && second <= 239){
				second++;
				System.out.println(second + " BEEEP!");
			}
			else if (second == 60 || second == 180){
				second++;
				System.out.println(second + " PAUSE!");
			}
			else if (second == 120 || second == 240){
				second++;
				System.out.println(second + " START!");
			}
			else{
				second++;
				System.out.println("Seconds passed: " + second);
			}
		}
//			if(second < (59-1)){ //59
//				second++;
//				System.out.println("Seconds passed: " + second);
//					if (second >= 0 && second <= 54){ //54
//						System.out.println("Seconds passed: " + second);					
//					}
//					if (second >= 55 && second <= 58){ //55 58
//						System.out.println("BEEEP!");
//					}
//			} else {
//				int finalSecond = second + 1;
//				second = 0;
//				if (minute < (4-1)){
//					minute++;
//					System.out.println("BEEEEEEP! Minutes passed " + minute);
//				} else {
//					int finalMinute = minute + 1;
//					minute = 0;
//					myTimer.cancel();
//					System.out.println("BEEEEEEP! Minutes passed: " + finalMinute);
//					System.out.println("LOPP");
//				}
//			}				
//		}
	};
	
	public void start(){
//		long startTime = System.currentTimeMillis();
//		long stopTime = System.currentTimeMillis();
//		int secStart = (int) (startTime / 1000) % 60;
//		int secStop = (int) (stopTime / 1000) % 60;
//		System.out.println("algus: " + secStart);
		myTimer.scheduleAtFixedRate(startTimer, 1000, 1000);
//		if (stopTime - startTime > 30){ //240000
//			myTimer.cancel();	
//			System.out.println("Stopped!!");
//		}
	}
}
