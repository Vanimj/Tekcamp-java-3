package concurrency;

import java.util.ArrayList;
import java.util.List;

public class TeamTC1 implements Runnable{
	
	
	public void run() {
		
		List<String> team = new ArrayList<String>();
		team.add("Dylan");
		team.add("Sabitha");
		team.add("Vimala");
		team.add("John");
		team.add("George");
		team.add("Katherin");
		team.add("Norita");
		team.add("Jeramy");
		team.add("Nancy");
		team.add("Victor");
		team.add("Mathew");
		team.add("Kevin");
		team.add("Jessica");
		
		for(String allnames:team) {
			System.out.println(allnames);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
