package com.example.rajit.employeeregistrationlogin;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;

public class EmployeeActivity extends AppCompatActivity {

    private ListView mListView;
    private EmployeeAdapter employeeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        mListView = findViewById(R.id.listView);

        employeeAdapter = new EmployeeAdapter(this,TempData.mEmployeeList);

        mListView.setAdapter(employeeAdapter);
    }





}
