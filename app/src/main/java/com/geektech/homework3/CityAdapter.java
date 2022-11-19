package com.geektech.homework3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public abstract class CityAdapter extends RecyclerView.Adapter<CityViewHolder> {
    public CityAdapter (ArrayList<String> citylist) {
        this.cityList = citylist;}

        private ArrayList<String> cityList;


    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CityViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cities, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        holder.bind(cityList.get(position));
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }
}
