package com.robinhood.android.cortex.digest.common;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocalClock.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"LocalClock", "Lcom/robinhood/android/cortex/digest/common/ClockCompositionLocal;", "getLocalClock", "()Lcom/robinhood/android/cortex/digest/common/ClockCompositionLocal;", "clockEntryPoint", "Lcom/robinhood/android/cortex/digest/common/ClockEntryPoint;", "Landroid/content/Context;", "lib-cortex-digest-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.common.LocalClockKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LocalClock3 {
    private static final LocalClock LocalClock = new LocalClock(null, 1, null);

    public static final LocalClock getLocalClock() {
        return LocalClock;
    }

    public static final LocalClock2 clockEntryPoint(Context context) {
        ComponentCallbacks2 componentCallbacks2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        return (LocalClock2) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get();
    }
}
