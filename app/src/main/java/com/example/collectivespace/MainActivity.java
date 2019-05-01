package com.example.collectivespace;

// importing libraries
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Login button onClick method, the method name was added on design tab to attributes
    public void interestPage(View view)
    {
        Intent intent = new Intent(this, interestpage.class);
        startActivity(intent);

    }

    // I tried to remove action bar with code, then I managed that with XML theme change
    @Override
    public void onResume()
    {
        super.onResume();
/*
        View decorView = getWindow().getDecorView();
  // Hide the status bar.// int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getActionBar();
        if (actionBar != null)
            actionBar.hide();
*/
    }


}

