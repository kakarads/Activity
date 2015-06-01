package id.pam1.radius.service;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startService(View view){
        startService(new Intent(getBaseContext(),MyService.class));
    }


    public void stopService(View view){
        stopService(new Intent(getBaseContext(), MyService.class));
    }



}
