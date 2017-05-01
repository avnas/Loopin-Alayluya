package alayluya.loopin.com.loopin_alayluya.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import alayluya.loopin.com.loopin_alayluya.Pojo.ArticleReturn;
import alayluya.loopin.com.loopin_alayluya.R;
import butterknife.BindView;

/**
 * Created by ranja_000 on 4/30/2017.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewAdapter>{

    Context context;
    ArrayList<ArticleReturn.Result.Category> categoryList;

    public ArticleAdapter(Context context, ArrayList<ArticleReturn.Result.Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @Override
    public ViewAdapter onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.title_circular_image_adapter, viewGroup, false);
        ViewAdapter viewAdapter = new ViewAdapter(view);
        return viewAdapter;

    }

    @Override
    public void onBindViewHolder(ViewAdapter viewAdapter, int i) {
        final ArticleReturn.Result.Category category = categoryList.get(i);
        viewAdapter.title.setText(category.getArticleEntityEnumName());
    }

    @Override
    public int getItemCount() {

        return categoryList.size();
    }

    class ViewAdapter extends RecyclerView.ViewHolder {

        @BindView(R.id.title_circular_image_adapter_text)
        TextView title;
        public ViewAdapter(View itemView) {
            super(itemView);
        }
    }
}
