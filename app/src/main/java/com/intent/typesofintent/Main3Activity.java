package com.intent.typesofintent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.intent.typesofintent.databinding.ActivityMain3Binding;


public class Main3Activity extends AppCompatActivity {

private ActivityMain3Binding activityMain3Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain3Binding=ActivityMain3Binding.inflate(getLayoutInflater());
        View view=activityMain3Binding.getRoot();
        setContentView(view);

        getDataFromActivity();
    }

    private void getDataFromActivity()
    {
        String message=getIntent().getStringExtra("raman");
        activityMain3Binding.tvCool.setText(message);
    }

}
