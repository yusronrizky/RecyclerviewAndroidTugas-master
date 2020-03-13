package id.ac.polinema.recyclerview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class ReversedLogoAdapter extends RecyclerView.Adapter<ReversedLogoAdapter.MyViewHolder> {

    private List<TeamLogo> teams = new ArrayList<>();
    public static final int LOGO_LEFT = 1;
    public static final int LOGO_RIGHT = 2;

    public ReversedLogoAdapter(List<TeamLogo> teams) {
        this.teams = teams;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if (viewType == LOGO_LEFT){
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_logo, parent,false);
        }else if(viewType == LOGO_RIGHT){
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_logo_reversed, parent,false);
        }
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TeamLogo team =teams.get(position);
        
        holder.textView.setText(team.getNama());
        Picasso.get().load(team.getLogo()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }


    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? LOGO_RIGHT : LOGO_LEFT;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.text_name);
            imageView = itemView.findViewById(R.id.image_logo);
        }
    }
}
