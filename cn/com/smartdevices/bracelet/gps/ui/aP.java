package cn.com.smartdevices.bracelet.gps.ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.com.smartdevices.bracelet.C0596r;
import com.xiaomi.hm.health.b.a.i;
import com.xiaomi.hm.health.b.a.j;
import kankan.wheel.widget.WheelView;
import kankan.wheel.widget.a;
import kankan.wheel.widget.a.f;

public class aP implements f {
    public static final int a = 8388607;
    public static final String b = "miui";
    public static final String c = "normal";
    private static final String d = "PickAdapter";
    private static final int e = 16777215;
    private float f;
    private float g;
    private float h;
    private int i;
    private float j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private WheelView r;
    private LayoutInflater s;
    private Context t;
    private int u;
    private int v;
    private String w;
    private int x;

    public aP(Context context, int i, int i2, WheelView wheelView, int i3, int i4) {
        this(context, i, i2, wheelView, i3, i4, false);
    }

    public aP(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        this(context, i, i2, wheelView, i3, i4, i5, z, i6, i7, i8, i9, 1);
    }

    public aP(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10) {
        this.k = 0;
        this.u = 1;
        this.t = context;
        this.q = i;
        this.p = i2;
        this.r = wheelView;
        this.s = LayoutInflater.from(context);
        this.n = i3;
        this.o = i4;
        this.i = i5;
        this.m = z;
        this.j = TypedValue.applyDimension(1, (float) i6, context.getResources().getDisplayMetrics());
        this.f = (float) i7;
        this.g = (float) i8;
        this.h = (float) i9;
        b(i10);
        this.k = (this.p - this.q) + 1;
        this.l = this.k * (a / this.k);
    }

    public aP(Context context, int i, int i2, WheelView wheelView, int i3, int i4, boolean z) {
        this(context, i, i2, wheelView, i3, i4, a.bm, z, 32, 11, 10, 9, 1);
    }

    private void e() {
        this.k = (this.p - this.q) + 1;
        this.l = this.k * (a / this.k);
    }

    public int a() {
        return this.m ? e : this.k;
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        View view2;
        int i2;
        view = (RelativeLayout) view;
        int i3 = i % this.k;
        if (view == null) {
            view2 = c.equals(this.w) ? (RelativeLayout) this.s.inflate(j.wheel_item_normal, null) : (RelativeLayout) this.s.inflate(j.wheel_item_miui, null);
            C0489aR c0489aR = new C0489aR();
            c0489aR.a = (TextView) view2.findViewById(i.content_txt);
            c0489aR.a.getLayoutParams().height = (int) this.j;
            view2.setTag(c0489aR);
        } else {
            view2 = view;
        }
        TextView textView = ((C0489aR) view2.getTag()).a;
        CharSequence format = String.format("%02d", new Object[]{Integer.valueOf((this.q + i3) * this.u)});
        int e = this.r.e();
        C0596r.e(d, "index = " + i + ", realCurIndex =" + e + ", pos=" + i3);
        switch (this.v) {
            case a.bp /*16*/:
                i3 += this.q;
                if (i3 > cn.com.smartdevices.bracelet.gps.c.a.i) {
                    i2 = i3 - 180;
                    format = String.format("%03d", new Object[]{Integer.valueOf(i2)});
                    break;
                }
                break;
        }
        textView.setText(format);
        i2 = (int) this.f;
        if (i == e) {
            textView.setTextColor(this.n);
        } else if (i == e - 1 || i == e + 1) {
            i2 = (int) this.g;
            textView.setTextColor(this.o);
        } else {
            i2 = (int) this.h;
            textView.setTextColor(this.i);
        }
        textView.setTextSize((float) i2);
        return view2;
    }

    public View a(View view, ViewGroup viewGroup) {
        return null;
    }

    public void a(int i) {
        this.v = i;
    }

    public void a(DataSetObserver dataSetObserver) {
    }

    public void a(String str) {
        this.w = str;
    }

    public void b(int i) {
        this.u = i;
    }

    public void b(DataSetObserver dataSetObserver) {
    }

    public boolean b() {
        return this.m;
    }

    public int c() {
        return this.l;
    }

    public void c(int i) {
        this.q = i;
    }

    public int d() {
        return this.k;
    }

    public void d(int i) {
        this.p = i;
        e();
        C0596r.e("Height", "setEnd: " + i + " base bundle = " + this.k);
    }

    public void e(int i) {
        this.x = i;
    }
}
