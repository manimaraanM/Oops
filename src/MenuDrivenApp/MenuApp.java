package MenuDrivenApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuApp {
	private static Scanner s = new Scanner(System.in);
	private static Teams team;
	private static Players play;
	private static List<Players> p=new ArrayList<Players>();
	private static List<Teams> t=new ArrayList<Teams>();
	
	public static void main(String [] args) {
		
		int i =0;
		while(i<=0) {
			display();
			try {
				int selection = s.nextInt();
				if(selection >0 && selection<8) {
					i= operation(selection);
				}
				else
					System.err.println("Please enter valid selection");
			}
			
			catch(Exception e)
			{
				System.err.println("Please enter valid selection");
				i =1;
			}
			
		}	
		
	}

	public static void display() {
		System.out.println("Welcome to Teams App");
		System.out.println("1. View Teams");
		System.out.println("2. Create Teams");
		System.out.println("3. View Players");
		System.out.println("4. Add Players to team");
		System.out.println("5. Delete Player from team");
		System.out.println("6. Delete entire team");
		System.out.println("7. Exit");
		
		
	}
	
	public static int operation(int opt) {
		if(opt ==1 ) {
			viewTeams();
		}
		else if(opt ==2) {
			createTeams();
		}
	else if(opt ==3) {
			viewPlayers();
		}
		else if(opt ==4) {
			addPlayers();
		}
		else if(opt ==5) {
			deletePlayers();
		}
		else if(opt ==6) {
			deleteTeam();
		}
	else if(opt ==7) {
			exit();
			return 1;
		}
	else {
			return 1;
	
	}
		return 0;
	}

	private static void exit() {
		System.out.println("Thanks for visiting app");
		
	}

	
	private static void deletePlayers() {
		viewTeams();
		System.out.println("Please enter the player you would like to delete");
		String player1=s.next();
		Players playerAvl;
		try{
			playerAvl= playervalidate(player1);
		
			
		team.teamPlayerRemove(playerAvl.getFirstName());
		
		}
		catch(Exception e)
		{
			System.err.println("Enter Valid Player name");
		}
		
		
	}

	private static Players playervalidate(String player1) throws Exception {
		for(Players player:p) {
			if(player.getFirstName().equals(player1)) {
				return player;
				
			}
		}
		throw new Exception ("PlayernotFound");
		
	}

	private static void viewPlayers() {
		viewTeams();
		System.out.println("Please enter the team you would like to view");
		String team1=s.next();
		Teams Available;
		try {
		 Available= teamvalidate(team1);
		
		team.teamDisplay(Available.getTeamName());
		}
		catch(Exception e)
		{
			System.err.println("Enter Valid Team name");
		}
	}

	private static void addPlayers() {
		
		viewTeams();
		
		System.out.println("Please enter the team to be added");
		String team1=s.next();
		Teams Available;
		try {
			Available = teamvalidate(team1);
		
		System.out.print("Please enter Player First name");
		String firstName=s.next();
		System.out.print("Please enter Player Last name");
		String lastName=s.next();
		System.out.print("Please enter Player position");
		String position = s.next();
		play = new Players(firstName,lastName,position);
		play.playerDetails();
		team.teamPlayerAdd(Available.getTeamName(), play);
		p.add(play);
		}
		catch(Exception e)
		{
			System.err.println("Enter Valid Team name");
		}
		
	}
	private static void deleteTeam() {
		viewTeams();
		System.out.println("Please enter the team you would like to delete");
	String team1=s.next();
	Teams Available;
	try {
		Available= teamvalidate(team1);
	
		team.teamDelete(Available.getTeamName());
		t.remove(Available);
		}
		catch(Exception e)
		{
			System.err.println("Enter Valid Team name");
		}
		
	}

	private static Teams teamvalidate(String team1) throws Exception {
		for(Teams team:t) {
			if(team.getTeamName().equals(team1)) {
				return team;
				
			}
		}
		throw new Exception("TeamnotFound");
		
	}

	private static void createTeams() {
		System.out.print("Please enter the team name to be created");
		team = new Teams(s.next());
		t.add(team);
	}

	private static void viewTeams() {
		System.out.println("Teams available:");
		for(Teams teamlist:t) {
			System.out.println(teamlist.getTeamName());
			//System.out.println(teamlist);
		}
	}
}