package com.robinhood.android.transfers.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferAccountDirection.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE", "SINK", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferAccountDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferAccountDirection[] $VALUES;
    public static final TransferAccountDirection SOURCE = new TransferAccountDirection("SOURCE", 0);
    public static final TransferAccountDirection SINK = new TransferAccountDirection("SINK", 1);

    private static final /* synthetic */ TransferAccountDirection[] $values() {
        return new TransferAccountDirection[]{SOURCE, SINK};
    }

    public static EnumEntries<TransferAccountDirection> getEntries() {
        return $ENTRIES;
    }

    private TransferAccountDirection(String str, int i) {
    }

    static {
        TransferAccountDirection[] transferAccountDirectionArr$values = $values();
        $VALUES = transferAccountDirectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferAccountDirectionArr$values);
    }

    public static TransferAccountDirection valueOf(String str) {
        return (TransferAccountDirection) Enum.valueOf(TransferAccountDirection.class, str);
    }

    public static TransferAccountDirection[] values() {
        return (TransferAccountDirection[]) $VALUES.clone();
    }
}
