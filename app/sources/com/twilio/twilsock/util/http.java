package com.twilio.twilsock.util;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: http.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003*\n\u0010\u0005\"\u00020\u00062\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"kDefaultRequestTimeout", "Lkotlin/time/Duration;", "getKDefaultRequestTimeout", "()J", "J", "Payload", "", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.twilsock.util.HttpKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class http {
    private static final long kDefaultRequestTimeout;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        kDefaultRequestTimeout = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
    }

    public static final long getKDefaultRequestTimeout() {
        return kDefaultRequestTimeout;
    }
}
