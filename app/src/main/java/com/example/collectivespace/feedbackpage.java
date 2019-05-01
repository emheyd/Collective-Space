package com.example.collectivespace;

// importing libraries
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.robertlevonyan.views.chip.Chip;
import java.util.ArrayList;

public class feedbackpage extends AppCompatActivity {

    // array list is defined to get the list coming from interest page
    ArrayList<String> chipList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackpage);

        // getting the array list from intent
        chipList = getIntent().getStringArrayListExtra("chips");

        //in order to check the number of selected chips, I used toast to print them on the screen.
        Toast toast=Toast.makeText(getApplicationContext(),String.valueOf(chipList.size()),Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();
    }

}
