package b.a;

import java.io.Serializable;

public class cJ implements Serializable {
    private final boolean a;
    public final byte b;
    private final String c;
    private final boolean d;

    public cJ(byte b) {
        this(b, false);
    }

    public cJ(byte b, String str) {
        this.b = b;
        this.a = true;
        this.c = str;
        this.d = false;
    }

    public cJ(byte b, boolean z) {
        this.b = b;
        this.a = false;
        this.c = null;
        this.d = z;
    }

    public boolean a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.b == C0374dh.j;
    }

    public boolean d() {
        return this.b == C0374dh.m || this.b == C0374dh.k || this.b == C0374dh.l;
    }

    public boolean e() {
        return this.d;
    }
}
