package com.jtdev.all_study;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Teacher_Inside_Server_Page_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_teacher_inside_server_page2);

        ImageButton edit_profile_button = findViewById(R.id.edit_profile_button);
        Button see_activities_button = findViewById(R.id.see_activities_button);
        TextView see_classroom_rules_click = findViewById(R.id.see_classroom_rules_click);
        ImageButton leave_server_button = findViewById(R.id.leave_server_button);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edit_profile_button.setOnClickListener(v -> {
            Intent intent = new Intent (Teacher_Inside_Server_Page_2.this, Teacher_Edit_Profile_Page.class);
            startActivity(intent);
        });

        see_activities_button.setOnClickListener(v -> {
            Intent intent = new Intent(Teacher_Inside_Server_Page_2.this, Teacher_See_More_Page.class);
            startActivity(intent);
        });

        see_classroom_rules_click.setOnClickListener(v -> {
            Intent intent = new Intent(Teacher_Inside_Server_Page_2.this, Teacher_Classroom_Rules_Page.class);
            startActivity(intent);
        });

        leave_server_button.setOnClickListener(v -> {
            Teacher_PopUp_Leave_Server popUp = new Teacher_PopUp_Leave_Server();
            popUp.showConfirmButton(Teacher_Inside_Server_Page_2.this);
        });

    }
}