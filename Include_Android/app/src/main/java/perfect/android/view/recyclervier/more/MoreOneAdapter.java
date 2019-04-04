package perfect.android.view.recyclervier.more;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import perfect.android.R;

/**
 * @author libingjun
 * @date 2019/4/4
 */
public class MoreOneAdapter extends RecyclerView.Adapter<MoreOneAdapter.ViewHolder> {

    private Context mContext;
    private List<MoreNews> mNewList;

    public MoreOneAdapter(Context context,List<MoreNews> newsList){
        mContext = context;
        mNewList = newsList;
    }

    @NonNull
    @Override
    public MoreOneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.adapter_more_one,parent,false);
        return new ViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull MoreOneAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mNewList == null ? 0 : mNewList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
