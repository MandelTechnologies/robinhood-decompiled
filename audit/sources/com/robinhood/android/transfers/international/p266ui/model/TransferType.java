package com.robinhood.android.transfers.international.p266ui.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "", "<init>", "(Ljava/lang/String;I)V", "FAST", "WIRE", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferType[] $VALUES;
    public static final TransferType FAST = new TransferType("FAST", 0);
    public static final TransferType WIRE = new TransferType("WIRE", 1);

    private static final /* synthetic */ TransferType[] $values() {
        return new TransferType[]{FAST, WIRE};
    }

    public static EnumEntries<TransferType> getEntries() {
        return $ENTRIES;
    }

    private TransferType(String str, int i) {
    }

    static {
        TransferType[] transferTypeArr$values = $values();
        $VALUES = transferTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferTypeArr$values);
    }

    public static TransferType valueOf(String str) {
        return (TransferType) Enum.valueOf(TransferType.class, str);
    }

    public static TransferType[] values() {
        return (TransferType[]) $VALUES.clone();
    }
}
