package cn.com.smartdevices.bracelet.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import cn.com.smartdevices.bracelet.C0596r;
import com.xiaomi.hm.health.bt.model.AlarmClockItem;
import com.xiaomi.hm.health.k;
import com.xiaomi.hm.health.l;
import com.xiaomi.hm.health.n;
import kankan.wheel.widget.g;

public class Y extends BaseAdapter {
    private static final String e = "WeekAdapter";
    protected final Context a;
    protected int b;
    protected int c;
    protected String[] d;

    public Y(Context context, String[] strArr, int i) {
        this.a = context;
        this.b = i;
        this.d = strArr;
        C0596r.e(e, "mDays =" + Long.toHexString((long) this.b));
    }

    public int a() {
        return this.c;
    }

    public void a(int i) {
        this.b = i;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.d.length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(n.view_select_days_item, null);
        }
        TextView textView = (TextView) view.findViewById(l.week_tv);
        textView.setText(this.d[i]);
        ImageView imageView = (ImageView) view.findViewById(l.select_marker);
        imageView.setImageResource(k.arrow_multi_choice);
        if (((this.b & AlarmClockItem.WEEK_MASK[i]) != 0 ? 1 : 0) != 0) {
            imageView.setVisibility(0);
            textView.setTextColor(this.a.getResources().getColor(g.highlight));
        } else {
            imageView.setVisibility(4);
            textView.setTextColor(this.a.getResources().getColor(g.main_ui_title_color));
        }
        return view;
    }
}
