package com.example.cardviewrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by erickguzman on 9/14/17.
 */


public class MyHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView nameTxt;
    TextView posTxt;
    ItemClickListener itemClickListener;
    public MyHolder(View myView){
        super(myView);
        img = itemView.findViewById(R.id.playerImage); //Finds the ID Of the image
        nameTxt = itemView.findViewById(R.id.nameTxt);
        //itemView.setOnClickListener(this);
    }
//    @Override
//    public void onClick(View view) {
//        this.itemClickListener.onItemClick(view,getLayoutPosition());
//        Intent intent=new Intent(MainActivity.class, AboutActivity.class);
//        startActivity(intent);
   // }
   // public void setItemClickListner(ItemClickListener ic){
     //   this.itemClickListener = ic;
   // }
}
