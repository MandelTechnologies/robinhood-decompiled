package com.robinhood.android.transfers.p271ui.max.createtransfer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ValueTextState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/TransferScreen;", "", "<init>", "(Ljava/lang/String;I)V", "CREATE_TRANSFER_SCREEN", "SELECT_ACCOUNT_SCREEN", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.createtransfer.TransferScreen, reason: use source file name */
/* loaded from: classes9.dex */
public final class ValueTextState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ValueTextState2[] $VALUES;
    public static final ValueTextState2 CREATE_TRANSFER_SCREEN = new ValueTextState2("CREATE_TRANSFER_SCREEN", 0);
    public static final ValueTextState2 SELECT_ACCOUNT_SCREEN = new ValueTextState2("SELECT_ACCOUNT_SCREEN", 1);

    private static final /* synthetic */ ValueTextState2[] $values() {
        return new ValueTextState2[]{CREATE_TRANSFER_SCREEN, SELECT_ACCOUNT_SCREEN};
    }

    public static EnumEntries<ValueTextState2> getEntries() {
        return $ENTRIES;
    }

    private ValueTextState2(String str, int i) {
    }

    static {
        ValueTextState2[] valueTextState2Arr$values = $values();
        $VALUES = valueTextState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(valueTextState2Arr$values);
    }

    public static ValueTextState2 valueOf(String str) {
        return (ValueTextState2) Enum.valueOf(ValueTextState2.class, str);
    }

    public static ValueTextState2[] values() {
        return (ValueTextState2[]) $VALUES.clone();
    }
}
