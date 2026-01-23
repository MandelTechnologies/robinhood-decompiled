package com.robinhood.android.transfers.p271ui.p272v2.additionaldata;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferAdditionalDataType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/TransferAdditionalDataType;", "", "<init>", "(Ljava/lang/String;I)V", "ELIGIBILITY", "FEES", "VALIDATION_CHECK", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferAdditionalDataType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferAdditionalDataType[] $VALUES;
    public static final TransferAdditionalDataType ELIGIBILITY = new TransferAdditionalDataType("ELIGIBILITY", 0);
    public static final TransferAdditionalDataType FEES = new TransferAdditionalDataType("FEES", 1);
    public static final TransferAdditionalDataType VALIDATION_CHECK = new TransferAdditionalDataType("VALIDATION_CHECK", 2);

    private static final /* synthetic */ TransferAdditionalDataType[] $values() {
        return new TransferAdditionalDataType[]{ELIGIBILITY, FEES, VALIDATION_CHECK};
    }

    public static EnumEntries<TransferAdditionalDataType> getEntries() {
        return $ENTRIES;
    }

    private TransferAdditionalDataType(String str, int i) {
    }

    static {
        TransferAdditionalDataType[] transferAdditionalDataTypeArr$values = $values();
        $VALUES = transferAdditionalDataTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferAdditionalDataTypeArr$values);
    }

    public static TransferAdditionalDataType valueOf(String str) {
        return (TransferAdditionalDataType) Enum.valueOf(TransferAdditionalDataType.class, str);
    }

    public static TransferAdditionalDataType[] values() {
        return (TransferAdditionalDataType[]) $VALUES.clone();
    }
}
