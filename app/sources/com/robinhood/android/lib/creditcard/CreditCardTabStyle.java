package com.robinhood.android.lib.creditcard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreditCardTabStyle.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DAY", "NIGHT", "feature-lib-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreditCardTabStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreditCardTabStyle[] $VALUES;
    public static final CreditCardTabStyle DAY = new CreditCardTabStyle("DAY", 0);
    public static final CreditCardTabStyle NIGHT = new CreditCardTabStyle("NIGHT", 1);

    private static final /* synthetic */ CreditCardTabStyle[] $values() {
        return new CreditCardTabStyle[]{DAY, NIGHT};
    }

    public static EnumEntries<CreditCardTabStyle> getEntries() {
        return $ENTRIES;
    }

    private CreditCardTabStyle(String str, int i) {
    }

    static {
        CreditCardTabStyle[] creditCardTabStyleArr$values = $values();
        $VALUES = creditCardTabStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(creditCardTabStyleArr$values);
    }

    public static CreditCardTabStyle valueOf(String str) {
        return (CreditCardTabStyle) Enum.valueOf(CreditCardTabStyle.class, str);
    }

    public static CreditCardTabStyle[] values() {
        return (CreditCardTabStyle[]) $VALUES.clone();
    }
}
