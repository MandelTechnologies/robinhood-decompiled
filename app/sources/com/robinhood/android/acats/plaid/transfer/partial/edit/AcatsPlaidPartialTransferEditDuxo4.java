package com.robinhood.android.acats.plaid.transfer.partial.edit;

import com.robinhood.android.futures.charts.DisplaySpans;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;", "", "<init>", "(Ljava/lang/String;I)V", DisplaySpans.ALL, "AMOUNT", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditSelectedRow, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferEditDuxo4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AcatsPlaidPartialTransferEditDuxo4[] $VALUES;
    public static final AcatsPlaidPartialTransferEditDuxo4 ALL = new AcatsPlaidPartialTransferEditDuxo4(DisplaySpans.ALL, 0);
    public static final AcatsPlaidPartialTransferEditDuxo4 AMOUNT = new AcatsPlaidPartialTransferEditDuxo4("AMOUNT", 1);

    private static final /* synthetic */ AcatsPlaidPartialTransferEditDuxo4[] $values() {
        return new AcatsPlaidPartialTransferEditDuxo4[]{ALL, AMOUNT};
    }

    public static EnumEntries<AcatsPlaidPartialTransferEditDuxo4> getEntries() {
        return $ENTRIES;
    }

    private AcatsPlaidPartialTransferEditDuxo4(String str, int i) {
    }

    static {
        AcatsPlaidPartialTransferEditDuxo4[] acatsPlaidPartialTransferEditDuxo4Arr$values = $values();
        $VALUES = acatsPlaidPartialTransferEditDuxo4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(acatsPlaidPartialTransferEditDuxo4Arr$values);
    }

    public static AcatsPlaidPartialTransferEditDuxo4 valueOf(String str) {
        return (AcatsPlaidPartialTransferEditDuxo4) Enum.valueOf(AcatsPlaidPartialTransferEditDuxo4.class, str);
    }

    public static AcatsPlaidPartialTransferEditDuxo4[] values() {
        return (AcatsPlaidPartialTransferEditDuxo4[]) $VALUES.clone();
    }
}
