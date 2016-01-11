package cn.com.smartdevices.bracelet.partner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.com.smartdevices.bracelet.C0401a;
import cn.com.smartdevices.bracelet.ui.SystemBarTintActivity;
import com.xiaomi.hm.health.f;
import com.xiaomi.hm.health.l;
import com.xiaomi.hm.health.n;
import com.xiaomi.hm.health.r;

public class HealthLinkActivity extends SystemBarTintActivity implements OnClickListener {
    private static final String NUMBER = "4008989580";

    public void onClick(View view) {
        switch (view.getId()) {
            case l.home_back /*2131296313*/:
                finish();
                return;
            case l.call_button /*2131296402*/:
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:4008989580")));
                C0401a.a(getApplicationContext(), C0401a.bz);
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) n.activity_health_link);
        TextView textView = (TextView) findViewById(l.home_back);
        textView.setText(r.title_health_link_service);
        textView.setOnClickListener(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(l.call_button);
        viewGroup.setOnClickListener(this);
        ((TextView) viewGroup.getChildAt(0)).setText(NUMBER);
        LinearLayout linearLayout = (LinearLayout) findViewById(l.description);
        String[] stringArray = getResources().getStringArray(f.health_link_title);
        String[] stringArray2 = getResources().getStringArray(f.health_link_content);
        LayoutInflater from = LayoutInflater.from(this);
        for (int i = 0; i < stringArray.length; i++) {
            View inflate = from.inflate(n.view_health_care_item, null);
            TextView textView2 = (TextView) inflate.findViewById(l.content);
            ((TextView) inflate.findViewById(l.title)).setText(stringArray[i]);
            textView2.setText(stringArray2[i]);
            linearLayout.addView(inflate);
        }
        C0401a.a((Context) this, C0401a.by);
    }

    protected void onPause() {
        super.onPause();
        C0401a.b(C0401a.az);
        C0401a.b((Activity) this);
    }

    protected void onResume() {
        super.onResume();
        C0401a.a(C0401a.az);
        C0401a.a((Activity) this);
    }
}
