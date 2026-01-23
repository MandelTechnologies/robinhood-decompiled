package com.robinhood.android.transfers.p271ui.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferAmountEntryLayout.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/common/AmountEntryState;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "REVIEW", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.common.AmountEntryState, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferAmountEntryLayout {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferAmountEntryLayout[] $VALUES;
    public static final TransferAmountEntryLayout INPUT = new TransferAmountEntryLayout("INPUT", 0);
    public static final TransferAmountEntryLayout REVIEW = new TransferAmountEntryLayout("REVIEW", 1);

    private static final /* synthetic */ TransferAmountEntryLayout[] $values() {
        return new TransferAmountEntryLayout[]{INPUT, REVIEW};
    }

    public static EnumEntries<TransferAmountEntryLayout> getEntries() {
        return $ENTRIES;
    }

    private TransferAmountEntryLayout(String str, int i) {
    }

    static {
        TransferAmountEntryLayout[] transferAmountEntryLayoutArr$values = $values();
        $VALUES = transferAmountEntryLayoutArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferAmountEntryLayoutArr$values);
    }

    public static TransferAmountEntryLayout valueOf(String str) {
        return (TransferAmountEntryLayout) Enum.valueOf(TransferAmountEntryLayout.class, str);
    }

    public static TransferAmountEntryLayout[] values() {
        return (TransferAmountEntryLayout[]) $VALUES.clone();
    }
}
