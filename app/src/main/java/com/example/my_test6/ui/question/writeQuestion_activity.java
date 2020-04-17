package com.example.my_test6.ui.question;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.my_test6.R;

public class writeQuestion_activity extends Activity {

    private ImageButton returnButton;
    private Button fabu_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_question);
        //找到返回按钮和发布按钮
        returnButton = findViewById(R.id.writeQuestion_return);
        fabu_button = findViewById(R.id.fabuQuestion_button);
        //设置监听器
        returnButton.setOnClickListener(l);
        fabu_button.setOnClickListener(l);
    }


    //设置点击事件监听器l来监控该activity上的点击事件
    View.OnClickListener l = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.writeQuestion_return:
                    finish();
                    break;
                case R.id.fabuQuestion_button:

                    break;
                default:
                    break;
            }
        }
    };
}
