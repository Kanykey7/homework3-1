package com.geektech.homework3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityViewHolder extends RecyclerView.ViewHolder{

    private TextView tvCities;
    public CityViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCities = itemView.findViewById(R.id.tv_city);
    }
     public void bind(String City){
         tvCities.setText(City);
     }
}
