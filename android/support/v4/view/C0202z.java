package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

class C0202z {
    C0202z() {
    }

    public static int a(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static void a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static void a(int i, Rect rect, Rect rect2, int i2) {
        Gravity.applyDisplay(i, rect, rect2, i2);
    }
}
