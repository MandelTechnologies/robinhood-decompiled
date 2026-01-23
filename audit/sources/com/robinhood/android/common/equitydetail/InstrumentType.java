package com.robinhood.android.common.equitydetail;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstrumentType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/equitydetail/InstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "STOCK", "ETF", "feature-lib-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentType[] $VALUES;
    public static final InstrumentType STOCK = new InstrumentType("STOCK", 0);
    public static final InstrumentType ETF = new InstrumentType("ETF", 1);

    private static final /* synthetic */ InstrumentType[] $values() {
        return new InstrumentType[]{STOCK, ETF};
    }

    public static EnumEntries<InstrumentType> getEntries() {
        return $ENTRIES;
    }

    private InstrumentType(String str, int i) {
    }

    static {
        InstrumentType[] instrumentTypeArr$values = $values();
        $VALUES = instrumentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(instrumentTypeArr$values);
    }

    public static InstrumentType valueOf(String str) {
        return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
    }

    public static InstrumentType[] values() {
        return (InstrumentType[]) $VALUES.clone();
    }
}
