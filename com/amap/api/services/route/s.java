package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class s implements Creator<SearchCity> {
    s() {
    }

    public SearchCity a(Parcel parcel) {
        return new SearchCity(parcel);
    }

    public SearchCity[] a(int i) {
        return null;
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
