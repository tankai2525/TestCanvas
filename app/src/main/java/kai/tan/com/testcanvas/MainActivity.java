package kai.tan.com.testcanvas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jiongbull.jlog.JLog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        JLog.init(this).setDebug(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_1).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                //画弧形
                actionOpen(ArcActivity.class);
                break;
        }
    }

    private void actionOpen(Class c) {
        Intent intent = new Intent(MainActivity.this, c);
        startActivity(intent);
    }
}
