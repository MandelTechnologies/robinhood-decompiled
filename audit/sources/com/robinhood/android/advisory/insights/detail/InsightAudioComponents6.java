package com.robinhood.android.advisory.insights.detail;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InsightAudioComponents.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/InsightAudioPlayStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "PLAYING", "PAUSED", "STOPPED", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.insights.detail.InsightAudioPlayStatus, reason: use source file name */
/* loaded from: classes7.dex */
public final class InsightAudioComponents6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InsightAudioComponents6[] $VALUES;
    public static final InsightAudioComponents6 INITIAL = new InsightAudioComponents6("INITIAL", 0);
    public static final InsightAudioComponents6 PLAYING = new InsightAudioComponents6("PLAYING", 1);
    public static final InsightAudioComponents6 PAUSED = new InsightAudioComponents6("PAUSED", 2);
    public static final InsightAudioComponents6 STOPPED = new InsightAudioComponents6("STOPPED", 3);

    private static final /* synthetic */ InsightAudioComponents6[] $values() {
        return new InsightAudioComponents6[]{INITIAL, PLAYING, PAUSED, STOPPED};
    }

    public static EnumEntries<InsightAudioComponents6> getEntries() {
        return $ENTRIES;
    }

    private InsightAudioComponents6(String str, int i) {
    }

    static {
        InsightAudioComponents6[] insightAudioComponents6Arr$values = $values();
        $VALUES = insightAudioComponents6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(insightAudioComponents6Arr$values);
    }

    public static InsightAudioComponents6 valueOf(String str) {
        return (InsightAudioComponents6) Enum.valueOf(InsightAudioComponents6.class, str);
    }

    public static InsightAudioComponents6[] values() {
        return (InsightAudioComponents6[]) $VALUES.clone();
    }
}
