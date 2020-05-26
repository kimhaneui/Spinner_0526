package com.example.spinner_0526;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.spinner_0526.adapter.OccapationAdapter;
import com.example.spinner_0526.databinding.ActivityMainBinding;
import com.example.spinner_0526.datas.Occupation;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    List<Occupation> occupations = new ArrayList<>();
    OccapationAdapter osa;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        addOccupation();
        osa = new OccapationAdapter(mContext,R.layout.occupation_spinner_list_item,occupations);
        binding.occSpiner.setAdapter(osa);

    }

    void addOccupation(){

        occupations.add(new Occupation("안드로이드",R.drawable.android));
        occupations.add(new Occupation("ios",R.drawable.ios_icon));
        occupations.add(new Occupation("Web",R.drawable.web));
        occupations.add(new Occupation("Server",R.drawable.server));
    }

}
