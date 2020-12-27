package com.yosefmoq.moamenprojecttest;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
        @VisibleForTesting
        protected static final String ROW_TEXT = "ROW_TEXT";

        @VisibleForTesting
        protected static final String ROW_ENABLED = "ROW_ENABLED";

        @VisibleForTesting
        protected static final int NUMBER_OF_ITEMS = 100;

        @VisibleForTesting
        protected static final String ITEM_TEXT_FORMAT = "item: %d";

        private List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

        private LayoutInflater layoutInflater;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                ListView listView =  findViewById(R.id.list);
                String[] from = new String[]{ROW_TEXT, ROW_ENABLED};
                int[] to = new int[]{R.id.rowContentTextView};
                populateData();
                layoutInflater = getLayoutInflater();
                ListAdapter adapter = new LongListAdapter(from, to);

                // Send the data to the list.
                listView.setAdapter(adapter);
        }

        @VisibleForTesting
        protected static Map<String, Object> makeItem(int forRow) {
                Map<String, Object> dataRow = Maps.newHashMap();
                dataRow.put(ROW_TEXT, String.format(ITEM_TEXT_FORMAT, forRow));
                dataRow.put(ROW_ENABLED, forRow == 1);
                return dataRow;
        }

        private void populateData() {
                for (int i = 0; i < NUMBER_OF_ITEMS; i++) {
                        data.add(makeItem(i));
                }
        }

        private class LongListAdapter extends SimpleAdapter {

                public LongListAdapter(String[] from, int[] to) {
                        super(MainActivity.this, MainActivity.this.data, R.layout.list_item, from, to);
                }

                @Override
                public View getView(final int position, View convertView, ViewGroup parent) {
                        // Inflate list items.
                        if (null == convertView) {
                                convertView = layoutInflater.inflate(R.layout.list_item, null);
                        }

                        convertView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                        ((TextView) findViewById(R.id.selection_row_value)).setText(
                                            String.valueOf(position));
                                }
                        });

                        return super.getView(position, convertView, parent);
                }
        }

}