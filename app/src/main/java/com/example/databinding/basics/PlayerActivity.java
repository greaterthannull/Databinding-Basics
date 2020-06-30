package com.example.databinding.basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.databinding.R;
import com.example.databinding.model.Player;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        Player player = new Player();

        TextView firstName = findViewById(R.id.first_name);
        firstName.setText(player.getFirstName());

        TextView secondName = findViewById(R.id.second_name);
        secondName.setText(player.getSecondName());

        TextView age = findViewById(R.id.age);
        age.setText(String.valueOf(player.getAge()));

        TextView height = findViewById(R.id.height);
        height.setText(player.getHeight());
    }
}
