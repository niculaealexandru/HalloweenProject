package com.stepit.holloweenCastle;

import com.stepit.model.DisplayMessage;
import com.stepit.model.GameQuestions;
import com.stepit.model.Sound;

import java.io.File;

public class HolloweenCastle {


    public static void main(String[] args) {

        File entry = new File("entry.wav");

        DisplayMessage dm = new DisplayMessage();
        dm.displayMessageEnjoyGame();
        Sound.playSound(entry);
        dm.chooseRealms();
        dm.showRealms();

        GameQuestions q = new GameQuestions();
        q.questions();
        
    }
}

