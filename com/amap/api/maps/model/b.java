package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class b implements Creator<Tile> {
    b() {
    }

    public Tile a(Parcel parcel) {
        return new Tile(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
    }

    public Tile[] a(int i) {
        return new Tile[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
