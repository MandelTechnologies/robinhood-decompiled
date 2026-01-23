package com.google.android.gms.tapandpay;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.tapandpay.zzag;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public abstract class TapAndPay {
    public static final Api zza;
    private static final Api.ClientKey zzb;
    private static final Api.AbstractClientBuilder zzc;

    /* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public interface DataChangedListener {
        void onDataChanged();
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzb = clientKey;
        zzb zzbVar = new zzb();
        zzc = zzbVar;
        zza = new Api("TapAndPay.TAP_AND_PAY_API", zzbVar, clientKey);
    }

    public static TapAndPayClient getClient(Activity activity) {
        return new zzag(activity);
    }

    public static TapAndPayClient getClient(Context context) {
        return new zzag(context);
    }
}
