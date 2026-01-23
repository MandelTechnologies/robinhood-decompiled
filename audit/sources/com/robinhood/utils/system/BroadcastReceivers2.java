package com.robinhood.utils.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BroadcastReceivers.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"broadcasts", "Lio/reactivex/Observable;", "Landroid/content/Intent;", "Landroid/content/Context;", "filter", "Landroid/content/IntentFilter;", "flags", "", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.system.BroadcastReceiversKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BroadcastReceivers2 {
    public static final Observable<Intent> broadcasts(final Context context, final IntentFilter filter, final int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Observable<Intent> observableSubscribeOn = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.utils.system.BroadcastReceiversKt.broadcasts.1
            /* JADX WARN: Type inference failed for: r0v1, types: [android.content.BroadcastReceiver, com.robinhood.utils.system.BroadcastReceiversKt$broadcasts$1$receiver$1] */
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<Intent> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final ?? r0 = new BroadcastReceiver() { // from class: com.robinhood.utils.system.BroadcastReceiversKt$broadcasts$1$receiver$1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        emitter.onNext(intent);
                    }
                };
                ContextCompat.registerReceiver(context, r0, filter, i);
                final Context context2 = context;
                emitter.setDisposable(new MainThreadDisposable() { // from class: com.robinhood.utils.system.BroadcastReceiversKt.broadcasts.1.1
                    @Override // io.reactivex.android.MainThreadDisposable
                    protected void onDispose() {
                        context2.unregisterReceiver(r0);
                    }
                });
            }
        }).subscribeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }
}
