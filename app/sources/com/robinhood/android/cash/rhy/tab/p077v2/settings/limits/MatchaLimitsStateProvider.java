package com.robinhood.android.cash.rhy.tab.p077v2.settings.limits;

import com.robinhood.android.cash.rhy.tab.p077v2.settings.limits.MatchaLimitsViewState;
import com.robinhood.android.models.matcha.api.ApiUserLimits;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaLimitsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsDataState;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState;", "<init>", "()V", "reduce", "dataState", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MatchaLimitsStateProvider implements StateProvider<MatchaLimitsDataState, MatchaLimitsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MatchaLimitsViewState reduce(MatchaLimitsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getLimits() == null) {
            return dataState.getThrowable() != null ? new MatchaLimitsViewState.Error(dataState.getThrowable()) : MatchaLimitsViewState.Loading.INSTANCE;
        }
        ApiUserLimits limits = dataState.getLimits();
        String instant_transfer_fee = limits.getInstant_transfer_fee();
        int weekly_transactions_limit = limits.getWeekly_transactions_limit();
        BigDecimal weekly_send_limit = limits.getWeekly_send_limit();
        Currency currency = Currencies.USD;
        return new MatchaLimitsViewState.Loaded(Money.format$default(Money3.toMoney(weekly_send_limit, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null), weekly_transactions_limit, Money.format$default(Money3.toMoney(limits.getMinimum_transaction_amount(), currency), null, false, null, false, 0, null, false, null, false, false, 1023, null), instant_transfer_fee);
    }
}
