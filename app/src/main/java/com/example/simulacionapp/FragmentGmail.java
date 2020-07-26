package com.example.simulacionapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.simulacionapp.Adaptadores.AdapterGmail;
import com.example.simulacionapp.Entidades.Mensaje;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentGmail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentGmail extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    AdapterGmail adapterGmail;
    ArrayList<Mensaje> listmensajes;

    public FragmentGmail() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentGmail.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentGmail newInstance(String param1, String param2) {
        FragmentGmail fragment = new FragmentGmail();
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
        View vista=inflater.inflate(R.layout.fragment_gmail,container,false);
        recyclerView=vista.findViewById(R.id.recycler_gmail);
        listmensajes=new ArrayList<>();
        //cargar la lista
        cargarLista();
        //mostrar archivos
        mostrarData();
        return vista;
    }
    public void cargarLista(){
        listmensajes.add(new Mensaje("sga2","Login exitoso SGA","Bienvenido al Sistema","17:43",R.drawable.sga));
        listmensajes.add(new Mensaje("Lenin Moreno","Pandemia Covid","No salgas de casa","07:30",R.drawable.lenin));
        listmensajes.add(new Mensaje("Gleiston Guerrero Ulloa","Fwd: [Urkund] 4% de similitud","Forwade message","10:25",R.drawable.gleiston));
        listmensajes.add(new Mensaje("Mauricio Fernandes","Solicitud de presupuesto","Estimado Jaime.","19:50",R.drawable.fernandez));
        listmensajes.add(new Mensaje("Fabricio Baño","Revision Literia","Proyecto integrador","15:33",R.drawable.usuario_fabri));
        listmensajes.add(new Mensaje("Washinton Chiriboga","Bienvenidos al primer periodo","Estimados estudiantes","05:25",R.drawable.wacho));
        listmensajes.add(new Mensaje("Washinton Chiriboga","Bienvenidos al primer periodo","Estimados estudiantes","10:55",R.drawable.wacho));
        listmensajes.add(new Mensaje("Washinton Chiriboga","Reunon universitaria","Estimados estudiantes","07:09",R.drawable.wacho));
        listmensajes.add(new Mensaje("Washinton Chiriboga","Solicitud de ingreso","Estimados estudiantes","08:25",R.drawable.wacho));



    }
    public void mostrarData(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterGmail=new AdapterGmail(getContext(),listmensajes);
        recyclerView.setAdapter(adapterGmail);
        adapterGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre_archivo= listmensajes.get(recyclerView.getChildAdapterPosition(v)).getTitulo();
                Toast.makeText(getContext(), "Selecciono: "+nombre_archivo,Toast.LENGTH_SHORT).show();
            }
        });
    }
}