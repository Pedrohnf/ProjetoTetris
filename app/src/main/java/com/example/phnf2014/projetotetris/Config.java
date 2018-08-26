package com.example.phnf2014.projetotetris;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Config extends AppCompatActivity {

    private static final String PREFS_NAME = "PREFS_FILE";
    int selecionar_Nivel = 0, nivel = 0;
    int selecionar_pecas = 0, elemento = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        Button Config = findViewById(R.id.salvar);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioGroup qtdPecas = findViewById(R.id.qtdPecas);


        SharedPreferences settings = getSharedPreferences(PREFS_NAME,MODE_PRIVATE);

        int s = getSelecionar_Nivel();
        int p = getSelecionar_pecas();

        nivel = settings.getInt("nivel",s);
        elemento = settings.getInt("elemento",p);

        // Verificar o Nivel do Jogo
         if(nivel == R.id.lento){
            radioGroup2.check(R.id.lento);

         }else if(nivel == R.id.medio){
            radioGroup2.check(R.id.medio);

         }else if(nivel == R.id.rapido){
             radioGroup2.check(R.id.rapido);
         }

         // Verificar a quantidade de peças
         if(elemento == R.id.Numero2){
             qtdPecas.check(R.id.Numero2);

         }else if(elemento == R.id.Numero3){
             qtdPecas.check(R.id.Numero3);

         }else if(elemento == R.id.Numero4){
             qtdPecas.check(R.id.Numero4);

         }else if(elemento == R.id.Numero5){
             qtdPecas.check(R.id.Numero5);

         }else if(elemento == R.id.Numero6){
             qtdPecas.check(R.id.Numero6);

         }else if(elemento == R.id.Numero7){
             qtdPecas.check(R.id.Numero7);
         }



    }


    @Override
    public void onStop(){
        super.onStop();

        Button Config = findViewById(R.id.salvar);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioGroup qtdPecas = findViewById(R.id.qtdPecas);

/////////////////////////////////////////////////////////////////////

        if(R.id.lento == radioGroup2.getCheckedRadioButtonId()){
            selecionar_Nivel = radioGroup2.getCheckedRadioButtonId();
            nivel = 200;

        }else if(R.id.medio == radioGroup2.getCheckedRadioButtonId()){
            selecionar_Nivel = radioGroup2.getCheckedRadioButtonId();
            nivel = 500;

        }else if(R.id.rapido == radioGroup2.getCheckedRadioButtonId()) {
            selecionar_Nivel = radioGroup2.getCheckedRadioButtonId();
            nivel = 80;
        }
 ///////////////////////////////////////////////////////////////

        if(R.id.Numero2 == qtdPecas.getCheckedRadioButtonId()){
             selecionar_pecas = qtdPecas.getCheckedRadioButtonId();
             elemento = 2;

        }else if(R.id.Numero3 == qtdPecas.getCheckedRadioButtonId()){
            selecionar_pecas = qtdPecas.getCheckedRadioButtonId();
            elemento = 3;

        }else if(R.id.Numero4 == qtdPecas.getCheckedRadioButtonId()){
            selecionar_pecas = qtdPecas.getCheckedRadioButtonId();
            elemento = 4;

        }else if(R.id.Numero5 == qtdPecas.getCheckedRadioButtonId()){
            selecionar_pecas = qtdPecas.getCheckedRadioButtonId();
            elemento = 5;

        }else if(R.id.Numero6 == qtdPecas.getCheckedRadioButtonId()){
            selecionar_pecas = qtdPecas.getCheckedRadioButtonId();
            elemento = 6;

        }else if(R.id.Numero7 == qtdPecas.getCheckedRadioButtonId()){
            selecionar_pecas = qtdPecas.getCheckedRadioButtonId();
            elemento = 7;
        }






    }

    public  int getSelecionar_Nivel(){
        return this.selecionar_Nivel;
    }

    public  int getSelecionar_pecas(){
        return this.selecionar_pecas;
    }

}
