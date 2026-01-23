package com.mux.stats.sdk.core.events;

/* loaded from: classes27.dex */
public class InternalErrorEvent extends BaseEvent {

    /* renamed from: a */
    private final String f1011a;

    /* renamed from: b */
    private final int f1012b;

    /* renamed from: c */
    private final String f1013c;

    public InternalErrorEvent(int i, String str) {
        this(i, str, null);
    }

    public InternalErrorEvent(int i, String str, String str2) {
        this.f1012b = i;
        this.f1011a = str;
        this.f1013c = str2;
    }

    public int getErrorCode() {
        return this.f1012b;
    }

    public String getErrorContext() {
        return this.f1013c;
    }

    public String getErrorMessage() {
        return this.f1011a;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "internalerror";
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public boolean isError() {
        return true;
    }
}
