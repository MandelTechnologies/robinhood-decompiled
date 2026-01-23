package com.mux.stats.sdk.core.events;

/* loaded from: classes27.dex */
public interface IEvent {
    String getType();

    boolean isData();

    boolean isError();

    boolean isPlayback();

    boolean isSessionData();

    boolean isTrackable();

    boolean isViewMetric();
}
