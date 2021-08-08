package ca.ciccc.wmad202.proyect.problem2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Fight {
    ArrayList<Autobot> autobots;
    ArrayList<Deception> deceptions;
    ArrayList<Transformers> teamWinner;
    ArrayList<Transformers> teamLosser;

    public Fight(ArrayList<Autobot> autobots, ArrayList<Deception> deceptions){
        this.autobots=autobots;
        this.deceptions =deceptions;
    }

    //Calc number of fights
    public Integer getNumberOfFights(){
        return Math.min(autobots.size(),deceptions.size());
    }

    //SortArrays (Using stream)
    public void sortArrays(){
        autobots.stream().sorted((o1, o2) -> {
            if(o1.getRank()>o2.getRank()){
                return 1;
            }
            else if(o1.getRank() < o2.getRank()){
                return -1;
            }
            else{
                return 0;
            }
        });

        deceptions.stream().sorted((o1, o2) -> {
            if(o1.getRank()>o2.getRank()){
                return 1;
            }
            else if(o1.getRank() < o2.getRank()){
                return -1;
            }
            else{
                return 0;
            }
        });
    }

    public Integer diffProperties(int value1, int value2){
        return Math.abs(value1-value2);
    }

    //Creating rule1:  If any fighter is down 4 or more points of courage and 3 or more points of
    //strength compared to their opponent, the opponent automatically wins the
    //face-off regardless of overall rating (opponent has ran away)
    class Rule1 implements BiPredicate<Transformers,Transformers> {

        @Override
        public boolean test(Transformers t1, Transformers t2) {
            int difCourage = diffProperties(t1.getCourage(),t2.getCourage());
            int difStrength = diffProperties(t1.getStrength(),t2.getStrength());
            if((difCourage >= 4)&&(difStrength>=3)){
                return true;
            }
            return false;
        }


    }

    // if one of the fighters is 3 or more points of skill above their
    //opponent, they win the fight regardless of overall rating
    class Rule2 implements BiPredicate<Transformers, Transformers> {

        @Override
        public boolean test(Transformers t1, Transformers t2) {
            int difSkill = diffProperties(t1.getSkill(),t2.getSkill());
            if(difSkill>=3){
                return true;
            }

            return false;
        }
    }

    // The winner is the Transformer with the highest overall rating
    BiPredicate<Transformers, Transformers> rule3 = new BiPredicate<Transformers, Transformers>() {
        @Override
        public boolean test(Transformers t1, Transformers t2) {
            t1.calcOverallRating();
            t2.calcOverallRating();
            if(t1.getOverallRating() > t2.getOverallRating()){
                return true;
            }
            return false;
        }
    };

    //Any Transformer named Optimus Prime or Predaking wins his fight automatically
    //regardless of any other criteria
    BiPredicate<Transformers, Transformers> specialRule1 = (t1,t2) ->{
        if(t1.getName() == "Optimus Prime" || (t1.getName() == "Predaking")){
            return true;
        }
        return false;
    };

    // In the event either of the above face each other (or a duplicate of each other), the
    //game immediately ends with all competitors destroyed
    BiPredicate<Transformers, Transformers> specialRule2 = (t1,t2) ->{
        if((t1.getName() == "Optimus Prime" || (t1.getName() == "Predaking")) &&(t2.getName() == "Optimus Prime" || (t2.getName() == "Predaking"))){
            return true;
        }
        return false;
    };

    //Determinate team winner
    public ArrayList<Transformers> teamWinner() throws NullPointerException{
        int fightWinnerAutobot=0, figthWinnerDeception=0;
        //running a for loop with the number of fights
            if(autobots!=null && deceptions!=null){
                for(int i=0; i<getNumberOfFights();i++){
                    Autobot autobot = autobots.get(i);
                    Deception deception = deceptions.get(i);
                    //Start fight: determinate winner round
                    Transformers winnerRound = winnerRound(autobot,deception);
                    if(winnerRound instanceof Autobot){
                        fightWinnerAutobot++;
                    }
                    else if(winnerRound instanceof Deception){
                        figthWinnerDeception++;
                    }
                }
                if(fightWinnerAutobot > figthWinnerDeception){
                    teamWinner = new ArrayList<>(autobots);
                    teamLosser = new ArrayList<>(deceptions);
                    return teamWinner;
                }
                else{
                    teamWinner = new ArrayList<>(deceptions);
                    teamLosser = new ArrayList<>(autobots);
                    return teamWinner;
                }
            }
            else{
                throw new NullPointerException("You need initialize the teams first");
            }
    }

    public Transformers winnerRound(Autobot autobot, Deception deception){
        //evaluate specialRule1
        Transformers winner = GenericRules.evaluateRule(autobot,deception, specialRule1);
        if(winner!= null){
            return winner;
        }
        //evaluate specialRule2
        else{
            winner = GenericRules.evaluateRule(autobot,deception, specialRule2);
            if(winner!= null){
                return winner;
            }
            //evaluate rule1
            else{
                winner = GenericRules.evaluateRule(autobot,deception, new Rule1());
                if(winner!= null){
                    return winner;
                }
                //evaluate rule2
                else{
                    winner = GenericRules.evaluateRule(autobot,deception, new Rule2());
                    if(winner!= null){
                        return winner;
                    }
                    //evaluate rule3
                    else{
                        winner = GenericRules.evaluateRule(autobot,deception, rule3);
                        if(winner!= null){
                            return winner;
                        }
                    }
                }
            }
            return null;
        }
    }

    public ArrayList<Transformers> getSurvivingLosingTeam(){
        ArrayList<Transformers> surviving = new ArrayList<>();
        for(int i=getNumberOfFights();i<teamLosser.size();i++){
            surviving.add(teamLosser.get(i));
        }
        return surviving;
    }




}
