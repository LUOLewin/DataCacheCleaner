package com.example.administrator.dccleaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends CheckPermissions {

    Button fbutton; //First page's button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fbutton = findViewById(R.id.t_button);

        fbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent SecondPage = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(SecondPage);
            }
        });
    }
}
