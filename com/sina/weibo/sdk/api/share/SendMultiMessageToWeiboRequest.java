package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.WeiboAppManager.WeiboInfo;
import com.sina.weibo.sdk.api.WeiboMultiMessage;

public class SendMultiMessageToWeiboRequest extends BaseRequest {
    public WeiboMultiMessage multiMessage;

    public SendMultiMessageToWeiboRequest(Bundle bundle) {
        fromBundle(bundle);
    }

    final boolean check(Context context, WeiboInfo weiboInfo, VersionCheckHandler versionCheckHandler) {
        return (this.multiMessage == null || weiboInfo == null || !weiboInfo.isLegal()) ? false : (versionCheckHandler == null || versionCheckHandler.checkRequest(context, weiboInfo, this.multiMessage)) ? this.multiMessage.checkArgs() : false;
    }

    public void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.multiMessage = new WeiboMultiMessage(bundle);
    }

    public int getType() {
        return 1;
    }

    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putAll(this.multiMessage.toBundle(bundle));
    }
}
