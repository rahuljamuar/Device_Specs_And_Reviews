package com.jamm.devicespecsandreviews;

/**
 * Created by Rahul on 23-04-2016.
 */


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBrandList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final String[] detail;
    private final Integer[] imageId;

    public CustomBrandList(Activity context,
                           String[] name, String[] detail, Integer[] imageId) {
        super(context, R.layout.list_rows, name);
        this.context = context;
        this.name = name;
        this.detail = detail;
        this.imageId = imageId;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_rows, null, true);
        TextView brandName = (TextView) rowView.findViewById(R.id.brand_name);
        TextView brandDetails = (TextView) rowView.findViewById(R.id.brand_details);

        ImageView brandImage = (ImageView) rowView.findViewById(R.id.brand_image);
        brandName.setText(name[position]);
        brandDetails.setText(detail[position]);

        brandImage.setImageResource(imageId[position]);
        return rowView;
    }
}
