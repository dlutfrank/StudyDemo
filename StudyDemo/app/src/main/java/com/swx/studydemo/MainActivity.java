package com.swx.studydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.swx.studydemo.activity.MyReactActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_confirm)
    TextView tvConfirm;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        tvConfirm.setOnClickListener(onClickListener);
        tvCancel.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_confirm: {
//                    Toast.makeText(v.getContext(), "confirm", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(), MyReactActivity.class);
                    startActivity(intent);
                }
                break;
                case R.id.tv_cancel: {
                    Toast.makeText(v.getContext(), "cancel", Toast.LENGTH_SHORT).show();
                }
                break;
                default:
                    break;
            }
        }
    };
}
