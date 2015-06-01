package id.pam1.radius.makeup;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    String p = "Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(p, " On Create () Event");
    }


    protected void OnStart(){
        super.onStart();
        Log.d(p, "On Start () Event");
    }

    protected void OnResume(){
        super.onResume();
        Log.d(p,"On Resume () Event");
    }

    protected void OnPause(){
        super.onPause();
        Log.d(p, "On pause () Event");
    }



}
