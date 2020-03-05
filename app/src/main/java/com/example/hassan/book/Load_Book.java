package com.example.hassan.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Load_Book extends AppCompatActivity {
    PDFView book;
    recycle_item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load__book);
        book=findViewById(R.id.pdfView);
        book.fromAsset(item.bookname).load();

    }


}
