package com.xiaomi.network;

import android.support.v4.view.a.C0113o;
import com.xiaomi.hm.health.dataprocess.HeartRateInfo;

public class b {
    private static final String a = System.getProperty("line.separator");
    private static char[] b = new char[64];
    private static byte[] c = new byte[C0113o.h];

    static {
        int i;
        int i2 = 0;
        char c = 'A';
        int i3 = 0;
        while (c <= 'Z') {
            i = i3 + 1;
            b[i3] = c;
            c = (char) (c + 1);
            i3 = i;
        }
        c = 'a';
        while (c <= 'z') {
            i = i3 + 1;
            b[i3] = c;
            c = (char) (c + 1);
            i3 = i;
        }
        c = '0';
        while (c <= '9') {
            i = i3 + 1;
            b[i3] = c;
            c = (char) (c + 1);
            i3 = i;
        }
        i = i3 + 1;
        b[i3] = '+';
        i3 = i + 1;
        b[i] = '/';
        for (int i4 = 0; i4 < c.length; i4++) {
            c[i4] = (byte) -1;
        }
        while (i2 < 64) {
            c[b[i2]] = (byte) i2;
            i2++;
        }
    }

    private b() {
    }

    public static char[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static char[] a(byte[] bArr, int i, int i2) {
        int i3 = ((i2 * 4) + 2) / 3;
        char[] cArr = new char[(((i2 + 2) / 3) * 4)];
        int i4 = i + i2;
        int i5 = 0;
        while (i < i4) {
            int i6;
            int i7;
            int i8 = i + 1;
            int i9 = bArr[i] & HeartRateInfo.HR_EMPTY_VALUE;
            if (i8 < i4) {
                i6 = bArr[i8] & HeartRateInfo.HR_EMPTY_VALUE;
                i8++;
            } else {
                i6 = 0;
            }
            if (i8 < i4) {
                i7 = i8 + 1;
                i8 = bArr[i8] & HeartRateInfo.HR_EMPTY_VALUE;
            } else {
                i7 = i8;
                i8 = 0;
            }
            int i10 = i9 >>> 2;
            i9 = ((i9 & 3) << 4) | (i6 >>> 4);
            i6 = ((i6 & 15) << 2) | (i8 >>> 6);
            int i11 = i8 & 63;
            i8 = i5 + 1;
            cArr[i5] = b[i10];
            i5 = i8 + 1;
            cArr[i8] = b[i9];
            cArr[i5] = i5 < i3 ? b[i6] : '=';
            i6 = i5 + 1;
            cArr[i6] = i6 < i3 ? b[i11] : '=';
            i5 = i6 + 1;
            i = i7;
        }
        return cArr;
    }
}
