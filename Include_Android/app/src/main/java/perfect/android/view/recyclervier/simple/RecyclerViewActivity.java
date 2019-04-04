package perfect.android.view.recyclervier.simple;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import perfect.android.R;

/**
 * 简单的RecyclerView使用
 */
public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        mRecyclerView = findViewById(R.id.recyclerView);
        // 设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        // 设置垂直布局
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        // 设置Adapter
        mRecyclerView.setAdapter(new SimpleRecyclerViewAdapter(this,getNews()));
        // 设置Item条目
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        // 设置增加或者删除默认动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // 当我们确定Item的改变不会影响RecyclerView的宽高的时候可以设置setHasFixedSize(true)，
        // 并通过Adapter的增删改插方法去刷新RecyclerView，而不是通过notifyDataSetChanged()
        mRecyclerView.setHasFixedSize(true);
    }

    private List<New> getNews() {
        List<New> list = new ArrayList<>();
        list.add(new New("今天1", "今天出大太阳啦.....", "2019年4月1日", "天气预报"));
        list.add(new New("今天2", "今天出大太阳啦........", "2019年4月2日", "天气预报"));
        list.add(new New("今天3", "今天出大太阳啦......", "2019年4月3日", "天气预报"));
        list.add(new New("今天4", "今天出大太阳啦....", "2019年4月4日", "天气预报"));
        list.add(new New("今天5", "今天出大太阳啦.....", "2019年4月5日", "天气预报"));
        list.add(new New("今天6", "今天出大太阳啦........", "2019年4月6日", "天气预报"));
        list.add(new New("今天7", "今天出大太阳啦........", "2019年4月7日", "天气预报"));
        list.add(new New("今天8", "今天出大太阳啦.......", "2019年4月8日", "天气预报"));
        list.add(new New("今天9", "今天出大太阳啦.......", "2019年4月9日", "天气预报"));
        list.add(new New("今天10", "今天出大太阳啦...", "2019年4月10日", "天气预报"));
        return list;
    }
}
