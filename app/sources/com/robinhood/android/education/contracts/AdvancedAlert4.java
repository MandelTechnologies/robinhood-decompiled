package com.robinhood.android.education.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvancedAlert.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;", "", "<init>", "(Ljava/lang/String;I)V", "DEEP_LINK", "ADVANCED_ALERT", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.education.contracts.AlertHubSettingsEntryPoint, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvancedAlert4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvancedAlert4[] $VALUES;
    public static final AdvancedAlert4 DEEP_LINK = new AdvancedAlert4("DEEP_LINK", 0);
    public static final AdvancedAlert4 ADVANCED_ALERT = new AdvancedAlert4("ADVANCED_ALERT", 1);

    private static final /* synthetic */ AdvancedAlert4[] $values() {
        return new AdvancedAlert4[]{DEEP_LINK, ADVANCED_ALERT};
    }

    public static EnumEntries<AdvancedAlert4> getEntries() {
        return $ENTRIES;
    }

    private AdvancedAlert4(String str, int i) {
    }

    static {
        AdvancedAlert4[] advancedAlert4Arr$values = $values();
        $VALUES = advancedAlert4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(advancedAlert4Arr$values);
    }

    public static AdvancedAlert4 valueOf(String str) {
        return (AdvancedAlert4) Enum.valueOf(AdvancedAlert4.class, str);
    }

    public static AdvancedAlert4[] values() {
        return (AdvancedAlert4[]) $VALUES.clone();
    }
}
