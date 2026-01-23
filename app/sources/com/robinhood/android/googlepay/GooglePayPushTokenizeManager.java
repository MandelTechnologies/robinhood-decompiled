package com.robinhood.android.googlepay;

import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayPushTokenizeManager.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/googlepay/GooglePayPushTokenizeManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "tapAndPayClient", "Lcom/google/android/gms/tapandpay/TapAndPayClient;", "onDestroy", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "pushTokenize", "activity", "Landroid/app/Activity;", "pushTokenizeRequest", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "requestCode", "", "onDataChanged", "Lio/reactivex/Completable;", "lib-google-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GooglePayPushTokenizeManager implements DefaultLifecycleObserver {
    private TapAndPayClient tapAndPayClient;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.tapAndPayClient = null;
    }

    public final void pushTokenize(Activity activity, PushTokenizeRequest pushTokenizeRequest, int requestCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pushTokenizeRequest, "pushTokenizeRequest");
        if (this.tapAndPayClient == null) {
            this.tapAndPayClient = TapAndPay.getClient(activity);
        }
        TapAndPayClient tapAndPayClient = this.tapAndPayClient;
        Intrinsics.checkNotNull(tapAndPayClient);
        tapAndPayClient.pushTokenize(activity, pushTokenizeRequest, requestCode);
    }

    public final Completable onDataChanged(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.tapAndPayClient == null) {
            this.tapAndPayClient = TapAndPay.getClient(activity);
        }
        Completable completableCreate = Completable.create(new CompletableOnSubscribe() { // from class: com.robinhood.android.googlepay.GooglePayPushTokenizeManager.onDataChanged.1
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(final CompletableEmitter emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                TapAndPayClient tapAndPayClient = GooglePayPushTokenizeManager.this.tapAndPayClient;
                Intrinsics.checkNotNull(tapAndPayClient);
                tapAndPayClient.registerDataChangedListener(new TapAndPay.DataChangedListener() { // from class: com.robinhood.android.googlepay.GooglePayPushTokenizeManager.onDataChanged.1.1
                    @Override // com.google.android.gms.tapandpay.TapAndPay.DataChangedListener
                    public final void onDataChanged() {
                        if (emitter.getDisposed()) {
                            return;
                        }
                        emitter.onComplete();
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableCreate, "create(...)");
        return completableCreate;
    }
}
