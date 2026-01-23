package com.robinhood.android.equities.taxlots.table;

import com.robinhood.android.generic.table.GenericCell;
import kotlin.Metadata;

/* compiled from: TaxLotsTableHelpers.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "Lcom/robinhood/android/generic/table/GenericCell;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsTableCell, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class TaxLotsTableHelpers4 implements GenericCell {
    public static final int $stable = 0;

    @Override // com.robinhood.android.generic.table.GenericCell
    public String getKey() {
        return String.valueOf(hashCode());
    }
}
