package com.example.simulacionapp.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simulacionapp.Entidades.Mensaje;
import com.example.simulacionapp.R;

import java.util.ArrayList;

public class AdapterGmail extends RecyclerView.Adapter<AdapterGmail.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<Mensaje> model;

    //Listener
    private  View.OnClickListener listener;

    public AdapterGmail(Context context, ArrayList<Mensaje> model){
        this.inflater= LayoutInflater.from(context);
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.lista_gmail,parent,false);
        view.setOnClickListener(this);
        return new AdapterGmail.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String titulo=model.get(position).getTitulo();
        String asunto=model.get(position).getAsunto();
        String mensaje=model.get(position).getMensaje();
        String hora=model.get(position).getHora();
        int imagen= model.get(position).getImagenid();
        holder.titulo.setText(titulo);
        holder.asunto.setText(asunto);
        holder.mensaje.setText(mensaje);
        holder.hora.setText(hora);
        holder.imagen.setImageResource(imagen);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View v) {
        if (listener!=null){
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView titulo, asunto,mensaje,hora;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo=itemView.findViewById(R.id.txt_titulo_msj);
            asunto=itemView.findViewById(R.id.txt_asunto_msj);
            mensaje=itemView.findViewById(R.id.txt_mensaje_msj);
            hora=itemView.findViewById(R.id.txt_hora_msj);
            imagen=itemView.findViewById(R.id.imagen_usuario_msj);
        }
    }
}
