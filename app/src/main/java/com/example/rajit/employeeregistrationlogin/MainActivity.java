package com.example.rajit.employeeregistrationlogin;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {


    private String mGender="";
    private String mEmployeeType="";
    private String mLocation = "";
    private List<String> mSelectedSkills = new ArrayList<>();
    private List<String> locations = new ArrayList<>();

    EditText mName;
    EditText mEmail;
    EditText mPassword;
    EditText mAge;
    RadioGroup mGenderGroup, mEmployeeTypeGroup;
    Spinner mSpinner;
    Button mRegisterButton;


    private String name;
    private String email;
    private String password;
    private String age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        locations.add("Rampura");
        locations.add("Mirpur");
        locations.add("Badda");
        locations.add("Gulshan");
        locations.add("Uttora");

        mName = findViewById(R.id.employeeName);
        mEmail = findViewById(R.id.employeeEmail);
        mPassword = findViewById(R.id.employeePassword);
        mAge = findViewById(R.id.employeeAge);
        mGenderGroup = findViewById(R.id.genderGroup);
        mEmployeeTypeGroup = findViewById(R.id.employeeTypeGroup);
        mSpinner = findViewById(R.id.spinner);
        mRegisterButton = findViewById(R.id.registerButton);



        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,locations);
        mSpinner.setAdapter(arrayAdapter);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mLocation = locations.get(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mLocation = locations.get(0);
            }
        });


        mGenderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = findViewById(checkedId);
                mGender = rb.getText().toString();
            }
        });

        mEmployeeTypeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = findViewById(checkedId);
                mEmployeeType = rb.getText().toString();
            }
        });


        // ************** ONCE YOU CLICK THIS REGISTRATION BUTTON *******//

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = mName.getText().toString();
                email = mEmail.getText().toString();
                password = mPassword.getText().toString();
                age = mAge.getText().toString();

                Employee employee = new Employee(name,email,password,age,mSelectedSkills,mGender,mEmployeeType,mLocation);
                TempData.mEmployeeList.add(employee);
                startActivity(new Intent(MainActivity.this,EmployeeActivity.class));

                mName.setText("");
                mEmail.setText("");
                mPassword.setText("");
                mAge.setText("");

            }
        });

    }


    public void selectLanguage(View view) {
        CheckBox cb = (CheckBox) view;
        boolean status = cb.isChecked();
        if (status)
        {
            mSelectedSkills.add(cb.getText().toString());
        }else
        {
            mSelectedSkills.remove(cb.getText().toString());
        }
    }
    
    
    //------------------ Menu Section ------------------------------------

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
                
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        
        switch (id)
        {
            case R.id.action_home:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_login:
                Toast.makeText(this, "Log in", Toast.LENGTH_SHORT).show();
                showLoginDialog ();
                break;

            case R.id.action_logout:
                Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show();
                break;
                
                default:
                    Toast.makeText(this, "Something Went ", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    //------------------ Menu Section End --------------------------------


    public void showLoginDialog ()
    {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.login_dialog);

        Button mLoginButton = dialog.findViewById(R.id.loginButton);
        Button mRegisterButton = dialog.findViewById(R.id.registerButton);


        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Loggin In.....", Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }
        });



        dialog.show();

    }

    
    
    
    
}