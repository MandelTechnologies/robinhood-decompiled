package com.robinhood.android.trading.contracts.configuration;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EquityOrderConfiguration.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "", "<init>", "(Ljava/lang/String;I)V", "SIMPLE", "DETAIL", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.EditMode, reason: use source file name */
/* loaded from: classes9.dex */
public final class EquityOrderConfiguration2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquityOrderConfiguration2[] $VALUES;
    public static final EquityOrderConfiguration2 SIMPLE = new EquityOrderConfiguration2("SIMPLE", 0);
    public static final EquityOrderConfiguration2 DETAIL = new EquityOrderConfiguration2("DETAIL", 1);

    private static final /* synthetic */ EquityOrderConfiguration2[] $values() {
        return new EquityOrderConfiguration2[]{SIMPLE, DETAIL};
    }

    public static EnumEntries<EquityOrderConfiguration2> getEntries() {
        return $ENTRIES;
    }

    private EquityOrderConfiguration2(String str, int i) {
    }

    static {
        EquityOrderConfiguration2[] equityOrderConfiguration2Arr$values = $values();
        $VALUES = equityOrderConfiguration2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(equityOrderConfiguration2Arr$values);
    }

    public static EquityOrderConfiguration2 valueOf(String str) {
        return (EquityOrderConfiguration2) Enum.valueOf(EquityOrderConfiguration2.class, str);
    }

    public static EquityOrderConfiguration2[] values() {
        return (EquityOrderConfiguration2[]) $VALUES.clone();
    }
}
