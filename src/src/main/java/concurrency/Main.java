package concurrency;

public class Main {

	public static void main(String[] args) {

		Reasoning reasoning = new Reasoning();
		reasoning.run();
		reasoning.start();
		distinguish();
		TeamTC1 teamNames = new TeamTC1();
		teamNames.run();
	}
	
	public static void distinguish() {
		
		System.out.println("The difference between thread and a process is thread is "
				+ " a flow of execution and process is a program under execution");
	}

}
