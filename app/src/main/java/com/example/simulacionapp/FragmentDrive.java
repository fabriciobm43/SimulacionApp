package com.example.simulacionapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.simulacionapp.Adaptadores.AdapterDrive;
import com.example.simulacionapp.Entidades.Archivo;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDrive#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDrive extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    AdapterDrive adapterarchivo;
    ArrayList<Archivo> listaarchivos;


    public FragmentDrive() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentDrive.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentDrive newInstance(String param1, String param2) {
        FragmentDrive fragment = new FragmentDrive();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_drive,container,false);
        recyclerView=vista.findViewById(R.id.recycler_drive);
        listaarchivos=new ArrayList<>();
        //cargar la lista
        cargarLista();
        //mostrar archivos
        mostrarData();
        return vista;
    }

    public void cargarLista(){
        listaarchivos.add(new Archivo("Practica 7 UI ToolBar Menu Floting","Lo subistes ayer",R.drawable.ppt_poo,R.drawable.power_point,R.drawable.icono_masopciones));
        listaarchivos.add(new Archivo("Fundamento de redes","Abierto por ti la semana pasada",R.drawable.documento,R.drawable.imagenpdf,R.drawable.icono_masopciones));
        listaarchivos.add(new Archivo("Modelo OSI y TCP/IP","Lo acabas de abrir",R.drawable.archivo_word,R.drawable.word,R.drawable.icono_masopciones));
        listaarchivos.add(new Archivo("Analisis inteligente de datos","Lo subistes hoy",R.drawable.archivo_power,R.drawable.power_point,R.drawable.icono_masopciones));

    }
    public void mostrarData(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterarchivo=new AdapterDrive(getContext(),listaarchivos);
        recyclerView.setAdapter(adapterarchivo);
        adapterarchivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre_archivo= listaarchivos.get(recyclerView.getChildAdapterPosition(v)).getTitulo();
                Toast.makeText(getContext(), "Selecciono: "+nombre_archivo,Toast.LENGTH_SHORT).show();
            }
        });
    }
}