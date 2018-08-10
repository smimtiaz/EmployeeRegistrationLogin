package com.example.rajit.employeeregistrationlogin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter extends ArrayAdapter<Employee>{


    private Context mContext;
    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeAdapter(@NonNull Context context, @NonNull List<Employee> employeeList) {
        super(context, R.layout.employee_model, employeeList);
        this.employeeList = employeeList;
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater =  LayoutInflater.from(mContext);

        convertView = inflater.inflate(R.layout.employee_model,parent,false);

        Employee employee = employeeList.get(position);
        TextView mName = convertView.findViewById(R.id.nameTV);
        TextView mEmail = convertView.findViewById(R.id.emailTV);
        TextView mSkill = convertView.findViewById(R.id.skillTV);
        TextView mLocation = convertView.findViewById(R.id.locationTV);
        TextView mAge = convertView.findViewById(R.id.ageTV);


        mName.setText(employee.getmEmployeeName()+" ("+employee.getmGender()+")");
        mEmail.setText(employee.getmEmployeeEmail());
        mSkill.setText(TextUtils.join(",",employee.getmLanguages()));
        mLocation.setText(employee.getmLocation());
        mAge.setText(employee.getmEmployeeAge());


        return convertView;
    }
}
