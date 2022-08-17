package com.example.project;
//Sıkıntıı

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RetrofitAdapter extends RecyclerView.Adapter<RetrofitAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ModelRecycler> dataModelArrayList;
    private Context ctx;

    public RetrofitAdapter(Context ctx, ArrayList<ModelRecycler> dataModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
        this.ctx=ctx;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.retro_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Picasso.get().load(dataModelArrayList.get(position).getImgURL()).into(holder.iv);
        holder.name.setText(dataModelArrayList.get(position).getName());
        holder.country.setText(dataModelArrayList.get(position).getCountry()+"TL   ");
        holder.city.setText(dataModelArrayList.get(position).getCity());
        holder.urlPrice=dataModelArrayList.get(position).getHotelUrl();

        Drawable drawable = ctx.getResources().getDrawable(R.drawable.fiyatok);
        if(dataModelArrayList.get(position).getCity().equals("4")){
                holder.starOne.setVisibility(View.GONE);
        }
        if(dataModelArrayList.get(position).getCity().equals("3")){
                holder.starTwo.setVisibility(View.GONE);
                holder.starOne.setVisibility(View.GONE);
        }

                /*
                if(dataModelArrayList.get(i).getCity().toString().equals(4)){
                Drawable drawable = ctx.getResources().getDrawable(R.drawable.fiyatok);
                holder.starOne.setImageDrawable(drawable);
                holder.starTwo.setImageDrawable(drawable);
                System.out.println("Bugraa:" );

            }else{
                Drawable drawable = ctx.getResources().getDrawable(R.drawable.fiyatok);
                System.out.println("Yildiz Sayisi: "+ dataModelArrayList.get(i).getCity());
            }
            */
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView country, name, city;
        ShapeableImageView iv;
        Button priceButton,geriButton;
        ImageView starOne,starTwo,starThree;
        String urlPrice;
        Boolean isItFour=false;

        public MyViewHolder(View itemView) {
            super(itemView);

            country = (TextView) itemView.findViewById(R.id.country);
            name = (TextView) itemView.findViewById(R.id.name);
            city = (TextView) itemView.findViewById(R.id.city);
            iv = (ShapeableImageView) itemView.findViewById(R.id.iv);
            priceButton= (Button) itemView.findViewById(R.id.priceButton);
            starOne= (ImageView) itemView.findViewById(R.id.starOne);
            starTwo =(ImageView) itemView.findViewById(R.id.starTwo);
            starThree =(ImageView) itemView.findViewById(R.id.starThree);
            geriButton = (Button) itemView.findViewById(R.id.geriButton);

            /*Fiyat Button yapımı*/
            try {
                priceButton.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        //  Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
                        System.out.println("Bugraaaa");

                        Uri uriUrl = Uri.parse(urlPrice);
                        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        ctx.startActivity(launchBrowser);

                    }
                });
            }catch (Exception e){

                System.out.println(e.toString());
            }

        }

    }
}