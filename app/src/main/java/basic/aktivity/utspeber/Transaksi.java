package basic.aktivity.utspeber;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Transaksi extends Fragment {


    ListView lv;

    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {"Pesanan 1", "Pesanan 2", "Pesanan 3", "Pesanan 4","Pesanan 5", "Pesanan 6","Pesanan 7","Pesanan 8","Pesanan 9","Pesanan 10","Pesanan 11","Pesanan 12"};

    public Transaksi(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_transaksi, container, false);
        lv = (ListView) view.findViewById(R.id.idlistView2);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);
        return view;
    }
}