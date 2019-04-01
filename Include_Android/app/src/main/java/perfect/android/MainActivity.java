package perfect.android;

import androidx.appcompat.app.AppCompatActivity;
import perfect.android.feature.new6.RuntimePermissionActivity;
import perfect.android.material.FloatingActionButtonActivity;
import perfect.android.material.tablayout.TabLayoutSimpleActivity;
import perfect.android.ndk.JNIClass;
import perfect.android.view.recyclervier.RecyclerViewActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] names = new String[]{
            "MaterialDesign之FloatingActionButton",
            "Android6.0之运行时权限",
            "RecyclerView简单运用",
            "MaterialDesign之TabLayout"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = findViewById(R.id.listView);
        mListView.setAdapter(new MyAdapter());

        JNIClass jniClass = new JNIClass();
        int result = jniClass.add(10,20);
        Log.e("tag","result:"+result);
    }

    class MyAdapter extends BaseAdapter {

        private LayoutInflater mInflater;

        public MyAdapter() {
            mInflater = LayoutInflater.from(MainActivity.this);
        }

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public String getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            TextView textView = (TextView) mInflater.inflate(R.layout.adapter_main, parent, false);
            textView.setText(names[position]);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = null;
                    switch (position) {
                        case 0:
                            intent = new Intent(MainActivity.this, FloatingActionButtonActivity.class);
                            break;
                        case 1:
                            intent = new Intent(MainActivity.this, RuntimePermissionActivity.class);
                            break;
                        case 2:
                            intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                            break;
                        case 3:
                            intent = new Intent(MainActivity.this, TabLayoutSimpleActivity.class);
                            break;
                    }
                    startActivity(intent);
                }
            });
            return textView;
        }
    }
}
