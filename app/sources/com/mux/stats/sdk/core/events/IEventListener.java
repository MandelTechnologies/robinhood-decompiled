package com.mux.stats.sdk.core.events;

/* loaded from: classes27.dex */
public interface IEventListener {
    int getId();

    void handle(IEvent iEvent);

    void setId(int i);
}
