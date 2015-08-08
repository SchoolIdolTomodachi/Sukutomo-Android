package lu.schoolido.sukutomo.sukutomo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by arukantara on 8/08/15.
 */
public class IdolsAdapter extends ArrayAdapter<String> {

    Context context;
    int layoutResourceId;
    ArrayList<String> data = null;

    public IdolsAdapter(Context context, int layoutResourceId, ArrayList data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        TextView text;
        int layout;

        if(data.get(position).equalsIgnoreCase("Ayase Eli")) {
            layout = R.layout.list_eli;
        } else if(data.get(position).equalsIgnoreCase("Hoshizora Rin")) {
            layout = R.layout.list_rin;
        } else if(data.get(position).equalsIgnoreCase("Koizumi Hanayo")) {
            layout = R.layout.list_hanayo;
        } else if(data.get(position).equalsIgnoreCase("Kousaka Honoka")) {
            layout = R.layout.list_honoka;
        } else if(data.get(position).equalsIgnoreCase("Minami Kotori")) {
            layout = R.layout.list_kotori;
        } else if(data.get(position).equalsIgnoreCase("Nishikino Maki")) {
            layout = R.layout.list_maki;
        } else if(data.get(position).equalsIgnoreCase("Sonoda Umi")) {
            layout = R.layout.list_umi;
        } else if(data.get(position).equalsIgnoreCase("Toujou Nozomi")) {
            layout = R.layout.list_nozomi;
        } else if(data.get(position).equalsIgnoreCase("Yazawa Nico")) {
            layout = R.layout.list_nico;
        } else {
            layout = R.layout.simple_white_list_item;
        }

        row = LayoutInflater.from(getContext()).inflate(layout, parent, false);
        text = (TextView) row;

        String item = getItem(position);
        text.setText(item.toString());

        return row;
    }

}