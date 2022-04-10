package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_MyApplication);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        openActivity2();
    }
});
}
public void openActivity2(){
    Intent intent = new Intent(this, Activity2.class);
    startActivity(intent);
}


    public void radioButtonhandler(View view) {

        // Decide what happens when a user clicks on a button
    }






    public void submitbuttonHandler(View view) {
        //Decide what happens when the user clicks the submit button

    }
}