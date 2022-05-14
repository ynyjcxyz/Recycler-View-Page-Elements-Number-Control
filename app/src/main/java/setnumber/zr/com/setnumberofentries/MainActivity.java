package setnumber.zr.com.setnumberofentries;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<TestData> testDataList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TestAdapter testAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        iniData();
        initRecyclerList(testDataList);
    }

    private void initRecyclerList(List<TestData> testDataList) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        testAdapter = new TestAdapter(testDataList);
        recyclerView.setAdapter(testAdapter);
    }

    private void iniData() {
        for (int i = 0; i < 20; i++) {
            TestData testData = new TestData(i);
            testDataList.add(testData);
        }
    }
}
