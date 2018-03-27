package toong.vn.androidhandler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 2500);
    }

    private void testContructor() {
        Handler handler = new Handler();

        Handler handler2 = new Handler(Looper.getMainLooper());
    }
}
