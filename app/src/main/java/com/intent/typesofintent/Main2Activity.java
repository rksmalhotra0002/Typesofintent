package com.intent.typesofintent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.intent.typesofintent.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {

private ActivityMain2Binding activityMain2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain2Binding=ActivityMain2Binding.inflate(getLayoutInflater());
        View view=activityMain2Binding.getRoot();
        setContentView(view);

        setListener();

    }

    private void setListener()
    {
  activityMain2Binding.btnClick.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

          String message=activityMain2Binding.etName.getText().toString();
          Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
          intent.putExtra("raman",message);
          startActivity(intent);

      }
  });
    }

}
