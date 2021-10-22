package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.DoubleUnaryOperator;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText input1,input2;
    Button pluss,minus,kali,bagi,bersihkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        hasil = findViewById(R.id.hasil);
        pluss = findViewById(R.id.pluss);
        minus = findViewById(R.id.minus);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        bersihkan = findViewById(R.id.bersihkan);
    }

    public void perkalian(View v) {
        if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
            Double angka1 = Double.parseDouble(input1.getText().toString());
            Double angka2 = Double.parseDouble(input2.getText().toString());
            Double result = angka1 * angka2;
            hasil.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan angka pada Input 1 dan Input 2", Toast.LENGTH_LONG);
            toast.show();
        }
    }

        public void pembagian(View v){
            if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                Double angka1 = Double.parseDouble(input1.getText().toString());
                Double angka2 = Double.parseDouble(input2.getText().toString());
                Double result = angka1 / angka2;
                hasil.setText(Double.toString(result));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan angka pada Input 1 dan Input 2", Toast.LENGTH_LONG);
                toast.show();
            }
        }

        public void pengurangan(View v){
            if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                Double angka1 = Double.parseDouble(input1.getText().toString());
                Double angka2 = Double.parseDouble(input2.getText().toString());
                Double result = angka1 - angka2;
                hasil.setText(Double.toString(result));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan angka pada Input 1 dan Input 2", Toast.LENGTH_LONG);
                toast.show();
            }
        }

        public void penjumlahan(View v){
            if ((input1.getText().length() > 0) && (input2.getText().length() > 0) ) {
                Double angka1 = Double.parseDouble(input1.getText().toString()) ;
                Double angka2 = Double.parseDouble(input2.getText().toString()) ;
                Double result = angka1 + angka2;
                hasil.setText(Double.toString(result));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan angka pada Input 1 dan Input 2", Toast.LENGTH_LONG);
                toast.show();
            }


        }

    public void bersihkan(View v){
        if ((input1.getText().length() > 0) && (input2.getText().length() > 0) ) {
            input1.setText("");
            input2.setText("");
            hasil.setText("0");
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan angka pada Input 1 dan Input 2", Toast.LENGTH_LONG);
            toast.show();
        }


    }
}