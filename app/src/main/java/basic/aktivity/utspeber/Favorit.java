package basic.aktivity.utspeber;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Favorit extends Fragment {

    ListView lv;

    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {"Tutorial Mobile Legend Bang-Bang", "Tutorial PUBG Mobile", "Tutorial Free Fire","Esports Mobile Legend Bang-Bang", "Esport PUBG Mobile", "Esport Free Fire", "Sejarah-Sejarah Game Mobile"};

    public Favorit(){

    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_favorit, container, false);
        lv = (ListView) view.findViewById(R.id.idlistView);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);
        return view;
    }
}