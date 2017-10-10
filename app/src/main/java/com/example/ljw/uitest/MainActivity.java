package com.example.ljw.uitest;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    AlertDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setView(R.layout.jiancha);
        dialog = builder.create();
        dialog.show();





    }
    public void exit(View v){
        Toast.makeText(this,"btn clicked",Toast.LENGTH_SHORT).show();
        dialog.dismiss();
    }
}
