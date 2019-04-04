package perfect.android.view.recyclervier.simple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import perfect.android.R;

class SimpleRecyclerViewAdapter extends RecyclerView.Adapter<SimpleRecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private List<New> mNewList;

    public SimpleRecyclerViewAdapter(Context context,List<New> newList){
        mContext = context;
        mNewList = newList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_simple_recycler_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        New news = mNewList.get(position);
        holder.tvTitle.setText(news.getTitle());
        holder.tvContent.setText(news.getContent());
        holder.tvFrom.setText(news.getFrom());
        holder.tvTime.setText(news.getTime());
    }

    @Override
    public int getItemCount() {
        return mNewList == null ? 0 : mNewList.size();
    }

    /**
     * 当只有一个布局时，可以不复写这个方法
     * @param position position
     * @return position
     */
    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;
        TextView tvContent;
        TextView tvFrom;
        TextView tvTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvContent = itemView.findViewById(R.id.tv_content);
            tvFrom = itemView.findViewById(R.id.tv_from);
            tvTime = itemView.findViewById(R.id.tv_time);
        }
    }
}
