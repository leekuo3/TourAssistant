package com.daoshengwanwu.android.tourassistant.leekuo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.daoshengwanwu.android.tourassistant.R;

import java.util.ArrayList;

/**
 * Created by LK on 2016/11/22.
 */
public class MyTeamAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MyTeamItem> items=new ArrayList<>();

    public MyTeamAdapter(Context context, ArrayList<MyTeamItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.lk_activity_my_team_item,null);
        ImageView pic=(ImageView)convertView.findViewById(R.id.activity_my_team_item_pic);
        pic.setImageResource(items.get(position).getPic());
        TextView name=(TextView)convertView.findViewById(R.id.activity_my_team_item_text);
        name.setText(items.get(position).getName());
        return convertView;
    }
}
