package ru.samsung.itschool.mdev.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button btn;
    private int counter;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        // реализация интерфейса через анонимный класс
        // лямбда выражение
        btn.setOnClickListener(v -> {
            counter++;
            tv.setText(Integer.toString(counter));
        });
        tv = findViewById(R.id.textView);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ccc",counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("ccc");
        tv.setText(Integer.toString(counter));
    }

    /*
    @Override
    public void onClick(View v) {
        counter++;
        tv.setText(Integer.toString(counter));
    }

     */
}