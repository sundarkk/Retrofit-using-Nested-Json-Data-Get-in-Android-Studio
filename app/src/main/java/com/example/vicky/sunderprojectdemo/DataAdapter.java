package com.example.vicky.sunderprojectdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.xml.sax.Parser;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataModelList;
    private Context context;

    public DataAdapter(ArrayList<DataModel> dataModelList, Context context) {
        this.dataModelList = dataModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_add, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.tvName.setText(dataModels.get(position).getName());
        Picasso.with(context).load(dataModelList.get(position).getStoreImage())//https://img.icons8.com/plasticine/2x/image.png
                .error(R.drawable.ic_launcher_background)
                //.placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.StoreImage);

     // holder.tvid.setText(Integer.valueOf(dataModelList.get(position).getId()));
        holder.tvName.setText(String.valueOf(dataModelList.get(position).getName()));
        holder.tvAddress.setText(String.valueOf(dataModelList.get(position).getAddress()));
        holder.tvCity.setText(String.valueOf(dataModelList.get(position).getCity()));
        holder.tvState.setText(String.valueOf(dataModelList.get(position).getState()));
        holder.tvZip.setText(String.valueOf(dataModelList.get(position).getZip()));
        holder.tvEmail.setText(String.valueOf(dataModelList.get(position).getEmail()));
        holder.tvPhone.setText(String.valueOf(dataModelList.get(position).getPhone()));
//        holder.tvLat.setText(f(dataModelList.get(position).getLatitude()));
//        holder.tvLog.setText(String.valueOf(dataModelList.get(position).getLongitude()));

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView StoreImage;
        TextView tvid,tvName,tvAddress,tvCity,tvState,tvZip,tvEmail,tvPhone,tvLat,tvLog;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            StoreImage = (ImageView) itemView.findViewById(R.id.StoreImage);
            tvName =(TextView) itemView.findViewById(R.id.tvName);
            tvid = (TextView) itemView.findViewById(R.id.tvid);
            tvAddress = (TextView) itemView.findViewById(R.id.tvAddress);
            tvState = (TextView) itemView.findViewById(R.id.tvState);
            tvCity = (TextView) itemView.findViewById(R.id.tvCity);
            tvZip = (TextView) itemView.findViewById(R.id.tvZip);
            tvEmail = (TextView) itemView.findViewById(R.id.tvEmail);
            tvPhone = (TextView) itemView.findViewById(R.id.tvPhone);
            tvLat = (TextView) itemView.findViewById(R.id.tvLat);
            tvLog = (TextView) itemView.findViewById(R.id.tvLog);

        }
    }
}
