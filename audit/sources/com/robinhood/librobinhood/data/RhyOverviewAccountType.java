package com.robinhood.librobinhood.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhyOverviewAccountType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;", "", "<init>", "(Ljava/lang/String;I)V", "RHY", "RHY_NO_DEBIT_CARD", "CASH_MANAGEMENT", "NONE", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyOverviewAccountType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhyOverviewAccountType[] $VALUES;
    public static final RhyOverviewAccountType RHY = new RhyOverviewAccountType("RHY", 0);
    public static final RhyOverviewAccountType RHY_NO_DEBIT_CARD = new RhyOverviewAccountType("RHY_NO_DEBIT_CARD", 1);
    public static final RhyOverviewAccountType CASH_MANAGEMENT = new RhyOverviewAccountType("CASH_MANAGEMENT", 2);
    public static final RhyOverviewAccountType NONE = new RhyOverviewAccountType("NONE", 3);

    private static final /* synthetic */ RhyOverviewAccountType[] $values() {
        return new RhyOverviewAccountType[]{RHY, RHY_NO_DEBIT_CARD, CASH_MANAGEMENT, NONE};
    }

    public static EnumEntries<RhyOverviewAccountType> getEntries() {
        return $ENTRIES;
    }

    private RhyOverviewAccountType(String str, int i) {
    }

    static {
        RhyOverviewAccountType[] rhyOverviewAccountTypeArr$values = $values();
        $VALUES = rhyOverviewAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhyOverviewAccountTypeArr$values);
    }

    public static RhyOverviewAccountType valueOf(String str) {
        return (RhyOverviewAccountType) Enum.valueOf(RhyOverviewAccountType.class, str);
    }

    public static RhyOverviewAccountType[] values() {
        return (RhyOverviewAccountType[]) $VALUES.clone();
    }
}
