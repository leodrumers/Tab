package com.ucc.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by MPR on 31/08/2017.
 */

public class tab_corte3 extends Fragment {
    private static final String TAG = "tab_corte3";

    private Button btn_corte;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.corte_3,container,false);

        btn_corte = (Button) view.findViewById(R.id.btn_corte);

        btn_corte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Boton del Corte 3",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
