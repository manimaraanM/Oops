package MenuDrivenApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teams {
private String TeamName;
static List<Players> player=new ArrayList<Players>();
static Map<Players,String> team=new HashMap<Players,String>();
//static Set<team> teamKey= keySet(team);
static Set<Players> k= team.keySet();


public Teams(String TeamName) {
	this.TeamName=TeamName;
	
}

public void teamDetails() {
	System.out.println("Teams available" +TeamName);
	
}
public void teamPlayerAdd(String TeamName,Players p) {
		
	team.put(p,TeamName);
}

public void teamPlayerRemove(String p) {
	for(Players player:k) {
		if(player.getFirstName().equals(p)) {
			team.remove(player);
		}
		
	}
	
}

public void teamDelete(String TeamName) {
	
	if(team.containsValue(TeamName)) {
	for(Players player:k) {
		if(team.get(player)==TeamName) {
			team.remove(player);
		}
	}
		
		
	}
}

public void teamDisplay(String TeamName) {
	
	System.out.println(TeamName +":" );
	System.out.println("===============");
	if(!team.containsValue(TeamName)) {
		System.out.println("Players are yet to be added to roaster");
		
	}
	for(Players player:k) {
		if(team.get(player).equals(TeamName)) {
		player.playerDetails();	
		}
	}
	
	
}
	//((Players) player).playerDetails();


public String getTeamName() {
	return TeamName;
	
}

public void setTeamName(String TeamName) {
	this.TeamName=TeamName;
}
}
