package com.robinhood.android.trade.equity.util;

import android.content.res.Resources;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equityadvancedorder.utils.MarketHours3;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: OrderRequests.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\b\u001a\u0019\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderContext;", "Lcom/robinhood/utils/resource/StringResource;", "getSideString", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;)Lcom/robinhood/utils/resource/StringResource;", "Landroid/content/res/Resources;", "res", "", "getCreateOrderTitleString", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;Landroid/content/res/Resources;)Ljava/lang/String;", "Lcom/robinhood/models/db/Order$Configuration;", "getTitleString", "(Lcom/robinhood/models/db/Order$Configuration;)Lcom/robinhood/utils/resource/StringResource;", "", "isDollar", "getActionOrderTypeString", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;Z)Lcom/robinhood/utils/resource/StringResource;", "getActionOrderLabelString", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "getTimeInForceStringResource", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;Lcom/robinhood/models/db/MarketHours;)Lcom/robinhood/utils/resource/StringResource;", "j$/time/Instant", "getExpiresTime", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;Lcom/robinhood/models/db/MarketHours;)Lj$/time/Instant;", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.OrderRequestsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderRequests {

    /* compiled from: OrderRequests.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.util.OrderRequestsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[OrderPositionEffect.values().length];
            try {
                iArr[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Order.Configuration.values().length];
            try {
                iArr3[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Order.Configuration.LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderMarketHours.values().length];
            try {
                iArr4[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[OrderMarketHours.REGULAR_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[OrderTimeInForce.values().length];
            try {
                iArr5[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[OrderTimeInForce.FOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[OrderTimeInForce.IOC.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[OrderTimeInForce.OPG.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[OrderTimeInForce.GFW.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[OrderTimeInForce.GFM.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final StringResource getSideString(EquityOrderContext equityOrderContext) {
        int i;
        Intrinsics.checkNotNullParameter(equityOrderContext, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[equityOrderContext.getSide().ordinal()];
        if (i2 == 1) {
            OrderPositionEffect positionEffect = equityOrderContext.getPositionEffect();
            int i3 = positionEffect == null ? -1 : WhenMappings.$EnumSwitchMapping$0[positionEffect.ordinal()];
            if (i3 == -1 || i3 == 1) {
                i = C32428R.string.general_label_buy;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C29365R.string.side_label_buy_to_close;
            }
        } else if (i2 == 2) {
            i = C32428R.string.general_label_sell;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C29365R.string.side_label_short;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final String getCreateOrderTitleString(EquityOrderContext equityOrderContext, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(equityOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(C29365R.string.order_create_title, getSideString(equityOrderContext).getText(res), equityOrderContext.getSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final StringResource getTitleString(Order.Configuration configuration) {
        int i;
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$2[configuration.ordinal()]) {
            case 1:
                i = C29312R.string.order_type_market_title;
                break;
            case 2:
            case 3:
                i = C29312R.string.order_type_limit_title;
                break;
            case 4:
                i = C29312R.string.order_type_stop_title;
                break;
            case 5:
                i = C29312R.string.order_type_stop_limit_title;
                break;
            case 6:
                i = C29312R.string.order_type_trailing_stop_title;
                break;
            default:
                Preconditions.INSTANCE.failUnknownEnumKotlin(configuration);
                throw new ExceptionsH();
        }
        return companion.invoke(i, new Object[0]);
    }

    public static /* synthetic */ StringResource getActionOrderTypeString$default(EquityOrderContext equityOrderContext, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getActionOrderTypeString(equityOrderContext, z);
    }

    public static final StringResource getActionOrderTypeString(EquityOrderContext equityOrderContext, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(equityOrderContext, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$2[equityOrderContext.getConfiguration().ordinal()]) {
            case 1:
            case 2:
                if (equityOrderContext.isDollarBasedAmount() || z) {
                    i = C29365R.string.order_type_dollar_based_title;
                    break;
                } else {
                    i = C29365R.string.order_type_share_based_title;
                    break;
                }
            case 3:
                i = C29312R.string.order_type_limit_title;
                break;
            case 4:
                i = C29312R.string.order_type_stop_title;
                break;
            case 5:
                i = C29312R.string.order_type_stop_limit_title;
                break;
            case 6:
                i = C29312R.string.order_type_trailing_stop_title;
                break;
            default:
                Preconditions.INSTANCE.failUnknownEnumKotlin(equityOrderContext.getConfiguration());
                throw new ExceptionsH();
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final String getActionOrderLabelString(EquityOrderContext equityOrderContext, Resources res) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(equityOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        int i = WhenMappings.$EnumSwitchMapping$2[equityOrderContext.getConfiguration().ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(C29312R.string.order_type_market_title);
        } else {
            numValueOf = (i == 2 || i == 3) ? Integer.valueOf(C29312R.string.order_type_limit_title) : null;
        }
        if (numValueOf != null) {
            return res.getString(numValueOf.intValue());
        }
        return null;
    }

    public static final StringResource getTimeInForceStringResource(EquityOrderContext equityOrderContext, MarketHours marketHours) {
        String extendedHoursCloseTimeString;
        Intrinsics.checkNotNullParameter(equityOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        Instant expiresTime = getExpiresTime(equityOrderContext, marketHours);
        switch (WhenMappings.$EnumSwitchMapping$4[equityOrderContext.getTimeInForce().ordinal()]) {
            case 1:
                LocalDate localDate$default = Instants.toLocalDate$default(expiresTime, null, 1, null);
                String str = InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(expiresTime);
                LocalDate localDateNow = LocalDate.now();
                LocalDate localDatePlusDays = localDateNow.plusDays(1L);
                if (equityOrderContext.getSide() == EquityOrderSide.SELL_SHORT) {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    int i = C29365R.string.order_create_gfd_expiration_suffix_today;
                    int i2 = WhenMappings.$EnumSwitchMapping$3[equityOrderContext.getMarketHours().ordinal()];
                    if (i2 == 1) {
                        extendedHoursCloseTimeString = MarketHours3.getExtendedHoursCloseTimeString(marketHours);
                    } else {
                        if (i2 != 2) {
                            if (i2 == 3 || i2 == 4 || i2 == 5) {
                                throw new IllegalStateException("Unsupported trading session");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        extendedHoursCloseTimeString = MarketHours3.getRegularHoursCloseTimeString(marketHours);
                    }
                    return companion.invoke(i, extendedHoursCloseTimeString);
                }
                if (Intrinsics.areEqual(localDate$default, localDateNow)) {
                    return StringResource.INSTANCE.invoke(C29365R.string.order_create_gfd_expiration_suffix_today, str);
                }
                if (Intrinsics.areEqual(localDate$default, localDatePlusDays)) {
                    return StringResource.INSTANCE.invoke(C29365R.string.order_create_gfd_expiration_suffix_tomorrow, str);
                }
                return StringResource.INSTANCE.invoke(C29365R.string.order_create_gfd_expiration_fallback, InstantFormatter.WEEKDAY_DATETIME_IN_SYSTEM_ZONE_REVERSED.format(expiresTime));
            case 2:
                return StringResource.INSTANCE.invoke(C29365R.string.order_create_gtc_expiration, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C32428R.string.order_time_in_force_fok, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C32428R.string.order_time_in_force_ioc, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C32428R.string.order_time_in_force_opg, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke(C32428R.string.order_time_in_force_gfw, new Object[0]);
            case 7:
                return StringResource.INSTANCE.invoke(C32428R.string.order_time_in_force_gfm, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Instant getExpiresTime(EquityOrderContext equityOrderContext, MarketHours marketHours) {
        Intrinsics.checkNotNullParameter(equityOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        if (Intrinsics.areEqual(equityOrderContext.isExtendedHours(), Boolean.TRUE) || equityOrderContext.getMarketHours() == OrderMarketHours.EXTENDED_HOURS) {
            return marketHours.getExtendedClosesAt();
        }
        if (Intrinsics.areEqual(equityOrderContext.isExtendedHours(), Boolean.FALSE) || equityOrderContext.getMarketHours() == OrderMarketHours.REGULAR_HOURS) {
            return marketHours.getRegularClosesAt();
        }
        if (equityOrderContext.getMarketHours() == OrderMarketHours.ALL_DAY_HOURS) {
            Instant allDayHoursClosesAt = marketHours.getAllDayHoursClosesAt();
            return allDayHoursClosesAt == null ? marketHours.getRegularClosesAt() : allDayHoursClosesAt;
        }
        return marketHours.getRegularClosesAt();
    }
}
