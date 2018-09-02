package com.example.phnf2014.projetotetris;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Config extends AppCompatActivity {

    private static final String PREFS_NAME = "PREFS_FILE";
    int  nivel = 200;
    int  elemento = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);



        Button Config = findViewById(R.id.salvar);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);




        Config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),Tabuleiro.class);

                Bundle b = new Bundle(); ///...

                setResult(RESULT_OK,i); // enviar valores para proxima tela
                finish();

            }
        });


    }


    @Override
    public void onStop(){
        super.onStop();

        SharedPreferences settings = getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();

        Button Config = findViewById(R.id.salvar);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);

        ////////////////////////////////////////////////////////////////////

           ///verificar a velocidade das peças

        if(R.id.lento == radioGroup2.getCheckedRadioButtonId()){
             nivel = 200;

        }else if(R.id.medio == radioGroup2.getCheckedRadioButtonId()){
            nivel = 500;

        }else if(R.id.rapido == radioGroup2.getCheckedRadioButtonId()) {
            nivel = 80;
        }
 ///////////////////////////////////////////////////////////////

/// verificar a quantidade de peças

        if(R.id.radioButton2 == radioGroup1.getCheckedRadioButtonId()){
            elemento = 2;
        }else if(R.id.radioButton4 == radioGroup1.getCheckedRadioButtonId()){
            elemento = 4;
        }else if(R.id.radioButton7 == radioGroup1.getCheckedRadioButtonId()){
            elemento =7;
        }

/// enviar valores
        editor.putInt("nivel",nivel);
        editor.putInt("qtdPecas",elemento);
        editor.commit();





    }

}
