package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.idl.IdlDecimal;
import com.robinhood.rosetta.common.MoneyDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"ZERO", "Lcom/robinhood/rosetta/common/MoneyDto;", "Lcom/robinhood/rosetta/common/MoneyDto$Companion;", "getZERO", "(Lcom/robinhood/rosetta/common/MoneyDto$Companion;)Lcom/robinhood/rosetta/common/MoneyDto;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class FuturesOrderFormDuxoKt {
    public static final MoneyDto getZERO(MoneyDto.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new MoneyDto(new IdlDecimal("0"), null, 2, null);
    }
}
