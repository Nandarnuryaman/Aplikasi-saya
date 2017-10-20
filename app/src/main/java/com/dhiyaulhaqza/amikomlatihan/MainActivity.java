package com.dhiyaulhaqza.amikomlatihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    private TextView tvWelcome;

    private Button btnSimpleList;
    private Button btnCustomList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        tvWelcome = (TextView) findViewById(R.id.tv_main_welcome);
//
//        if (getIntent().hasExtra("data"))   {
//            String name = getIntent().getStringExtra("data");
//            tvWelcome.setText("Hello, " + name);
//        }

        setupView();
    }

    private void setupView() {
        btnSimpleList = (Button) findViewById(R.id.btn_simple_list);
        btnCustomList = (Button) findViewById(R.id.btn_custom_list);
        btnSimpleList.setOnClickListener(this);
        btnCustomList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_simple_list:
                startActivity(new Intent(MainActivity.this, ListActivity.class));
                break;
            case R.id.btn_custom_list:

                break;
        }
    }
}
