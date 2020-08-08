package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<ADDITION> extends AppCompatActivity {
    private Button a1;
    private Button a2;
    private Button a3;
    private Button a4;
    private Button a5;
    private Button a6;
    private Button a7;
    private Button a8;
    private Button a9;
    private Button a0;
    private Button aa;
    private Button as;
    private Button am;
    private Button ad;
    private Button ac;
    private Button ae;
    private Button aexit;
    private TextView info;
    private TextView res;
    private double val1=Double.NaN;
    private double val2 ;
    private char action;
    private final char ADDITION='+';
    private final char SUBTRACTION='-';
    private final char MULTIPLICATION='*';
    private final char DIVISION='/';
    private final char equ=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aexit= findViewById(R.id.exit);
        aexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        setupid();
       a0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               info.setText(info.getText().toString()+"0");
           }
       });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"9");
            }
        });
        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=SUBTRACTION;
                res.setText(String.valueOf(val1)+"-");
                info.setText(null);
            }
        });
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=ADDITION;
                res.setText(String.valueOf(val1)+"+");
                info.setText(null);
            }
        });
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=MULTIPLICATION;
                res.setText(String.valueOf(val1)+"*");
                info.setText(null);
            }
        });
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=DIVISION;
                res.setText(String.valueOf(val1)+"/");
                info.setText(null);
            }
        });
        ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=equ;
                res.setText(res.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));
                info.setText(null);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length()>0)
                {
                    CharSequence name=info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    res.setText(null);
                    info.setText(null);
                }
            }
        });

    }

    public void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(info.getText().toString());
            switch(action)
            {
                case ADDITION:
                    val1=val1+val2;
                    break;
                case SUBTRACTION:
                    val1=val1-val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case equ:
                    break;
            }
        }
        else
        {
            val1=Double.parseDouble(info.getText().toString());
        }
    }
    public void setupid()
    {
        a1=findViewById(R.id.b1);
        a2=findViewById(R.id.b2);
        a3=findViewById(R.id.b3);
        a4=findViewById(R.id.b4);
        a5=findViewById(R.id.b5);
        a6=findViewById(R.id.b6);
        a7=findViewById(R.id.b7);
        a8=findViewById(R.id.b8);
        a9=findViewById(R.id.b9);
        a0=findViewById(R.id.b0);
        aa=findViewById(R.id.a);
        as=findViewById(R.id.s);
        am=findViewById(R.id.m);
        ad=findViewById(R.id.d);
        ac=findViewById(R.id.c);
        ae=findViewById(R.id.e);
        info=findViewById(R.id.t2);
        res=findViewById(R.id.t1);
    }
}
