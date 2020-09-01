package demo.smart.access.xutlis.other.QuickAdapter.listener;

import android.view.View;

import demo.smart.access.xutlis.other.QuickAdapter.ZXQuickAdapter;

/**
 * Created by AllenCoder on 2016/8/03.
 * A convenience class to extend when you only want to OnItemChildClickListener for a subset
 * of all the SimpleClickListener. This implements all methods in the
 * {@link SimpleClickListener}
 **/

public abstract class OnItemChildClickListener extends SimpleClickListener {
    @Override
    public void onItemClick(ZXQuickAdapter adapter, View view, int position) {

    }

    @Override
    public void onItemLongClick(ZXQuickAdapter adapter, View view, int position) {

    }

    @Override
    public void onItemChildClick(ZXQuickAdapter adapter, View view, int position) {
        onSimpleItemChildClick(adapter, view, position);
    }

    @Override
    public void onItemChildLongClick(ZXQuickAdapter adapter, View view, int position) {

    }

    public abstract void onSimpleItemChildClick(ZXQuickAdapter adapter, View view, int position);
}
