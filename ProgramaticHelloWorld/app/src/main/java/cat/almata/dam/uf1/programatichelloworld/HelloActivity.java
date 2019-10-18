package cat.almata.dam.uf1.programatichelloworld;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(lp);
        TextView display = new TextView(this);
        display.setText("Hello World!!");
        display.setTextColor(getResources().getColor(R.color.Vermell));
        display.setLayoutParams(lp);
        layout.addView(display);
        TextView display2 = new TextView(this);
        display2.setText(getResources().getText(R.string.respostes));
        display.setTextColor(getResources().getColor(R.color.Vermell));
        display2.setLayoutParams(lp);
        layout.addView(display2);
        setContentView(layout);

        Log.i("ProgramaticHelloWorld","Exiting from onCreate()");
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
