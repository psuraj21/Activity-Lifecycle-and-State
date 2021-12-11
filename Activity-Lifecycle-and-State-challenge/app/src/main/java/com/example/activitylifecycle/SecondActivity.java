package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button apples,banana,pumpkin, cheese,rice,egg, grapes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get references of buttons
        apples=findViewById(R.id.btn_apple);
        banana=findViewById(R.id.btn_banana);
        pumpkin=findViewById(R.id.btn_pumpkin);
        cheese=findViewById(R.id.btn_cheese);
        rice=findViewById(R.id.btn_rice);
        egg=findViewById(R.id.btn_egg);
        grapes=findViewById(R.id.btn_grapes);

    }
//method of reply of apple button
    public void AppleReply(View view) {
        Intent replyIntent = new Intent();
        String applesText = apples.getText().toString();
        replyIntent.putExtra("appleReply", applesText);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    //method of reply of banana button
    public void BananaReply(View view){
        Intent replyIntent = new Intent();
        String bananaText = banana.getText().toString();
        replyIntent.putExtra("bananaReply", bananaText);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
    //method of reply of pumpkin button
    public void PumpkinReply(View view){
        Intent replyIntent = new Intent();
        String pumpkinText = pumpkin.getText().toString();
        replyIntent.putExtra("pumpkinReply", pumpkinText);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
    //method of reply of cheese Button
    public void CheeseReply(View view){
        Intent replyIntent = new Intent();
        String cheeseText = cheese.getText().toString();
        replyIntent.putExtra("cheeseReply", cheeseText);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
    //method of reply of rice button
    public void RiceReply(View view){
        Intent replyIntent = new Intent();
        String riceText = rice.getText().toString();
        replyIntent.putExtra("riceReply", riceText);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
    //method of reply of egg button
    public void EggReply(View view){
        Intent replyIntent = new Intent();
        String eggText = egg.getText().toString();
        replyIntent.putExtra("eggReply", eggText);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
    //method of reply of grapes button
    public void GrapesReply(View view){
        Intent replyIntent = new Intent();
        String grapesText = grapes.getText().toString();
        replyIntent.putExtra("grapesReply", grapesText);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

}