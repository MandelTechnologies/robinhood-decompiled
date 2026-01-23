package com.robinhood.android.search.highlights.model;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: PollingInterval.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/model/PollingInterval;", "", "<init>", "()V", "HIGHLIGHTS", "Lkotlin/time/Duration;", "getHIGHLIGHTS-UwyO8pc", "()J", "J", "SUBPAGE", "getSUBPAGE-UwyO8pc", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PollingInterval {
    public static final int $stable = 0;
    private static final long HIGHLIGHTS;
    public static final PollingInterval INSTANCE = new PollingInterval();
    private static final long SUBPAGE;

    private PollingInterval() {
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.MINUTES;
        HIGHLIGHTS = Duration3.toDuration(5, durationUnitJvm);
        SUBPAGE = Duration3.toDuration(5, durationUnitJvm);
    }

    /* renamed from: getHIGHLIGHTS-UwyO8pc, reason: not valid java name */
    public final long m18616getHIGHLIGHTSUwyO8pc() {
        return HIGHLIGHTS;
    }

    /* renamed from: getSUBPAGE-UwyO8pc, reason: not valid java name */
    public final long m18617getSUBPAGEUwyO8pc() {
        return SUBPAGE;
    }
}
