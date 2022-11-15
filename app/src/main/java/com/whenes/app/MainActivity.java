package com.whenes.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1;
    private EditText editText2;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

//    private String msg = "C Android -> ";

//    private TextView textView;
//    private EditText editText;
//    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


//----------------------------------------------------------------

//        textView = (TextView) findViewById(R.id.labelText);
//        editText = (EditText) findViewById(R.id.editText);
//        button = (Button) findViewById(R.id.button);

//        JAVA 8
//        button.setOnClickListener(view -> {
//            textView.setText("Hello " + editText.getText());
//            Toast.makeText(this, "Btn clicked J8", Toast.LENGTH_LONG).show();
//        });

//        JAVA 7
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(msg, "Clicked from listener event");
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        Double num1 = 0.0;
        Double num2 = 0.0;
        Double result = 0.0;

        num1 = Double.parseDouble(editText1.getText().toString());
        num2 = Double.parseDouble(editText2.getText().toString());
        switch (view.getId()) {
            case R.id.button1:
                result = num1 + num2;
                Toast.makeText(this, result+"", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                result = num1 - num2;
                Toast.makeText(this, result+"", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                result = num1 * num2;
                Toast.makeText(this, result+"", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                result = num1 / num2;
                Toast.makeText(this, result+"", Toast.LENGTH_LONG).show();
                break;
        }
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(msg, "onStart method");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(msg, "onResume method");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(msg, "onStop method");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(msg, "onDestroy method");
//    }

//    FromXML   android:onClick="doAction"
//    public void doAction(View view) {
//        Log.d(msg, "Action doAction was called!");
//    }
}
