package com.aboo.horizontalslidepicker.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.aboo.horizontalslidepicker.app.View.HorizontalPicker;


public class MainActivity extends Activity {

    private Context mContext;
    private HorizontalPicker mTimePicker;
    private String[] mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        mItems = new String[]{"0分钟", "10分钟", "20分钟", "30分钟", "40分钟", "50分钟", "60分钟", "70分钟", "80分钟", "90分钟", "100分钟"};
        mTimePicker = (HorizontalPicker) findViewById(R.id.main_timeSelection);
        mTimePicker.setValues(mItems);

        Button btn = (Button) findViewById(R.id.main_confirm_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "选中：" + mItems[mTimePicker.getSelectedItem()], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
