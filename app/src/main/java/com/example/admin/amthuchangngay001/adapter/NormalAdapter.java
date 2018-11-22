package com.example.admin.amthuchangngay001.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.amthuchangngay001.R;
import com.example.admin.amthuchangngay001.listener.OnDelete;
import com.example.admin.amthuchangngay001.listener.OnEdit;
import com.example.admin.amthuchangngay001.model.Normal;

import java.util.List;

public class NormalAdapter extends RecyclerView.Adapter<NormalAdapter.ViewHolder> {

    private List<Normal> normalist;
    private final OnDelete onDelete;
    private final OnEdit onEdit;

    public NormalAdapter(List<Normal> normalist, OnDelete onDelete, OnEdit onEdit) {
        this.normalist = normalist;
        this.onDelete = onDelete;
        this.onEdit = onEdit;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_normal, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Normal normal = normalist.get(position);
        if(normal.getNormalName().length()>20){
            String normalname = "Tên quán: "+ normal.getNormalName().substring(0,20)+"...";
            holder.tvNormalName.setText(normalname);
        }else{
            holder.tvNormalName.setText("Tên quán: "+ normal.getNormalName());
        }
        if(normal.getNormalAdd().length()>20){
            String normaladdress = "Địa chỉ : "+ normal.getNormalAdd().substring(0,20)+"...";
            holder.tvNormalAdd.setText(normaladdress);
        }else{
            holder.tvNormalAdd.setText("Địa chỉ: "+ normal.getNormalAdd());
        }
        holder.cvNormal_Item.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                onDelete.onDelete(position);
                return true;
            }
        });
        holder.imgNormal_Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.imgNormal_Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEdit.onEdit(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder {
        final CardView cvNormal_Item;
        final ImageView imgNormal_Info;
        final ImageView imgNormal_Edit;
        final TextView tvNormalName;
        final TextView tvNormalAdd;

        ViewHolder(View normalview) {
            super(normalview);
            cvNormal_Item = normalview.findViewById(R, R.id.cvNormal_Item);
            tvNormalAdd = normalview.findViewById(R.id.tvNormalAdd);
            tvNormalName = normalview.findViewById(R.id.tvNormalName);
            imgNormal_Info = normalview.findViewById(R.id.imgNormal_Info);
            imgNormal_Edit = normalview.findViewById(R.id.imgNormal_Edit);
        }
    }
}
