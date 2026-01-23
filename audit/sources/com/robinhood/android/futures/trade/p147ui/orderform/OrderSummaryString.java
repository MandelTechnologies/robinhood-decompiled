package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OrderSummaryString.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"getOrderSummaryString", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;", "getGfdExpirationTimeString", "nextOpenTradingSession", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "getQuoteSummaryString", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.orderform.OrderSummaryStringKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OrderSummaryString {

    /* compiled from: OrderSummaryString.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.OrderSummaryStringKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[FuturesTimeInForce.values().length];
            try {
                iArr2[FuturesTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FuturesTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FuturesTimeInForce.IOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FuturesTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FuturesTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FuturesOrderConfiguration.values().length];
            try {
                iArr3[FuturesOrderConfiguration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[FuturesOrderConfiguration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[FuturesOrderConfiguration.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[FuturesOrderConfiguration.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final StringResource getOrderSummaryString(FuturesOrderFormDataState futuresOrderFormDataState) {
        String displaySymbol;
        UiFuturesOrderContext orderContext;
        UiFuturesOrderContext.OrderRequest orderRequest;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(futuresOrderFormDataState, "<this>");
        FuturesContract contract = futuresOrderFormDataState.getContract();
        if (contract == null || (displaySymbol = contract.getDisplaySymbol()) == null || (orderContext = futuresOrderFormDataState.getOrderContext()) == null || (orderRequest = orderContext.getOrderRequest()) == null) {
            return null;
        }
        int intRounded = BigDecimals7.toIntRounded((BigDecimal) ComparisonsKt.minOf(orderRequest.getQuantity(), new BigDecimal(Integer.MAX_VALUE)));
        int i8 = WhenMappings.$EnumSwitchMapping$2[futuresOrderFormDataState.getOrderConfig().ordinal()];
        if (i8 == 1) {
            int i9 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getSide().ordinal()];
            if (i9 == 1) {
                i = C17462R.plurals.futures_order_form_summary_market_buy;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C17462R.plurals.futures_order_form_summary_market_sell;
            }
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(i, intRounded), Formats.getShareQuantityFormat().format(orderRequest.getQuantity()), displaySymbol);
        }
        if (i8 == 2) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[futuresOrderFormDataState.getTimeInForce().ordinal()];
            if (i10 == 1) {
                StringResource gfdExpirationTimeString = getGfdExpirationTimeString(futuresOrderFormDataState.getNextOpenTradingSession());
                if (gfdExpirationTimeString == null) {
                    return null;
                }
                int i11 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getSide().ordinal()];
                if (i11 == 1) {
                    i2 = C17462R.plurals.futures_order_form_summary_limit_buy_gfd;
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C17462R.plurals.futures_order_form_summary_limit_sell_gfd;
                }
                return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(i2, intRounded), Formats.getShareQuantityFormat().format(orderRequest.getQuantity()), displaySymbol, gfdExpirationTimeString, FuturesProduct5.formatNullable$default(futuresOrderFormDataState.getProduct(), orderRequest.getLimitPrice(), null, 2, null));
            }
            if (i10 == 2) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getSide().ordinal()];
                if (i12 == 1) {
                    i3 = C17462R.plurals.futures_order_form_summary_limit_buy_gtc;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C17462R.plurals.futures_order_form_summary_limit_sell_gtc;
                }
                return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(i3, intRounded), Formats.getShareQuantityFormat().format(orderRequest.getQuantity()), displaySymbol, FuturesProduct5.formatNullable$default(futuresOrderFormDataState.getProduct(), orderRequest.getLimitPrice(), null, 2, null));
            }
            if (i10 != 3) {
                if (i10 == 4 || i10 == 5) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            int i13 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getSide().ordinal()];
            if (i13 == 1) {
                i4 = C17462R.plurals.futures_order_form_summary_limit_buy_ioc;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = C17462R.plurals.futures_order_form_summary_limit_sell_ioc;
            }
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(i4, intRounded), Formats.getShareQuantityFormat().format(orderRequest.getQuantity()), displaySymbol, FuturesProduct5.formatNullable$default(futuresOrderFormDataState.getProduct(), orderRequest.getLimitPrice(), null, 2, null));
        }
        if (i8 != 3) {
            if (i8 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException(("Unsupported order config: " + futuresOrderFormDataState.getOrderConfig()).toString());
        }
        int i14 = WhenMappings.$EnumSwitchMapping$1[futuresOrderFormDataState.getTimeInForce().ordinal()];
        if (i14 == 1) {
            StringResource gfdExpirationTimeString2 = getGfdExpirationTimeString(futuresOrderFormDataState.getNextOpenTradingSession());
            if (gfdExpirationTimeString2 == null) {
                return null;
            }
            int i15 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getSide().ordinal()];
            if (i15 == 1) {
                i5 = C17462R.plurals.futures_order_form_summary_stop_buy_gfd;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = C17462R.plurals.futures_order_form_summary_stop_sell_gfd;
            }
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(i5, intRounded), Formats.getShareQuantityFormat().format(orderRequest.getQuantity()), displaySymbol, gfdExpirationTimeString2, FuturesProduct5.formatNullable$default(futuresOrderFormDataState.getProduct(), orderRequest.getStopPrice(), null, 2, null));
        }
        if (i14 == 2) {
            int i16 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getSide().ordinal()];
            if (i16 == 1) {
                i6 = C17462R.plurals.futures_order_form_summary_stop_buy_gtc;
            } else {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = C17462R.plurals.futures_order_form_summary_stop_sell_gtc;
            }
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(i6, intRounded), Formats.getShareQuantityFormat().format(orderRequest.getQuantity()), displaySymbol, FuturesProduct5.formatNullable$default(futuresOrderFormDataState.getProduct(), orderRequest.getStopPrice(), null, 2, null));
        }
        if (i14 != 3) {
            if (i14 == 4 || i14 == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i17 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getSide().ordinal()];
        if (i17 == 1) {
            i7 = C17462R.plurals.futures_order_form_summary_stop_buy_ioc;
        } else {
            if (i17 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i7 = C17462R.plurals.futures_order_form_summary_stop_sell_ioc;
        }
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(i7, intRounded), Formats.getShareQuantityFormat().format(orderRequest.getQuantity()), displaySymbol, FuturesProduct5.formatNullable$default(futuresOrderFormDataState.getProduct(), orderRequest.getStopPrice(), null, 2, null));
    }

    public static final StringResource getGfdExpirationTimeString(FuturesTradingHours.Session session) {
        if (session == null) {
            return null;
        }
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jUntil = localDateNow.until(Instants.toLocalDate$default(session.getEndTime(), null, 1, null), ChronoUnit.DAYS);
        if (jUntil == 0) {
            return StringResource.INSTANCE.invoke(C17462R.string.futures_order_summary_gfd_expiration_today, InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(session.getEndTime()));
        }
        if (jUntil == 1) {
            return StringResource.INSTANCE.invoke(C17462R.string.futures_order_summary_gfd_expiration_tomorrow, InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(session.getEndTime()));
        }
        return StringResource.INSTANCE.invoke(C17462R.string.futures_order_summary_gfd_expiration_future, InstantFormatter.DATE_NO_YEAR_IN_SYSTEM_ZONE.format(session.getEndTime()), InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(session.getEndTime()));
    }

    public static final StringResource getQuoteSummaryString(FuturesOrderFormDataState futuresOrderFormDataState) {
        Intrinsics.checkNotNullParameter(futuresOrderFormDataState, "<this>");
        if (futuresOrderFormDataState.getProduct() == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C17462R.string.futures_order_summary_prices;
        String withDefault$default = FuturesProduct5.formatWithDefault$default(futuresOrderFormDataState.getProduct(), futuresOrderFormDataState.getQuote().getBidPrice(), null, null, 6, null);
        String withDefault$default2 = FuturesProduct5.formatWithDefault$default(futuresOrderFormDataState.getProduct(), futuresOrderFormDataState.getQuote().getAskPrice(), null, null, 6, null);
        String withDefault$default3 = FuturesProduct5.formatWithDefault$default(futuresOrderFormDataState.getProduct(), futuresOrderFormDataState.getQuote().getLastTradePrice(), null, null, 6, null);
        Instant receivedAt = futuresOrderFormDataState.getQuote().getReceivedAt();
        return companion.invoke(i, withDefault$default, withDefault$default2, withDefault$default3, receivedAt != null ? InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format(receivedAt) : null);
    }
}
