package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class C0224ar {
    C0224ar() {
    }

    public static Object a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public static void a(Object obj, int i, int i2, int i3) {
        ((OverScroller) obj).notifyHorizontalEdgeReached(i, i2, i3);
    }

    public static void a(Object obj, int i, int i2, int i3, int i4) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4);
    }

    public static void a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public static void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((OverScroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public static void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        ((OverScroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    public static boolean a(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    public static int b(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    public static void b(Object obj, int i, int i2, int i3) {
        ((OverScroller) obj).notifyVerticalEdgeReached(i, i2, i3);
    }

    public static int c(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    public static boolean d(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    public static void e(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    public static boolean f(Object obj) {
        return ((OverScroller) obj).isOverScrolled();
    }

    public static int g(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    public static int h(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
