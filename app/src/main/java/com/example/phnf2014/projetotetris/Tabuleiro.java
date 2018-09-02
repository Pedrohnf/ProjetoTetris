package com.example.phnf2014.projetotetris;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import Componente.Linha;
import Componente.Piece;

public class Tabuleiro extends AppCompatActivity {

    ImageView[][] tab;
    GridLayout grade;
    public static final int a = 35;
    public static final int b = 25;

    Context p = this;
    int[][] g;
    Handler handler = new Handler();
    Boolean running = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuleiro);

        SharedPreferences settings = getSharedPreferences("PREFS_FILE", MODE_PRIVATE);
        int qtdPecas = settings.getInt("qtdPecas", 2);
        int nivel = settings.getInt("nivel", 200);



        g = new int[a][b];

        tab = new ImageView[a][b];

        grade = findViewById(R.id.mapa);
        TextView prox = findViewById(R.id.proximo);
        TextView pontos = findViewById(R.id.pontos);

        grade.setRowCount(a);
        grade.setColumnCount(b);

         // receber nivel e qtd de peças


         /// Tabuleiro
        LayoutInflater inflater = LayoutInflater.from(p);

        for (int i = 0; i < grade.getRowCount(); i++) {
            for (int j = 0; j < grade.getColumnCount(); j++) {
                tab[i][j] = (ImageView) inflater.inflate(R.layout.inflar_tabuleiro_black, grade, false);

                if (i == 0) {
                    tab[i][j].setImageResource(R.drawable.gray);
                    g[i][j] = 1;
                } else if (i == a - 1) {
                    tab[i][j].setImageResource(R.drawable.gray);
                    g[i][j] = 1;
                }else if(j == 0){
                    tab[i][j].setImageResource(R.drawable.gray);
                    g[i][j] = 1;
                }else if(j == b - 1){
                    tab[i][j].setImageResource(R.drawable.gray);
                    g[i][j] = 1;
                }

                grade.addView(tab[i][j]);

            }

        }

        jogo();

    }

// Movimentar as peças
    public void jogo(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (running){
                    try{

                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            zerarTela();

                            Piece p = new Linha(5,1);


                        }
                });
            }
        }
    }).start();
}

    public void zerarTela(){


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                tab[i][j].setImageResource(R.drawable.black);
                g[i][j] = 0;

                if (i == 0) {
                    tab[i][j].setImageResource(R.drawable.gray);
                    g[i][j] = 1;
                } else if (i == a - 1) {
                    tab[i][j].setImageResource(R.drawable.gray);
                    g[i][j] = 1;
                }else if(j == 0){
                    tab[i][j].setImageResource(R.drawable.gray);
                    g[i][j] = 1;
                }else if(j == b - 1){
                    tab[i][j].setImageResource(R.drawable.gray);
                    g[i][j] = 1;
                }

            }

        }


    }





    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }

}