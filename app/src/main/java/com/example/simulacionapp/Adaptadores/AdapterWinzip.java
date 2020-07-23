package com.example.simulacionapp.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simulacionapp.Entidades.WinzipModel;
import com.example.simulacionapp.R;

import java.util.ArrayList;

public class AdapterWinzip extends RecyclerView.Adapter<AdapterWinzip.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<WinzipModel> model;

    //Listener
    private  View.OnClickListener listener;

    public AdapterWinzip(Context context, ArrayList<WinzipModel> model){
        this.inflater= LayoutInflater.from(context);
        this.model = model;
    }
    @Override
    public void onClick(View v) {
        if (listener!=null){
            listener.onClick(v);
        }
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @NonNull
    @Override
    public AdapterWinzip.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.lista_winzip,parent,false);
        view.setOnClickListener(this);
        return new AdapterWinzip.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWinzip.ViewHolder holder, int position) {
        String nombre=model.get(position).getNombre();
        String detalle=model.get(position).getDetalle();
        int imagen= model.get(position).getImagen();
        holder.nombre.setText(nombre);
        holder.detalle.setText(detalle);
        holder.imagen.setImageResource(imagen);

    }

    @Override
    public int getItemCount() {
        return model.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombre, detalle;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.txt_nombre_carpeta);
            detalle=itemView.findViewById(R.id.txt_detalle_carpeta);
            imagen=itemView.findViewById(R.id.carpeta);
        }
    }
}
