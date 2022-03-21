package com.example.onthididong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.XeAdapter;
import model.Xe;

public class MainActivity2 extends AppCompatActivity {

    private XeAdapter xeAdapter;
    private List<Xe> listXe;
    private ListView listView;
    private int[] imgs = new int[] {R.drawable.img_src2_2, R.drawable.img_src2_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.idListview);
        listXe = new ArrayList<>();
        listXe.add(new Xe(imgs[0], "Red Bull One", "$350", "$449"));
        listXe.add(new Xe(imgs[1], "Blue One", "$840", "$950"));

        xeAdapter = new XeAdapter(this, R.layout.item_custom_list_view, listXe);
        listView.setAdapter(xeAdapter);

        // truyền dl
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent intent = new Intent(MainActivity2.this, );
            }
        });
    }
}