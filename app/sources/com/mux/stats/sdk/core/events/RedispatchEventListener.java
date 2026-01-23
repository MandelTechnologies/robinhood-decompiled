package com.mux.stats.sdk.core.events;

/* loaded from: classes27.dex */
public class RedispatchEventListener extends BaseEventListener {

    /* renamed from: a */
    private final IEventDispatcher f1014a;

    public RedispatchEventListener(IEventDispatcher iEventDispatcher) {
        this.f1014a = iEventDispatcher;
    }

    @Override // com.mux.stats.sdk.core.events.IEventListener
    public void handle(IEvent iEvent) {
        if (iEvent.isPlayback()) {
            return;
        }
        this.f1014a.dispatch(iEvent);
    }
}
