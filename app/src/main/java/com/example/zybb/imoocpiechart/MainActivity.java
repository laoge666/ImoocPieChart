package com.example.zybb.imoocpiechart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private ViewPager vpMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vpMain = ((ViewPager) findViewById(R.id.vp_main));
        initView();
        Gson gson=new Gson();
    }

    private void initView() {
        vpMain.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return PieFragment.newInstance(position + "");
            }

            @Override
            public int getCount() {
                return 4;
            }
        });
    }
}
