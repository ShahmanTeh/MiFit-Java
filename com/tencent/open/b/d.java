package com.tencent.open.b;

import android.os.SystemClock;
import com.tencent.connect.common.Constants;
import com.tencent.open.utils.Util;
import com.xiaomi.e.a;

public class d {
    protected static d a;

    protected d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (a == null) {
                a = new d();
            }
            dVar = a;
        }
        return dVar;
    }

    public void a(int i, String str, String str2, String str3, String str4, Long l, int i2, int i3, String str5) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        long j = (l.longValue() == 0 || elapsedRealtime < 0) ? 0 : elapsedRealtime;
        StringBuffer stringBuffer = new StringBuffer("http://c.isdspeed.qq.com/code.cgi");
        stringBuffer.append("?domain=mobile.opensdk.com&cgi=opensdk&type=").append(i).append("&code=").append(i2).append("&time=").append(j).append("&rate=").append(i3).append("&uin=").append(str2).append("&data=");
        g.a().a(stringBuffer.toString(), Constants.HTTP_GET, Util.composeHaboCgiReportParams(String.valueOf(i), String.valueOf(i2), String.valueOf(j), String.valueOf(i3), str, str2, str3, str4, str5), true);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        g.a().a(Util.composeViaReportParams(str, str4, str5, str3, str2, str6, a.f, str7, str8, a.f, a.f, a.f), str2, false);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        g.a().a(Util.composeViaReportParams(str, str4, str5, str3, str2, str6, str7, a.f, a.f, str8, str9, str10), str2, false);
    }
}
