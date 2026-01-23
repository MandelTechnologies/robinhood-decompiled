package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tapandpay.TapAndPay;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
final class zzc implements ListenerHolder.Notifier {
    zzc() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((TapAndPay.DataChangedListener) obj).onDataChanged();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
