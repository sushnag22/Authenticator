package tech.sushnag22.authenticator.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import tech.sushnag22.authenticator.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String welcomeText = "Welcome " + getIntent().getStringExtra("username") + "!";
        TextView tvWelcome = findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);
    }
}