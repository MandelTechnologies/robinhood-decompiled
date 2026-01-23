package com.robinhood.android.instant.p160ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstantCashLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/instant/ui/InstantCashLoggingScreenIdentifier;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INVESTING_SETTINGS_ACCOUNT_TYPE_SECTION", "INVESTING_SETTINGS_MARGIN_INVESTING_SECTION", "feature-lib-instant_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.instant.ui.InstantCashLoggingScreenIdentifier, reason: use source file name */
/* loaded from: classes10.dex */
public final class InstantCashLogger3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstantCashLogger3[] $VALUES;
    public static final InstantCashLogger3 INVESTING_SETTINGS_ACCOUNT_TYPE_SECTION = new InstantCashLogger3("INVESTING_SETTINGS_ACCOUNT_TYPE_SECTION", 0, "investing_settings-account_type_section");
    public static final InstantCashLogger3 INVESTING_SETTINGS_MARGIN_INVESTING_SECTION = new InstantCashLogger3("INVESTING_SETTINGS_MARGIN_INVESTING_SECTION", 1, "investing_settings-margin_investing_section");
    private final String value;

    private static final /* synthetic */ InstantCashLogger3[] $values() {
        return new InstantCashLogger3[]{INVESTING_SETTINGS_ACCOUNT_TYPE_SECTION, INVESTING_SETTINGS_MARGIN_INVESTING_SECTION};
    }

    public static EnumEntries<InstantCashLogger3> getEntries() {
        return $ENTRIES;
    }

    private InstantCashLogger3(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        InstantCashLogger3[] instantCashLogger3Arr$values = $values();
        $VALUES = instantCashLogger3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(instantCashLogger3Arr$values);
    }

    public static InstantCashLogger3 valueOf(String str) {
        return (InstantCashLogger3) Enum.valueOf(InstantCashLogger3.class, str);
    }

    public static InstantCashLogger3[] values() {
        return (InstantCashLogger3[]) $VALUES.clone();
    }
}
