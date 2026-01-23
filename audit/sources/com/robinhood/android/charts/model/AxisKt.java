package com.robinhood.android.charts.model;

import com.robinhood.models.util.Money;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Axis.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toMoney", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AxisKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Money toMoney(com.robinhood.models.serverdriven.experimental.api.Money money) {
        Currency currency = Currency.getInstance(money.getCurrency_code());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return new Money(currency, money.getAmount());
    }
}
