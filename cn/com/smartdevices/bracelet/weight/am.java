package cn.com.smartdevices.bracelet.weight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huami.android.view.c;
import com.xiaomi.hm.health.R;

public class am extends c {
    protected int inflateLayout() {
        return R.layout.fragment_weight_overload;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((TextView) onCreateView.findViewById(R.id.weight_overload_confirm_tv)).setOnClickListener(new an(this));
        return onCreateView;
    }
}
