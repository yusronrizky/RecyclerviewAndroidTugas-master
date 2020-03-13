package id.ac.polinema.recyclerview.models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerview.R;

public class TeamItems extends AbstractItem<TeamItems,TeamItems.MyViewHolder> {
    private String logo,name;

    public TeamItems(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    @NonNull
    @Override
    public MyViewHolder getViewHolder(View v) {
        return new MyViewHolder(v);
    }

    @Override
    public int getType() {
        return R.id.rv_teams;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_logo;
    }

    public class MyViewHolder extends FastAdapter.ViewHolder<TeamItems> {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_logo);
            textView = itemView.findViewById(R.id.text_name);
        }

        @Override
        public void bindView(TeamItems item, List<Object> payloads) {
            Picasso.get().load(item.logo).into(imageView);
            textView.setText(item.name);
        }

        @Override
        public void unbindView(TeamItems item) {
            imageView.setImageBitmap(null);
            textView.setText(null);
        }
    }
}
