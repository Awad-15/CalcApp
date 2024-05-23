package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.app.Activity;

public class MainActivity extends Activity {
 Button one;
 Button two;
 Button three;
 Button four;
 Button five;
 Button six;
 Button seven;
 Button eight;
 Button nine;
 Button ten;
 Button plus;
 Button minus;
 Button divide;
 Button multiply;
 Button equal;
 Button reset;
 EditText data;

 float data1;
 float data2;
 float data3;
 float data4;
 float data5;
 float data6;
 float data7;
 float data8;
 float data9;
 float data10;
 float value1;
 float value2;

    String lastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        data = (EditText) findViewById(R.id.editText1);
        one = (Button) findViewById(R.id.button9);
     two = (Button) findViewById(R.id.button8);
     three = (Button) findViewById(R.id.button7);
     four = (Button) findViewById(R.id.button6);
     five = (Button) findViewById(R.id.button5);
     six = (Button) findViewById(R.id.button4);
     seven = (Button) findViewById(R.id.button3);
     eight = (Button) findViewById(R.id.button2);
     nine = (Button) findViewById(R.id.button1);
     ten = (Button) findViewById(R.id.button11);
     plus = (Button) findViewById(R.id.button10);
     minus = (Button) findViewById(R.id.button12);
     divide = (Button) findViewById(R.id.button14);
     multiply = (Button) findViewById(R.id.button13);
     equal = (Button) findViewById(R.id.button15);
     reset = findViewById(R.id.reset);

     one.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("1");
      }
     });

     two.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("2");
      }
     });
     three.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("3");
      }
     });
     four.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("4");
      }
     });
     five.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("5");
      }
     });
     six.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("6");
      }
     });
     seven.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("7");
      }
     });
     eight.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("8");
      }
     });
     nine.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("9");
      }
     });
     ten.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       data.append("0");
      }
     });
     plus.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
      lastButton = (String) plus.getText();
      value1 = Float.valueOf(data.getText().toString());
      data.setText("");
      }
     });

     minus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         lastButton = (String) minus.getText();
         value1 = Float.valueOf(data.getText().toString());
         data.setText("");
        }
       });

     divide.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
           lastButton = (String) divide.getText();
           value1 = Float.valueOf(data.getText().toString());
           data.setText("");
          }
         });
     multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             lastButton = (String) multiply.getText();
             value1 = Float.valueOf(data.getText().toString());
             data.setText("");
            }
           });
     reset.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {data.setText("");}
     });
     equal.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View arg0) {
       value2 = Float.valueOf(data.getText().toString());
        float info;
        if(lastButton.equals("+")){
         info = value1+value2;
         data.setText(String.valueOf(info));
        }
        if(lastButton.equals("-")){
         info = value1-value2;
         data.setText((String.valueOf(info)));
        }
       if(lastButton.equals("/")){
        info = value1/value2;
        data.setText((String.valueOf(info)));
       }
       if(lastButton.equals("*")){
        info = value1*value2;
        data.setText((String.valueOf(info)));
       }}
     });

    }
}