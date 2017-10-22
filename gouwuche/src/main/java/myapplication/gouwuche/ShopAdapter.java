package myapplication.gouwuche;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

/**
 * Created by Bare on 2017/10/22.
 */

public class ShopAdapter extends BaseAdapter{

    private List<ShopBean> shopBeen;
    private Context context;

    public ShopAdapter(List<ShopBean> shopBeen, Context context) {
        this.shopBeen = shopBeen;
        this.context = context;
    }

    @Override
    public int getCount() {
        return shopBeen.size();
    }

    @Override
    public Object getItem(int i) {
        return shopBeen.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if(view == null){
            view = View.inflate(context,R.layout.activity_item,null);
            viewHolder = new ViewHolder();
            viewHolder.shop_image = (ImageView) view.findViewById(R.id.shop_image);
            viewHolder.shopSelect = (CheckBox) view.findViewById(R.id.shopSelect);
            viewHolder.tv_name = (TextView) view.findViewById(R.id.tv_name);
            viewHolder.tv_price = (TextView) view.findViewById(R.id.tv_price);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tv_name.setText(shopBeen.get(i).getShopName());
        viewHolder.tv_price.setText("¥"+shopBeen.get(i).getPrice());
        viewHolder.shopSelect.setChecked(shopBeen.get(i).isSelected());
        viewHolder.shopSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shopBeen.get(i).setSelected(!shopBeen.get(i).isSelected);
                boolean b = true;
                for (int i =0;i<shopBeen.size();i++){
                    if(!shopBeen.get(i).isSelected){
                        b = false;
                    }
                }
                EventBus.getDefault().post(new EventBean(b,shopBeen));
                notifyDataSetChanged();
            }
        });
        return view;
    }
    class ViewHolder{
        TextView tv_name;
        TextView tv_price;
        ImageView shop_image;
        CheckBox shopSelect;
    }
}
