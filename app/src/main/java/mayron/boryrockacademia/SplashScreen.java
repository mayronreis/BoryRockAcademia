package mayron.boryrockacademia;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jaciara on 04/12/2017.
 */

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Handler handle = new Handler();

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMain();
            }
        }, 3000);
    }

    private void mostrarMain() {
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_in);
        finish();
    }
}

