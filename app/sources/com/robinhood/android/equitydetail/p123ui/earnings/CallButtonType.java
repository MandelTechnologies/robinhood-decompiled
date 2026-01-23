package com.robinhood.android.equitydetail.p123ui.earnings;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equitydetail.C15314R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallButtonType.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/CallButtonType;", "", "stringRes", "", "analyticsString", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getStringRes", "()I", "getAnalyticsString", "()Ljava/lang/String;", "PREVIEW", "JOIN", "REPLAY", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CallButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CallButtonType[] $VALUES;
    private final String analyticsString;
    private final int stringRes;
    public static final CallButtonType PREVIEW = new CallButtonType("PREVIEW", 0, C15314R.string.instrument_detail_earnings_preview, AnalyticsStrings.BUTTON_EARNINGS_PREVIEW);
    public static final CallButtonType JOIN = new CallButtonType("JOIN", 1, C15314R.string.instrument_detail_earnings_listen, AnalyticsStrings.BUTTON_EARNINGS_JOIN_LIVE);
    public static final CallButtonType REPLAY = new CallButtonType("REPLAY", 2, C15314R.string.instrument_detail_earnings_replay, AnalyticsStrings.BUTTON_EARNINGS_REPLAY);

    private static final /* synthetic */ CallButtonType[] $values() {
        return new CallButtonType[]{PREVIEW, JOIN, REPLAY};
    }

    public static EnumEntries<CallButtonType> getEntries() {
        return $ENTRIES;
    }

    private CallButtonType(String str, int i, int i2, String str2) {
        this.stringRes = i2;
        this.analyticsString = str2;
    }

    public final int getStringRes() {
        return this.stringRes;
    }

    public final String getAnalyticsString() {
        return this.analyticsString;
    }

    static {
        CallButtonType[] callButtonTypeArr$values = $values();
        $VALUES = callButtonTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(callButtonTypeArr$values);
    }

    public static CallButtonType valueOf(String str) {
        return (CallButtonType) Enum.valueOf(CallButtonType.class, str);
    }

    public static CallButtonType[] values() {
        return (CallButtonType[]) $VALUES.clone();
    }
}
