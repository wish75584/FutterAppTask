package com.example.futterapptask.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.futterapptask.Models.MorePayload;
import com.example.futterapptask.R;

import java.util.List;


public class AdapterUserData extends RecyclerView.Adapter<AdapterUserData.RecyclerViewHolder> {


    List<MorePayload> userData;
    List<MorePayload> filteredUserList;
    Context context;

    public AdapterUserData(List<MorePayload> userData, Context context) {
        this.userData = userData;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_user_data, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        MorePayload PayLoadUser = userData.get(position);
        // com.example.futterapptask.Models.PayLoadUser PayLoadUser = (PayLoadUser) us.getPayload();
        holder.tv_name.setText(PayLoadUser.getFirst_name());
        holder.tv_email.setText(PayLoadUser.getEmail());
        holder.tv_occupation.setText(PayLoadUser.getOccupation());
        holder.tv_ph_no.setText(PayLoadUser.getPhone_number());
        holder.tv_reg_date.setText(PayLoadUser.getCreatedAt().toString());
        Glide.with(context)
                .load(PayLoadUser.getThumb())
                .centerCrop()
                .into(holder.user_pic);
    }

    @Override
    public int getItemCount() {
        return userData.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView user_pic;
        TextView tv_name, tv_ph_no, tv_email, tv_reg_date, tv_occupation;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            user_pic = itemView.findViewById(R.id.user_pic);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_ph_no = itemView.findViewById(R.id.tv_ph_no);
            tv_email = itemView.findViewById(R.id.tv_email);
            tv_reg_date = itemView.findViewById(R.id.tv_reg_date);
            tv_occupation = itemView.findViewById(R.id.tv_occupation);
        }
    }
}
