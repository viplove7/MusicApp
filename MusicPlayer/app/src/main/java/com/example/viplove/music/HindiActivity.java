package com.example.viplove.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        final ArrayList<song> array = new ArrayList<>();
        array.add(new song("Shayad", "Arjit Singh", R.drawable.songimage9, R.raw.shayad));
        array.add(new song("Ik Vaari", "Arjit Singh", R.drawable.songimage10, R.raw.il));
        array.add(new song("Filhall", "B Praak", R.drawable.songimage11, R.raw.filhal));
        array.add(new song("Laare", "Maninder Buttar", R.drawable.songimage12, R.raw.laare));
        array.add(new song("Lehenga", "Jass Manak", R.drawable.songimage13, R.raw.lehenga));
        array.add(new song("Liggi", "Ritviz", R.drawable.songimage14, R.raw.liggi));

        songadapter adapter = new songadapter(this, array, R.color.category_english);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                song songs = array.get(position);
                Intent intent = new Intent(getApplicationContext(), Englishsong.class);

                intent.putExtra("image", songs.getImageid());
                intent.putExtra("audio", songs.getAudioid());
                startActivity(intent);
            }
        });
    }
}
