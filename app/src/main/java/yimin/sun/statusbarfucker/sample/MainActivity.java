package yimin.sun.statusbarfucker.sample;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import yimin.sun.statusbarfucker.StatusBarFucker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StatusBarFucker fucker = new StatusBarFucker();
        fucker.setWindowExtend(1);
        fucker.setStatusBarColor(Color.parseColor("#33666666"));
        fucker.setUseDarkNotiIcon(true);
        fucker.fuck(getWindow());


    }

    public void onClickFoo(View view) {
        /*ProgressDialog.show(this, null, "message", false, true);*/
        Log.d("edmund", "is content extended up = " + StatusBarFucker.isContentExtendedUp(this));
    }
}
