package com.example.viplove.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        final ArrayList<song> array = new ArrayList<>();
        array.add(new song("Faded", "Alan Waler", R.drawable.songimage, R.raw.faded));
        array.add(new song("Memories", "Maroon 5", R.drawable.songimage2, R.raw.memories));
        array.add(new song("Mask Off", "Future", R.drawable.songimage3, R.raw.maskoff));
        array.add(new song("Sugar And Brownies", "Dharia", R.drawable.songimage4, R.raw.sugar));
        array.add(new song("Wake Me Up", "Avicii", R.drawable.songimage5, R.raw.wake));
        array.add(new song("Let You Love Me", "Rita Ora", R.drawable.songimage1, R.raw.let));
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
