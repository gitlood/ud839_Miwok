/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the number category
//        TextView numbers = (TextView) findViewById(R.id.numbers);
//
//        //Set a clicklistener on that view
//        numbers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Create a new intent to open the {@link Numbers Activity}
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//
//                //Start the new activity
//                startActivity(numbersIntent);
//            }
//        });
//
//        TextView family = (TextView) findViewById(R.id.family);
//
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Create a new intent to open the {@link Family Activity}
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//
//                //Start the new activity
//                startActivity(familyIntent);
//            }
//        });
//
//        TextView colors = (TextView) findViewById(R.id.colors);
//
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Create a new intent to open the {@link Colors Activity}
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//
//                //Start the new activity
//                startActivity(colorsIntent);
//            }
//        });
//
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Create a new intent to open the {@link Phrases Activity}
//                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//
//                //Start the new activity
//                startActivity(phrasesIntent);
//            }
//        });

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
    }
    }
//}
