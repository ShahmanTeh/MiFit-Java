package cn.com.smartdevices.bracelet.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import cn.com.smartdevices.bracelet.C0401a;
import cn.com.smartdevices.bracelet.C0596r;
import cn.com.smartdevices.bracelet.Keeper;
import cn.com.smartdevices.bracelet.config.b;
import cn.com.smartdevices.bracelet.datasource.DeviceSource;
import cn.com.smartdevices.bracelet.eventbus.EventPersonInfoUpdateUnit;
import cn.com.smartdevices.bracelet.model.PersonInfo;
import com.xiaomi.hm.health.l;
import com.xiaomi.hm.health.n;
import de.greenrobot.event.EventBus;
import kankan.wheel.widget.g;

public class PersonInfoSettingUnitActivity extends SystemBarTintActivity implements OnClickListener {
    private PersonInfo a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private b s;
    private final String t = "PersonInfoSettingUnitActivity";

    private void a() {
        this.a = Keeper.readPersonInfo();
        this.s = b.h();
        b();
        c();
    }

    private void a(int i) {
        if (i == l.person_info_length_unit_metric_area) {
            this.h.setVisibility(0);
            this.i.setVisibility(4);
            this.n.setTextColor(getResources().getColor(g.main_ui_title_color));
            this.m.setTextColor(getResources().getColor(g.highlight));
        } else if (i == l.person_info_length_unit_british_area) {
            this.h.setVisibility(4);
            this.i.setVisibility(0);
            this.m.setTextColor(getResources().getColor(g.main_ui_title_color));
            this.n.setTextColor(getResources().getColor(g.highlight));
        }
    }

    private void b() {
        this.b = findViewById(l.person_info_length_unit_metric_area);
        this.b.setOnClickListener(this);
        this.c = findViewById(l.person_info_length_unit_british_area);
        this.c.setOnClickListener(this);
        this.e = findViewById(l.person_info_weight_unit_british_area);
        this.e.setOnClickListener(this);
        this.d = findViewById(l.person_info_weight_unit_metric_area);
        this.d.setOnClickListener(this);
        this.f = findViewById(l.person_info_weight_unit_shijin_area);
        this.f.setOnClickListener(this);
        this.g = findViewById(l.person_info_weight_unit_text_hint_area);
        this.g.setClickable(false);
        this.h = findViewById(l.length_unit_metric);
        this.i = findViewById(l.length_unit_british);
        this.j = findViewById(l.weight_unit_metric);
        this.k = findViewById(l.weight_unit_british);
        this.l = findViewById(l.weight_unit_shijin);
        this.m = (TextView) findViewById(l.length_unit_metric_txt);
        this.n = (TextView) findViewById(l.length_unit_british_txt);
        this.o = (TextView) findViewById(l.weight_unit_metric_txt);
        this.p = (TextView) findViewById(l.weight_unit_british_txt);
        this.q = (TextView) findViewById(l.weight_unit_shijin_txt);
        this.r = (TextView) findViewById(l.weight_unit_text_hint);
    }

    private void b(int i) {
        if (i == l.person_info_weight_unit_british_area) {
            this.k.setVisibility(0);
            this.p.setTextColor(getResources().getColor(g.highlight));
            this.j.setVisibility(4);
            this.o.setTextColor(getResources().getColor(g.main_ui_title_color));
            this.l.setVisibility(4);
            this.q.setTextColor(getResources().getColor(g.main_ui_title_color));
        } else if (i == l.person_info_weight_unit_metric_area) {
            this.k.setVisibility(4);
            this.p.setTextColor(getResources().getColor(g.main_ui_title_color));
            this.j.setVisibility(0);
            this.o.setTextColor(getResources().getColor(g.highlight));
            this.l.setVisibility(4);
            this.q.setTextColor(getResources().getColor(g.main_ui_title_color));
        } else if (i == l.person_info_weight_unit_shijin_area) {
            this.k.setVisibility(4);
            this.p.setTextColor(getResources().getColor(g.main_ui_title_color));
            this.j.setVisibility(4);
            this.o.setTextColor(getResources().getColor(g.main_ui_title_color));
            this.l.setVisibility(0);
            this.q.setTextColor(getResources().getColor(g.highlight));
        }
    }

    private void c() {
        if (!this.s.l.a.booleanValue()) {
            findViewById(l.person_info_weight_unit_shijin_and_txt_area).setVisibility(4);
        }
        a(d());
        if (DeviceSource.hasBindWeight()) {
            this.r.setVisibility(0);
            c(e());
            return;
        }
        this.r.setVisibility(4);
        b(e());
    }

    private void c(int i) {
        f();
        if (i == l.person_info_weight_unit_british_area) {
            this.k.setVisibility(0);
            this.p.setTextColor(getResources().getColor(g.highlight));
            this.j.setVisibility(4);
            this.o.setTextColor(getResources().getColor(g.text_color_gray));
            this.l.setVisibility(4);
            this.q.setTextColor(getResources().getColor(g.text_color_gray));
        } else if (i == l.person_info_weight_unit_metric_area) {
            this.k.setVisibility(4);
            this.p.setTextColor(getResources().getColor(g.text_color_gray));
            this.j.setVisibility(0);
            this.o.setTextColor(getResources().getColor(g.highlight));
            this.l.setVisibility(4);
            this.q.setTextColor(getResources().getColor(g.text_color_gray));
        } else if (i == l.person_info_weight_unit_shijin_area) {
            this.k.setVisibility(4);
            this.p.setTextColor(getResources().getColor(g.text_color_gray));
            this.j.setVisibility(4);
            this.o.setTextColor(getResources().getColor(g.text_color_gray));
            this.l.setVisibility(0);
            this.q.setTextColor(getResources().getColor(g.highlight));
        }
    }

    private int d() {
        int i = this.a.miliConfig.unit;
        return i == 1 ? l.person_info_length_unit_british_area : i == 0 ? l.person_info_length_unit_metric_area : l.person_info_length_unit_metric_area;
    }

    private int e() {
        int i = this.a.miliConfig.weightUnit;
        C0596r.e("PersonInfoSettingUnitActivity", "weightUnit: " + this.a.miliConfig.weightUnit);
        return i == 16 ? l.person_info_weight_unit_shijin_area : i == 1 ? l.person_info_weight_unit_british_area : i == 0 ? l.person_info_weight_unit_metric_area : l.person_info_weight_unit_metric_area;
    }

    private void f() {
        this.e.setClickable(false);
        this.d.setClickable(false);
        this.f.setClickable(false);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case l.person_info_length_unit_metric_area /*2131296626*/:
                this.a.miliConfig.unit = 0;
                a(id);
                break;
            case l.person_info_length_unit_british_area /*2131296629*/:
                this.a.miliConfig.unit = 1;
                a(id);
                break;
            case l.person_info_weight_unit_metric_area /*2131296633*/:
                this.a.miliConfig.weightUnit = 0;
                b(id);
                break;
            case l.person_info_weight_unit_british_area /*2131296636*/:
                this.a.miliConfig.weightUnit = 1;
                b(id);
                break;
            case l.person_info_weight_unit_shijin_area /*2131296640*/:
                this.a.miliConfig.weightUnit = 16;
                b(id);
                break;
        }
        C0596r.e("PersonInfoSettingUnitActivity", "weightUnit: " + this.a.miliConfig.weightUnit);
        this.a.setNeedSyncServer(2);
        Keeper.keepPersonInfo(this.a);
        EventBus.getDefault().post(new EventPersonInfoUpdateUnit());
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) n.activity_person_info_setting_unit);
        a();
        C0596r.e("PersonInfoSettingUnitActivity", "weightUnit: " + this.a.miliConfig.weightUnit);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C0401a.b(C0401a.h);
    }

    public void onResume() {
        super.onResume();
        C0401a.a(C0401a.h);
    }
}
