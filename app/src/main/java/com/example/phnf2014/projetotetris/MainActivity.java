package com.example.phnf2014.projetotetris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button novoJovo = findViewById(R.id.NovoJogo);
        Button continuar = findViewById(R.id.Continuar);
        Button configurar = findViewById(R.id.Config);


        novoJovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent novoJ = new Intent(getApplicationContext(),Tabuleiro.class);
                Bundle p1 = new Bundle();
                p1.putInt("jogo",1);
                novoJ.putExtras(p1);
                startActivityForResult(novoJ, A);
            }
        });

        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent conti = new Intent(getApplicationContext(),Recorde.class);
                Bundle p2 = new Bundle();
                p2.putInt("jogo",2);
                conti.putExtras(p2);
                startActivityForResult(conti, B);
            }
        });

        configurar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent conf = new Intent(getApplicationContext(),Config.class);
                Bundle p3 = new Bundle();
                p3.putInt("jogo",3);
                conf.putExtras(p3);
                startActivityForResult(conf, C);
            }
        });

    }
}
