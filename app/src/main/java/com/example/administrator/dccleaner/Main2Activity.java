package com.example.administrator.dccleaner;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button sbutton; //Second page's button
    private TextView ptextView; //Second page's textView of path
    private DataClean  DataCleaner;

    private String BasicAddress;  //Basic address of Android
    private String[] Address = {
            "/tencent/MobileQQ/shortvideo",
            "/tencent/MobileQQ/hotpic",
            "/tencent/MicroMsg/c58b2d370fa150e99c3141107f85c5ab/emoji",
            "/tencent/MicroMsg/c58b2d370fa150e99c3141107f85c5ab/image2",
};  //Path of cache

    //static String TAG = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sbutton = findViewById(R.id.c_button);
        ptextView = findViewById(R.id.p_textView);
        DataCleaner = new DataClean();
        BasicAddress = Environment.getExternalStorageDirectory().getAbsolutePath();

        //Log.e(TAG,Environment.getExternalStorageDirectory().getAbsolutePath());

        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i = 0; i < Address.length; i++)
                {
                    ptextView.setText(Address[i]);
                    DataCleaner.deleteFolderFile(BasicAddress + Address[i], true);
                }

                Toast.makeText(Main2Activity.this, "清理完成", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
