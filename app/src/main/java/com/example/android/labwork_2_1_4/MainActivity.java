package com.example.android.labwork_2_1_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        // инициализация
        tabHost.setup();
        TabHost.TabSpec tabSpec;

        // создаем вкладку 1 и указываем тег
        tabSpec = tabHost.newTabSpec("tag1");
        // название вкладки
        tabSpec.setIndicator("ABOUT");
        // указываем id компонента из FrameLayout -это содержимое
        tabSpec.setContent(R.id.tvTab1);
        // добавляем в корневой элемент
        tabHost.addTab(tabSpec);

        // первая вкладка будет выбрана по умолчанию
        tabHost.setCurrentTabByTag("tag1");

        // создаем вкладку 2 и указываем тег
        tabSpec = tabHost.newTabSpec("tag2");
        // название вкладки
        tabSpec.setIndicator("INGRIDIENT");
        // указываем id компонента из FrameLayout -это содержимое
        tabSpec.setContent(R.id.tvTab);
        // добавляем в корневой элемент
        tabHost.addTab(tabSpec);


    }
}