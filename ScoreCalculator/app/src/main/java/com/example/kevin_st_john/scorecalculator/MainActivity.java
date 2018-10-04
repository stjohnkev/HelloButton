package com.example.kevin_st_john.scorecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mNearBallDistanceEditText;
    private EditText mFarBallDistanceEditText;
    private EditText mRobotHomeDistanceEditText;

    private int mCounter=0;
    private TextView mColourPointsView;
    private TextView mWBPointsView;
    private TextView mTotalPointsView;
    private TextView mNearBallView;
    private TextView mFarBallView;
    private TextView mRobotView;

    private int mColourPoints=0;
    private int mNearBallPoints=0;
    private int mFarBallPoints=0;
    private int mRobotHomePoints=0;
    private int mWBPoints=0;
    private int mTotalPoints=0;

   // private int mNearBallPointsEntered=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code goes after this
        mColourPointsView=findViewById(R.id.colour_points);
        mWBPointsView=findViewById(R.id.wb_points);
        mTotalPointsView=findViewById(R.id.total_points);
        mNearBallView=findViewById(R.id.near);
        mFarBallView=findViewById(R.id.far);
        mRobotView=findViewById(R.id.robot);

        mNearBallDistanceEditText=findViewById(R.id.near_input);
        mFarBallDistanceEditText=findViewById(R.id.far_input);
        mRobotHomeDistanceEditText=findViewById(R.id.robot_input);

        mNearBallView=findViewById(R.id.near);
        mFarBallView=findViewById(R.id.far);
        mRobotView=findViewById(R.id.robot);
    }



    public void click3(View view){
        mColourPoints=0;
        updateView();
    }

    public void click2(View view){
        mColourPoints=25;
        updateView();
    }

    public void click1(View view){
        mColourPoints=75;
        updateView();
    }
    public void click0(View view){
        mColourPoints=150;
        updateView();
    }

    public void WBYes(View view){
        mWBPoints=60;
        updateView();
    }

    public void WBNo(View view){
        mWBPoints=0;
        updateView();
    }

    public void distancePoints(View view){

        // Near Ball
        int nearBallDistance=Integer.parseInt(mNearBallDistanceEditText.getText().toString());
       // mNearBallPointsEntered=nearBallDistance;
        //mNearBallView.setText("" + mNearBallPoints);

        if(nearBallDistance>45){
            mNearBallPoints=0;
        }
        else if(nearBallDistance<=45 && nearBallDistance>30){
            mNearBallPoints=10;
        }
        else if(nearBallDistance<=30 && nearBallDistance>20){
            mNearBallPoints=50;
        }
        else if(nearBallDistance<=20 && nearBallDistance>10){
            mNearBallPoints=80;
        }
        else if(nearBallDistance<=10 && nearBallDistance>5){
            mNearBallPoints=100;
        }
        else{
            mNearBallPoints=110;
        }

        // Far Ball
        int farBallDistance=Integer.parseInt(mFarBallDistanceEditText.getText().toString());
        // mNearBallPointsEntered=nearBallDistance;
        //mNearBallView.setText("" + mNearBallPoints);

        if(farBallDistance>45){
            mFarBallPoints=0;
        }
        else if(farBallDistance<=45 && farBallDistance>30){
            mFarBallPoints=20;
        }
        else if(farBallDistance<=30 && farBallDistance>20){
            mFarBallPoints=100;
        }
        else if(farBallDistance<=20 && farBallDistance>10){
            mFarBallPoints=160;
        }
        else if(farBallDistance<=10 && farBallDistance>5){
            mFarBallPoints=200;
        }
        else{
            mFarBallPoints=220;
        }

        // Robot home
        int robotHome=Integer.parseInt(mRobotHomeDistanceEditText.getText().toString());
        // mNearBallPointsEntered=nearBallDistance;
        //mNearBallView.setText("" + mNearBallPoints);

        if(robotHome>45){
            mRobotHomePoints=0;
        }
        else if(robotHome<=45 && robotHome>30){
            mRobotHomePoints=10;
        }
        else if(robotHome<=30 && robotHome>20){
            mRobotHomePoints=50;
        }
        else if(robotHome<=20 && robotHome>10){
            mRobotHomePoints=80;
        }
        else if(robotHome<=10 && robotHome>5){
            mRobotHomePoints=100;
        }
        else{
            mRobotHomePoints=110;
        }

        updateView();

    }

    public void reset(View view){
       mColourPoints=0;
       mNearBallPoints=0;
       mFarBallPoints=0;
       mRobotHomePoints=0;
       mWBPoints=0;
       mTotalPoints=0;
       updateView();
    }

    public void updateView(){
        mTotalPoints=mColourPoints+mWBPoints+mNearBallPoints+mFarBallPoints+mRobotHomePoints;

        mColourPointsView.setText(getString(R.string.message_format, mColourPoints));
        mWBPointsView.setText(getString(R.string.message_format1, mWBPoints));
        mTotalPointsView.setText(getString(R.string.message_format2, mTotalPoints));

        mNearBallView.setText(getString(R.string.message_format2, mNearBallPoints));
        mFarBallView.setText(getString(R.string.message_format2, mFarBallPoints));
        mRobotView.setText(getString(R.string.message_format2, mRobotHomePoints));


    }
}
