package com.example.simulacionapp.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simulacionapp.Entidades.Archivo;
import com.example.simulacionapp.R;

import java.util.ArrayList;

public class AdapterDrive extends RecyclerView.Adapter<AdapterDrive.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    ArrayList<Archivo> model;

    //Listener
    private  View.OnClickListener listener;

    public AdapterDrive(Context context, ArrayList<Archivo> model){
        this.inflater= LayoutInflater.from(context);
        this.model = model;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.listadrive,parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String titulo=model.get(position).getTitulo();
        String subido=model.get(position).getSubido();
        int imagen= model.get(position).getImagenid();
        int imagenpdf= model.get(position).getImagenpdf();
        int imagenpoint= model.get(position).getImagenpoint();
        holder.titulo.setText(titulo);
        holder.subido.setText(subido);
        holder.imagen.setImageResource(imagen);
        holder.imagenpdf.setImageResource(imagenpdf);
        holder.imagenpoint.setImageResource(imagenpoint);

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View v) {

        if (listener!=null){
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView titulo, subido;
        ImageView imagen,imagenpdf,imagenpoint;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo=itemView.findViewById(R.id.txt_titulo);
            subido=itemView.findViewById(R.id.txt_subido);
            imagen=itemView.findViewById(R.id.imagen_archivo);
            imagenpdf=itemView.findViewById(R.id.imagen_pdf);
            imagenpoint=itemView.findViewById(R.id.imagen_opciones);
        }
    }
}
