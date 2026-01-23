package com.robinhood.idl.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.datetime.Instant;
import p479j$.time.Duration;

/* compiled from: DatetimeConversions.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001*\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\n\u001a\u00020\t*\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00060\u0007j\u0002`\b*\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/datetime/Instant;", "toKotlinInstant", "(Lj$/time/Instant;)Lkotlinx/datetime/Instant;", "toWireInstant", "(Lkotlinx/datetime/Instant;)Lj$/time/Instant;", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "Lkotlin/time/Duration;", "toKotlinDuration", "(Lj$/time/Duration;)J", "toWireDuration-LRDsOJo", "(J)Lj$/time/Duration;", "toWireDuration", "core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.idl.datetime.DatetimeConversionsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class DatetimeConversions {
    public static final Instant toKotlinInstant(p479j$.time.Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return Instant.INSTANCE.fromEpochSeconds(instant.getEpochSecond(), instant.getNano());
    }

    public static final p479j$.time.Instant toWireInstant(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        p479j$.time.Instant instantOfEpochSecond = p479j$.time.Instant.ofEpochSecond(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    public static final long toKotlinDuration(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.Duration.m28755plusLRDsOJo(Duration3.toDuration(duration.getSeconds(), DurationUnitJvm.SECONDS), Duration3.toDuration(duration.getNano(), DurationUnitJvm.NANOSECONDS));
    }

    /* renamed from: toWireDuration-LRDsOJo, reason: not valid java name */
    public static final p479j$.time.Duration m22529toWireDurationLRDsOJo(long j) {
        long jM28741getInWholeSecondsimpl = kotlin.time.Duration.m28741getInWholeSecondsimpl(j);
        p479j$.time.Duration durationOfSeconds = p479j$.time.Duration.ofSeconds(jM28741getInWholeSecondsimpl, kotlin.time.Duration.m28740getInWholeNanosecondsimpl(kotlin.time.Duration.m28754minusLRDsOJo(j, Duration3.toDuration(jM28741getInWholeSecondsimpl, DurationUnitJvm.SECONDS))));
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return durationOfSeconds;
    }
}
