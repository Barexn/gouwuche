package myapplication.gouwuche;

import java.util.List;

/**
 * Created by Bare on 2017/10/22.
 */

public class EventBean {
    public boolean isSelectAll;
    public List<ShopBean> list;

    public EventBean(boolean isSelectAll, List<ShopBean> list) {
        this.isSelectAll = isSelectAll;
        this.list = list;
    }

    public boolean isSelectAll() {
        return isSelectAll;
    }

    public void setSelectAll(boolean selectAll) {
        isSelectAll = selectAll;
    }

    public List<ShopBean> getList() {
        return list;
    }

    public void setList(List<ShopBean> list) {
        this.list = list;
    }
}
