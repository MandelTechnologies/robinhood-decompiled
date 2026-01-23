package com.robinhood.android.equity.ordercheck;

import com.robinhood.models.api.ApiEquityOrderPostBody;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: EquityOrderCheckValidator.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, m3636d2 = {"toOrderCheckBody", "Lcom/robinhood/models/api/ApiEquityOrderPostBody;", "Lcom/robinhood/models/db/DirectOrderRequestDraft;", "lib-equity-validation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.ordercheck.EquityOrderCheckValidatorKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrderCheckValidator4 {
    public static final ApiEquityOrderPostBody toOrderCheckBody(DirectOrderRequestDraft directOrderRequestDraft) {
        Intrinsics.checkNotNullParameter(directOrderRequestDraft, "<this>");
        String string2 = directOrderRequestDraft.getRefId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String url = Account.INSTANCE.getUrl(directOrderRequestDraft.getAccountNumber());
        String url2 = directOrderRequestDraft.getInstrument().getUrl();
        String symbol = directOrderRequestDraft.getInstrument().getSymbol();
        EquityOrderSide side = directOrderRequestDraft.getSide();
        OrderType type2 = directOrderRequestDraft.getType();
        BigDecimal quantity = directOrderRequestDraft.getQuantity();
        OrderTimeInForce timeInForce = directOrderRequestDraft.getTimeInForce();
        OrderTrigger trigger = directOrderRequestDraft.getTrigger();
        OrderMarketHours marketHours = directOrderRequestDraft.getMarketHours();
        BigDecimal price = directOrderRequestDraft.getPrice();
        BigDecimal stopPrice = directOrderRequestDraft.getStopPrice();
        OrderTrailingPeg trailingPeg = directOrderRequestDraft.getTrailingPeg();
        Money dollarBasedAmount = directOrderRequestDraft.getDollarBasedAmount();
        List<String> checkOverrides = directOrderRequestDraft.getCheckOverrides();
        BigDecimal presetPercentLimit = directOrderRequestDraft.getPresetPercentLimit();
        Integer numValueOf = Integer.valueOf(directOrderRequestDraft.getOrderFormVersion());
        BigDecimal bidPrice = directOrderRequestDraft.getBidPrice();
        BigDecimal askPrice = directOrderRequestDraft.getAskPrice();
        Instant bidAskTimestamp = directOrderRequestDraft.getBidAskTimestamp();
        return new ApiEquityOrderPostBody(string2, url, url2, symbol, side, type2, quantity, timeInForce, trigger, null, marketHours, price, stopPrice, trailingPeg, dollarBasedAmount, checkOverrides, presetPercentLimit, numValueOf, bidPrice, askPrice, bidAskTimestamp != null ? bidAskTimestamp.toString() : null, null, null, directOrderRequestDraft.getInputFormat(), directOrderRequestDraft.getEntryPoint(), directOrderRequestDraft.getBorrowFeeApr(), 6291456, null);
    }
}
