package com.example.carlos.myhairapp;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CustomSwipeAdapter extends PagerAdapter {

    private int[] image_resources = {R.drawable.imggel,R.drawable.imgmousse,R.drawable.imgpomada,R.drawable.logo,R.drawable.pic1};
    private Context ctx;
    private LayoutInflater layoutinflater;

    public CustomSwipeAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    public Object instantiateItem(ViewGroup container, int position){
        layoutinflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutinflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.image_view);
        imageView.setImageResource(image_resources[position]);
        container.addView(item_view);

        return item_view;
    }

    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((LinearLayout)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return (view==(LinearLayout)object);
    }
}
