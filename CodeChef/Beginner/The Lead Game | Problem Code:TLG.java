import java.util.*;
import java.lang.*;
import java.io.*;

class TheLeadGame {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        int maxLead=0,finalWinner=0;
        int rounds=s.nextInt();

        for(int i=0;i<rounds;i++){
        int player1=s.nextInt();
        int player2=s.nextInt();

        int winner=0,lead=0;

        if(player1>player2){
            lead=player1-player2;
            winner=1;}
        else{
            lead=player2-player1;
            winner=2;}
        if(i==0){
            maxLead=lead;
        finalWinner=winner;}
        if(lead>maxLead){
        maxLead=lead;
        finalWinner=winner;
        }
        }
        System.out.println(finalWinner+""+maxLead);

    }

}
