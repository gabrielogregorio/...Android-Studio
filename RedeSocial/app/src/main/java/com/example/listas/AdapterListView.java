package com.example.listas;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import java.util.ArrayList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterListView extends BaseAdapter {

    /* vai inflar o XML? */
    private LayoutInflater nInflater;
    private ArrayList<itemListView> Itens;

    public AdapterListView(Context context, ArrayList<itemListView> Itens){
        this.Itens = Itens;
        nInflater = LayoutInflater.from((context));
    }

    public int getCount(){
       return Itens.size();
    }

    public itemListView getItem(int position){
        return Itens.get(position);
    }

    public long getItemId(int i){
        return i;
    }

    public View getView(int position, View view, ViewGroup parent){
        itemListView item = Itens.get(position);
        view = nInflater.inflate(R.layout.layout_item_lista, null);

        ((TextView) view.findViewById(R.id.txtNome)).setText(item.getNome());
        ((TextView) view.findViewById(R.id.txtNome)).setText(item.getDescricao());
        ((ImageView) view.findViewById(R.id.imgFoto)).setImageResource(item.getFoto());
        return view;
    }
}
