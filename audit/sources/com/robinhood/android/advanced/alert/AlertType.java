package com.robinhood.android.advanced.alert;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlertType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AlertType;", "", "loggingIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingIdentifier", "()Ljava/lang/String;", "PRICE", "INDICATOR", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AlertType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlertType[] $VALUES;
    private final String loggingIdentifier;
    public static final AlertType PRICE = new AlertType("PRICE", 0, "price-alerts");
    public static final AlertType INDICATOR = new AlertType("INDICATOR", 1, "indicator-alerts");

    private static final /* synthetic */ AlertType[] $values() {
        return new AlertType[]{PRICE, INDICATOR};
    }

    public static EnumEntries<AlertType> getEntries() {
        return $ENTRIES;
    }

    private AlertType(String str, int i, String str2) {
        this.loggingIdentifier = str2;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    static {
        AlertType[] alertTypeArr$values = $values();
        $VALUES = alertTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(alertTypeArr$values);
    }

    public static AlertType valueOf(String str) {
        return (AlertType) Enum.valueOf(AlertType.class, str);
    }

    public static AlertType[] values() {
        return (AlertType[]) $VALUES.clone();
    }
}
