package com.example.admin.phoneverification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit);
    }

    public void submit(View view)
    {
        String mob;
        mob=editText.getText().toString();
        Intent intent=new Intent(this,verify.class);
        intent.putExtra("mob",mob);
        startActivity(intent);
        finish();
    }
}
