package cn.com.smartdevices.bracelet.ui;

import android.view.View;

class C0686ap implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ C0681ak b;

    C0686ap(C0681ak c0681ak, View view) {
        this.b = c0681ak;
        this.a = view;
    }

    public void run() {
        this.b.a(this.a, this.b.E);
    }
}
