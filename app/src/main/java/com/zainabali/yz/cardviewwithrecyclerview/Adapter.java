package com.zainabali.yz.cardviewwithrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.countryViewHolder>{
    ArrayList<String> countryName;
    ArrayList<String>details;
    ArrayList<Integer>image;
    Context context;

    public Adapter(ArrayList<String> countryName, ArrayList<String> details, ArrayList<Integer> image, Context context) {
        this.countryName = countryName;
        this.details = details;
        this.image = image;
        this.context = context;
    }

    @NonNull
    @Override
    public countryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new countryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull countryViewHolder holder, int position) {
     holder.txt1.setText(countryName.get(position));
        holder.txt2.setText(details.get(position));
        holder.imageFlag.setImageResource(image.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Toast.makeText(context,"you select the qatar flag",Toast.LENGTH_SHORT).show();
                }else if (position==1){
                    Toast.makeText(context,"you select the turkish flag",Toast.LENGTH_SHORT).show();
                }
                else if (position==2){
                    Toast.makeText(context,"you select the iraq flag",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return countryName.size();
    }

    public class countryViewHolder extends RecyclerView.ViewHolder {
        TextView txt1,txt2;
        ImageView imageFlag;
        CardView cardView;

        public countryViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.textView);
            txt2=itemView.findViewById(R.id.textView2);
            imageFlag=itemView.findViewById(R.id.profile_image);
            cardView=itemView.findViewById(R.id.card);
        }
    }
}
