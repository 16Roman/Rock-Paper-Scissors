package edu.lorainccc.ciss.giannuzzi.rockpaperscissorsgame;

import java.util.Random;
public class RpsGame{
    public int playerChoice;
    public String player;
    public int computerChoice;
    public String CPU;
    public int rock=0;
    public int paper=1;
    public int scissors=2;
    public String results;
    public String Final;

    public RpsGame(int argChoice){
        playerChoice=argChoice;
    }
    //Getter
    public int getPlayerChoice(){
        return playerChoice;
    }
    //Setter
    public void setPlayerChoice(int newPlayerChoice){
        if(playerChoice>=0 && newPlayerChoice<=2){
            this.playerChoice=newPlayerChoice;
        }
        else{
            throw new IllegalArgumentException("Invalid User Input Value");
        }
        
    }

    
    public void playGame(){
        //CPU
        /**
         * Randomly Generate CPU's Choice
         */
        Random random=new Random();
        computerChoice=random.nextInt(3);
        if(computerChoice==0){
            CPU="ROCK";
        }
        if(computerChoice==1){
            CPU="PAPER";
        }
        if(computerChoice==2){
            CPU="SCISSORS";
        }
        //User
        if(playerChoice==0){
            player="ROCK";
        }
        if(playerChoice==1){
            player="PAPER";
        }
        if(playerChoice==2){
            player="SCISSORS";
        }
        //Results
        /**
         * Based on user input, determine if the user is the winner
         */
        if(computerChoice==playerChoice){
            Final="DRAW";
        }

        if(computerChoice==0){
            if(playerChoice==1){
                Final="USER WINS";
            }
            if(playerChoice==2){
                Final="CPU WINS";
            }
        }

        if(computerChoice==1){
            if(playerChoice==2){
                Final="USER WINS";
            }
            if(playerChoice==0){
                Final="CPU WINS";
            }
        }

        if(computerChoice==2){
            if(playerChoice==0){
                Final="USER WINS";
            }
            if(playerChoice==1){
                Final="CPU WINS";
            }
        }
    }
        
   
}