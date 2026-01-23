package com.robinhood.android.equity.ordercheck;

import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.ApiTaxLot;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethod;
import com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.converters.brokerage.TaxLots2;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.converters.stocktrading.EquityOrders2;
import com.robinhood.rosetta.eventlogging.EquityOrderPayload;
import com.robinhood.rosetta.eventlogging.TrailingPeg;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import rosetta.order.MarketHours;
import rosetta.order.OrderType;
import rosetta.order.PositionEffect;
import rosetta.order.Side;
import rosetta.order.TimeInForce;
import rosetta.order.Trigger;

/* compiled from: Logging.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toOrderPayload", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "Lcom/robinhood/models/db/DirectOrderRequestDraft;", "lib-equity-validation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.ordercheck.LoggingKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class Logging5 {
    public static final EquityOrderPayload toOrderPayload(DirectOrderRequestDraft directOrderRequestDraft) {
        String protobuf;
        Intrinsics.checkNotNullParameter(directOrderRequestDraft, "<this>");
        String string2 = directOrderRequestDraft.getRefId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String url = Account.INSTANCE.getUrl(directOrderRequestDraft.getAccountNumber());
        String url2 = directOrderRequestDraft.getInstrument().getUrl();
        String symbol = directOrderRequestDraft.getInstrument().getSymbol();
        String protobuf2 = Securities.toProtobuf(directOrderRequestDraft.getQuantity());
        Side protobuf3 = Orders2.toProtobuf(directOrderRequestDraft.getSide());
        PositionEffect protobuf4 = Orders2.toProtobuf(directOrderRequestDraft.getPositionEffect());
        String protobuf5 = Securities.toProtobuf(directOrderRequestDraft.getPrice());
        String protobuf6 = Securities.toProtobuf(directOrderRequestDraft.getBidPrice());
        String protobuf7 = Securities.toProtobuf(directOrderRequestDraft.getAskPrice());
        Instant bidAskTimestamp = directOrderRequestDraft.getBidAskTimestamp();
        String protobuf8 = Securities.toProtobuf(directOrderRequestDraft.getStopPrice());
        OrderType protobuf9 = Orders2.toProtobuf(directOrderRequestDraft.getType());
        Trigger protobuf10 = Orders2.toProtobuf(directOrderRequestDraft.getTrigger());
        TimeInForce protobuf11 = Orders2.toProtobuf(directOrderRequestDraft.getTimeInForce());
        MarketHours protobuf12 = Orders2.toProtobuf(directOrderRequestDraft.getMarketHours());
        Money dollarBasedAmount = directOrderRequestDraft.getDollarBasedAmount();
        com.robinhood.rosetta.eventlogging.Money protobuf13 = dollarBasedAmount != null ? Securities.toProtobuf(dollarBasedAmount) : null;
        OrderTrailingPeg trailingPeg = directOrderRequestDraft.getTrailingPeg();
        TrailingPeg protobuf14 = trailingPeg != null ? EquityOrders2.toProtobuf(trailingPeg) : null;
        List<String> checkOverrides = directOrderRequestDraft.getCheckOverrides();
        String protobuf15 = Securities.toProtobuf(directOrderRequestDraft.getPresetPercentLimit());
        int orderFormVersion = directOrderRequestDraft.getOrderFormVersion();
        List<ApiTaxLot> taxLots = directOrderRequestDraft.getTaxLots();
        if (taxLots == null) {
            taxLots = CollectionsKt.emptyList();
        }
        List<TaxLotSelection> protobuf16 = TaxLots2.toProtobuf(taxLots);
        DisposalMethod protobuf17 = TaxLots2.toProtobuf(directOrderRequestDraft.getTaxLotSelectionType());
        BigDecimal estimatedTotalFeeAndTaxes = directOrderRequestDraft.getEstimatedTotalFeeAndTaxes();
        if (estimatedTotalFeeAndTaxes == null || (protobuf = Securities.toProtobuf(estimatedTotalFeeAndTaxes)) == null) {
            protobuf = "";
        }
        return new EquityOrderPayload(string2, url, url2, symbol, protobuf2, protobuf3, protobuf5, protobuf8, protobuf9, protobuf10, protobuf11, false, protobuf13, protobuf14, false, false, false, null, null, null, null, false, checkOverrides, protobuf15, orderFormVersion, protobuf12, protobuf6, protobuf7, bidAskTimestamp, protobuf17, protobuf16, null, protobuf, protobuf4, null, null, null, -2143303680, 28, null);
    }
}
