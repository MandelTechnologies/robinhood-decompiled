package com.robinhood.utils;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import p479j$.time.Duration;

/* compiled from: RhProcessLifecycleOwner.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/utils/RhProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "observer", "", "register", "(Lcom/robinhood/utils/ProcessLifecycleObserver;)V", "unregisterAll", "()V", "useExtendedTimeout", "onStart", "", "isUsingExtendedTimeout", "()Z", "j$/time/Duration", "getExtendedTimeoutDuration", "()Lj$/time/Duration;", "extendedTimeoutDuration", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface RhProcessLifecycleOwner extends LifecycleOwner, DefaultLifecycleObserver {
    Duration getExtendedTimeoutDuration();

    boolean isUsingExtendedTimeout();

    void onStart();

    void register(RhProcessLifecycleOwner2 observer);

    void unregisterAll();

    void useExtendedTimeout();
}
