package ca.ciccc.wmad202.proyect.problem2;

import java.util.ArrayList;

public class TestProyect {
    public static void run(){
        Deception deception1 = new Deception("Soundwave",8,9,2,6,7,5,6,10);
        Autobot autobot1 = new Autobot("Bluestreak",6,6,7,9,5,2,9,7);
        Autobot autobot2 = new Autobot("Hubcap",4,4,4,4,4,4,4,4);
        ArrayList<Deception> deceptions = new ArrayList<>();
        ArrayList<Autobot> autobots = new ArrayList<>();
        deceptions.add(deception1);
        autobots.add(autobot1);
        autobots.add(autobot2);
        Fight fight = new Fight(autobots,deceptions);
        fight.sortArrays();
        System.out.println("The number of battles: "+ fight.getNumberOfFights());
        ArrayList<Transformers> teamWinner = fight.teamWinner();
        if(teamWinner.get(0) instanceof Deception){
            System.out.print("The winner team: (Decepticons): ");
        }
        else if(teamWinner.get(0) instanceof Autobot){
            System.out.println("The winner team: (Autobots)");
        }
        teamWinner.stream().forEach(s-> System.out.println(s.getName()));
        //teamWinner.stream().forEach(s-> System.out.println(s));
        ArrayList<Transformers> survivingLosserTeam = fight.getSurvivingLosingTeam();
        System.out.print("The surviving member of the losing team: ("+survivingLosserTeam.get(0).nameClass+"): ");
        survivingLosserTeam.stream().forEach(s-> System.out.println(s.getName() +" "));


    }
}
