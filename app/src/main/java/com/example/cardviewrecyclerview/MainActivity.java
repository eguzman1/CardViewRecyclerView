package com.example.cardviewrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    String [] names = {"3M", "Leidos"};
    int []images = {R.drawable.images, R.drawable.leidos};
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView card = new CardView(this);


        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);



//        card.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
//                startActivity(intent);
//            }
//        });



        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        MainAdapter adapter = new MainAdapter(this,names,images);
        mRecyclerView.setAdapter(adapter);


    }
}

