package com.robinhood.hammer.android.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.hammer.core.internal.HammerBaseClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HammerBroadcastReceiver.kt */
@HammerBaseClass
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/hammer/android/broadcastreceiver/HammerBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "injected", "", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "inject", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class HammerBroadcastReceiver extends BroadcastReceiver {
    private volatile boolean injected;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        inject(context);
    }

    private final synchronized void inject(Context context) {
        if (!this.injected) {
            ((HammerBroadcastReceiver2) EntryPoints.applicationEntryPoint(context)).getBroadcastReceiverInjector().inject(this);
            this.injected = true;
        }
    }
}
