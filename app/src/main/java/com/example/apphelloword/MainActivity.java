package com.example.apphelloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickBtn (View view) {
        EditText editTxtName = findViewById(R.id.editTxtName);
        TextView txtHello = findViewById(R.id.txtMessage);

        String userName = editTxtName.getText().toString();
        txtHello.setText("Olá " + userName + ", bem-vindo ao seu primeiro App!");
    }
}