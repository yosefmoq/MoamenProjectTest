package com.yosefmoq.moamenprojecttest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.yosefmoq.moamenprojecttest.R;

import java.util.List;

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
        private List<String> mDataSet;

        private  Context mContext;


        public static class ViewHolder extends RecyclerView.ViewHolder {
                private final TextView textView;

                // We'll use this field to showcase matching the holder from the test.
                private boolean mIsInTheMiddle = false;

                ViewHolder(View v) {
                        super(v);
                        textView = (TextView) v.findViewById(R.id.textView);
                }

                TextView getTextView() {
                        return textView;
                }

                public boolean getIsInTheMiddle() {
                        return mIsInTheMiddle;
                }

                void setIsInTheMiddle(boolean isInTheMiddle) {
                        mIsInTheMiddle = isInTheMiddle;
                }
        }


        public RecyclerAdapter(List<String> dataSet, Context context) {
                mDataSet = dataSet;
                mContext = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
                // Create a new view.
                View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_recycler, viewGroup, false);

                return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, final int position) {
                if (position == mDataSet.size() / 2 /* calculate middle element position */) {
                        viewHolder.setIsInTheMiddle(true);
                                viewHolder.getTextView().setText(mContext.getResources().getString(R.string.middle));
                } else {
                        viewHolder.setIsInTheMiddle(false);
                        viewHolder.getTextView().setText(mDataSet.get(position));
                }
        }

        @Override
        public int getItemCount() {
                return mDataSet.size();
        }

}
