package com.robinhood.android.futures.history.p142ui.settlement;

import com.robinhood.android.futures.history.p142ui.settlement.FuturesCashSettlementDetailDuxo4;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.p189db.FuturesCashSettlement;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateTimeFormatter;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesCashSettlementDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailDataState;", "Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailViewState;", "<init>", "()V", "zeroMoney", "Lcom/robinhood/models/util/Money;", "getZeroMoney", "()Lcom/robinhood/models/util/Money;", "reduce", "dataState", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.settlement.RhdCashSettlementStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesCashSettlementDetailDuxo5 implements StateProvider<RhdCashSettlementDetailDataState, FuturesCashSettlementDetailDuxo4> {
    public static final int $stable;
    public static final FuturesCashSettlementDetailDuxo5 INSTANCE = new FuturesCashSettlementDetailDuxo5();
    private static final Money zeroMoney;

    private FuturesCashSettlementDetailDuxo5() {
    }

    static {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        zeroMoney = Money3.toMoney(ZERO, Currencies.USD);
        $stable = 8;
    }

    public final Money getZeroMoney() {
        return zeroMoney;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesCashSettlementDetailDuxo4 reduce(RhdCashSettlementDetailDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getExecution() == null) {
            return FuturesCashSettlementDetailDuxo4.Loading.INSTANCE;
        }
        FuturesCashSettlement execution = dataState.getExecution();
        return new FuturesCashSettlementDetailDuxo4.Loaded(dataState.getPageTitle(), dataState.getPageSubtitle(), dataState.getToolbarCta(), LocalDateTimeFormatter.LONG.format(Instants.toLocalDateTime$default(execution.getEventTime(), null, 1, null)), dataState.getSettlementPrice(), Formats.getIntegerFormat().format(execution.getQuantity()), dataState.getRealizedPnlLabel(), dataState.getRealizedPnlValue(), dataState.getFees(), dataState.getCommissions(), dataState.getGoldSavings(), dataState.getTotalCostOrCredit());
    }
}
