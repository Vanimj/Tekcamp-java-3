package concurrency;

import java.util.ArrayList;
import java.util.List;

public class TeamTC1 implements Runnable{
	
//	 List<String> team = new ArrayList<>();
//
//	    //This thread should be created by implementing the Runnable interface, 
	//NOT by extending the Thread class.  In the run method of this thread,
	//print out the name of each student in your TA group, (starting with your TA). 
	//There should be a pause of 1 second before each name is printed to the console.
	//The name should then be pushed to the team List  After all the names have been pushed to this List, 
	//print out the entire list of all the students in your TA group. 
	//Don't forget your TA as well!  All of these steps should be done whenever the thread is started.
	//(i.e. it can be done directly in the run()method of the thread itself). 
	//Kick off the thread in the Main class of the concurrency package.  
//	}
	
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
