package perfect.android.feature.new6;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import perfect.android.R;

/**
 * @author Flower 2019/3/29
 * @version Android6.0运行时权限
 * ContextCompat.checkSelfPermission():检测是否拥有权限
 * ActivityCompat.requestPermissions():申请授权
 * onRequestPermissionsResult():用户是否授权
 * ActivityCompat.shouldShowRequestPermissionRationale():用户拒绝后出现,当前被拒权限的解释
 */
public class RuntimePermissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runtime_permission);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 100:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // 权限通过
                    call();
                } else {
                    Toast.makeText(this, "没有权限", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void call() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // 如果没有权限则申请权限
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 100);
            return;
        }
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + 111111)));
    }

    public void onGoogleApi(View view) {
    }

    public void onSelf(View view) {

    }

    public void onEasy(View view) {

    }

    public void onRxPermission(View view) {

    }
}
