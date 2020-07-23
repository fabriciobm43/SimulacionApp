package com.example.simulacionapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.simulacionapp.Adaptadores.Adapter;
import com.example.simulacionapp.Adaptadores.AdapterWinzip;
import com.example.simulacionapp.Entidades.WinzipModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentWinZip#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentWinZip extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    AdapterWinzip adapterwinzip;
    ArrayList<WinzipModel> listacarpetas;

    public FragmentWinZip() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentWinZip.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentWinZip newInstance(String param1, String param2) {
        FragmentWinZip fragment = new FragmentWinZip();
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
        View vista=inflater.inflate(R.layout.fragment_win_zip,container,false);
        recyclerView=vista.findViewById(R.id.recycler_winzip);
        listacarpetas=new ArrayList<>();
        //cargar la lista
        cargarLista();
        //mostrar archivos
        mostrarData();
        return vista;
    }
    public void cargarLista(){
        listacarpetas.add(new WinzipModel("Android","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("bluetooth","14 items 2020-01-17 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("bytedance","2 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("CamScanner","16 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("DCIM","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("Documents","11 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("Download","320 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("FaceApp","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("Huawei","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("HuaweiSystem","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("installation","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("Movies","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("Music","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("Pictures","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("Sounds","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("rar","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));
        listacarpetas.add(new WinzipModel("Otros","4 items 2020-05-26 06:31",R.drawable.icono_carpeta));



    }
    public void mostrarData(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterwinzip=new AdapterWinzip(getContext(),listacarpetas);
        recyclerView.setAdapter(adapterwinzip);
        adapterwinzip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre_archivo= listacarpetas.get(recyclerView.getChildAdapterPosition(v)).getNombre();
                Toast.makeText(getContext(), "Selecciono: "+nombre_archivo,Toast.LENGTH_SHORT).show();
            }
        });
    }
}