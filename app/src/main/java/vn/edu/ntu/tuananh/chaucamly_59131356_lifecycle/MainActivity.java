package vn.edu.ntu.tuananh.chaucamly_59131356_lifecycle;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate Called");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("LifeCycle", "onStart Called");
        txtTG = findViewById(R.id.textTG);
        SimpleDateFormat spF = new SimpleDateFormat("HH:mm:ss");
        String date = spF.format(new Date());
        txtTG.setText(date);
        Toast.makeText(MainActivity.this, "LifeCycle", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("LifeCycle", "onRestart Called");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("LifeCycle", "onResume Called");

    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("LifeCycle", "onPause Called");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("LifeCycle", "onStop Called");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy Called");
    }
}
