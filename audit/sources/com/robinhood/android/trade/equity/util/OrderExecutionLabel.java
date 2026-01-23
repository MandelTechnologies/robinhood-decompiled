package com.robinhood.android.trade.equity.util;

import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OrderExecutionLabel.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a?\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderContext;", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "", "isReviewing", "marketBuysEnabled", "j$/time/Clock", Card.Icon.CLOCK, "showTaxLots", "Lcom/robinhood/utils/resource/StringResource;", "orderExecutionLabel", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;Lcom/robinhood/models/db/MarketHours;ZZLj$/time/Clock;Z)Lcom/robinhood/utils/resource/StringResource;", "marketExecutionString", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;Lcom/robinhood/models/db/MarketHours;ZLj$/time/Clock;)Lcom/robinhood/utils/resource/StringResource;", "orderContext", "limitExecutionString", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;Z)Lcom/robinhood/utils/resource/StringResource;", "stopLimitPriceExecutionString", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;)Lcom/robinhood/utils/resource/StringResource;", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.equity.util.OrderExecutionLabelKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderExecutionLabel {

    /* compiled from: OrderExecutionLabel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.util.OrderExecutionLabelKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderMarketHours.values().length];
            try {
                iArr2[OrderMarketHours.REGULAR_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ StringResource orderExecutionLabel$default(EquityOrderContext equityOrderContext, MarketHours marketHours, boolean z, boolean z2, Clock clock, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            clock = Clock.systemDefaultZone();
        }
        return orderExecutionLabel(equityOrderContext, marketHours, z, z2, clock, z3);
    }

    public static final StringResource orderExecutionLabel(EquityOrderContext equityOrderContext, MarketHours marketHours, boolean z, boolean z2, Clock clock, boolean z3) {
        Intrinsics.checkNotNullParameter(equityOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        switch (WhenMappings.$EnumSwitchMapping$0[equityOrderContext.getConfiguration().ordinal()]) {
            case 4:
                StringResource stringResourceMarketExecutionString = marketExecutionString(equityOrderContext, marketHours, z, clock);
                if (z2) {
                    return stringResourceMarketExecutionString;
                }
            case 1:
            case 2:
            case 3:
                return null;
            case 5:
                return limitExecutionString(equityOrderContext, z3);
            case 6:
                return stopLimitPriceExecutionString(equityOrderContext);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ StringResource marketExecutionString$default(EquityOrderContext equityOrderContext, MarketHours marketHours, boolean z, Clock clock, int i, Object obj) {
        if ((i & 4) != 0) {
            clock = Clock.systemDefaultZone();
        }
        return marketExecutionString(equityOrderContext, marketHours, z, clock);
    }

    private static final StringResource marketExecutionString(EquityOrderContext equityOrderContext, MarketHours marketHours, boolean z, Clock clock) {
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C29365R.string.order_create_queued_market_execution, new Object[0]);
        if (!equityOrderContext.isBuy()) {
            return null;
        }
        if (marketHours != null) {
            Instant instant = clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            if (marketHours.isOpenRegular(instant)) {
                return null;
            }
        }
        if (z) {
            return stringResourceInvoke;
        }
        return null;
    }

    private static final StringResource limitExecutionString(EquityOrderContext equityOrderContext, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$1[equityOrderContext.getMarketHours().ordinal()];
        if (i == 1) {
            if (z) {
                return StringResource.INSTANCE.invoke(C29365R.string.order_extended_hours_no, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C29365R.string.order_create_limit_market_hours_execution, new Object[0]);
        }
        if (i == 2 || i == 3) {
            if (z) {
                return StringResource.INSTANCE.invoke(C29365R.string.order_extended_hours_yes, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C29365R.string.order_create_limit_extended_hours_execution, new Object[0]);
        }
        if (i == 4) {
            throw new IllegalStateException("Index options curb hours is not supported for equities");
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C29365R.string.order_create_limit_all_day_hours_execution, new Object[0]);
    }

    private static final StringResource stopLimitPriceExecutionString(EquityOrderContext equityOrderContext) {
        String str;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C29365R.string.order_create_stop_limit_price_execution;
        BigDecimal stopPrice = equityOrderContext.getStopPrice();
        if (stopPrice == null || (str = Formats.getPriceFormat().format(stopPrice)) == null) {
            str = "";
        }
        return companion.invoke(i, str);
    }
}
