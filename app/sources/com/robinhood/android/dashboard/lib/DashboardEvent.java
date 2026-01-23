package com.robinhood.android.dashboard.lib;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DashboardEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardEvent;", "", "<init>", "()V", "ShowFxSwitcherFtux", "Lcom/robinhood/android/dashboard/lib/DashboardEvent$ShowFxSwitcherFtux;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class DashboardEvent {
    public static final int $stable = 0;

    public /* synthetic */ DashboardEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DashboardEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardEvent$ShowFxSwitcherFtux;", "Lcom/robinhood/android/dashboard/lib/DashboardEvent;", "<init>", "()V", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowFxSwitcherFtux extends DashboardEvent {
        public static final int $stable = 0;
        public static final ShowFxSwitcherFtux INSTANCE = new ShowFxSwitcherFtux();

        private ShowFxSwitcherFtux() {
            super(null);
        }
    }

    private DashboardEvent() {
    }
}
