package com.example.hassan.book;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class recycle_item extends AppCompatActivity {

    Book_item book_item;
    public String z="";
    RecyclerView recyclerView;

   public static String bookname;

    LinearLayoutManager linearLayoutManager;
    BookAdapter adapter;
    public static ArrayList<Date>date;
    public static int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_item);

        recyclerView=findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
            adapter = new BookAdapter(date);
            recyclerView.setAdapter(adapter);
           // recyclerView.setLayoutManager(linearLayoutManager);

            // on Book  item click

             adapter.setBookOnclickllistner(new BookAdapter.BookOnclickllistner() {
                 @Override
                 public void onbookclick(java.util.Date data, int postion) {
                     // action islamic book
                     if(postion==0&& x==1) {

                       Intent intent=new Intent(recycle_item.this,Load_Book.class);

                        startActivity(intent);
                       bookname="a1.pdf";



                     }
                     else  if(postion==1&& x==1)
                     {
                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a2.pdf";
                     }
                     else if(postion==2&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a3.pdf";


                     }

                     else if(postion==3&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a4.pdf";


                     }
                     else if(postion==4&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a5.pdf";


                     }

                     else if(postion==5&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a6.pdf";


                     }

                     else if(postion==6&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a7.pdf";


                     }

                     else if(postion==7&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a8.pdf";


                     }
                     else if(postion==8&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a9.pdf";


                     }
                     else if(postion==9&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a10.pdf";


                     }

                     else if(postion==10&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a11.pdf";


                     }
                     else if(postion==11&& x==1) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="a12.pdf";


                     }

                     // action history book
                     else if(postion==0&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h1.pdf";


                     }
                     else if(postion==1&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h2.pdf";


                     }
                     else if(postion==2&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h3.pdf";


                     }
                     else if(postion==3&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h4.pdf";


                     }
                     else if(postion==4&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h5.pdf";


                     }
                     else if(postion==5&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h6.pdf";


                     }
                     else if(postion==6&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h7.pdf";


                     }
                     else if(postion==7&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h8.pdf";


                     }
                     else if(postion==8&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h9.pdf";


                     }

                     else if(postion==9&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h10.pdf";


                     }
                     else if(postion==10&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h11.pdf";


                     }
                     else if(postion==11&& x==2) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="h12.pdf";


                     }
                     // action novel book
                     else if(postion==0&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n1.pdf";


                     }
                     else if(postion==1&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n2.pdf";


                     }
                     else if(postion==2&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n3.pdf";


                     }
                     else if(postion==3&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n4.pdf";


                     }
                     else if(postion==4&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n5.pdf";


                     }
                     else if(postion==5&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n6.pdf";


                     }
                     else if(postion==6&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n7.pdf";


                     }
                     else if(postion==7&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n8.pdf";


                     }
                     else if(postion==8&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n9.pdf";


                     }
                     else if(postion==9&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n10.pdf";


                     }
                     else if(postion==10&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n11.pdf";


                     }
                     else if(postion==11&& x==4) {

                         Intent intent=new Intent(recycle_item.this,Load_Book.class);

                         startActivity(intent);
                         bookname="n12.pdf";


                     }




                 }
             });

    }
    public  static void  pushdata(int name,String[] title)
    {
        date=new ArrayList<>();
        for (int i=0;i<=11;i++)
        {
            date.add(new Date(name,title[i]));

        }

    }


}
