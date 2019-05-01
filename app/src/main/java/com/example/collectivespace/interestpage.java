package com.example.collectivespace;

// importing libraries
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.robertlevonyan.views.chip.Chip;
import com.robertlevonyan.views.chip.OnSelectClickListener;
import java.util.ArrayList;

public class interestpage extends AppCompatActivity {


    // array list to manage selected chips to transfer to project activity
    private ArrayList<String> selectedChips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //initializing selectedChips array
        selectedChips = new ArrayList<>();
        setContentView(R.layout.activity_interestpage);

        // assigning onSelectListener to all Chips on the screen.
        // if the chip turns to selected, then its tag will be added to selectedChips list
        // if the chip turns to unselected, then its tag will be removed from the selectedChips list
        final Chip chip1 = (Chip) findViewById(R.id.chip1);
        chip1.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip1.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip1.getTag());
                }
            }
        });

        final Chip chip2 = (Chip) findViewById(R.id.chip2);
        chip2.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip2.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip2.getTag());
                }
            }
        });

        final Chip chip3 = (Chip) findViewById(R.id.chip3);
        chip3.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip3.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip3.getTag());
                }
            }
        });

        final Chip chip4 = (Chip) findViewById(R.id.chip4);
        chip4.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip4.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip4.getTag());
                }
            }
        });

        final Chip chip5 = (Chip) findViewById(R.id.chip5);
        chip5.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip5.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip5.getTag());
                }
            }
        });

        final Chip chip7 = (Chip) findViewById(R.id.chip7);
        chip7.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip7.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip7.getTag());
                }
            }
        });

        final Chip chip8 = (Chip) findViewById(R.id.chip8);
        chip8.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip8.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip8.getTag());
                }
            }
        });

        final Chip chip9 = (Chip) findViewById(R.id.chip9);
        chip9.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip9.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip9.getTag());
                }
            }
        });

        final Chip chip10 = (Chip) findViewById(R.id.chip10);
        chip10.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip10.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip10.getTag());
                }
            }
        });


        final Chip chip11 = (Chip) findViewById(R.id.chip11);
        chip11.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip11.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip11.getTag());
                }
            }
        });

        final Chip chip12 = (Chip) findViewById(R.id.chip12);
        chip12.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip12.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip12.getTag());
                }
            }
        });

        final Chip chip13 = (Chip) findViewById(R.id.chip13);
        chip13.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip13.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip13.getTag());
                }
            }
        });

        final Chip chip14 = (Chip) findViewById(R.id.chip14);
        chip14.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip14.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip14.getTag());
                }
            }
        });

        final Chip chip15 = (Chip) findViewById(R.id.chip15);
        chip15.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip15.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip15.getTag());
                }
            }
        });

        final Chip chip16 = (Chip) findViewById(R.id.chip16);
        chip16.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip16.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip16.getTag());
                }
            }
        });

        final Chip chip17 = (Chip) findViewById(R.id.chip17);
        chip17.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip17.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip17.getTag());
                }
            }
        });

        final Chip chip18 = (Chip) findViewById(R.id.chip18);
        chip18.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip18.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip18.getTag());
                }
            }
        });

        final Chip chip20 = (Chip) findViewById(R.id.chip20);
        chip20.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip20.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip20.getTag());
                }
            }
        });

        final Chip chip21 = (Chip) findViewById(R.id.chip21);
        chip21.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                if (selected){

                    selectedChips.add((String)chip21.getTag());
                }
                else
                {

                    selectedChips.remove((String)chip21.getTag());
                }
            }
        });
    }

    // continueButton click listener.
    // when the user clicks on the button, it creates intent with selectedChips list and starts feedback page with this list
    public void continueButton(View view)
    {
    Intent intent = new Intent(this, feedbackpage.class);
    intent.putExtra("chips", selectedChips);
    startActivity(intent);

    }


}
