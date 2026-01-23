package com.robinhood.time.android;

import com.robinhood.time.annotation.ElapsedRealtime;
import kotlin.Metadata;
import p479j$.time.Clock;

/* compiled from: AndroidClockModule.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/time/android/AndroidClockModule;", "", "<init>", "()V", "j$/time/Clock", "provideElapsedRealtimeClock", "()Lj$/time/Clock;", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AndroidClockModule {
    public static final AndroidClockModule INSTANCE = new AndroidClockModule();

    private AndroidClockModule() {
    }

    @ElapsedRealtime
    public final Clock provideElapsedRealtimeClock() {
        return ElapsedRealtimeClock.INSTANCE;
    }
}
