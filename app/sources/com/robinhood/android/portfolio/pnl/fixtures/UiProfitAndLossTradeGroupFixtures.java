package com.robinhood.android.portfolio.pnl.fixtures;

import com.robinhood.android.portfolio.pnl.p215ui.UiProfitAndLossTradeGroup;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiProfitAndLossTradeGroupFixtures.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/UiProfitAndLossTradeGroupFixtures;", "", "<init>", "()V", "uiProfitAndLossTradeGroup", "Lcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;", "getUiProfitAndLossTradeGroup", "()Lcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class UiProfitAndLossTradeGroupFixtures {
    public static final UiProfitAndLossTradeGroupFixtures INSTANCE = new UiProfitAndLossTradeGroupFixtures();
    private static final UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup;

    private UiProfitAndLossTradeGroupFixtures() {
    }

    static {
        Currency currency = Currencies.USD;
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        Money money = new Money(currency, ONE);
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        uiProfitAndLossTradeGroup = new UiProfitAndLossTradeGroup("id", "displayName", 1, money, IdlDecimal2.toIdlDecimal(ONE), false, CollectionsKt.emptyList());
    }

    public final UiProfitAndLossTradeGroup getUiProfitAndLossTradeGroup() {
        return uiProfitAndLossTradeGroup;
    }
}
