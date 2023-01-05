package com.example.a3_1_2023;

import static com.example.a3_1_2023.R.id.spinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = findViewById(R.id.button);
        TextView name = findViewById(R.id.textView);
        TextView salary = findViewById(R.id.textView2);
         Spinner work = findViewById(R.id.spinner1);
        ListView show = findViewById(R.id.listview);
        ArrayList<Employee> arr = new ArrayList<>();
        ArrayAdapter<String> options= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, new String[]{"Full time", "Part time"});
        work.setAdapter(options);
        add.setOnClickListener(e->{
            String empname = name.getText().toString();
            double empsalary = Double.parseDouble(salary.getText().toString());
            int id=work.getSelectedItemPosition();
            String option="";
            if(id==0){
                option="Full time";
            }else
                option="Part time";
            arr.add(new Employee(empname,empsalary,option));
            String all[]=new String[arr.size()];
            for (int i=0;i<arr.size();i++){
                all[i]=arr.get(i).toString();
            }
            ArrayAdapter listAdapter = new ArrayAdapter(this, R.layout.simple_list,all);
            show.setAdapter(listAdapter);

        });
    }
}