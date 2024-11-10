package edu.lorainccc.ciss.giannuzzi.rockpaperscissorsgame;

public class UnitTest {
    public static void main(String[] args){
        //Select different options for the user
        //0=Rock 1=paper 2=scissors
        RpsGame game=new RpsGame(2);
        game.playGame();
        if(game.player!=null){
            game.results="CPU selected "+game.CPU+"\n"+ "The Player selected "+ game.player ;
        System.out.println(game.results);
        System.out.println(game.Final);
        }
        else{
            System.out.println("Invalid User Value");
        }
    }
}
