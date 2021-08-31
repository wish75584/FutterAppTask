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
import com.example.futterapptask.Models.SearchPayload;
import com.example.futterapptask.R;

import java.util.List;

public class AdapterSearchUser extends RecyclerView.Adapter<AdapterSearchUser.RecyclerViewHolder> {

    List<SearchPayload> srlist;
    Context context;

    public AdapterSearchUser(List<SearchPayload> srlist, Context context) {
        this.srlist = srlist;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterSearchUser.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_search_results, parent, false);
        AdapterSearchUser.RecyclerViewHolder recyclerViewHolder = new AdapterSearchUser.RecyclerViewHolder(view);
        return recyclerViewHolder;    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSearchUser.RecyclerViewHolder holder, int position) {
        SearchPayload sr = srlist.get(position);
        holder.tv_search_fname.setText(sr.getFirstName());
        holder.tv_search_occupation.setText(sr.getOccupation());
        holder.tv_search_phoneno.setText(sr.getPhoneNumber());
        holder.tv_search_createdat.setText(sr.getCreatedAt().toString());
        Glide.with(context)
                .load(sr.getThumb())
                .centerCrop()
                .into(holder.iv_search_user);
    }

    @Override
    public int getItemCount() {
        return srlist.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_search_user;
        TextView tv_search_fname, tv_search_occupation, tv_search_phoneno, tv_search_createdat;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_search_user = itemView.findViewById(R.id.iv_search_user);
            tv_search_fname = itemView.findViewById(R.id.tv_search_fname);
            tv_search_occupation = itemView.findViewById(R.id.tv_search_occupation);
            tv_search_phoneno = itemView.findViewById(R.id.tv_search_phoneno);
            tv_search_createdat = itemView.findViewById(R.id.tv_search_createdat);
        }
    }
}
