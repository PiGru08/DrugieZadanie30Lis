package com.example.drugiezadanie30lis;

import android.os.CountDownTimer;
import android.widget.Button;

public class Gracz {
    int pozostaleSekundy;
    boolean czyDziala;

    Button buttonGracz1;
    CountDownTimer countDownTimer;

    public Gracz(boolean czyDziala, Button buttonGracz1) {
        this.czyDziala = czyDziala;
        this.buttonGracz1 = buttonGracz1;
        pozostaleSekundy = 3*60;
    }

    public void stopTimer(){
        czyDziala = false;
    }

    public void startTimer(){
        czyDziala = true;
        countDownTimer = new CountDownTimer(1000*pozostaleSekundy,1000) {
            @Override
            public void onTick(long l) {
                pozostaleSekundy = (int)l/1000;
                buttonGracz1.setText(String.valueOf(pozostaleSekundy));
                //TODO: poprawić wyświetlanie
            }

            @Override
            public void onFinish() {
                buttonGracz1.setText("KONIEC");
            }
        };
    }
}
