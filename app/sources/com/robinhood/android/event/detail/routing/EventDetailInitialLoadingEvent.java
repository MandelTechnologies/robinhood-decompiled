package com.robinhood.android.event.detail.routing;

import kotlin.Metadata;

/* compiled from: EventDetailInitialLoadingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/event/detail/routing/EventDetailInitialLoadingEvent;", "", "routeToGdp", "", "supportCombos", "<init>", "(ZZ)V", "getRouteToGdp", "()Z", "getSupportCombos", "feature-event-detail-routing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventDetailInitialLoadingEvent {
    public static final int $stable = 0;
    private final boolean routeToGdp;
    private final boolean supportCombos;

    public EventDetailInitialLoadingEvent(boolean z, boolean z2) {
        this.routeToGdp = z;
        this.supportCombos = z2;
    }

    public final boolean getRouteToGdp() {
        return this.routeToGdp;
    }

    public final boolean getSupportCombos() {
        return this.supportCombos;
    }
}
