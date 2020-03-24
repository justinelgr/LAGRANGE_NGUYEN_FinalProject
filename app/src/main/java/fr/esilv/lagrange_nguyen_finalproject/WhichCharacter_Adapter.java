package fr.esilv.lagrange_nguyen_finalproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class WhichCharacter_Adapter extends BaseAdapter {

    private final Context mContext;

    // Keep all Images in array
    public Integer[] icons = {
            R.drawable.serena_icon, R.drawable.blair_icon,
            R.drawable.dan_icon, R.drawable.nate_icon,
            R.drawable.chuck_icon, R.drawable.jenny_icon,
            R.drawable.eric_icon, R.drawable.vanessa_icon,
            R.drawable.georgina_icon, R.drawable.carter_icon,
            R.drawable.lily_icon, R.drawable.rufus_icon,
            R.drawable.bart_icon, R.drawable.eleanor_icon,
            R.drawable.dorota_icon
    };

    // Constructor
    public WhichCharacter_Adapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int position) {
        return icons[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(icons[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(350, 350));
        return imageView;
    }
}