package com.jtdev.all_study;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Teacher_Favorite_Server_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_teacher_favorite_server_page);

        ImageButton back_button = findViewById(R.id.back_button);
        ImageButton edit_profile_button = findViewById(R.id.edit_profile_button);
        ImageButton notification_button = findViewById(R.id.notification_button);
        ImageButton create_server_button = findViewById(R.id.create_server_button);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back_button.setOnClickListener(v -> {
            Intent intent = new Intent(Teacher_Favorite_Server_Page.this, Teacher_Home_Page.class);
            startActivity(intent);
        });

        edit_profile_button.setOnClickListener(v -> {
            Intent intent = new Intent(Teacher_Favorite_Server_Page.this, Teacher_Edit_Profile_Page.class);
            startActivity(intent);
        });

        notification_button.setOnClickListener(v -> {
            Intent intent = new Intent(Teacher_Favorite_Server_Page.this, Teacher_Notification_Page.class);
            startActivity(intent);
        });

        create_server_button.setOnClickListener(v -> {
            Intent intent = new Intent(Teacher_Favorite_Server_Page.this, Teacher_Create_Server_Page.class);
            startActivity(intent);
        });

    }
}