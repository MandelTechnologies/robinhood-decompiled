package com.robinhood.time.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AndroidClockModule_ProvideElapsedRealtimeClockFactory.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/time/android/AndroidClockModule_ProvideElapsedRealtimeClockFactory;", "Ldagger/internal/Factory;", "j$/time/Clock", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Lcom/robinhood/time/android/AndroidClockModule_ProvideElapsedRealtimeClockFactory;", "provideElapsedRealtimeClock", "()Lj$/time/Clock;", "get", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AndroidClockModule_ProvideElapsedRealtimeClockFactory implements Factory<Clock> {
    public static final AndroidClockModule_ProvideElapsedRealtimeClockFactory INSTANCE = new AndroidClockModule_ProvideElapsedRealtimeClockFactory();

    private AndroidClockModule_ProvideElapsedRealtimeClockFactory() {
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return provideElapsedRealtimeClock();
    }

    @JvmStatic
    public static final AndroidClockModule_ProvideElapsedRealtimeClockFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Clock provideElapsedRealtimeClock() {
        Object objCheckNotNull = Preconditions.checkNotNull(AndroidClockModule.INSTANCE.provideElapsedRealtimeClock(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Clock) objCheckNotNull;
    }
}
