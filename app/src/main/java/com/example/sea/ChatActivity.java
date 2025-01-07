package com.example.sea;

import android.os.Bundle;
//import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        // 找到返回按钮
        Button backButton = findViewById(R.id.back_button);

        // 设置返回按钮的点击事件
        backButton.setOnClickListener(v -> {
            // 关闭当前 Activity
            finish();
        });
    }
}
