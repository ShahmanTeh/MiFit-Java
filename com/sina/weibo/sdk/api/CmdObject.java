package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.activeandroid.b;
import com.xiaomi.e.a;

public class CmdObject extends BaseMediaObject {
    public static final String CMD_HOME = "home";
    public static final Creator<CmdObject> CREATOR = new Creator<CmdObject>() {
        public CmdObject createFromParcel(Parcel parcel) {
            return new CmdObject(parcel);
        }

        public CmdObject[] newArray(int i) {
            return new CmdObject[i];
        }
    };
    public String cmd;

    public CmdObject(Parcel parcel) {
        this.cmd = parcel.readString();
    }

    public boolean checkArgs() {
        return (this.cmd == null || this.cmd.length() == 0 || this.cmd.length() > b.a) ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public int getObjType() {
        return 7;
    }

    protected BaseMediaObject toExtraMediaObject(String str) {
        return this;
    }

    protected String toExtraMediaString() {
        return a.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cmd);
    }
}
