package com.example.user.mycalc;

import android.app.Activity;
import android.os.Bundle;
/*import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;*/
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    //1.속성 설정 - 변수 명 정의
    //입력 필드 선언
    EditText et_first, et_second;
    //계산 액션 버튼 선언
    Button   bt_plus, bt_subs, bt_mult, bt_divd, bt_mod;
    //결과 필드 선언
    TextView tv_ruslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //2.속성별 객체 연동
        et_first = (EditText)this.findViewById(R.id.et_first);
        et_second= (EditText)this.findViewById(R.id.et_second);
        bt_plus  = (Button)this.findViewById(R.id.bt_plus);
        bt_subs  = (Button)this.findViewById(R.id.bt_subs);
        bt_mult  = (Button)this.findViewById(R.id.bt_mult);
        bt_divd  = (Button)this.findViewById(R.id.bt_divd);
        bt_mod   = (Button)this.findViewById(R.id.bt_mod);
        tv_ruslt = (TextView)this.findViewById(R.id.tv_ruslt);

        bt_plus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int result = Integer.parseInt(et_first.getText().toString()) + Integer.parseInt(et_second.getText().toString());
                tv_ruslt.setText(result+"");
                return false;
            }
        });

        bt_subs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int result = Integer.parseInt(et_first.getText().toString()) - Integer.parseInt(et_second.getText().toString());
                tv_ruslt.setText(result+"");
                return false;
            }
        });

        bt_mult.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int result = Integer.parseInt(et_first.getText().toString()) * Integer.parseInt(et_second.getText().toString());
                tv_ruslt.setText(result+"");
                return false;
            }
        });

        bt_divd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int result = Integer.parseInt(et_first.getText().toString()) / Integer.parseInt(et_second.getText().toString());
                tv_ruslt.setText(result+"");
                return false;
            }
        });

        bt_mod.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int result = Integer.parseInt(et_first.getText().toString()) % Integer.parseInt(et_second.getText().toString());
                tv_ruslt.setText(result+"");
                return false;
            }
        });

    }
}