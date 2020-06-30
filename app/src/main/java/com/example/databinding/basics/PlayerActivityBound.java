package com.example.databinding.basics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityPlayerBoundBinding;
import com.example.databinding.model.Player;

public class PlayerActivityBound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_bound);

        ActivityPlayerBoundBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_player_bound);

        Player player = new Player();
        binding.setPlayer(player);
    }
}
