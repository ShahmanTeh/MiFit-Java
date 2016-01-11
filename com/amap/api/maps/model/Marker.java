package com.amap.api.maps.model;

import android.os.RemoteException;
import com.amap.api.mapcore.y;
import java.util.ArrayList;

public final class Marker {
    private y a;

    public Marker(y yVar) {
        this.a = yVar;
    }

    public void destroy() {
        try {
            if (this.a != null) {
                this.a.p();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean equals(Object obj) {
        try {
            return !(obj instanceof Marker) ? false : this.a.a(((Marker) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public ArrayList<BitmapDescriptor> getIcons() {
        try {
            return this.a.w();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getId() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public Object getObject() {
        return this.a.s();
    }

    public int getPeriod() {
        try {
            return this.a.v();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public LatLng getPosition() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getRotateAngle() {
        return this.a.u();
    }

    public String getSnippet() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getTitle() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        return this.a.q();
    }

    public void hideInfoWindow() {
        try {
            this.a.m();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isDraggable() {
        return this.a.k();
    }

    public boolean isFlat() {
        return this.a.A();
    }

    public boolean isInfoWindowShown() {
        try {
            return this.a.n();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isPerspective() {
        try {
            return this.a.t();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isVisible() {
        try {
            return this.a.o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.a.b();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setAnchor(float f, float f2) {
        try {
            this.a.a(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setDraggable(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setFlat(boolean z) {
        try {
            this.a.d(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            try {
                this.a.a(bitmapDescriptor);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        try {
            this.a.a((ArrayList) arrayList);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setObject(Object obj) {
        this.a.a(obj);
    }

    public void setPeriod(int i) {
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPerspective(boolean z) {
        try {
            this.a.c(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(LatLng latLng) {
        try {
            this.a.a(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPositionByPixels(int i, int i2) {
        this.a.a(i, i2);
    }

    public void setRotateAngle(float f) {
        try {
            this.a.a(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setSnippet(String str) {
        try {
            this.a.b(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setTitle(String str) {
        try {
            this.a.a(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setToTop() {
        try {
            this.a.z();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean z) {
        try {
            this.a.b(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void showInfoWindow() {
        try {
            this.a.l();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
