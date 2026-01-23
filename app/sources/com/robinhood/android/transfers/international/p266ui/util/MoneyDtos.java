package com.robinhood.android.transfers.international.p266ui.util;

import com.robinhood.rosetta.common.MoneyDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoneyDtos.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"format", "", "Lcom/robinhood/rosetta/common/MoneyDto;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.util.MoneyDtosKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MoneyDtos {
    public static final String format(MoneyDto moneyDto) {
        Intrinsics.checkNotNullParameter(moneyDto, "<this>");
        return Currency2.formatWithSymbolPrefix(Currency2.toCurrency(moneyDto.getCurrency()), moneyDto.getAmount().toBigDecimalOrThrow());
    }
}
