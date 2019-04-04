package perfect.android.view.recyclervier.more;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import perfect.android.R;

/**
 * @author libingjun
 * @date 2019/4/4
 */
public class MoreRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_recycler_view);
        mRecyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(llm);
        // 设置垂直布局
        llm.setOrientation(RecyclerView.VERTICAL);
        // 设置Adapter
//        mRecyclerView.setAdapter(new MoreOneAdapter(this,getNews());
        // 设置Item条目
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        // 设置增加或者删除默认动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // 当我们确定Item的改变不会影响RecyclerView的宽高的时候可以设置setHasFixedSize(true)，
        // 并通过Adapter的增删改插方法去刷新RecyclerView，而不是通过notifyDataSetChanged()
        mRecyclerView.setHasFixedSize(true);
    }
}
