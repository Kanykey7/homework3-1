package com.geektech.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList cityList = new ArrayList();
    private RecyclerView rvCities;
    private CityAdapter adapter = new CityAdapter(cityList) {
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCities = findViewById(R.id.recycler_view);
        rvCities.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        cityList.add("Бишкек");
        cityList.add("Токио");
        cityList.add("Анкара");
        cityList.add("Стамбул");
        cityList.add("Москва");
        cityList.add("Дубай");
        cityList.add("Вашингтон");
        cityList.add("Амстердам");
        cityList.add("Лос-Анджелес");
        cityList.add("Нью-Йорк");
        cityList.add("Омск");
        cityList.add("Прага");
        cityList.add("Сочи");
        cityList.add("Сеул");
        cityList.add("Астана");
        cityList.add("Павлодар");
        cityList.add("Барселона");
        cityList.add("Киев");
        cityList.add("Афины");
        cityList.add("Рим");
    }
}