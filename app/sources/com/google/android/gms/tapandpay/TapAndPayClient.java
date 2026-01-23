package com.google.android.gms.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public interface TapAndPayClient {
    Task<List<TokenInfo>> listTokens();

    void pushTokenize(Activity activity, PushTokenizeRequest pushTokenizeRequest, int i);

    Task<Void> registerDataChangedListener(TapAndPay.DataChangedListener dataChangedListener);

    Task<PendingIntent> viewToken(ViewTokenRequest viewTokenRequest);
}
