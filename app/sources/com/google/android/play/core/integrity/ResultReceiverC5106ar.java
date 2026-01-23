package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.ar */
/* loaded from: classes27.dex */
final class ResultReceiverC5106ar extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ BinderC5107as f718a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultReceiverC5106ar(BinderC5107as binderC5107as, Handler handler) {
        super(handler);
        this.f718a = binderC5107as;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f718a.f719a.trySetResult(3);
        } else if (i == 2) {
            this.f718a.f719a.trySetResult(2);
        } else {
            if (i != 3) {
                return;
            }
            this.f718a.f719a.trySetResult(1);
        }
    }
}
