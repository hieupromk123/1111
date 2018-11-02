package com.example.acerhome.recycleviewpt13354.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.acerhome.recycleviewpt13354.R;
import com.example.acerhome.recycleviewpt13354.model.SinhVien;

import java.util.List;

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.SinhVienHolder> {
    private List<SinhVien> mSinhVien;

    public SinhVienAdapter(List<SinhVien> sinhViens){
        this.mSinhVien = sinhViens;
    }
    @NonNull
    @Override
    public SinhVienHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_sinh_vien,parent,false);
        return new SinhVienHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SinhVienHolder holder, int position) {
        SinhVien sv = mSinhVien.get(position);
        holder.tvTen.setText(sv.getTen());
    }

    @Override
    public int getItemCount() {
        return mSinhVien.size();
    }

    public class SinhVienHolder extends RecyclerView.ViewHolder{
        public ImageView imgAnh;
        public TextView tvTen;


        public SinhVienHolder(View itemView) {
            super(itemView);

            imgAnh = itemView.findViewById(R.id.imgAnh);
            tvTen = itemView.findViewById(R.id.tvTen);
        }
    }
}
