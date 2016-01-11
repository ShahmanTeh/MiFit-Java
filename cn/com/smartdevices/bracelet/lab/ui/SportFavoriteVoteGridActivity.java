package cn.com.smartdevices.bracelet.lab.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.com.smartdevices.bracelet.C0401a;
import cn.com.smartdevices.bracelet.ui.SystemBarTintActivity;
import com.xiaomi.hm.health.k;
import com.xiaomi.hm.health.l;
import com.xiaomi.hm.health.n;
import com.xiaomi.hm.health.r;

public class SportFavoriteVoteGridActivity extends SystemBarTintActivity implements OnClickListener {
    private S a = null;
    private GridView b = null;
    private TextView c = null;
    private TextView d = null;
    private RelativeLayout e = null;
    private ImageView f = null;
    private TextView g = null;
    private TextView h = null;
    private final OnItemClickListener i = new O(this);

    private void a() {
        Dialog dialog = new Dialog(this);
        dialog.setTitle(r.lab_factory_sport_type_others);
        View inflate = getLayoutInflater().inflate(n.dialog_lab_sport_favorite_others, null);
        dialog.setContentView(inflate);
        EditText editText = (EditText) inflate.findViewById(l.favorite_user_sport_name);
        inflate.findViewById(l.left_button).setOnClickListener(new P(this, dialog));
        inflate.findViewById(l.right_button).setOnClickListener(new Q(this, editText, dialog));
        dialog.show();
    }

    private void a(int i, String str) {
        if (this.c == null) {
            this.c = (TextView) findViewById(l.lab_sport_favorite_desc);
        }
        if (this.d == null) {
            this.d = (TextView) findViewById(l.lab_sport_favorite_sub_desc);
        }
        if (this.e == null) {
            this.e = (RelativeLayout) findViewById(l.vote_result);
        }
        if (this.f == null) {
            this.f = (ImageView) findViewById(l.vote_result_img);
        }
        if (this.g == null) {
            this.g = (TextView) findViewById(l.vote_result_name);
        }
        this.f.setImageResource(i);
        this.g.setText(str);
        this.e.setVisibility(0);
        Resources resources = getResources();
        this.c.setText(resources.getText(r.lab_factory_sport_vote_result_desc));
        this.d.setText(resources.getText(r.lab_factory_sport_vote_result_sub_desc));
        this.b.setVisibility(4);
    }

    private void b() {
        this.h = (TextView) findViewById(l.home_back);
        this.h.setOnClickListener(this);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0 && intent != null) {
            String stringExtra = intent.getStringExtra("sport_name");
            if (!TextUtils.isEmpty(stringExtra)) {
                a(k.lab_favorite_vote_others_normal, stringExtra);
                C0401a.a((Context) this, C0401a.bb, "Others", stringExtra);
            }
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case l.home_back /*2131296313*/:
                finish();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) n.activity_lab_factory_more_sport_favorite);
        b();
        this.b = (GridView) findViewById(l.favorite_sports_list);
        this.a = new S(this, this, C0568d.a());
        this.b.setChoiceMode(2);
        this.b.setOnItemClickListener(this.i);
        this.b.setAdapter(this.a);
    }

    public void onDestroy() {
        if (this.a != null) {
            this.a.a();
        }
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();
        C0401a.b(C0401a.ad);
        C0401a.b((Activity) this);
    }

    protected void onResume() {
        super.onResume();
        C0401a.a(C0401a.ad);
        C0401a.a((Activity) this);
    }
}
