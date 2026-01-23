package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuoteTouchPoint.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/QuoteTouchPoint;", "", "<init>", "(Ljava/lang/String;I)V", "TRADE", "OTHER", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class QuoteTouchPoint {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuoteTouchPoint[] $VALUES;
    public static final QuoteTouchPoint TRADE = new QuoteTouchPoint("TRADE", 0);
    public static final QuoteTouchPoint OTHER = new QuoteTouchPoint("OTHER", 1);

    private static final /* synthetic */ QuoteTouchPoint[] $values() {
        return new QuoteTouchPoint[]{TRADE, OTHER};
    }

    public static EnumEntries<QuoteTouchPoint> getEntries() {
        return $ENTRIES;
    }

    private QuoteTouchPoint(String str, int i) {
    }

    static {
        QuoteTouchPoint[] quoteTouchPointArr$values = $values();
        $VALUES = quoteTouchPointArr$values;
        $ENTRIES = EnumEntries2.enumEntries(quoteTouchPointArr$values);
    }

    public static QuoteTouchPoint valueOf(String str) {
        return (QuoteTouchPoint) Enum.valueOf(QuoteTouchPoint.class, str);
    }

    public static QuoteTouchPoint[] values() {
        return (QuoteTouchPoint[]) $VALUES.clone();
    }
}
