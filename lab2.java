package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RadioButton radiobutton1=findViewById(R.id.Option1);
        RadioButton radiobutton2=findViewById(R.id.Option2);
        RadioButton radiobutton3=findViewById(R.id.Option3);
        RadioButton radiobutton4=findViewById(R.id.Option4);
        Button button = findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                String selectedAns = "no Selection";
                if (radiobutton1.isChecked()){
                    selectedAns=radiobutton1.getText().toString();
                } else if (radiobutton2.isChecked()) {
                    selectedAns = radiobutton2.getText().toString();
                } else if (radiobutton3.isChecked()) {
                    selectedAns = radiobutton3.getText().toString();
                } else if (radiobutton4.isChecked()) {
                    selectedAns = radiobutton4.getText().toString();
                }
                if(selectedAns.equals("javascript object notation")){
                    Toast.makeText(MainActivity.this,"Correct Answer",
                            Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this,"Wrong Answer",
                            Toast.LENGTH_SHORT).show();
            }
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

    <TextView
        android:id="@+id/question"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="What is the full form of JSON?" />

    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <RadioButton
            android:id="@+id/Option1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="javascript object notation" />

        <RadioButton
            android:id="@+id/Option2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="java standard object notation" />

        <RadioButton
            android:id="@+id/Option3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="java security object notation" />

        <RadioButton
            android:id="@+id/Option4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="None of the above" />
    </RadioGroup>

    <Button
        android:id="@+id/submit"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Submit" />

</LinearLayout>