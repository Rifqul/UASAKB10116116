package com.e.uasakb;

//Taggal : 1-8-2019
//10116116
//Ammar Rifqul Abrar
//AKB-3

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MyViewHolder> {
    private List<MahasiswaModel> mahasiswaModels;
    Context context;

    public MahasiswaAdapter(Context context, List<MahasiswaModel> mahasiswaModels){
        this.context = context;
        this.mahasiswaModels = mahasiswaModels;
    }

    @Override
    public MahasiswaAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa, parent, false);
        return new MyViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(MahasiswaAdapter.MyViewHolder holder, int position) {
        final MahasiswaModel model = mahasiswaModels.get(position);
        holder.nim.setText(model.getNim().toString());
        holder.nama.setText(model.getNama());
        holder.kelas.setText(model.getKelas());
        holder.telepon.setText(model.getTelepon().toString());
        holder.email.setText(model.getEmail());
        holder.line.setText(model.getLine());
        holder.instagram.setText(model.getInstagram());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("id", model.getId().toString());
                intent.putExtra("nim", model.getNim().toString());
                intent.putExtra("nama", model.getNama());
                intent.putExtra("kelas",model.getKelas());
                intent.putExtra("telepon",model.getTelepon().toString());
                intent.putExtra("email",model.getEmail());
                intent.putExtra("line",model.getLine());
                intent.putExtra("instagram",model.getInstagram());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mahasiswaModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nim, nama, kelas, telepon, email, line, instagram;

        public MyViewHolder(View itemView){
            super(itemView);
            nim = itemView.findViewById(R.id.tvNim);
            nama = itemView.findViewById(R.id.tvNama);
            kelas = itemView.findViewById(R.id.tvKelas);
            telepon = itemView.findViewById(R.id.tvTelepon);
            email = itemView.findViewById(R.id.tvEmail);
            line = itemView.findViewById(R.id.tvLine);
            instagram = itemView.findViewById(R.id.tvInstagram);
        }
    }
}

