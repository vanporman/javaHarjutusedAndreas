package testimine;

import java.util.Timer;
import java.util.TimerTask;

public class AllaLugemine {
	
	private static int aegMaha = Meetodid.aegStardini + 1;
	private static String minuValik2 = Meetodid.minuValik;
	
	 Timer myTimer = new Timer();
	 TimerTask startTimer = new TimerTask(){
		public void run(){
			if (aegMaha < 2){
				aegMaha--;
				System.out.println("STARTS");
				if (aegMaha == 0 && minuValik2.equals("wall sit")){
					myTimer.cancel();
					Harjutus harjutus1 = new Harjutus();
					harjutus1.start();
				} else if (aegMaha == 0 && minuValik2.equals("plank")){
					myTimer.cancel();
					Harjutus harjutus2 = new Harjutus();
					harjutus2.start();
				} else if (aegMaha == 0 && minuValik2.equals("side plank")){
					myTimer.cancel();
					Harjutus2 harjutus3 = new Harjutus2();
					harjutus3.start();
				}
			} else {
				aegMaha--;
				System.out.println("Seconds to go: " + aegMaha);
			}
		}	
	};
	
	public void start(){
		myTimer.scheduleAtFixedRate(startTimer, 1000, 1000);
	}
}
