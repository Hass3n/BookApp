package com.example.hassan.book;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder>  {

    ArrayList<com.example.hassan.book.Date>data;
    BookOnclickllistner bookOnclickllistner;

    public BookAdapter(ArrayList<com.example.hassan.book.Date> data) {
        this.data = data;
    }

    public void setBookOnclickllistner(BookOnclickllistner bookOnclickllistner) {
        this.bookOnclickllistner = bookOnclickllistner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_design,viewGroup,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

            final com.example.hassan.book.Date item=data.get(i);
        viewHolder.txt1.setText(item.getBook_name());

        viewHolder.imag.setImageResource(item.getImage());
        viewHolder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookOnclickllistner.onbookclick(item,i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt1;
        ImageView imag;
        View parent;

        ViewHolder(View view){
            super(view);
            txt1= view.findViewById(R.id.txt1);

            imag = view.findViewById(R.id.image);
            parent=view;
        }
    }

    interface BookOnclickllistner
    {
        public void onbookclick(Date data, int postion);

    }

}
