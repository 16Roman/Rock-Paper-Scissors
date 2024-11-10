package edu.lorainccc.ciss.giannuzzi.rockpaperscissorsgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GameGUI extends JFrame implements ActionListener {
    public JRadioButton rb1=new JRadioButton("Rock");
    public JRadioButton rb2=new JRadioButton("Paper");
    public JRadioButton rb3=new JRadioButton("Scissors");
    ButtonGroup bg=new ButtonGroup();
    JFrame frame =new JFrame();
    public JLabel userChoice=new JLabel("Player Selected:");
    public JLabel cpuChoice=new JLabel("CPU Selected:");
    public JButton play = new JButton("Play");
    public JLabel results= new JLabel("         ");
    public static void main(String args[]){
        new GameGUI();
    }
    GameGUI() {
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        JPanel topPanel = new JPanel(); 
        JPanel middlePanel = new JPanel(); 
        JPanel bottomPanel = new JPanel(); 
        topPanel.add(rb1);
        topPanel.add(rb2);
        topPanel.add(rb3);
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        middlePanel.add(userChoice);
        middlePanel.add(cpuChoice);
        bottomPanel.add(play);
        bottomPanel.add(results);

        p.add(topPanel);
        p.add(middlePanel);
        p.add(bottomPanel);

        play.addActionListener(this);
        add(p);
        this.setTitle("Rock-Paper-Scissors");
        this.setSize(800, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //CPU
    try{
        /**
         * Randomly generate data to determine CPU's choice
         */
        Random random=new Random();
        int computerChoice=random.nextInt(3);
        if(computerChoice==0){
            cpuChoice.setText("CPU Selected: ROCK");
        }
        if(computerChoice==1){
            cpuChoice.setText("CPU Selected: PAPER");
        }
        if(computerChoice==2){
            cpuChoice.setText("CPU Selected: SCISSORS");
        }
        if(rb1.isSelected()){
            userChoice.setText("Player Selected: ROCK");
            if(computerChoice==0){
                results.setText("DRAW");
            }
            if(computerChoice==1){
                results.setText("CPU WINS");
            }
            if(computerChoice==2){
                results.setText("Player WINS");
            }
        }
        else if(rb2.isSelected()){
            userChoice.setText("Player Selected: PAPER");
            if(computerChoice==0){
                results.setText("Player WINS");
            }
            if(computerChoice==1){
                results.setText("DRAW");
            }
            if(computerChoice==2){
                results.setText("CPU WINS");
            }
        }
        else if(rb3.isSelected()){
            userChoice.setText("Player Selected: SCISSORS");
            if(computerChoice==0){
                results.setText("CPU WINS");
            }
            if(computerChoice==1){
                results.setText("Player WINS");
            }
            if(computerChoice==2){
                results.setText("DRAW");
            }
        }
        else{
            /**
             * If user did not select a radio button
             */
            userChoice.setText("Player: Error");
            results.setText("Error: Please Select an Option");
        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
        
    }
}
