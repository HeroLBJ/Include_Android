package perfect.android;

import androidx.appcompat.app.AppCompatActivity;
import perfect.android.material.FloatingActionButtonActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] names = new String[]{"MaterialDesign之FloatingActionButton"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = findViewById(R.id.listView);
        mListView.setAdapter(new MyAdapter());
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
                    }
                    startActivity(intent);
                }
            });
            return textView;
        }
    }
}
