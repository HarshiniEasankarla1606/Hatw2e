package com.example.w2e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void browser1(View view){

        Intent obj1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Priyanka_Chopra"));
        startActivity(obj1);
    }
    public void browser2(View view){

        Intent obj2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Deepika_Padukone"));
        startActivity(obj2);
    }
    public void browser3(View view){

        Intent obj3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Kiara_Advani"));
        startActivity(obj3);
    }


}
