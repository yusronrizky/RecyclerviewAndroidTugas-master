package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleSimpleButton(View view) {
		startActivity(new Intent(this, SimpleActivity.class));
	}

	public void handleLogoButton(View view) {
		startActivity(new Intent(this, LogoActivity.class));
	}

	public void handleGridButton(View view) {
		startActivity(new Intent(this, GridActivity.class));
	}

	public void handleViewTypeButton(View view) {
		startActivity(new Intent(this, ViewTypeActivity.class));
	}

	public void handleExercise(View view) {
	    startActivity(new Intent(this, ExerciseActivity.class));
	}

	public void handleFastAdapter(View view) {
		startActivity(new Intent(this, FastAdapterActivity.class));
	}
}
