package com.google.firebase.events;

/* loaded from: classes27.dex */
public class Event<T> {
    private final T payload;

    /* renamed from: type, reason: collision with root package name */
    private final Class<T> f9839type;

    public Class<T> getType() {
        return this.f9839type;
    }

    public T getPayload() {
        return this.payload;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f9839type, this.payload);
    }
}
