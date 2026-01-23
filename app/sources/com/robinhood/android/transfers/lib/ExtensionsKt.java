package com.robinhood.android.transfers.lib;

import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.eventlogging.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toMoneyForLogging", "Lcom/robinhood/rosetta/eventlogging/Money;", "Ljava/math/BigDecimal;", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ExtensionsKt {
    public static final Money toMoneyForLogging(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        String string2 = bigDecimal.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Currency currency = Currency.USD;
        return new Money(string2, currency, currency, null, 8, null);
    }
}
