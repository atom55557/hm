package com.example.hesapmakinesi;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText opr1;
    private EditText opr2;
    private Button btnadd;
    private  Button btnsub;
    private  Button btnmul;
    private Button btndiv;
    private Button btnclr;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1 = findViewById(R.id.editOp1);
        opr2 =findViewById(R.id.editOp2);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnclr =  findViewById(R.id.btnclr);
        txtresult= (TextView) findViewById(R.id.result);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 + oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"lutfen sayilari giriniz",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 - oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"lutfen sayilari giriniz",Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 * oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"lutfen sayilari giriniz",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 / oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"lutfen sayilari giriniz",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr1.setText("");
                opr2.setText("");
                txtresult.setText("0.00");
                opr1.requestFocus();
            }
        });

    }
}