package com.example.cardviewrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by erickguzman on 9/13/17.
 */

public class MainAdapter extends RecyclerView.Adapter<MyHolder>{

    Context c;
    String[] compaines;
    int[] images;


    public MainAdapter(Context ctx,String[] names, int[] images){

        //Assign them
        this.c = ctx;
        this.compaines = names;
        this.images = images;

    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.img.setImageResource(images[position]);
        holder.nameTxt.setText(compaines[position]);
    }

    @Override
    public int getItemCount() {
        return compaines.length;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mFullName;
            public ViewHolder(View itemView){
                super(itemView);
                mFullName = itemView.findViewById(R.id.nameTxt);
            }


    }
}
