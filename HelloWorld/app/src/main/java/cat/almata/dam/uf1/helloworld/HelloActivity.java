package cat.almata.dam.uf1.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Log.i("HelloWorld", "Exiting onCreate()");
        Log.println(Log.ASSERT, "onCreate", "Finalitzant onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.println(Log.ASSERT,"onPause", "Executant onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.println(Log.ASSERT,"onStop", "Executant onStop()");
    }
}
