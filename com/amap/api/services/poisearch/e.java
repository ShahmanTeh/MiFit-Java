package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e implements Creator<Hotel> {
    e() {
    }

    public Hotel a(Parcel parcel) {
        return new Hotel(parcel);
    }

    public Hotel[] a(int i) {
        return null;
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
