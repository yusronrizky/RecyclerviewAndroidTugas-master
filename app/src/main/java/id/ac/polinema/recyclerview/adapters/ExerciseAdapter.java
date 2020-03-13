package id.ac.polinema.recyclerview.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.ExerciseModel;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.MyViewHolder> {

    private List<ExerciseModel> lists = new ArrayList<>();
    private int posisi = 0;


    public ExerciseAdapter(List<ExerciseModel> lists) {
        this.lists = lists;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exercise,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ExerciseModel item = lists.get(position);

        if (posisi == 0 || posisi == 3){

        }

        posisi++;
        if(posisi > 3) posisi = 0;

        holder.tvName.setText(item.getNama());
        holder.tvTitle.setText(item.getTitle());
        Picasso.get().load(item.getLogo()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvTitle, tvName;
        ConstraintLayout constraintLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.logo);
            tvTitle = itemView.findViewById(R.id.text_title);
            tvName = itemView.findViewById(R.id.text_name);
            constraintLayout = itemView.findViewById(R.id.constrain);
        }
    }
}
