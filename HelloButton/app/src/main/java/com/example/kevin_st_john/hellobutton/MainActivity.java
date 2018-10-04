package com.example.kevin_st_john.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCounter=0;
    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code goes after this
        mMessageTextView=findViewById(R.id.text_counter);

        final Button resetButton= findViewById(R.id.reset_Button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter=0;
                updateView();
            }
        });
        //testing area
        //mMessageTextView.setText("KSJ is cool");
        //Log.d("HB","This is a test log file");

    }

    public void handle_decrement(View view){
        mCounter--;
        updateView();
    }

    public void handle_increment(View view){
        mCounter++;
        updateView();
    }

    //public void handle_reset(View view){
    //    mCounter=0;
    //    updateView();
    //}

    public void updateView(){
        mMessageTextView.setText(getString(R.string.message_format, mCounter));
        if(mCounter>10){
            mMessageTextView.setVisibility(View.INVISIBLE);
        }
        else {
            mMessageTextView.setVisibility(View.VISIBLE);
        }


    }
}

