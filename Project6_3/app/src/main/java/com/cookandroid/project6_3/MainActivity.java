package com.cookandroid.project6_3;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec tabSpec1 = tabHost.newTabSpec("DOG").setIndicator("강아지");
        tabSpec1.setContent(R.id.tabDog);
        tabHost.addTab(tabSpec1);

        TabSpec tabSpec2 = tabHost.newTabSpec("CAT").setIndicator("고양이");
        tabSpec2.setContent(R.id.tabCat);
        tabHost.addTab(tabSpec2);

        TabSpec tabSpec3 = tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        tabSpec3.setContent(R.id.tabRabbit);
        tabHost.addTab(tabSpec3);

        TabSpec tabSpec4 = tabHost.newTabSpec("HORSE").setIndicator("말");
        tabSpec4.setContent(R.id.tabHorse);
        tabHost.addTab(tabSpec4);

        tabHost.setCurrentTab(0);
    }
}
