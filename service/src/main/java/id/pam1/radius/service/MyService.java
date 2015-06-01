package id.pam1.radius.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;


/**
 * Created by Radius on 30/05/2015.
 */
public class MyService extends Service {

    @Override
    public IBinder onBind(Intent arg0){
        return null;
    }

    @Override
    public int onStartCommand (Intent intent, int flags, int startId){
        Toast.makeText(this, "Service Start", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Service Stop", Toast.LENGTH_SHORT).show();

    }


}
