package com.huami.android.bitmapfun;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class p extends FilterOutputStream {
    final /* synthetic */ o a;

    private p(o oVar, OutputStream outputStream) {
        this.a = oVar;
        super(outputStream);
    }

    public void close() {
        try {
            this.out.close();
        } catch (IOException e) {
            this.a.c = true;
        }
    }

    public void flush() {
        try {
            this.out.flush();
        } catch (IOException e) {
            this.a.c = true;
        }
    }

    public void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException e) {
            this.a.c = true;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException e) {
            this.a.c = true;
        }
    }
}
