package com.example.myapplication;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText inr = findViewById(R.id.inr);
        EditText r = findViewById(R.id.res);
        Button dollar = findViewById(R.id.but1);
        Button yen = findViewById(R.id.but2);
        Button pound = findViewById(R.id.but3);
        Button euro = findViewById(R.id.but4);

        dollar.setOnClickListener(view -> {
            double a = Double.parseDouble(inr.getText().toString());
            double c = 0.012 * a;
            r.setText(Double.toString(c));
        });

        yen.setOnClickListener(view -> {
            double a = Double.parseDouble(inr.getText().toString());
            double c = a * 1.73;
            r.setText(Double.toString(c));
        });

        pound.setOnClickListener(view -> {
            double a = Double.parseDouble(inr.getText().toString());
            double c = a * 0.009;
            r.setText(Double.toString(c));
        });

        euro.setOnClickListener(view -> {
            double a = Double.parseDouble(inr.getText().toString());
            double c = a * 0.011;
            r.setText(Double.toString(c));
        });
    }
}


activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/inr"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter amount in INR" />

    <GridLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:columnCount="2"
        android:rowCount="2">

        <Button
            android:id="@+id/but1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Dollar" />

        <Button
            android:id="@+id/but2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Yen" />

        <Button
            android:id="@+id/but3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Pound" />

        <Button
            android:id="@+id/but4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Euro" />
    </GridLayout>

    <EditText
        android:id="@+id/res"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:editable="false"
        android:hint="Result" />

</LinearLayout>