package com.robinhood.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionManagerModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/analytics/SessionManagerModule;", "", "<init>", "()V", "provideSessionManager", "Lcom/robinhood/analytics/SessionManager;", "realSessionManager", "Lcom/robinhood/analytics/RealSessionManager;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SessionManagerModule {
    public static final SessionManagerModule INSTANCE = new SessionManagerModule();

    public final SessionManager provideSessionManager(RealSessionManager realSessionManager) {
        Intrinsics.checkNotNullParameter(realSessionManager, "realSessionManager");
        return realSessionManager;
    }

    private SessionManagerModule() {
    }
}
