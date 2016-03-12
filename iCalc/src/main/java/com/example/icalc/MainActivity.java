package com.example.icalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int total = 0;

    public void onButtonClick(View v) {
        Button button = (Button) v;
        String bText = (String) button.getText();
        int value = Integer.parseInt(bText);
        total += value;
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText(Integer.toString(total));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
