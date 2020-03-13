package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.ExerciseAdapter;
import id.ac.polinema.recyclerview.models.ExerciseModel;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        RecyclerView rv = findViewById(R.id.rv_teams);

        List<ExerciseModel> lists = new ArrayList<>();
        lists.add(new ExerciseModel("A City Living Under the Shadow", "RBC News ", R.drawable.rbc));
        lists.add(new ExerciseModel("One Problem for Democratic Leaders", "Ny Times", R.drawable.bbc));
        lists.add(new ExerciseModel("The Golden Secret to Better Breakfasat", "BBC World", R.drawable.yahoo));
        lists.add(new ExerciseModel("How to Plan Your First Ski Vacation", "NBC Nightly", R.drawable.rbc));
        lists.add(new ExerciseModel("How Social Isolation Is Killing Us", "RBC News", R.drawable.bbc));
        lists.add(new ExerciseModel("Use Labels to Sort Messages in Facebook", "BBC World", R.drawable.yahoo));

        rv.setAdapter(new ExerciseAdapter(lists));
        rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}

