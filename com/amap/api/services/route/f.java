package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class f implements Creator<DrivePath> {
    f() {
    }

    public DrivePath a(Parcel parcel) {
        return new DrivePath(parcel);
    }

    public DrivePath[] a(int i) {
        return null;
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
