package com.example.phnf2014.projetotetris;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class Tabuleiro extends AppCompatActivity {

    ImageView[][] tab;
    GridLayout grade;
    public static final int a = 35;
    public static final int b = 25;

    Context p = this;
    int[][] g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuleiro);

        g = new int[a][b];

        tab = new ImageView[a][b];

        grade = findViewById(R.id.tabuleiro);
        TextView prox = findViewById(R.id.proximo);
        TextView pontos = findViewById(R.id.pontos);

        grade.setRowCount(a);
        grade.setColumnCount(b);

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

        Log.i("deb", "Tamanho de linhas: " + grade.getRowCount());
        Log.i("deb", "Tamanho de colunas: " + grade.getColumnCount());
        Log.i("imagem", "Tamanho de colunas: " + grade.getColumnCount());

    }

    }
