package com.google.firebase.sessions;

import kotlin.Metadata;

/* compiled from: TimeProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/google/firebase/sessions/WallClock;", "Lcom/google/firebase/sessions/TimeProvider;", "<init>", "()V", "", "currentTimeUs", "()J", "com.google.firebase-firebase-sessions"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: com.google.firebase.sessions.WallClock, reason: use source file name */
/* loaded from: classes.dex */
public final class TimeProvider2 implements TimeProvider {
    public static final TimeProvider2 INSTANCE = new TimeProvider2();

    private TimeProvider2() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
        return System.currentTimeMillis() * 1000;
    }
}
