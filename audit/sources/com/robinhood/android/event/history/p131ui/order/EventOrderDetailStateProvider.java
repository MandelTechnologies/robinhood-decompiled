package com.robinhood.android.event.history.p131ui.order;

import com.robinhood.android.event.history.C16405R;
import com.robinhood.android.event.history.p131ui.order.utils.OrderStrings;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.models.event.p186db.order.EventOrder;
import com.robinhood.android.models.event.p186db.order.EventOrder4;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.common.strings.C32428R;
import com.robinhood.common.strings.OrderStates;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Some;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: EventOrderDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0002H\u0002¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/order/EventOrderDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState;", "<init>", "()V", "reduce", "dataState", "getOrderSubtitle", "Lcom/robinhood/utils/resource/StringResource;", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventOrderDetailStateProvider implements StateProvider<EventOrderDetailDataState, EventOrderDetailViewState> {
    public static final int $stable = 0;
    public static final EventOrderDetailStateProvider INSTANCE = new EventOrderDetailStateProvider();

    /* compiled from: EventOrderDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ExchangeSource.values().length];
            try {
                iArr[ExchangeSource.FORECAST_EX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExchangeSource.KALSHI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExchangeSource.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventOrderSide.values().length];
            try {
                iArr2[EventOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EventOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EventOrder4.values().length];
            try {
                iArr3[EventOrder4.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EventOrder4.CLOSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EventOrder4.POSITION_EFFECT_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[FuturesTimeInForce.values().length];
            try {
                iArr4[FuturesTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[FuturesTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[FuturesTimeInForce.IOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[FuturesTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[FuturesTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private EventOrderDetailStateProvider() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [com.robinhood.utils.resource.StringResource] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EventOrderDetailViewState reduce(EventOrderDetailDataState dataState) {
        boolean zHasExecutions;
        boolean z;
        ArrayList arrayList;
        StringResource stringResourceInvoke;
        boolean z2;
        StringResource stringResource;
        StringResource stringResourceInvoke2;
        StringResource stringResource2;
        String str;
        boolean z3;
        StringResource stringResource3;
        StringResource stringResource4;
        ExchangeSource exchangeSource;
        StringResource stringResourceInvoke3;
        StringResource stringResource5;
        ?? r17;
        Object obj;
        StringResource stringResourceInvoke4;
        StringResource stringResource6;
        StringResource stringResourceInvoke5;
        StringResource stringResource7;
        StringResource stringResourceInvoke6;
        StringResource stringResource8;
        StringResource stringResource9;
        StringResource stringResourceInvoke7;
        StringResource stringResource10;
        StringResource stringResource11;
        boolean z4;
        StringResource stringResource12;
        StringResource stringResource13;
        StringResource stringResourceInvoke8;
        EventContract contract;
        ExchangeSource exchangeSource2;
        EventContract contract2;
        ExchangeSource exchangeSource3;
        BigDecimal bigDecimalSignedAdjustmentAmount;
        BigDecimal bigDecimalAdd;
        StringResource stringResourceInvoke9;
        ContractDisplayDetails orNull;
        List<ContractDisplayDetails> selectedLegsDetails;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiEventOrder eventOrder = dataState.getEventOrder();
        if (eventOrder == null) {
            return EventOrderDetailViewState.INSTANCE.getEmpty();
        }
        EventOrder order = eventOrder.getOrder();
        OrderState commonState = order.getOrderState().toCommonState();
        boolean zIsCancellable = commonState.isCancellable();
        EventOrderSide side = eventOrder.getSide();
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i = iArr[side.ordinal()];
        if (i == 1) {
            zHasExecutions = false;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            EventContract contract3 = dataState.getContract();
            ExchangeSource exchangeSource4 = contract3 != null ? contract3.getExchangeSource() : null;
            int i2 = exchangeSource4 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[exchangeSource4.ordinal()];
            if (i2 != -1) {
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zHasExecutions = false;
                } else {
                    zHasExecutions = commonState.hasExecutions();
                }
            }
        }
        int i3 = WhenMappings.$EnumSwitchMapping$2[eventOrder.getOrder().getPositionEffect().ordinal()];
        if (i3 == 1) {
            z = true;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i4 = iArr[eventOrder.getSide().ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z = true;
            }
            z = false;
        }
        StringResource stringResourceInvoke10 = StringResource.INSTANCE.invoke(OrderStrings.eventOrderTypeName(order.getOrderConfiguration(), eventOrder.getSide(), eventOrder.getOrder().getPositionEffect()), new Object[0]);
        StringResource orderSubtitle = getOrderSubtitle(dataState);
        Optional<ContractDisplayDetails> displayDetail = dataState.getDisplayDetail();
        if (displayDetail == null || (orNull = displayDetail.getOrNull()) == null || (selectedLegsDetails = orNull.getSelectedLegsDetails()) == null) {
            arrayList = null;
        } else {
            List<ContractDisplayDetails> list = selectedLegsDetails;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ContractDisplayDetails) it.next()).getYesNoAndContractName());
            }
        }
        ImmutableList3 persistentListOrEmpty = com.robinhood.android.util.extensions.CollectionsKt.toPersistentListOrEmpty(arrayList);
        EventContract contract4 = dataState.getContract();
        String description = contract4 != null ? contract4.getDescription() : null;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke11 = companion.invoke(OrderStates.getLabelResId(commonState), new Object[0]);
        int i5 = WhenMappings.$EnumSwitchMapping$3[order.getTimeInForce().ordinal()];
        if (i5 == 1) {
            stringResourceInvoke = companion.invoke(C32428R.string.order_time_in_force_gfd, new Object[0]);
        } else if (i5 == 2) {
            stringResourceInvoke = companion.invoke(C32428R.string.order_time_in_force_gtc, new Object[0]);
        } else if (i5 == 3) {
            stringResourceInvoke = companion.invoke(C32428R.string.order_time_in_force_ioc, new Object[0]);
        } else if (i5 != 4) {
            if (i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = companion.invoke(C32428R.string.order_time_in_force_fok, new Object[0]);
        } else if (commonState.isFinal()) {
            stringResourceInvoke = companion.invoke(C32428R.string.order_time_in_force_gtd, new Object[0]);
        } else {
            stringResourceInvoke = dataState.getGtdTimeInForce();
        }
        LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM;
        StringResource stringResourceInvoke12 = companion.invoke(localDateFormatter.format(Instants.toLocalDate$default(order.getCreatedAt(), null, 1, null)));
        BigDecimal bigDecimalDisplayPrice = eventOrder.displayPrice();
        if (bigDecimalDisplayPrice != null) {
            z2 = z;
            stringResource = stringResourceInvoke10;
            stringResourceInvoke2 = companion.invoke(Formats.getPriceFormat().format(bigDecimalDisplayPrice));
        } else {
            z2 = z;
            stringResource = stringResourceInvoke10;
            stringResourceInvoke2 = null;
        }
        int i6 = WhenMappings.$EnumSwitchMapping$1[eventOrder.getSide().ordinal()];
        if (i6 == 1) {
            stringResource2 = stringResourceInvoke;
            str = description;
            z3 = false;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            EventContract contract5 = dataState.getContract();
            ExchangeSource exchangeSource5 = contract5 != null ? contract5.getExchangeSource() : null;
            int i7 = exchangeSource5 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[exchangeSource5.ordinal()];
            if (i7 != -1) {
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResource2 = stringResourceInvoke;
                    str = description;
                    z3 = false;
                } else {
                    stringResource2 = stringResourceInvoke;
                    str = description;
                    z3 = true;
                }
            }
        }
        Money enteredNotionalAmount = order.getEnteredNotionalAmount();
        boolean z5 = z3;
        boolean z6 = zHasExecutions;
        StringResource stringResourceInvoke13 = companion.invoke(C16405R.string.filled_quantity_format, Formats.getIntegerFormat().format(order.getFilledQuantity()), Formats.getIntegerFormat().format(order.getQuantity()));
        if (commonState.hasExecutions()) {
            stringResource3 = stringResourceInvoke13;
            exchangeSource = null;
            stringResource4 = stringResource;
            stringResourceInvoke3 = companion.invoke(C16405R.string.filled_time, localDateFormatter.format(Instants.toLocalDate$default(order.getUpdatedAt(), null, 1, null)), LocalTimeFormatter.SHORT.format(Instants.toLocalTime$default(order.getUpdatedAt(), null, 1, null)));
        } else {
            stringResource3 = stringResourceInvoke13;
            stringResource4 = stringResource;
            exchangeSource = null;
            stringResourceInvoke3 = null;
        }
        EventContract contract6 = dataState.getContract();
        ExchangeSource exchangeSource6 = contract6 != null ? contract6.getExchangeSource() : exchangeSource;
        int i8 = exchangeSource6 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[exchangeSource6.ordinal()];
        if (i8 != -1) {
            if (i8 == 1) {
                stringResourceInvoke9 = companion.invoke(C16405R.string.filled_notional_fcx, new Object[0]);
            } else if (i8 == 2) {
                stringResourceInvoke9 = companion.invoke(C16405R.string.filled_notional, new Object[0]);
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke9 = companion.invoke(C16405R.string.filled_notional, new Object[0]);
            }
            StringResource stringResource14 = stringResource3;
            r17 = stringResourceInvoke9;
            stringResource5 = stringResource14;
        } else {
            stringResource5 = stringResource3;
            r17 = exchangeSource;
        }
        if (order.getEnteredNotionalAmount() == null || !commonState.hasExecutions()) {
            obj = exchangeSource;
        } else if (z2) {
            BigDecimal bigDecimalSignedAdjustmentAmount2 = eventOrder.signedAdjustmentAmount();
            BigDecimal bigDecimalAbs = bigDecimalSignedAdjustmentAmount2 != null ? bigDecimalSignedAdjustmentAmount2.abs() : exchangeSource;
            BigDecimal totalFees = eventOrder.getOrder().getTotalFees();
            if (bigDecimalAbs == null || totalFees == null) {
                bigDecimalAdd = exchangeSource;
            } else {
                bigDecimalAdd = bigDecimalAbs.subtract(totalFees);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "subtract(...)");
            }
            if (bigDecimalAdd == null) {
                obj = Formats.getPriceFormat().format(bigDecimalAdd);
            }
        } else {
            BigDecimal bigDecimalSignedAdjustmentAmount3 = eventOrder.signedAdjustmentAmount();
            BigDecimal bigDecimalAbs2 = bigDecimalSignedAdjustmentAmount3 != null ? bigDecimalSignedAdjustmentAmount3.abs() : exchangeSource;
            BigDecimal totalFees2 = eventOrder.getOrder().getTotalFees();
            if (bigDecimalAbs2 != null && totalFees2 != null) {
                bigDecimalAdd = bigDecimalAbs2.add(totalFees2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            }
            if (bigDecimalAdd == null) {
            }
        }
        EventContract contract7 = dataState.getContract();
        ExchangeSource exchangeSource7 = contract7 != null ? contract7.getExchangeSource() : exchangeSource;
        int i9 = exchangeSource7 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[exchangeSource7.ordinal()];
        if (i9 == -1) {
            stringResourceInvoke4 = companion.invoke(C16405R.string.commission_and_fees, new Object[0]);
        } else if (i9 == 1) {
            stringResourceInvoke4 = companion.invoke(C16405R.string.commission, new Object[0]);
        } else {
            if (i9 != 2 && i9 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke4 = companion.invoke(C16405R.string.commission_and_fees, new Object[0]);
        }
        BigDecimal totalFees3 = order.getTotalFees();
        StringResource stringResourceInvoke14 = (totalFees3 == null || Intrinsics.areEqual(totalFees3, BigDecimal.ZERO)) ? null : companion.invoke(Formats.getPriceFormat().format(totalFees3));
        if (!commonState.hasExecutions()) {
            stringResource6 = stringResourceInvoke3;
            stringResourceInvoke5 = null;
        } else if (z2) {
            stringResource6 = stringResourceInvoke3;
            stringResourceInvoke5 = companion.invoke(C16405R.string.total_cost, new Object[0]);
        } else {
            stringResource6 = stringResourceInvoke3;
            stringResourceInvoke5 = companion.invoke(C16405R.string.total_credit, new Object[0]);
        }
        if (!commonState.hasExecutions() || (bigDecimalSignedAdjustmentAmount = eventOrder.signedAdjustmentAmount()) == null) {
            stringResource7 = stringResourceInvoke5;
            stringResourceInvoke6 = null;
        } else {
            NumberFormatter priceFormat = Formats.getPriceFormat();
            BigDecimal bigDecimalAbs3 = bigDecimalSignedAdjustmentAmount.abs();
            stringResource7 = stringResourceInvoke5;
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs3, "abs(...)");
            stringResourceInvoke6 = companion.invoke(priceFormat.format(bigDecimalAbs3));
        }
        if (!z6 || (contract2 = dataState.getContract()) == null || (exchangeSource3 = contract2.getExchangeSource()) == null) {
            stringResource8 = stringResourceInvoke6;
            stringResource9 = stringResource5;
            stringResourceInvoke7 = null;
        } else {
            int i10 = WhenMappings.$EnumSwitchMapping$0[exchangeSource3.ordinal()];
            if (i10 == 1) {
                BigDecimal bigDecimalDisplayPrice2 = eventOrder.displayPrice();
                if (bigDecimalDisplayPrice2 != null) {
                    stringResource8 = stringResourceInvoke6;
                    stringResource9 = stringResource5;
                    stringResourceInvoke7 = companion.invoke(new StringResource.PluralsResource(C16405R.plurals.total_breakdown_notional, order.getFilledQuantity().intValue()), Formats.getPriceFormat().format(EventOrder.INSTANCE.getPAYOUT_PER_CONTRACT()), Formats.getPriceFormat().format(bigDecimalDisplayPrice2), Integer.valueOf(order.getFilledQuantity().intValue()));
                }
            } else if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            stringResource8 = stringResourceInvoke6;
            stringResource9 = stringResource5;
            stringResourceInvoke7 = null;
        }
        if (!z6 || (contract = dataState.getContract()) == null || (exchangeSource2 = contract.getExchangeSource()) == null) {
            stringResource10 = stringResourceInvoke11;
            stringResource11 = orderSubtitle;
            z4 = z5;
            stringResource12 = null;
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$0[exchangeSource2.ordinal()];
            if (i11 == 1) {
                BigDecimal feesPerContract = order.getFeesPerContract();
                StringResource stringResourceInvoke15 = feesPerContract != null ? companion.invoke(C16405R.string.total_breakdown_commission, Formats.getPriceFormat().format(feesPerContract)) : null;
                stringResource10 = stringResourceInvoke11;
                stringResource11 = orderSubtitle;
                z4 = z5;
                stringResource12 = stringResourceInvoke15;
            } else if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            stringResource10 = stringResourceInvoke11;
            stringResource11 = orderSubtitle;
            z4 = z5;
            stringResource12 = stringResourceInvoke15;
        }
        if (zIsCancellable) {
            if (commonState == OrderState.PARTIALLY_FILLED) {
                stringResourceInvoke8 = companion.invoke(C16405R.string.cancel_remaining_cta, new Object[0]);
            } else {
                stringResourceInvoke8 = companion.invoke(C16405R.string.cancel_order_cta, new Object[0]);
            }
            stringResource13 = stringResourceInvoke8;
        } else {
            stringResource13 = null;
        }
        return new EventOrderDetailViewState(stringResource4, stringResource11, persistentListOrEmpty, str, stringResource10, stringResource2, stringResourceInvoke12, stringResourceInvoke2, z4, enteredNotionalAmount, stringResource9, stringResource6, r17, obj, stringResourceInvoke4, stringResourceInvoke14, stringResource7, stringResource8, stringResourceInvoke7, stringResource12, zIsCancellable, stringResource13, dataState.getCancelInProgress());
    }

    private final StringResource getOrderSubtitle(EventOrderDetailDataState eventOrderDetailDataState) {
        EventContract contract;
        String displayLongName;
        if (eventOrderDetailDataState.getDisplayDetail() == null) {
            return null;
        }
        if (eventOrderDetailDataState.getDisplayDetail() instanceof Some) {
            return StringResource.INSTANCE.invoke(((ContractDisplayDetails) ((Some) eventOrderDetailDataState.getDisplayDetail()).getValue()).getOrderDetailPageSubTitle());
        }
        if (eventOrderDetailDataState.getEventOrder() == null || (contract = eventOrderDetailDataState.getContract()) == null || (displayLongName = contract.getDisplayLongName()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(OrderStrings.eventOrderYesNoType(eventOrderDetailDataState.getEventOrder()), displayLongName);
    }
}
