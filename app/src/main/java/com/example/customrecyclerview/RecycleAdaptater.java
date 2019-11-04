package com.example.customrecyclerview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdaptater extends RecyclerView.Adapter<RecycleAdaptater.ViewHolder> {
    private String[] titles = {"word", "exel", "powerpoint", "outlook"};
    private String[] detailles = {"Editeur de text", "tableur", "presentation", "co elec"};
    private int[] img = {R.drawable.word, R.drawable.excel, R.drawable.powerpoint, R.drawable.outlook};


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
        holder.itemDetail.setText(detailles[position]);
        holder.imageView.setImageResource(img[position]);

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView itemTitle;
        private TextView itemDetail;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.item_image);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDetail = itemView.findViewById(R.id.item_detail);

        }
    }
}
