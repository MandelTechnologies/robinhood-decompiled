package com.robinhood.rosetta.converters.stocktrading;

import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.eventlogging.TrailingPeg;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.PegType;

/* compiled from: EquityOrders.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002¨\u0006\u0005"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/TrailingPeg;", "Lcom/robinhood/models/db/OrderTrailingPeg;", "Lrosetta/order/PegType;", "Lcom/robinhood/models/db/OrderTrailingPeg$TrailingPegType;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.stocktrading.EquityOrdersKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class EquityOrders2 {

    /* compiled from: EquityOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.stocktrading.EquityOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public static final TrailingPeg toProtobuf(OrderTrailingPeg orderTrailingPeg) {
        String string2;
        Intrinsics.checkNotNullParameter(orderTrailingPeg, "<this>");
        PegType protobuf = toProtobuf(orderTrailingPeg.getType());
        Integer percentage = orderTrailingPeg.getPercentage();
        if (percentage == null || (string2 = percentage.toString()) == null) {
            string2 = "";
        }
        String str = string2;
        Money price = orderTrailingPeg.getPrice();
        return new TrailingPeg(protobuf, str, price != null ? Securities.toProtobuf(price) : null, null, 8, null);
    }

    private static final PegType toProtobuf(OrderTrailingPeg.TrailingPegType trailingPegType) {
        int i = WhenMappings.$EnumSwitchMapping$0[trailingPegType.ordinal()];
        if (i == 1) {
            return PegType.PRICE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PegType.PERCENTAGE;
    }
}
