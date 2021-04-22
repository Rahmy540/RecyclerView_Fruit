package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


import java.util.List;

public class ListFruitAdapter extends RecyclerView.Adapter<ListFruitAdapter.ViewHolder> {

    private List<Fruit> fruits;

    public ListFruitAdapter(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row_fruit, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Fruit fruit = fruits.get(position);
        Glide.with(holder.itemView.getContext()).load(fruit.getPhoto()).apply(new RequestOptions().override(55, 55));
        holder.ivPhoto.setImageResource(fruit.getPhoto());
        holder.tvName.setText(fruit.getName());
        holder.tvDetail.setText(fruit.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(fruits.get(holder.getAdapterPosition()));
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("Image", fruit.getPhoto());
                intent.putExtra("Name", fruit.getName());
                intent.putExtra("Detail", fruit.getDetail());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName, tvDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto = itemView.findViewById(R.id.iv_fruit);
            tvName = itemView.findViewById(R.id.tv_fruit_name);
            tvDetail = itemView.findViewById(R.id.tv_fruit_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Fruit data);
    }
}