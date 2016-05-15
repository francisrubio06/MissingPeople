package com.example.henryf.missingpeople;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.facebook.messenger.MessengerUtils;
import com.facebook.messenger.MessengerThreadParams;
import com.facebook.messenger.ShareToMessengerParams;
/**
 * Created by Francisco Rubio on 5/15/2016.
 */
public class PeopleAdapter extends BaseAdapter {
    private static final int REQUEST_CODE_SHARE_TO_MESSENGER = 1;
    private Toolbar mToolbar;
    private View mMessengerButton;
    private MessengerThreadParams mThreadParams;
    private boolean mPicking;
    private Context context;

    public PeopleAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return People.ITEMS.length;
    }

    @Override
    public People getItem(int position) {
        return People.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenPeople = (ImageView) view.findViewById(R.id.imagen_coche);
        TextView nombrePeople = (TextView) view.findViewById(R.id.nombre_coche);

        final People item = getItem(position);
        Glide.with(imagenPeople.getContext())
                .load(item.getIdDrawable())
                .into(imagenPeople);

        nombrePeople.setText(item.getNombre());

        return view;
    }
}
