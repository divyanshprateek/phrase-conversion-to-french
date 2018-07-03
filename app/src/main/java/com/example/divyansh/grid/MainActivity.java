package com.example.divyansh.grid;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void speak(View view)
    {
        int id = view.getId();
        String oid = "";
        oid = view.getResources().getResourceEntryName(id);
        Log.i("ID : ",oid);
        int resourceid = getResources().getIdentifier(oid , "raw" ,"com.example.divyansh.grid");
        MediaPlayer mp = MediaPlayer.create(this,resourceid);
        mp.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
