package com.example.basicauth;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.basicauth.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvWelcome.setText("Chào mừng bạn đã đăng nhập thành công!");
    }
}
