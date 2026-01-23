package com.robinhood.android.options.lib.simulatedreturn;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedReturnErrorState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "", "loggingIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingIdentifier", "()Ljava/lang/String;", "POSITION_EXPIRED", "POSITION_CLOSED", "NETWORK_ERROR", "INVALID_IV", "NULL_CHART", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnErrorState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedReturnErrorState[] $VALUES;
    private final String loggingIdentifier;
    public static final OptionsSimulatedReturnErrorState POSITION_EXPIRED = new OptionsSimulatedReturnErrorState("POSITION_EXPIRED", 0, "option_expired");
    public static final OptionsSimulatedReturnErrorState POSITION_CLOSED = new OptionsSimulatedReturnErrorState("POSITION_CLOSED", 1, "position_closed");
    public static final OptionsSimulatedReturnErrorState NETWORK_ERROR = new OptionsSimulatedReturnErrorState("NETWORK_ERROR", 2, AnalyticsStrings.TAB_CRYPTO_UPGRADE_AGREEMENT_NETWORK_ERROR);
    public static final OptionsSimulatedReturnErrorState INVALID_IV = new OptionsSimulatedReturnErrorState("INVALID_IV", 3, "invalid_iv");
    public static final OptionsSimulatedReturnErrorState NULL_CHART = new OptionsSimulatedReturnErrorState("NULL_CHART", 4, "null_chart");

    private static final /* synthetic */ OptionsSimulatedReturnErrorState[] $values() {
        return new OptionsSimulatedReturnErrorState[]{POSITION_EXPIRED, POSITION_CLOSED, NETWORK_ERROR, INVALID_IV, NULL_CHART};
    }

    public static EnumEntries<OptionsSimulatedReturnErrorState> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedReturnErrorState(String str, int i, String str2) {
        this.loggingIdentifier = str2;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    static {
        OptionsSimulatedReturnErrorState[] optionsSimulatedReturnErrorStateArr$values = $values();
        $VALUES = optionsSimulatedReturnErrorStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedReturnErrorStateArr$values);
    }

    public static OptionsSimulatedReturnErrorState valueOf(String str) {
        return (OptionsSimulatedReturnErrorState) Enum.valueOf(OptionsSimulatedReturnErrorState.class, str);
    }

    public static OptionsSimulatedReturnErrorState[] values() {
        return (OptionsSimulatedReturnErrorState[]) $VALUES.clone();
    }
}
