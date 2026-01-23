package com.robinhood.android.equityadvancedorder.datastate;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.tradesettings.utils.StringsKt;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.ILimit;
import com.robinhood.android.equityadvancedorder.datastate.ITaxLots;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder2;
import com.robinhood.android.trading.contracts.configuration.DirectOrder4;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.prefs.StringPreference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;

/* compiled from: InitialDataStateHelper.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/InitialDataStateHelper;", "", "Lcom/robinhood/prefs/StringPreference;", "defaultTimeInForcePref", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/prefs/StringPreference;Lj$/time/Clock;)V", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;", "args", "Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "initialEditMode", "Lcom/robinhood/android/equityadvancedorder/datastate/IMarket;", "marketOrder", "(Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;Lcom/robinhood/android/trading/contracts/configuration/EditMode;Lj$/time/Clock;)Lcom/robinhood/android/equityadvancedorder/datastate/IMarket;", "", "isKeyboardVisible", "Lcom/robinhood/android/equityadvancedorder/datastate/MarketStandard;", "marketStandard", "(Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;Lcom/robinhood/android/trading/contracts/configuration/EditMode;ZLj$/time/Clock;)Lcom/robinhood/android/equityadvancedorder/datastate/MarketStandard;", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit;", "limitOrder", "(Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;Lcom/robinhood/android/trading/contracts/configuration/EditMode;Lj$/time/Clock;)Lcom/robinhood/android/equityadvancedorder/datastate/ILimit;", "Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "limitStandard", "(Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;Lcom/robinhood/android/trading/contracts/configuration/EditMode;Lj$/time/Clock;)Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;)Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "Lcom/robinhood/prefs/StringPreference;", "Lj$/time/Clock;", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InitialDataStateHelper {
    public static final int $stable = 8;
    private final Clock clock;
    private final StringPreference defaultTimeInForcePref;

    /* compiled from: InitialDataStateHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InitialDataStateHelper(StringPreference defaultTimeInForcePref, Clock clock) {
        Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.defaultTimeInForcePref = defaultTimeInForcePref;
        this.clock = clock;
    }

    public final EquityAdvancedOrderDataState create(EquityAdvancedOrderFragment.Args args) {
        EquityOrderConfiguration2 equityOrderConfiguration2;
        Intrinsics.checkNotNullParameter(args, "args");
        if ((args.getConfiguration() instanceof AdvancedOrder.Draft) || (args.getConfiguration() instanceof DirectOrder4) || args.getConfiguration().getTaxLots()) {
            equityOrderConfiguration2 = EquityOrderConfiguration2.DETAIL;
        } else {
            equityOrderConfiguration2 = EquityOrderConfiguration2.SIMPLE;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[args.getConfiguration().getOrderConfiguration().ordinal()]) {
            case 1:
                return marketOrder(args, equityOrderConfiguration2, this.clock);
            case 2:
                return limitOrder(args, equityOrderConfiguration2, this.clock);
            case 3:
            case 4:
            case 5:
            case 6:
                throw new IllegalStateException(("Unsupported configuration: " + args.getConfiguration().getOrderConfiguration()).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final IMarket marketOrder(EquityAdvancedOrderFragment.Args args, EquityOrderConfiguration2 initialEditMode, Clock clock) {
        if (args.getConfiguration().getTaxLots()) {
            if (args.getSide() != EquityOrderSide.SELL) {
                throw new IllegalStateException("Tax lots are only supported for sell orders");
            }
            return new MarketTaxLots(marketStandard(args, initialEditMode, false, clock), new ITaxLots.TaxLotsState(null, args.getRefId(), false, null, false, null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null));
        }
        return marketStandard(args, initialEditMode, !(args.getConfiguration() instanceof AdvancedOrder.Draft), clock);
    }

    private final MarketStandard marketStandard(EquityAdvancedOrderFragment.Args args, EquityOrderConfiguration2 initialEditMode, boolean isKeyboardVisible, Clock clock) {
        return new MarketStandard(new EquityAdvancedOrderDataState.CommonState(null, args.getConfiguration().getAccountNumber(), null, initialEditMode, isKeyboardVisible, ((args.getConfiguration() instanceof AdvancedOrder.Draft) || args.getConfiguration().getTaxLots()) ? null : EditingField.NUMBER_OF_WHOLE_SHARES, InitialDataStateHelper2.toSharesQuantityText(args.getConfiguration().getShareQuantity()), null, null, args.getSide(), null, false, false, null, null, null, null, null, null, false, false, null, args.getFlowSource(), null, null, null, false, args.getOrderToReplaceId(), null, false, false, null, args.getRefId(), false, null, false, null, clock, null, false, null, -138412667, 478, null));
    }

    private final ILimit limitOrder(EquityAdvancedOrderFragment.Args args, EquityOrderConfiguration2 initialEditMode, Clock clock) {
        LimitStandard limitStandard = limitStandard(args, initialEditMode, clock);
        if (!args.getConfiguration().getTaxLots()) {
            return limitStandard;
        }
        if (args.getSide() != EquityOrderSide.SELL) {
            throw new IllegalStateException("Tax lots are only supported for sell orders");
        }
        return new LimitTaxLots(limitStandard, new ITaxLots.TaxLotsState(null, args.getRefId(), false, null, false, null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null));
    }

    private final LimitStandard limitStandard(EquityAdvancedOrderFragment.Args args, EquityOrderConfiguration2 initialEditMode, Clock clock) {
        EditingField editingField;
        OrderMarketHours marketHours;
        EditingField editingField2;
        String accountNumber = args.getConfiguration().getAccountNumber();
        String sharesQuantityText = InitialDataStateHelper2.toSharesQuantityText(args.getConfiguration().getShareQuantity());
        EquityOrderSide side = args.getSide();
        EquityOrderConfiguration2 equityOrderConfiguration2 = EquityOrderConfiguration2.SIMPLE;
        boolean z = initialEditMode == equityOrderConfiguration2;
        if (initialEditMode == equityOrderConfiguration2) {
            if (args.getOrderToReplaceId() != null) {
                editingField2 = EditingField.LIMIT_PRICE;
            } else {
                editingField2 = EditingField.NUMBER_OF_WHOLE_SHARES;
            }
            editingField = editingField2;
        } else {
            editingField = null;
        }
        EquityAdvancedOrderDataState.CommonState commonState = new EquityAdvancedOrderDataState.CommonState(null, accountNumber, null, initialEditMode, z, editingField, sharesQuantityText, null, null, side, null, false, false, null, null, null, null, null, null, false, false, null, args.getFlowSource(), null, null, null, false, args.getOrderToReplaceId(), null, false, false, null, args.getRefId(), false, null, false, null, clock, null, false, null, -138412667, 478, null);
        AdvancedOrder configuration = args.getConfiguration();
        DirectOrder2 directOrder2 = configuration instanceof DirectOrder2 ? (DirectOrder2) configuration : null;
        String sharesQuantityText2 = InitialDataStateHelper2.toSharesQuantityText(directOrder2 != null ? directOrder2.getLimitPrice() : null);
        AdvancedOrder configuration2 = args.getConfiguration();
        DirectOrder2 directOrder22 = configuration2 instanceof DirectOrder2 ? (DirectOrder2) configuration2 : null;
        if (directOrder22 == null || (marketHours = directOrder22.getMarketHours()) == null) {
            marketHours = OrderMarketHours.REGULAR_HOURS;
        }
        OrderMarketHours orderMarketHours = marketHours;
        OrderTimeInForce timeInForce = args.getConfiguration().getTimeInForce();
        if (timeInForce == null) {
            timeInForce = OrderTimeInForce.INSTANCE.fromServerValue(StringsKt.blankToNull(this.defaultTimeInForcePref.get()));
            if (args.getOrderToReplaceId() != null) {
                timeInForce = null;
            }
            if (timeInForce == null) {
                timeInForce = OrderTimeInForce.GFD;
            }
        }
        OrderTimeInForce orderTimeInForce = timeInForce;
        AdvancedOrder configuration3 = args.getConfiguration();
        DirectOrder2 directOrder23 = configuration3 instanceof DirectOrder2 ? (DirectOrder2) configuration3 : null;
        return new LimitStandard(commonState, new ILimit.LimitState(sharesQuantityText2, orderTimeInForce, orderMarketHours, null, null, null, false, false, null, (directOrder23 != null ? directOrder23.getLimitPrice() : null) == null, 504, null));
    }
}
