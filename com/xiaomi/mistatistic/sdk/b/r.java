package com.xiaomi.mistatistic.sdk.b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.d.a.a.h;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class r {
    private static String a;

    public static String a(Context context) {
        String str = null;
        if (null != null) {
            return null;
        }
        String string;
        String b = b(context);
        try {
            string = Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            string = null;
        }
        if (VERSION.SDK_INT > 8) {
            str = Build.SERIAL;
        }
        return a(b + string + str);
    }

    static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(c(str));
            BigInteger bigInteger = new BigInteger(1, instance.digest());
            return String.format("%1$032X", new Object[]{bigInteger});
        } catch (NoSuchAlgorithmException e) {
            return str;
        }
    }

    public static String b(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String deviceId = telephonyManager.getDeviceId();
            int i = 10;
            while (deviceId == null) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                deviceId = telephonyManager.getDeviceId();
                i = i2;
            }
            return deviceId;
        } catch (Throwable th) {
            return null;
        }
    }

    private static byte[] c(String str) {
        try {
            return str.getBytes(h.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            return str.getBytes();
        }
    }

    public String a() {
        if (a != null) {
            return a;
        }
        m.a().a(new s(C1125b.a()));
        return null;
    }
}
