package com.robinhood.android.equities.equityupsell;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EquityUpsell.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/equities/equityupsell/EquityUpsell;", "", "<init>", "(Ljava/lang/String;I)V", "POST_TRADE_AUTO_SEND", "lib-equity-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityUpsell {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquityUpsell[] $VALUES;
    public static final EquityUpsell POST_TRADE_AUTO_SEND = new EquityUpsell("POST_TRADE_AUTO_SEND", 0);

    private static final /* synthetic */ EquityUpsell[] $values() {
        return new EquityUpsell[]{POST_TRADE_AUTO_SEND};
    }

    public static EnumEntries<EquityUpsell> getEntries() {
        return $ENTRIES;
    }

    private EquityUpsell(String str, int i) {
    }

    static {
        EquityUpsell[] equityUpsellArr$values = $values();
        $VALUES = equityUpsellArr$values;
        $ENTRIES = EnumEntries2.enumEntries(equityUpsellArr$values);
    }

    public static EquityUpsell valueOf(String str) {
        return (EquityUpsell) Enum.valueOf(EquityUpsell.class, str);
    }

    public static EquityUpsell[] values() {
        return (EquityUpsell[]) $VALUES.clone();
    }
}
