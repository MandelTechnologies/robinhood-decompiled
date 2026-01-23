package com.robinhood.android.event.history.p131ui.settlement;

import com.robinhood.android.event.history.C16405R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.ceres.EventCashSettlement;
import com.robinhood.android.models.event.p186db.order.EventOrder;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventCashSettlementDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailDataState;", "", "cashSettlement", "Lcom/robinhood/android/models/event/db/ceres/EventCashSettlement;", "eventContract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "<init>", "(Lcom/robinhood/android/models/event/db/ceres/EventCashSettlement;Lcom/robinhood/android/models/event/db/arsenal/EventContract;)V", "getCashSettlement", "()Lcom/robinhood/android/models/event/db/ceres/EventCashSettlement;", "getEventContract", "()Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "pageTitle", "Lcom/robinhood/utils/resource/StringResource;", "getPageTitle", "()Lcom/robinhood/utils/resource/StringResource;", "pageSubtitle", "getPageSubtitle", "settlementPrice", "", "getSettlementPrice", "()Ljava/lang/String;", "realizedPnlLabel", "getRealizedPnlLabel", "realizedPnlValue", "getRealizedPnlValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EventCashSettlementDetailDataState {
    public static final int $stable = 8;
    private final EventCashSettlement cashSettlement;
    private final EventContract eventContract;

    /* compiled from: EventCashSettlementDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesOrderSide.values().length];
            try {
                iArr[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventCashSettlementDetailDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EventCashSettlementDetailDataState copy$default(EventCashSettlementDetailDataState eventCashSettlementDetailDataState, EventCashSettlement eventCashSettlement, EventContract eventContract, int i, Object obj) {
        if ((i & 1) != 0) {
            eventCashSettlement = eventCashSettlementDetailDataState.cashSettlement;
        }
        if ((i & 2) != 0) {
            eventContract = eventCashSettlementDetailDataState.eventContract;
        }
        return eventCashSettlementDetailDataState.copy(eventCashSettlement, eventContract);
    }

    /* renamed from: component1, reason: from getter */
    public final EventCashSettlement getCashSettlement() {
        return this.cashSettlement;
    }

    /* renamed from: component2, reason: from getter */
    public final EventContract getEventContract() {
        return this.eventContract;
    }

    public final EventCashSettlementDetailDataState copy(EventCashSettlement cashSettlement, EventContract eventContract) {
        return new EventCashSettlementDetailDataState(cashSettlement, eventContract);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventCashSettlementDetailDataState)) {
            return false;
        }
        EventCashSettlementDetailDataState eventCashSettlementDetailDataState = (EventCashSettlementDetailDataState) other;
        return Intrinsics.areEqual(this.cashSettlement, eventCashSettlementDetailDataState.cashSettlement) && Intrinsics.areEqual(this.eventContract, eventCashSettlementDetailDataState.eventContract);
    }

    public int hashCode() {
        EventCashSettlement eventCashSettlement = this.cashSettlement;
        int iHashCode = (eventCashSettlement == null ? 0 : eventCashSettlement.hashCode()) * 31;
        EventContract eventContract = this.eventContract;
        return iHashCode + (eventContract != null ? eventContract.hashCode() : 0);
    }

    public String toString() {
        return "EventCashSettlementDetailDataState(cashSettlement=" + this.cashSettlement + ", eventContract=" + this.eventContract + ")";
    }

    public EventCashSettlementDetailDataState(EventCashSettlement eventCashSettlement, EventContract eventContract) {
        this.cashSettlement = eventCashSettlement;
        this.eventContract = eventContract;
    }

    public /* synthetic */ EventCashSettlementDetailDataState(EventCashSettlement eventCashSettlement, EventContract eventContract, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eventCashSettlement, (i & 2) != 0 ? null : eventContract);
    }

    public final EventCashSettlement getCashSettlement() {
        return this.cashSettlement;
    }

    public final EventContract getEventContract() {
        return this.eventContract;
    }

    public final StringResource getPageTitle() {
        return StringResource.INSTANCE.invoke(C16405R.string.event_payout_detail_title, new Object[0]);
    }

    public final StringResource getPageSubtitle() {
        EventContract eventContract = this.eventContract;
        if (eventContract == null) {
            return null;
        }
        EventCashSettlement eventCashSettlement = this.cashSettlement;
        FuturesOrderSide side = eventCashSettlement != null ? eventCashSettlement.getSide() : null;
        int i = side == null ? -1 : WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == -1) {
            return StringResource.INSTANCE.invoke(eventContract.getDisplayLongName());
        }
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C16405R.string.event_payout_detail_subtitle_no, eventContract.getDisplayLongName());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C16405R.string.event_payout_detail_subtitle_yes, eventContract.getDisplayLongName());
    }

    public final String getSettlementPrice() {
        EventCashSettlement eventCashSettlement = this.cashSettlement;
        BigDecimal pricePerContract = eventCashSettlement != null ? eventCashSettlement.getPricePerContract() : null;
        if (pricePerContract == null) {
            throw new IllegalStateException("Can't call settlementPrice with a null execution");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.cashSettlement.getSide().ordinal()];
        if (i == 1) {
            pricePerContract = EventOrder.INSTANCE.getPAYOUT_PER_CONTRACT().subtract(pricePerContract);
            Intrinsics.checkNotNullExpressionValue(pricePerContract, "subtract(...)");
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Formats.getPriceFormat().format(pricePerContract);
    }

    public final StringResource getRealizedPnlLabel() {
        EventCashSettlement eventCashSettlement = this.cashSettlement;
        Money realizedPnlWithoutFees = eventCashSettlement != null ? eventCashSettlement.getRealizedPnlWithoutFees() : null;
        if (realizedPnlWithoutFees == null) {
            return null;
        }
        if (!realizedPnlWithoutFees.isNegative()) {
            return StringResource.INSTANCE.invoke(C16405R.string.event_payout_detail_realized_profit_label, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C16405R.string.event_payout_detail_realized_loss_label, new Object[0]);
    }

    public final String getRealizedPnlValue() {
        Money realizedPnlWithoutFees;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Money money = Money3.toMoney(ZERO, Currencies.USD);
        EventCashSettlement eventCashSettlement = this.cashSettlement;
        if (eventCashSettlement != null && (realizedPnlWithoutFees = eventCashSettlement.getRealizedPnlWithoutFees()) != null) {
            money = realizedPnlWithoutFees;
        }
        BigDecimal bigDecimalAbs = money.getDecimalValue().abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return Money.format$default(Money3.toMoney(bigDecimalAbs, money.getCurrency()), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }
}
