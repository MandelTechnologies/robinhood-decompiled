package com.robinhood.android.deeplink.resolver;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: RealDeeplinkContext.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"DEEPLINK_BLOCKING_TIMEOUT", "Lkotlin/time/Duration;", "J", "lib-deeplink-resolver_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.resolver.RealDeeplinkContextKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RealDeeplinkContext3 {
    private static final long DEEPLINK_BLOCKING_TIMEOUT;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DEEPLINK_BLOCKING_TIMEOUT = Duration3.toDuration(500, DurationUnitJvm.MILLISECONDS);
    }
}
