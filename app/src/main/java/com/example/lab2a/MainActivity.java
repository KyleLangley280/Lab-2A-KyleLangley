package com.example.lab2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int playerScore,computerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerScore = 0;
        computerScore = 0;
        TextView t = (TextView) findViewById(R.id.outputScore);
        t.setText("Player: " + playerScore + ", Computer: " + computerScore);
    }

    public void onClickRock(View v){
        TextView t = (TextView) findViewById(R.id.outputScore);
        String computerChoice = computerChoice();
        choices("Rock", computerChoice);
        TextView computer = (TextView) findViewById(R.id.outputResult);
        if (computerChoice.equals("Rock")){
            computer.setText("Tie...Both players chose Rock!");
        }
        else if (computerChoice.equals("Paper")){
            computer.setText("Computer wins...Paper covers Rock!");
            computerScore++;
            t.setText("Player: " + playerScore + ", Computer: " + computerScore);
        }
        else if (computerChoice.equals("Scissors")){
            computer.setText("Player wins...Rock blunts Scissors!");
            playerScore++;
            t.setText("Player: " + playerScore + ", Computer: " + computerScore);
        }
        else{
            computer.setText("ERROR");
        }
    }
    public void onClickPaper(View v) {
        TextView t = (TextView) findViewById(R.id.outputScore);
        String computerChoice = computerChoice();
        choices("Paper", computerChoice);
        TextView computer = (TextView) findViewById(R.id.outputResult);
        if (computerChoice.equals("Rock")) {
            computer.setText("Player wins...Paper covers Rock!");
            playerScore++;
            t.setText("Player: " + playerScore + ", Computer: " + computerScore);
        } else if (computerChoice.equals("Paper")) {
            computer.setText("Tie...Both players chose Paper!");
        } else if (computerChoice.equals("Scissors")) {
            computer.setText("Computer wins...Scissors cuts Paper!");
            computerScore++;
            t.setText("Player: " + playerScore + ", Computer: " + computerScore);
        } else {
            computer.setText("ERROR");
        }
    }
    public void onClickScissors(View v){
        TextView t = (TextView) findViewById(R.id.outputScore);
        String computerChoice = computerChoice();
        choices("Scissors", computerChoice);
        TextView computer = (TextView) findViewById(R.id.outputResult);
        if (computerChoice.equals("Rock")){
            computer.setText("Computer wins...Rock blunts Scissors!");
            computerScore++;
            t.setText("Player: " + playerScore + ", Computer: " + computerScore);
        }
        else if (computerChoice.equals("Paper")){
            computer.setText("Player wins... Scissors cuts Paper!");
            playerScore++;
            t.setText("Player: " + playerScore + ", Computer: " + computerScore);
        }
        else if (computerChoice.equals("Scissors")){
            computer.setText("Tie...Both players chose Scissors!");
        }
        else{
            computer.setText("ERROR");
        }
    }
    public String computerChoice(){
        Random generator = new Random();
        int choice = generator.nextInt(3)+1;
        switch (choice){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "RANDOM ERROR";
        }
    }
    public void choices(String player, String computer){
        TextView playerString = (TextView) findViewById(R.id.outputPlayer);
        TextView computerString = (TextView) findViewById(R.id.outputComp);
        playerString.setText("Player's weapon: " + player);
        computerString.setText("Computer's weapon: " + computer);
    }
}