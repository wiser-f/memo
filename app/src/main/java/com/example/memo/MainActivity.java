package com.example.memo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private final String[] dataset = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ツールバー　タイトル表記
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("最初の画面だよ");
        }
        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager rLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(rLayoutManager);

        int i = 0;
        while (i < 20) {
            dataset[i] = String.format(Locale.ENGLISH, "Data_0%d", i);
            i++;
        }

        MyAdapter adapter = new MyAdapter(dataset);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_add:
                //　[追加] 選択時の処理
                break;
            default:
                break;
        }

        return super.onMenuItemSelected(featureId, item);
    }

}