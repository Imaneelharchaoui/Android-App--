package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class Achat1 extends AppCompatActivity {
   BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achat2);
        barChart=(BarChart) findViewById(R.id.bargraph);
        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(44f,9));
        barEntries.add(new BarEntry(99f,7));
        barEntries.add(new BarEntry(    55f,7));
        barEntries.add(new BarEntry(99f,7));
        barEntries.add(new BarEntry(99f,7));
        BarDataSet barDataSet=new BarDataSet(barEntries,"mois");
        ArrayList<String> theDates=new ArrayList<>();
        theDates.add("junary");
        theDates.add("feburary");
        theDates.add("mars");
        theDates.add("april");
        theDates.add("may");
        BarData theData=new BarData(theDates,barDataSet);
        barChart.setData(theData);
        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);


    }
}
