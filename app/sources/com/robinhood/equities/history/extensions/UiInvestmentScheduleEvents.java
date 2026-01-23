package com.robinhood.equities.history.extensions;

import android.content.res.Resources;
import com.robinhood.equities.history.C33130R;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.recurring.models.TradeSkippedReason;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiInvestmentScheduleEvents.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getOrderErrorStatusText", "", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "res", "Landroid/content/res/Resources;", "lib-equity-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.equities.history.extensions.UiInvestmentScheduleEventsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class UiInvestmentScheduleEvents {
    public static final String getOrderErrorStatusText(UiInvestmentScheduleEvent uiInvestmentScheduleEvent, Resources res) {
        PaymentTransfer paymentTransfer;
        Intrinsics.checkNotNullParameter(uiInvestmentScheduleEvent, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        TradeSkippedReason tradeSkippedReason = uiInvestmentScheduleEvent.getInvestmentScheduleEvent().getTradeSkippedReason();
        if (tradeSkippedReason != null) {
            return TradeSkippedReasons.getOrderString(tradeSkippedReason, res);
        }
        Order order = uiInvestmentScheduleEvent.getOrder();
        if ((order != null ? order.getState() : null) == EquityOrderState.CANCELED && (paymentTransfer = uiInvestmentScheduleEvent.getPaymentTransfer()) != null && paymentTransfer.isSuccess()) {
            return res.getString(C33130R.string.investment_schedule_event_order_cancelled_order_error);
        }
        return null;
    }
}
