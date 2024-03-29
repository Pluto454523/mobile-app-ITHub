package com.example.it_hub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private int idActiveMenu = R.id.btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(this);
        LinearLayout btnCourse = findViewById(R.id.btnCourse);
        btnCourse.setOnClickListener(this);
        LinearLayout btnPersonel = findViewById(R.id.btnPersonel);
        btnPersonel.setOnClickListener(this);
        LinearLayout btnLocation = findViewById(R.id.btnLocation);
        btnLocation.setOnClickListener(this);
        LinearLayout btnEvent = findViewById(R.id.btnAbout);
        btnEvent.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btnHome && viewId != idActiveMenu) {

            onMenuActive(viewId);
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, HomeFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name")
                    .commit();

        } else if (viewId == R.id.btnCourse && viewId != idActiveMenu) {

            onMenuActive(viewId);
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, CourseFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name")
                    .commit();

        } else if (viewId == R.id.btnPersonel && viewId != idActiveMenu) {

            onMenuActive(viewId);
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, PersonelFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name")
                    .commit();

        } else if (viewId == R.id.btnLocation && viewId != idActiveMenu) {

            onMenuActive(viewId);
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, LocationFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name")
                    .commit();

        } else if (viewId == R.id.btnAbout && viewId != idActiveMenu) {

            onMenuActive(viewId);
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, AboutFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name")
                    .commit();

        }
    }

    private void onMenuActive(int id) {
        LinearLayout linearLayout;

        linearLayout = findViewById(idActiveMenu);
        linearLayout.setBackground(null);

        linearLayout = findViewById(id);
        linearLayout.setBackgroundResource(R.drawable.menu_icon_active);

        idActiveMenu = id;
    }
}