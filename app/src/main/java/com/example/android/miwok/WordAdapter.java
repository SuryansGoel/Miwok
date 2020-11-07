package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;

    public WordAdapter(@NonNull Context context, @NonNull List objects, int color) {
        super(context, 0, objects);
        mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Word w = getItem(position);

        LinearLayout innerLinearLayout = (LinearLayout) convertView.findViewById(R.id.innerLinearLayout);
        TextView miwok_textview = (TextView) convertView.findViewById(R.id.miwok_textview);
        TextView eng_textview = (TextView) convertView.findViewById(R.id.eng_textview);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        innerLinearLayout.setBackgroundResource(mColor);
        miwok_textview.setText(w.getMiwokTranslation());
        eng_textview.setText(w.getEngTranslation());
        if (w.hasImage())
            image.setImageResource(w.getImage());
        else
            image.setVisibility(View.GONE);

        return convertView;
    }
}