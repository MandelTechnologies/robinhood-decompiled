package com.mux.stats.sdk.core.events;

/* loaded from: classes27.dex */
public class DebugEvent extends BaseEvent {

    /* renamed from: a */
    private final String f1007a;

    public DebugEvent(String str) {
        this.f1007a = str;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "DebugEvent";
    }
}
