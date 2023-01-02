package com.example.framgment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mancj.materialsearchbar.MaterialSearchBar;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.Locale;

public class datafragment extends Fragment {
    RecyclerView recyclerView;
    MaterialSearchBar searchBar;
    ArrayList<MyData>myData=new ArrayList<>();
    MyAdapter myAdapter;

    @SuppressLint("MissingInflatedId")

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=  inflater.inflate(R.layout.fragment_datafragment, container, false);

        searchBar=view.findViewById(R.id.searchBar);
        recyclerView=view.findViewById(R.id.recyclerview);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

                myData.add(new MyData("Oggy",R.drawable.oggy,"#E0C1EC"));
                myData.add(new MyData("Dorimon",R.drawable.dorimon,"#C3E096"));
                myData.add(new MyData("Bugs Bunny",R.drawable.bugsbunny,"#696d7d"));
                myData.add(new MyData("Barbies",R.drawable.barbie,"#769da6"));
                myData.add(new MyData("MickeyMouse",R.drawable.mickeymouse,"#eee5d1"));
                myData.add(new MyData("Tom And Jry",R.drawable.tom,"#a58fbe"));
                myData.add(new MyData("Multi Rajo",R.drawable.cartoon,"#e4b849"));

                        MyAdapter myAdapter=new MyAdapter(myData,datafragment.this);
                recyclerView.setAdapter(myAdapter);


        searchBar.addTextChangeListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(searchBar.toString());
            }

            private void filter(String text) {

                ArrayList<MyData>filterSportList=new ArrayList<>();
                for (MyData item:myData){
                    if (item.getName().contains(text.toLowerCase().toUpperCase())){
                        filterSportList.add(item);
                    }
                }
                myAdapter.filterList(filterSportList);
            }
        });

        return view;


    }

}