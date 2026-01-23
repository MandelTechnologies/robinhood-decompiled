package com.robinhood.android.futures.history.p142ui.settlement;

import com.robinhood.android.futures.history.C17229R;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract;
import com.robinhood.android.models.futures.p189db.FuturesCashSettlement;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesCashSettlementDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b%\u0010\u000fR\u0011\u0010&\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b'\u0010\u0019¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/settlement/RhdCashSettlementDetailDataState;", "", "execution", "Lcom/robinhood/android/models/futures/db/FuturesCashSettlement;", "futuresContract", "Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;", "<init>", "(Lcom/robinhood/android/models/futures/db/FuturesCashSettlement;Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;)V", "getExecution", "()Lcom/robinhood/android/models/futures/db/FuturesCashSettlement;", "getFuturesContract", "()Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;", "pageTitle", "Lcom/robinhood/utils/resource/StringResource;", "getPageTitle", "()Lcom/robinhood/utils/resource/StringResource;", "toolbarCta", "Lcom/robinhood/android/futures/history/ui/settlement/FuturesExecutionToolbarCta;", "getToolbarCta", "()Lcom/robinhood/android/futures/history/ui/settlement/FuturesExecutionToolbarCta;", "pageSubtitle", "getPageSubtitle", "settlementPrice", "", "getSettlementPrice", "()Ljava/lang/String;", "fees", "getFees", "commissions", "getCommissions", "goldSavings", "getGoldSavings", "totalCostOrCredit", "Lkotlin/Pair;", "getTotalCostOrCredit", "()Lkotlin/Pair;", "realizedPnlLabel", "getRealizedPnlLabel", "realizedPnlValue", "getRealizedPnlValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class RhdCashSettlementDetailDataState {
    public static final int $stable = 8;
    private final FuturesCashSettlement execution;
    private final UiFuturesContract futuresContract;

    /* JADX WARN: Multi-variable type inference failed */
    public RhdCashSettlementDetailDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RhdCashSettlementDetailDataState copy$default(RhdCashSettlementDetailDataState rhdCashSettlementDetailDataState, FuturesCashSettlement futuresCashSettlement, UiFuturesContract uiFuturesContract, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresCashSettlement = rhdCashSettlementDetailDataState.execution;
        }
        if ((i & 2) != 0) {
            uiFuturesContract = rhdCashSettlementDetailDataState.futuresContract;
        }
        return rhdCashSettlementDetailDataState.copy(futuresCashSettlement, uiFuturesContract);
    }

    /* renamed from: component1, reason: from getter */
    public final FuturesCashSettlement getExecution() {
        return this.execution;
    }

    /* renamed from: component2, reason: from getter */
    public final UiFuturesContract getFuturesContract() {
        return this.futuresContract;
    }

    public final RhdCashSettlementDetailDataState copy(FuturesCashSettlement execution, UiFuturesContract futuresContract) {
        return new RhdCashSettlementDetailDataState(execution, futuresContract);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhdCashSettlementDetailDataState)) {
            return false;
        }
        RhdCashSettlementDetailDataState rhdCashSettlementDetailDataState = (RhdCashSettlementDetailDataState) other;
        return Intrinsics.areEqual(this.execution, rhdCashSettlementDetailDataState.execution) && Intrinsics.areEqual(this.futuresContract, rhdCashSettlementDetailDataState.futuresContract);
    }

    public int hashCode() {
        FuturesCashSettlement futuresCashSettlement = this.execution;
        int iHashCode = (futuresCashSettlement == null ? 0 : futuresCashSettlement.hashCode()) * 31;
        UiFuturesContract uiFuturesContract = this.futuresContract;
        return iHashCode + (uiFuturesContract != null ? uiFuturesContract.hashCode() : 0);
    }

    public String toString() {
        return "RhdCashSettlementDetailDataState(execution=" + this.execution + ", futuresContract=" + this.futuresContract + ")";
    }

    public RhdCashSettlementDetailDataState(FuturesCashSettlement futuresCashSettlement, UiFuturesContract uiFuturesContract) {
        this.execution = futuresCashSettlement;
        this.futuresContract = uiFuturesContract;
    }

    public /* synthetic */ RhdCashSettlementDetailDataState(FuturesCashSettlement futuresCashSettlement, UiFuturesContract uiFuturesContract, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresCashSettlement, (i & 2) != 0 ? null : uiFuturesContract);
    }

    public final FuturesCashSettlement getExecution() {
        return this.execution;
    }

    public final UiFuturesContract getFuturesContract() {
        return this.futuresContract;
    }

    public final StringResource getPageTitle() {
        return StringResource.INSTANCE.invoke(C17229R.string.futures_executions_detail_title, new Object[0]);
    }

    public final FuturesExecutionToolbarCta getToolbarCta() {
        FuturesContract contract;
        UiFuturesContract uiFuturesContract = this.futuresContract;
        if (uiFuturesContract == null || (contract = uiFuturesContract.getContract()) == null) {
            return null;
        }
        return new FuturesExecutionToolbarCta(StringResource.INSTANCE.invoke(C17229R.string.futures_order_detail_view_contract_cta, contract.getDisplaySymbol()), contract.getId());
    }

    public final StringResource getPageSubtitle() {
        FuturesContract contract;
        String displayName;
        UiFuturesContract uiFuturesContract = this.futuresContract;
        if (uiFuturesContract == null || (contract = uiFuturesContract.getContract()) == null || (displayName = contract.getDisplayName()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(displayName);
    }

    public final String getSettlementPrice() {
        FuturesCashSettlement futuresCashSettlement = this.execution;
        BigDecimal pricePerContract = futuresCashSettlement != null ? futuresCashSettlement.getPricePerContract() : null;
        if (pricePerContract == null) {
            throw new IllegalStateException("Can't call settlementPrice with a null execution");
        }
        UiFuturesContract uiFuturesContract = this.futuresContract;
        return FuturesProduct5.format$default(uiFuturesContract != null ? uiFuturesContract.getProduct() : null, pricePerContract, null, 2, null);
    }

    public final String getFees() {
        Money zeroMoney;
        FuturesCashSettlement futuresCashSettlement = this.execution;
        if (futuresCashSettlement == null || (zeroMoney = futuresCashSettlement.getTotalExchangeAndRegFees()) == null) {
            zeroMoney = FuturesCashSettlementDetailDuxo5.INSTANCE.getZeroMoney();
        }
        return Money.format$default(zeroMoney, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getCommissions() {
        Money zeroMoney;
        Money totalCommission;
        FuturesCashSettlement futuresCashSettlement = this.execution;
        if (futuresCashSettlement == null || (totalCommission = futuresCashSettlement.getTotalCommission()) == null || (zeroMoney = totalCommission.abs()) == null) {
            zeroMoney = FuturesCashSettlementDetailDuxo5.INSTANCE.getZeroMoney();
        }
        return Money.format$default(zeroMoney, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getGoldSavings() {
        Money totalGoldSavings;
        FuturesCashSettlement futuresCashSettlement = this.execution;
        if (futuresCashSettlement == null || (totalGoldSavings = futuresCashSettlement.getTotalGoldSavings()) == null) {
            return null;
        }
        return Money.format$default(totalGoldSavings, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final Tuples2<StringResource, String> getTotalCostOrCredit() {
        Money money;
        Money money2;
        Money money3;
        FuturesCashSettlement futuresCashSettlement = this.execution;
        if (futuresCashSettlement == null || (money = futuresCashSettlement.getTotalFee()) == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            money = Money3.toMoney(ZERO, Currencies.USD);
        }
        Money money4 = money;
        FuturesCashSettlement futuresCashSettlement2 = this.execution;
        if (futuresCashSettlement2 == null || (money2 = futuresCashSettlement2.getRealizedPnlWithoutFees()) == null) {
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            money2 = Money3.toMoney(ZERO2, Currencies.USD);
        }
        FuturesCashSettlement futuresCashSettlement3 = this.execution;
        if (futuresCashSettlement3 == null || (money3 = futuresCashSettlement3.getRealizedPnl()) == null) {
            BigDecimal ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
            money3 = Money3.toMoney(ZERO3, Currencies.USD);
        }
        if (money2.isZero()) {
            return Tuples4.m3642to(StringResource.INSTANCE.invoke(C17229R.string.futures_executions_detail_total_cost_label, new Object[0]), Money.format$default(money4, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        if (money3.isNegative()) {
            return Tuples4.m3642to(StringResource.INSTANCE.invoke(C17229R.string.futures_executions_detail_total_cost_label, new Object[0]), Money.format$default(money3.abs(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return Tuples4.m3642to(StringResource.INSTANCE.invoke(C17229R.string.futures_executions_detail_total_credit_label, new Object[0]), Money.format$default(money3.abs(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final StringResource getRealizedPnlLabel() {
        FuturesCashSettlement futuresCashSettlement = this.execution;
        Money realizedPnlWithoutFees = futuresCashSettlement != null ? futuresCashSettlement.getRealizedPnlWithoutFees() : null;
        if (realizedPnlWithoutFees == null) {
            return null;
        }
        if (!realizedPnlWithoutFees.isNegative()) {
            return StringResource.INSTANCE.invoke(C17229R.string.futures_executions_detail_realized_profit_label, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C17229R.string.futures_executions_detail_realized_loss_label, new Object[0]);
    }

    public final String getRealizedPnlValue() {
        Money zeroMoney;
        FuturesCashSettlement futuresCashSettlement = this.execution;
        if (futuresCashSettlement == null || (zeroMoney = futuresCashSettlement.getRealizedPnlWithoutFees()) == null) {
            zeroMoney = FuturesCashSettlementDetailDuxo5.INSTANCE.getZeroMoney();
        }
        BigDecimal bigDecimalAbs = zeroMoney.getDecimalValue().abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return Money.format$default(Money3.toMoney(bigDecimalAbs, zeroMoney.getCurrency()), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }
}
