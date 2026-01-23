package com.robinhood.android.equityadvancedorder.datastate;

import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0001\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0001\u001a\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\"\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, m3636d2 = {"mutateCommon", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "mutator", "Lkotlin/Function1;", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "Lkotlin/ExtensionFunctionType;", "orderTypeSelectionRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection;", "getOrderTypeSelectionRow", "(Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;)Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection;", "onSwitchToMarket", "", "onSwitchToLimit", "getSideString", "Lcom/robinhood/utils/resource/StringResource;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "SHARE_QUANTITY_FIELD_ID", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderDataState2 {
    public static final String SHARE_QUANTITY_FIELD_ID = "share_quantity";

    /* compiled from: EquityAdvancedOrderDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EquityAdvancedOrderDataState mutateCommon(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Function1<? super EquityAdvancedOrderDataState.CommonState, EquityAdvancedOrderDataState.CommonState> mutator) {
        Intrinsics.checkNotNullParameter(equityAdvancedOrderDataState, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (equityAdvancedOrderDataState instanceof MarketStandard) {
            MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
            return marketStandard.copy(mutator.invoke(marketStandard.getCommonState()));
        }
        if (equityAdvancedOrderDataState instanceof LimitStandard) {
            LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
            return LimitStandard.copy$default(limitStandard, mutator.invoke(limitStandard.getCommonState()), null, 2, null);
        }
        if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
            MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
            return MarketTaxLots.copy$default(marketTaxLots, marketTaxLots.getMarketStandard().copy(mutator.invoke(marketTaxLots.getCommonState())), null, 2, null);
        }
        if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
            throw new NoWhenBranchMatchedException();
        }
        LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
        return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), mutator.invoke(limitTaxLots.getCommonState()), null, 2, null), null, 2, null);
    }

    public static final EquityOrderFormRowState.FloatingSelection getOrderTypeSelectionRow(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
        int i;
        Intrinsics.checkNotNullParameter(equityAdvancedOrderDataState, "<this>");
        if (equityAdvancedOrderDataState.isCancelNewOrder()) {
            return null;
        }
        EditingField editingField = EditingField.ORDER_TYPE;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C15237R.string.order_create_type, new Object[0]);
        boolean z = equityAdvancedOrderDataState instanceof IMarket;
        if (z) {
            i = C29312R.string.order_type_market_title_options;
        } else {
            if (!(equityAdvancedOrderDataState instanceof ILimit)) {
                throw new NoWhenBranchMatchedException();
            }
            i = C29312R.string.order_type_limit_title_options;
        }
        StringResource stringResourceInvoke2 = companion.invoke(i, new Object[0]);
        return new EquityOrderFormRowState.FloatingSelection(EquityOrderFormRowState2.OrderTypeSelectRowTestTag, stringResourceInvoke, true, editingField, equityAdvancedOrderDataState.getCommonState().getOrderFormState(), stringResourceInvoke2, CollectionsKt.listOf((Object[]) new EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable[]{new EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable(companion.invoke(C29312R.string.order_type_market_title_options, new Object[0]), z, new EquityAdvancedOrderDataState3(equityAdvancedOrderDataState)), new EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable(companion.invoke(C29312R.string.order_type_limit_title_options, new Object[0]), equityAdvancedOrderDataState instanceof ILimit, new EquityAdvancedOrderDataState4(equityAdvancedOrderDataState))}));
    }

    public static final void onSwitchToMarket(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
        Intrinsics.checkNotNullParameter(equityAdvancedOrderDataState, "<this>");
        equityAdvancedOrderDataState.getCommonState().getOnSwitchOrderConfiguration().invoke(Order.Configuration.MARKET);
    }

    public static final void onSwitchToLimit(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
        Intrinsics.checkNotNullParameter(equityAdvancedOrderDataState, "<this>");
        equityAdvancedOrderDataState.getCommonState().getOnSwitchOrderConfiguration().invoke(Order.Configuration.LIMIT);
    }

    public static final StringResource getSideString(EquityOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C32428R.string.general_label_buy, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C32428R.string.general_label_sell, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C15237R.string.order_create_sell_short, new Object[0]);
    }
}
