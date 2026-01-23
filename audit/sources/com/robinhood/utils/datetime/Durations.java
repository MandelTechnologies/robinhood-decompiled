package com.robinhood.utils.datetime;

import android.annotation.SuppressLint;
import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: Durations.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\fR\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\fR\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\fR\u0014\u0010$\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\n¨\u0006%"}, m3636d2 = {"Lcom/robinhood/utils/datetime/Durations;", "", "<init>", "()V", "j$/time/Instant", GoldFeature.INSTANT, "j$/time/Duration", "since", "(Lj$/time/Instant;)Lj$/time/Duration;", "ONE_SECOND", "Lj$/time/Duration;", "getONE_SECOND", "()Lj$/time/Duration;", "TWO_SECONDS", "getTWO_SECONDS", "THREE_SECONDS", "getTHREE_SECONDS", "FIVE_SECONDS", "getFIVE_SECONDS", "FIFTEEN_SECONDS", "getFIFTEEN_SECONDS", "ONE_MINUTE", "getONE_MINUTE", "FIVE_MINUTES", "TEN_MINUTES", "getTEN_MINUTES", "FIFTEEN_MINUTES", "getFIFTEEN_MINUTES", "THIRTY_MINUTES", "getTHIRTY_MINUTES", "ONE_HOUR", "getONE_HOUR", "ONE_DAY", "getONE_DAY", "THIRTY_DAYS", "getTHIRTY_DAYS", "ONE_WEEK", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Durations {
    private static final Duration FIFTEEN_MINUTES;
    private static final Duration FIFTEEN_SECONDS;

    @JvmField
    public static final Duration FIVE_MINUTES;
    private static final Duration FIVE_SECONDS;
    public static final Durations INSTANCE = new Durations();
    private static final Duration ONE_DAY;
    private static final Duration ONE_HOUR;
    private static final Duration ONE_MINUTE;
    private static final Duration ONE_SECOND;

    @JvmField
    public static final Duration ONE_WEEK;
    private static final Duration TEN_MINUTES;
    private static final Duration THIRTY_DAYS;
    private static final Duration THIRTY_MINUTES;
    private static final Duration THREE_SECONDS;
    private static final Duration TWO_SECONDS;

    private Durations() {
    }

    static {
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        ONE_SECOND = durationOfSeconds;
        Duration durationOfSeconds2 = Duration.ofSeconds(2L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(...)");
        TWO_SECONDS = durationOfSeconds2;
        Duration durationOfSeconds3 = Duration.ofSeconds(3L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds3, "ofSeconds(...)");
        THREE_SECONDS = durationOfSeconds3;
        Duration durationOfSeconds4 = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds4, "ofSeconds(...)");
        FIVE_SECONDS = durationOfSeconds4;
        Duration durationOfSeconds5 = Duration.ofSeconds(15L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds5, "ofSeconds(...)");
        FIFTEEN_SECONDS = durationOfSeconds5;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        ONE_MINUTE = durationOfMinutes;
        Duration durationOfMinutes2 = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes2, "ofMinutes(...)");
        FIVE_MINUTES = durationOfMinutes2;
        Duration durationOfMinutes3 = Duration.ofMinutes(10L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes3, "ofMinutes(...)");
        TEN_MINUTES = durationOfMinutes3;
        Duration durationOfMinutes4 = Duration.ofMinutes(15L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes4, "ofMinutes(...)");
        FIFTEEN_MINUTES = durationOfMinutes4;
        Duration durationOfMinutes5 = Duration.ofMinutes(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes5, "ofMinutes(...)");
        THIRTY_MINUTES = durationOfMinutes5;
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        ONE_HOUR = durationOfHours;
        Duration durationOfDays = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays, "ofDays(...)");
        ONE_DAY = durationOfDays;
        Duration durationOfDays2 = Duration.ofDays(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays2, "ofDays(...)");
        THIRTY_DAYS = durationOfDays2;
        Duration durationOfDays3 = Duration.ofDays(7L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays3, "ofDays(...)");
        ONE_WEEK = durationOfDays3;
    }

    public final Duration getONE_SECOND() {
        return ONE_SECOND;
    }

    public final Duration getTWO_SECONDS() {
        return TWO_SECONDS;
    }

    public final Duration getTHREE_SECONDS() {
        return THREE_SECONDS;
    }

    public final Duration getFIVE_SECONDS() {
        return FIVE_SECONDS;
    }

    public final Duration getFIFTEEN_SECONDS() {
        return FIFTEEN_SECONDS;
    }

    public final Duration getONE_MINUTE() {
        return ONE_MINUTE;
    }

    public final Duration getTEN_MINUTES() {
        return TEN_MINUTES;
    }

    public final Duration getFIFTEEN_MINUTES() {
        return FIFTEEN_MINUTES;
    }

    public final Duration getTHIRTY_MINUTES() {
        return THIRTY_MINUTES;
    }

    public final Duration getONE_HOUR() {
        return ONE_HOUR;
    }

    public final Duration getONE_DAY() {
        return ONE_DAY;
    }

    public final Duration getTHIRTY_DAYS() {
        return THIRTY_DAYS;
    }

    @JvmStatic
    @SuppressLint({"UnsafeTemporalApi"})
    public static final Duration since(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "instant");
        Duration durationBetween = Duration.between(instant, Instant.now());
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return durationBetween;
    }
}
