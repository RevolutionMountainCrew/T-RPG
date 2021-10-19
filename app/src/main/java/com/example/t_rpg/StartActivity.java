package com.example.t_rpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);

        startPage();
    }

    private void startPage() {
        Button startButton = findViewById(R.id.startButton);
        Button optionButton = findViewById(R.id.optionButton);

        // 얘는 start 버튼 누르면 메인화면(MainActivity)으로 넘어가고 밑에 option 버튼은 옵션화면(OptionActivity)으로 넘어감
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        optionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OptionActivity.class);
                startActivity(intent);
            }
        });
    }
}
