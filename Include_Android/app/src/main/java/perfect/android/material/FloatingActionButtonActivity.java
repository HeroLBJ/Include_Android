package perfect.android.material;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.Nullable;
import perfect.android.R;

/**
 * @author Flower 2019/3/28
 * @version FloatingActionButton:悬浮控件
 */
public class FloatingActionButtonActivity extends Activity {

    private TextView tvNum;
    private int num = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design_floating_action_button);
        FloatingActionButton fab = findViewById(R.id.btn_floating_action);
        tvNum = findViewById(R.id.tv_num);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNum.setText(++num + "");
            }
        });
    }
}

/**
 * FloatingActionButton常用属性:
 * android:src 设置fab按钮中间的图标(建议大小为:24dp*24dp)
 * app:fabSize 设置按钮大小,默认值为normal(56dp*56dp),mini(40dp*40dp)表示更小
 * app:backgroundTint 设置背景颜色
 * app:rippleColor 设置按下时背景颜色(有渐变效果)
 * app:borderWidth 设置描边的宽度
 * app:elevation 设置默认情况下阴影大小,让按钮有一种悬浮起来的3D效果
 * app:pressedTranslationZ 设置按钮被按下时阴影的大小
 */