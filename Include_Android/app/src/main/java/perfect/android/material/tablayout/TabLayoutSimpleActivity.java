package perfect.android.material.tablayout;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import perfect.android.R;

public class TabLayoutSimpleActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private String[] titles = new String[]{"第一条目","第二条目","第三条目","第四条目","第五条目",
            "第六条目","第七条目","第八条目","第九条目","第十条目"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_simple);

        tabLayout = findViewById(R.id.tabLayout);

        for(String tabName : titles){
            tabLayout.addTab(tabLayout.newTab().setText(tabName));
        }

        List<OneFragment> fragmentList = new ArrayList<>();
        for(int i = 0;i<titles.length;i++){
            fragmentList.add(new OneFragment());
        }
    }
}
