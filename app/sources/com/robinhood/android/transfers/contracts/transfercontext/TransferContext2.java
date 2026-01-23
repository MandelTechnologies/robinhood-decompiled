package com.robinhood.android.transfers.contracts.transfercontext;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferContext.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0003*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"TransferEntryPoint", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "roundedUp", "Ljava/math/BigDecimal;", "contracts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.contracts.transfercontext.TransferContextKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferContext2 {
    public static final BigDecimal roundedUp(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }
}
