package com.robinhood.android.equityadvancedorder.utils;

import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.contracts.equity_order_context.proto.p487v1.OrderSide;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponse;
import microgram.contracts.equity_order_context.proto.p487v1.TrailingPeg;

/* compiled from: EquityOrderContexts.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"toProto", "Lcom/robinhood/rosetta/common/Currency;", "Ljava/util/Currency;", "Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPeg;", "Lcom/robinhood/models/db/OrderTrailingPeg;", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;", "Lcom/robinhood/models/db/OrderType;", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderSide;", "Lcom/robinhood/models/db/EquityOrderSide;", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderTrigger;", "Lcom/robinhood/models/db/OrderTrigger;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "advancedOrderRefId", "Ljava/util/UUID;", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.utils.EquityOrderContextsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrderContexts {

    /* compiled from: EquityOrderContexts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityadvancedorder.utils.EquityOrderContextsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[OrderTrailingPeg.TrailingPegType.values().length];
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderType.values().length];
            try {
                iArr2[OrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EquityOrderSide.values().length];
            try {
                iArr3[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderTrigger.values().length];
            try {
                iArr4[OrderTrigger.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[OrderTrigger.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    private static final Currency toProto(java.util.Currency currency) {
        String currencyCode = currency.getCurrencyCode();
        if (currencyCode != null) {
            switch (currencyCode.hashCode()) {
                case 69026:
                    if (currencyCode.equals("EUR")) {
                        return Currency.EUR;
                    }
                    break;
                case 70357:
                    if (currencyCode.equals("GBP")) {
                        return Currency.GBP;
                    }
                    break;
                case 82032:
                    if (currencyCode.equals("SGD")) {
                        return Currency.SGD;
                    }
                    break;
                case 84326:
                    if (currencyCode.equals("USD")) {
                        return Currency.USD;
                    }
                    break;
            }
        }
        return Currency.CURRENCY_UNSPECIFIED;
    }

    private static final TrailingPeg toProto(OrderTrailingPeg orderTrailingPeg) {
        int i = WhenMappings.$EnumSwitchMapping$0[orderTrailingPeg.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (orderTrailingPeg.getPercentage() == null) {
                throw new IllegalStateException("percentage must be set for PERCENTAGE type");
            }
            return new TrailingPeg(orderTrailingPeg.getPercentage(), null, null, 6, null);
        }
        Money price = orderTrailingPeg.getPrice();
        if (price == null) {
            throw new IllegalStateException("Price must be set for PRICE type");
        }
        String string2 = price.getDecimalValue().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new TrailingPeg(null, new com.robinhood.rosetta.common.Money(string2, toProto(price.getCurrency()), null, 4, null), null, 5, null);
    }

    private static final microgram.contracts.equity_order_context.proto.p487v1.OrderType toProto(OrderType orderType) {
        int i = WhenMappings.$EnumSwitchMapping$1[orderType.ordinal()];
        if (i == 1) {
            return microgram.contracts.equity_order_context.proto.p487v1.OrderType.MARKET;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return microgram.contracts.equity_order_context.proto.p487v1.OrderType.LIMIT;
    }

    private static final OrderSide toProto(EquityOrderSide equityOrderSide) {
        int i = WhenMappings.$EnumSwitchMapping$2[equityOrderSide.ordinal()];
        if (i == 1) {
            return OrderSide.BUY;
        }
        if (i == 2) {
            return OrderSide.SELL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Not implemented yet");
    }

    private static final microgram.contracts.equity_order_context.proto.p487v1.OrderTrigger toProto(OrderTrigger orderTrigger) {
        int i = WhenMappings.$EnumSwitchMapping$3[orderTrigger.ordinal()];
        if (i == 1) {
            return microgram.contracts.equity_order_context.proto.p487v1.OrderTrigger.IMMEDIATE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return microgram.contracts.equity_order_context.proto.p487v1.OrderTrigger.STOP;
    }

    public static final StreamOrderContextResponse toProto(EquityOrderContext equityOrderContext, UUID advancedOrderRefId) {
        Intrinsics.checkNotNullParameter(equityOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(advancedOrderRefId, "advancedOrderRefId");
        String string2 = advancedOrderRefId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String accountNumber = equityOrderContext.getAccountNumber();
        String string3 = equityOrderContext.getInstrument().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        microgram.contracts.equity_order_context.proto.p487v1.OrderTrigger proto = toProto(equityOrderContext.getTrigger());
        microgram.contracts.equity_order_context.proto.p487v1.OrderType proto2 = toProto(equityOrderContext.getOrderType());
        OrderSide proto3 = toProto(equityOrderContext.getSide());
        OrderTrailingPeg trailingPeg = equityOrderContext.getTrailingPeg();
        return new StreamOrderContextResponse(string2, accountNumber, string3, proto2, proto3, proto, trailingPeg != null ? toProto(trailingPeg) : null, equityOrderContext.getPresetPercentLimit() != null, new com.robinhood.rosetta.common.Money(String.valueOf(equityOrderContext.getPrice()), null, null, 6, null), new com.robinhood.rosetta.common.Money(String.valueOf(equityOrderContext.getStopPrice()), null, null, 6, null), null, 1024, null);
    }
}
