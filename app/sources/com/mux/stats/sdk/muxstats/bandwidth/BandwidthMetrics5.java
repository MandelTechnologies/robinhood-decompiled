package com.mux.stats.sdk.muxstats.bandwidth;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BandwidthMetrics.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/bandwidth/TrackedHeader;", "", "()V", "matches", "", "headerName", "", "ExactlyIgnoreCase", "Matching", "Lcom/mux/stats/sdk/muxstats/bandwidth/TrackedHeader$ExactlyIgnoreCase;", "Lcom/mux/stats/sdk/muxstats/bandwidth/TrackedHeader$Matching;", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.stats.sdk.muxstats.bandwidth.TrackedHeader, reason: use source file name */
/* loaded from: classes27.dex */
public abstract class BandwidthMetrics5 {
    public /* synthetic */ BandwidthMetrics5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean matches(String headerName);

    private BandwidthMetrics5() {
    }

    /* compiled from: BandwidthMetrics.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/bandwidth/TrackedHeader$ExactlyIgnoreCase;", "Lcom/mux/stats/sdk/muxstats/bandwidth/TrackedHeader;", "name", "", "(Ljava/lang/String;)V", "matches", "", "headerName", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.bandwidth.TrackedHeader$ExactlyIgnoreCase */
    public static final class ExactlyIgnoreCase extends BandwidthMetrics5 {
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExactlyIgnoreCase(String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        @Override // com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetrics5
        public boolean matches(String headerName) {
            return StringsKt.contentEquals(headerName, this.name, true);
        }
    }

    /* compiled from: BandwidthMetrics.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/bandwidth/TrackedHeader$Matching;", "Lcom/mux/stats/sdk/muxstats/bandwidth/TrackedHeader;", "pattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "matches", "", "headerName", "", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.bandwidth.TrackedHeader$Matching */
    public static final class Matching extends BandwidthMetrics5 {
        private final Pattern pattern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Matching(Pattern pattern) {
            super(null);
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.pattern = pattern;
        }

        @Override // com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetrics5
        public boolean matches(String headerName) {
            if (headerName != null) {
                return this.pattern.matcher(headerName).find();
            }
            return false;
        }
    }
}
