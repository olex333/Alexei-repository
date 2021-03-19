package com.demo.main;

import java.util.List;

import com.demo.model.Player;
import com.demo.playerdao.PlayerDAO;
import com.demo.playerdao.impl.PlayerDAOImpl;

public class PlayerMain {

	public static void main(String[] args) {

		PlayerDAO dao = new PlayerDAOImpl();
//		Player p=new Player(110, "Raj", "Bangalore", 23, "M");
//		
//		int c=dao.addPlayer(p);
//		if (c>0) {
//			System.out.println("Player registered with below details");
//			System.out.println(p);
//		} else {
//			System.out.println("Failure in registration");
//		}

//		int id=102;
//		Player player=dao.getPlayerById(id);
//		if(player==null) {
//			System.out.println("No player found with id "+id);
//		}else {
//			System.out.println("Player found with id = "+id+" and the details are below :");
//			System.out.println(player);
//		}

//		List<Player> playerList = dao.getAllPlayers();
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now in DB");
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//		}
//		int id = 109;
//		String newCity = "Delhi";
//		int c=dao.updatePlayerCity(id, newCity );
//		if (c>0) {
//			System.out.println("City Updated");
//		} else {
//			System.out.println("Unable to update the city");
//		}
//		String teamName = "ABC Riders";
//		List<Player> playerList = dao.getAllPlayersByTeamName(teamName);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now in DB");
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//
//		}
		
//		int age = 21;
//		List<Player> playerList = dao.getAllPlayersByAge(age);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now in DB");
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//
//		}
		
//		String location = "Delhi";
//		List<Player> playerList = dao.getAllPlayersByTeamLocation(location);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now in DB");
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//
//		}
		
//		String teamId = "T0003";
//		List<Player> playerList = dao.getAllPlayersByTeamId(teamId);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now in DB");
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//
//		}
		
		String city = "Bangalore";
		List<Player> playerList = dao.getAllPlayersByCity(city);
		if (playerList.size() == 0) {
			System.out.println("No players as of now in DB");
		} else {
			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
			}

		}

	}
}
