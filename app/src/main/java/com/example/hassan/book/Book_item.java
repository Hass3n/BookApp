package com.example.hassan.book;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Book_item extends AppCompatActivity {

  Button button1,
  button2,button3,button4,button5,button6;
  recycle_item recycle_items;
   web_page webPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_item);
         button1=findViewById(R.id.Button1);
       button2=findViewById(R.id.Button2);
        button3=findViewById(R.id.Button3);
        button4=findViewById(R.id.Button4);
      //  button5=findViewById(R.id.Button5);
         button6=findViewById(R.id.Button6);







        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Book_item.this, recycle_item.class));
                //recycle_items.z="H";
                String[] title={"أحداث النهاية ","استمتع بحياتك","السر الاعظم","السر الأكبر",
                        "القران والأسرة والجريمة",
                        "النهاية ابن كثير",
                        "تفسير",
                        "ديوان الإمام الشافعي",
                        "نهاية العالم"
                        ,"يأجوج ومأجوج ","افراح الروح","الفريضة الخامسة "
                };

              int name=R.drawable.aslamic;
                recycle_items. pushdata(name,title);
                recycle_items.x=1;

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Book_item.this, recycle_item.class));
               // recycle_items.z="B";
                String[] title={"اشهر الاغتيلات ","الامريكيون الجوامع","الامبراطورية الرومانية","في جزورهم الاجتماعية","التاريخ الوجيز",
                        "التراث الهندي","التاريخ الكوني","الحرب العالمية الاولي","ابادة شعب الاندلس","الرحلات المغربية",
                        "الرحالة المستشرقون","عاصمة السخرية " };
                int name=R.drawable.lec;
                recycle_items. pushdata(name,title);
                recycle_items.x=2;
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Book_item.this, web_page.class));
                webPage.ul_name="https://drive.google.com/drive/mobile/folders/0B2NLwo64KlltZGgwQkxKYk9tdUU";
            }
        });


           button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Book_item.this, recycle_item.class));
                // recycle_items.z="B";
                String[] title={"ان تبقي","سوف احكي عنك","كتاب الشمس","كن خائنا تكن اجمل","مذكرات حائر",
                        "مع وقف التنفيذ","وداع","عصير الكتب","يوتوبيا","ارض النفاق","نيران صديقة","اشباح وطنية"
                        };
                int name=R.drawable.no;
                recycle_items. pushdata(name,title);
                recycle_items.x=4;
            }
        });



        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(Book_item.this, web_page.class));
                webPage.ul_name="https://drive.google.com/drive/mobile/folders/1XdQeNrxznmJYBewSqqEVxhNF7MJ6NxEH";

            }
        });


    }





}
