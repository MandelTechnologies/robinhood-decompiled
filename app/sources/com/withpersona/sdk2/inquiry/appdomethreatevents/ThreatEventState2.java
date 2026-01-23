package com.withpersona.sdk2.inquiry.appdomethreatevents;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ThreatEventState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\"\u001d\u0010\u0000\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, m3636d2 = {"threatEventReceiver", "Landroid/content/BroadcastReceiver;", "getThreatEventReceiver", "()Landroid/content/BroadcastReceiver;", "threatEventReceiver$delegate", "Lkotlin/Lazy;", "getThreatEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/withpersona/sdk2/inquiry/appdomethreatevents/ThreatEventState;", "registerThreatEventReceiver", "", "context", "Landroid/content/Context;", "unregisterThreatEventReceiver", "appdome-threatevents_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventStateKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ThreatEventState2 {
    private static final Lazy threatEventReceiver$delegate = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventStateKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThreatEventState2.threatEventReceiver_delegate$lambda$0();
        }
    });

    private static final BroadcastReceiver getThreatEventReceiver() {
        return (BroadcastReceiver) threatEventReceiver$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BroadcastReceiver threatEventReceiver_delegate$lambda$0() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventReceiver").getConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type android.content.BroadcastReceiver");
            return (BroadcastReceiver) objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Flow<ThreatEventState> getThreatEventFlow() {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventFlow").getConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState>");
            return (StateFlow) objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void registerThreatEventReceiver(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver threatEventReceiver = getThreatEventReceiver();
        if (getThreatEventReceiver() == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator<T> it = ThreatEventState.INSTANCE.getKnownThreatEventNames().iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(threatEventReceiver, intentFilter, null, null, 4);
        } else {
            applicationContext.registerReceiver(threatEventReceiver, intentFilter);
        }
    }

    public static final void unregisterThreatEventReceiver(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver threatEventReceiver = getThreatEventReceiver();
        if (getThreatEventReceiver() == null) {
            return;
        }
        try {
            applicationContext.unregisterReceiver(threatEventReceiver);
        } catch (Exception unused) {
        }
    }
}
