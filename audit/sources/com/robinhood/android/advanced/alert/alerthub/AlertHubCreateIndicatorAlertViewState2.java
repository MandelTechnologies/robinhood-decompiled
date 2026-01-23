package com.robinhood.android.advanced.alert.alerthub;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlertHubCreateIndicatorAlertViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CROSSES_ABOVE", "CROSSES_BELOW", "MOVE_ABOVE_VALUE", "MOVE_BELOW_VALUE", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.alerthub.IndicatorMovingType, reason: use source file name */
/* loaded from: classes24.dex */
public final class AlertHubCreateIndicatorAlertViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlertHubCreateIndicatorAlertViewState2[] $VALUES;
    public static final AlertHubCreateIndicatorAlertViewState2 CROSSES_ABOVE = new AlertHubCreateIndicatorAlertViewState2("CROSSES_ABOVE", 0, "crosses_above");
    public static final AlertHubCreateIndicatorAlertViewState2 CROSSES_BELOW = new AlertHubCreateIndicatorAlertViewState2("CROSSES_BELOW", 1, "crosses_below");
    public static final AlertHubCreateIndicatorAlertViewState2 MOVE_ABOVE_VALUE = new AlertHubCreateIndicatorAlertViewState2("MOVE_ABOVE_VALUE", 2, "moves_above");
    public static final AlertHubCreateIndicatorAlertViewState2 MOVE_BELOW_VALUE = new AlertHubCreateIndicatorAlertViewState2("MOVE_BELOW_VALUE", 3, "moves_below");
    private final String serverValue;

    private static final /* synthetic */ AlertHubCreateIndicatorAlertViewState2[] $values() {
        return new AlertHubCreateIndicatorAlertViewState2[]{CROSSES_ABOVE, CROSSES_BELOW, MOVE_ABOVE_VALUE, MOVE_BELOW_VALUE};
    }

    public static EnumEntries<AlertHubCreateIndicatorAlertViewState2> getEntries() {
        return $ENTRIES;
    }

    private AlertHubCreateIndicatorAlertViewState2(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        AlertHubCreateIndicatorAlertViewState2[] alertHubCreateIndicatorAlertViewState2Arr$values = $values();
        $VALUES = alertHubCreateIndicatorAlertViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(alertHubCreateIndicatorAlertViewState2Arr$values);
    }

    public static AlertHubCreateIndicatorAlertViewState2 valueOf(String str) {
        return (AlertHubCreateIndicatorAlertViewState2) Enum.valueOf(AlertHubCreateIndicatorAlertViewState2.class, str);
    }

    public static AlertHubCreateIndicatorAlertViewState2[] values() {
        return (AlertHubCreateIndicatorAlertViewState2[]) $VALUES.clone();
    }
}
