package cn.com.smartdevices.bracelet.weight.a;

import cn.com.smartdevices.bracelet.i.a.e;
import cn.com.smartdevices.bracelet.weight.WeightInfo;
import cn.com.smartdevices.bracelet.weight.ah;
import java.util.List;

class k extends e<List<WeightInfo>> {
    private k() {
    }

    public void a(List<WeightInfo> list) {
        for (WeightInfo weightInfo : list) {
            weightInfo.synced = 1;
        }
        success(ah.a().a((List) list));
    }
}
