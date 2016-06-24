package com.dahanis.piechart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //注意两个数相除必须转换成同样的类型
    float a = 99.0f, b = 90.0f, c = 90.0f, d = 99.0f, e = 80.0f, f = 80.0f;
    float total = a + b + c + d + e + f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_pie_chart_view);

        PieChartView pieChartView = (PieChartView) findViewById(R.id.pie_chart);

        List<PieChartView.PieceDataHolder> pieceDataHolders = new ArrayList<>();
        pieceDataHolders.add(new PieChartView.PieceDataHolder(10, 0xFF77CCAA, "%"+String.format("%.2f",a/total*100)));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(10, 0xFF11AA33, "%" +String.format("%.2f",b/total*100)));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(10, Color.GRAY, "%" +String.format("%.2f",c/total*100)));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(10, Color.YELLOW, "%" + String.format("%.2f",d/total*100)));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(10, Color.RED, "%" +String.format("%.2f",e/total*100)));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(10, Color.BLUE, "%" + String.format("%.2f",f/total*100)));
        pieChartView.setData(pieceDataHolders);
    }
}
