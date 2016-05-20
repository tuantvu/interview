package com.usaa.interview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.usaa.interview.R;

import java.util.Random;

/**
 * Created by oj82730 on 5/19/16.
 */
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    private String[] names = new String[]{"Jaime Lannister", "Ned Stark", "Jon Snow", "Daenarys Targaryen",
        "Arya Stark", "Theon Greyjoy", "Sansa Stark", "Khal Drogo", "The Hound", "Brienne of Tarth",
        "Joffrey Baratheon", "Cersei Lannister", "Robb Stark", "Rhaegar Targaryen"};

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_challenge_1, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(names[position]);
        Random random = new Random();
        holder.age.setText(random.nextInt(100) + " years old");
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView age;
        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.text_name);
            age = (TextView)itemView.findViewById(R.id.text_age);
        }
    }
}
