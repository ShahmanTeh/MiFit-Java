package cn.com.smartdevices.bracelet.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import cn.com.smartdevices.bracelet.C0401a;
import cn.com.smartdevices.bracelet.C0596r;
import cn.com.smartdevices.bracelet.view.C0828b;
import cn.com.smartdevices.bracelet.view.SelectDaysView;
import com.xiaomi.hm.health.bt.model.AlarmClockItem;
import com.xiaomi.hm.health.f;
import com.xiaomi.hm.health.l;
import com.xiaomi.hm.health.n;
import com.xiaomi.hm.health.r;
import kankan.wheel.widget.a;

public class AlarmRepeatActivity extends SystemBarTintActivity implements OnClickListener {
    private static final String a = "AlarmRepeatActivity";
    private SelectDaysView b;
    private int c;
    private TextView d;

    private void a() {
        int i = 0;
        for (int i2 : AlarmClockItem.WEEK_MASK) {
            if ((i2 & this.c) != 0) {
                i++;
            }
        }
        C0596r.e(a, "bits=" + i);
        this.d.setText(String.format(getString(r.alarm_repeat_title_format), new Object[]{Integer.valueOf(i)}));
    }

    private void b() {
        findViewById(l.cancel).setOnClickListener(this);
        findViewById(l.confirm).setOnClickListener(this);
        this.d = (TextView) findViewById(l.fragment_alarm_repeat_title);
        this.b = (SelectDaysView) findViewById(l.days_view);
        C0596r.e(a, "Days : " + this.c);
        this.b.a(new C0828b(this, getResources().getStringArray(f.weeks), this.c));
        this.b.a(new C0809i(this));
    }

    protected boolean isExceptForMiNote() {
        return true;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case l.confirm /*2131296545*/:
                Intent intent = new Intent();
                intent.putExtra(a.bv, this.c);
                setResult(-1, intent);
                finish();
                return;
            case l.cancel /*2131296581*/:
                finish();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) n.alarm_repeat_activity);
        Intent intent = getIntent();
        if (intent == null) {
            this.c = 0;
        } else {
            this.c = intent.getIntExtra(a.bv, 0);
        }
        b();
        a();
    }

    protected void onPause() {
        super.onPause();
        C0401a.b(C0401a.J);
        C0401a.b((Activity) this);
    }

    protected void onResume() {
        super.onResume();
        C0401a.a(C0401a.J);
        C0401a.a((Activity) this);
    }
}
