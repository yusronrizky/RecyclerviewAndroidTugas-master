package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.models.TeamItems;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class FastAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_adapter);

        RecyclerView recyclerView = findViewById(R.id.rv_teams);

        ItemAdapter itemAdapter = new ItemAdapter();
        FastAdapter fastAdapter = FastAdapter.with(itemAdapter);

        List teams = new ArrayList();
        teams.add(new TeamItems("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
        teams.add(new TeamItems("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
        teams.add(new TeamItems("https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Atletico_Madrid_2017_logo.svg/800px-Atletico_Madrid_2017_logo.svg.png", "Atletico Madrid"));
        teams.add(new TeamItems("https://upload.wikimedia.org/wikipedia/en/thumb/7/7a/Manchester_United_FC_crest.svg/1024px-Manchester_United_FC_crest.svg.png", "Manchester United"));


        itemAdapter.add(teams);
        recyclerView.setAdapter(fastAdapter);recyclerView.setLayoutManager(new LinearLayoutManager(this));

    } ;
}
