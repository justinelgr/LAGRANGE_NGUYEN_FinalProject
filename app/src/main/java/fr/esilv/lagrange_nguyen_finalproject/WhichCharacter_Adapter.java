package fr.esilv.lagrange_nguyen_finalproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WhichCharacter_Adapter extends BaseAdapter {

    private final Context mContext;
    private final Characters[] icons;

    // 1
    public WhichCharacter_Adapter(Context context, Characters[] icons) {
        this.mContext = context;
        this.icons = icons;
    }

    // 2
    @Override
    public int getCount() {
        return icons.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(position));
        return dummyTextView;
    }

}