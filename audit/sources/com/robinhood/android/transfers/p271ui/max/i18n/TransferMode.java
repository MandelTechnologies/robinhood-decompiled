package com.robinhood.android.transfers.p271ui.max.i18n;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;", "", "<init>", "(Ljava/lang/String;I)V", "EDIT", "REVIEW", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferMode[] $VALUES;
    public static final TransferMode EDIT = new TransferMode("EDIT", 0);
    public static final TransferMode REVIEW = new TransferMode("REVIEW", 1);

    private static final /* synthetic */ TransferMode[] $values() {
        return new TransferMode[]{EDIT, REVIEW};
    }

    public static EnumEntries<TransferMode> getEntries() {
        return $ENTRIES;
    }

    private TransferMode(String str, int i) {
    }

    static {
        TransferMode[] transferModeArr$values = $values();
        $VALUES = transferModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferModeArr$values);
    }

    public static TransferMode valueOf(String str) {
        return (TransferMode) Enum.valueOf(TransferMode.class, str);
    }

    public static TransferMode[] values() {
        return (TransferMode[]) $VALUES.clone();
    }
}
