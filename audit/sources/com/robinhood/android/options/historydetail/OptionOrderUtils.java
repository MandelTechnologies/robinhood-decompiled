package com.robinhood.android.options.historydetail;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrderUtils.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0005J&\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!J.\u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/historydetail/UiOptionOrderUtils;", "", "<init>", "()V", "getOrderTypeString", "", "resources", "Landroid/content/res/Resources;", "type", "Lcom/robinhood/models/db/OrderType;", "getTimeInForceString", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "getPositionEffectString", "effect", "Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;", "getOrderPriceString", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "getOrderStateStringRes", "state", "Lcom/robinhood/shared/models/history/shared/OrderState;", "getEquityOrderLegRowTitleString", "symbol", "getEquityOrderLegRowSubtitleString", "side", "Lcom/robinhood/models/db/OrderSide;", "ratioQuantity", "", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "getEquityOptionOrderLegRowTitleString", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "getEquityOptionOrderLegRowSubtitleResource", "lib-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.historydetail.UiOptionOrderUtils, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOrderUtils {
    public static final OptionOrderUtils INSTANCE = new OptionOrderUtils();

    /* compiled from: OptionOrderUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.historydetail.UiOptionOrderUtils$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[OrderType.values().length];
            try {
                iArr[OrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderTimeInForce.values().length];
            try {
                iArr2[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderTimeInForce.FOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderTimeInForce.IOC.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderTimeInForce.OPG.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderTimeInForce.GFW.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderTimeInForce.GFM.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[UiOptionStrategyDisplay.OptionOrderPositionEffect.values().length];
            try {
                iArr3[UiOptionStrategyDisplay.OptionOrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[UiOptionStrategyDisplay.OptionOrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[UiOptionStrategyDisplay.OptionOrderPositionEffect.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderState.values().length];
            try {
                iArr4[OrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[OrderState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OrderState.UNCONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[OrderState.CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[OrderState.PARTIALLY_FILLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[OrderState.PENDING_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[OrderState.FILLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[OrderState.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[OrderState.FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[OrderState.VOIDED.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[OrderState.CANCELED.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[OrderState.TRIGGERED.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[OrderState.NOT_ACCEPTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[OrderSide.values().length];
            try {
                iArr5[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[OrderPositionEffect.values().length];
            try {
                iArr6[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[OptionContractType.values().length];
            try {
                iArr7[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    private OptionOrderUtils() {
    }

    public final String getOrderTypeString(Resources resources, OrderType type2) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type2, "type");
        int i2 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i2 == 1) {
            i = C23150R.string.combo_order_detail_market_order;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23150R.string.combo_order_detail_limit_order;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final String getTimeInForceString(Resources resources, OrderTimeInForce timeInForce) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        switch (WhenMappings.$EnumSwitchMapping$1[timeInForce.ordinal()]) {
            case 1:
                i = C23150R.string.option_time_in_force_gfd;
                break;
            case 2:
                i = C23150R.string.option_time_in_force_gtc;
                break;
            case 3:
                i = C23150R.string.option_time_in_force_fok;
                break;
            case 4:
                i = C23150R.string.option_time_in_force_ioc;
                break;
            case 5:
                i = C23150R.string.option_time_in_force_opg;
                break;
            case 6:
                i = C23150R.string.option_time_in_force_gfw;
                break;
            case 7:
                i = C23150R.string.option_time_in_force_gfm;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final String getPositionEffectString(Resources resources, UiOptionStrategyDisplay.OptionOrderPositionEffect effect) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(effect, "effect");
        int i = WhenMappings.$EnumSwitchMapping$2[effect.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C23386R.string.option_effect_open);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (i == 2) {
            String string3 = resources.getString(C23386R.string.option_effect_close);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = resources.getString(C11048R.string.general_label_n_a_short);
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    public final String getOrderPriceString(Resources resources, OrderType type2, BigDecimal price) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type2, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C32428R.string.order_market_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (price == null) {
            String string3 = resources.getString(C32428R.string.order_limit_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        return Formats.getCurrencyFormat().format(price);
    }

    public final String getOrderStateStringRes(Resources resources, OrderState state) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(state, "state");
        switch (WhenMappings.$EnumSwitchMapping$3[state.ordinal()]) {
            case 1:
                i = C32428R.string.order_state_queued;
                break;
            case 2:
            case 3:
                i = C32428R.string.order_state_pending;
                break;
            case 4:
                i = C32428R.string.order_state_placed;
                break;
            case 5:
            case 6:
                i = C32428R.string.order_state_partially_filled;
                break;
            case 7:
                i = C32428R.string.order_state_pending_cancel;
                break;
            case 8:
                i = C32428R.string.order_state_filled;
                break;
            case 9:
            case 10:
            case 11:
                i = C32428R.string.order_state_rejected;
                break;
            case 12:
                i = C32428R.string.order_state_canceled;
                break;
            case 13:
                i = C32428R.string.order_state_triggered;
                break;
            case 14:
                throw new IllegalStateException("Unsupported order state");
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(C23150R.string.option_order_state_label, string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public final String getEquityOrderLegRowTitleString(Resources resources, String symbol) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        String string2 = resources.getString(C23150R.string.option_order_combo_order_equity_leg_title, symbol);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final String getEquityOrderLegRowSubtitleString(Resources resources, OrderSide side, int ratioQuantity, OrderPositionEffect positionEffect) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i3 = WhenMappings.$EnumSwitchMapping$4[side.ordinal()];
        if (i3 == 1) {
            i = C23150R.plurals.option_order_leg_side_buy;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23150R.plurals.option_order_leg_side_sell;
        }
        StringResource stringResourceInvoke = companion.invoke(new StringResource.PluralsResource(i, ratioQuantity), new Object[0]);
        int i4 = WhenMappings.$EnumSwitchMapping$5[positionEffect.ordinal()];
        if (i4 == 1) {
            i2 = C23150R.string.option_order_leg_effect_open;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C23150R.string.option_order_leg_effect_close;
        }
        return companion.invoke(C23150R.string.option_order_leg_subtitle, Integer.valueOf(ratioQuantity), stringResourceInvoke, companion.invoke(i2, new Object[0])).getText(resources).toString();
    }

    public final String getEquityOptionOrderLegRowTitleString(Resources resources, OptionInstrument optionInstrument) {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        int i2 = WhenMappings.$EnumSwitchMapping$6[optionInstrument.getContractType().ordinal()];
        if (i2 == 1) {
            i = C11048R.string.option_contract_type_call;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11048R.string.option_contract_type_put;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return companion.invoke(C23150R.string.option_order_combo_order_equity_option_leg_title, optionInstrument.getChainSymbol(), Formats.getStrikePriceFormat().format(optionInstrument.getStrikePrice()), companion.invoke(i, new Object[0])).getText(resources).toString();
    }

    public final String getEquityOptionOrderLegRowSubtitleResource(Resources resources, OptionInstrument optionInstrument, OrderSide side, int ratioQuantity, OrderPositionEffect positionEffect) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i3 = WhenMappings.$EnumSwitchMapping$4[side.ordinal()];
        if (i3 == 1) {
            i = C23150R.plurals.option_order_leg_side_buy;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23150R.plurals.option_order_leg_side_sell;
        }
        StringResource stringResourceInvoke = companion.invoke(new StringResource.PluralsResource(i, ratioQuantity), new Object[0]);
        int i4 = WhenMappings.$EnumSwitchMapping$5[positionEffect.ordinal()];
        if (i4 == 1) {
            i2 = C23150R.string.option_order_leg_effect_open;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C23150R.string.option_order_leg_effect_close;
        }
        StringResource stringResourceInvoke2 = companion.invoke(i2, new Object[0]);
        return companion.invoke(C23150R.string.option_order_combo_order_equity_option_leg_subtitle, OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate()), Integer.valueOf(ratioQuantity), stringResourceInvoke, stringResourceInvoke2).getText(resources).toString();
    }
}
