package com.robinhood.android.eventcontracts.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventContractsNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EcUuidType;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_ID", "CONTRACT_ID", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EcUuidType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EcUuidType[] $VALUES;
    public static final EcUuidType EVENT_ID = new EcUuidType("EVENT_ID", 0);
    public static final EcUuidType CONTRACT_ID = new EcUuidType("CONTRACT_ID", 1);

    private static final /* synthetic */ EcUuidType[] $values() {
        return new EcUuidType[]{EVENT_ID, CONTRACT_ID};
    }

    public static EnumEntries<EcUuidType> getEntries() {
        return $ENTRIES;
    }

    private EcUuidType(String str, int i) {
    }

    static {
        EcUuidType[] ecUuidTypeArr$values = $values();
        $VALUES = ecUuidTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(ecUuidTypeArr$values);
    }

    public static EcUuidType valueOf(String str) {
        return (EcUuidType) Enum.valueOf(EcUuidType.class, str);
    }

    public static EcUuidType[] values() {
        return (EcUuidType[]) $VALUES.clone();
    }
}
