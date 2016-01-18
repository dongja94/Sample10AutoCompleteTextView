package com.example.dongja94.sampleautocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView textView;
//    ArrayAdapter<String> mAdapter;
    MyArrayAdapter mAdapter;

    int[] IDS = {R.drawable.gallery_photo_1,
            R.drawable.gallery_photo_2,
            R.drawable.gallery_photo_3,
            R.drawable.gallery_photo_4,
            R.drawable.gallery_photo_5,
            R.drawable.gallery_photo_6,
            R.drawable.gallery_photo_7,
            R.drawable.gallery_photo_8,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        mAdapter = new MyArrayAdapter(this);
        textView.setAdapter(mAdapter);

        initData();
    }

    private void initData() {
        String[] array = getResources().getStringArray(R.array.items);
        for (int i = 0; i < array.length; i++) {
            MyData data = new MyData();
            data.icon = getResources().getDrawable(IDS[i % IDS.length]);
            data.title = array[i];
            mAdapter.add(data);
        }
    }
}
