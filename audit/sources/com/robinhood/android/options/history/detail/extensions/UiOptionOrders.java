package com.robinhood.android.options.history.detail.extensions;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.history.detail.C23086R;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionOrderExecution;
import com.robinhood.models.p320db.OptionOrderLeg;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailLegContext;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.shared.models.history.shared.OrderState;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: UiOptionOrders.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u001a\n\u0010\u001b\u001a\u00020\u0019*\u00020\u0002\u001a\n\u0010\u001c\u001a\u00020\u001d*\u00020\u0002¨\u0006\u001e"}, m3636d2 = {"getDetailLegTitleString", "", "Lcom/robinhood/models/ui/UiOptionOrder;", "resources", "Landroid/content/res/Resources;", "legIndex", "", "getOrderTypeString", "getEffectString", "Lcom/robinhood/models/ui/UiOptionOrderLeg;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "getDayTradeTitle", "", "getTimeInForceString", "context", "Landroid/content/Context;", "getOptionOrderDetailLegContext", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailLegContext;", "Lcom/robinhood/models/db/OptionOrderLeg;", "orderState", "Lcom/robinhood/shared/models/history/shared/OrderState;", "getOptionOrderDetailContext", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;", "bidPrice", "Ljava/math/BigDecimal;", "askPrice", "getTotalExecutionPrice", "isReplaceable", "", "feature-options-history-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.history.detail.extensions.UiOptionOrdersKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiOptionOrders {

    /* compiled from: UiOptionOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.history.detail.extensions.UiOptionOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
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
            int[] iArr3 = new int[OrderTrigger.values().length];
            try {
                iArr3[OrderTrigger.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OrderTrigger.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderPositionEffect.values().length];
            try {
                iArr4[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[OrderTimeInForce.values().length];
            try {
                iArr5[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr5[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[OrderTimeInForce.FOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[OrderTimeInForce.IOC.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[OrderTimeInForce.OPG.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[OrderTimeInForce.GFW.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[OrderTimeInForce.GFM.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final String getDetailLegTitleString(UiOptionOrder uiOptionOrder, Resources resources, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiOptionOrderLeg uiOptionOrder2 = uiOptionOrder.getLegs().get(i);
        OptionInstrument optionInstrument = uiOptionOrder2.getOptionInstrument();
        int iIntValue = uiOptionOrder.getOptionOrder().getQuantity().intValue() * uiOptionOrder2.getLeg().getRatioQuantity();
        int i2 = WhenMappings.$EnumSwitchMapping$0[uiOptionOrder2.getLeg().getSide().ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = -1;
        }
        int i4 = iIntValue * i3;
        CharSequence contractTypeString$default = OptionExtensions.getContractTypeString$default(resources, optionInstrument.getContractType(), 0, 4, null);
        String string2 = resources.getString(C23086R.string.options_order_detail_leg_leg_title, Formats.getIntegerDeltaFormat().format(Integer.valueOf(i4)), uiOptionOrder.getOptionChain().getSymbol(), OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate()), Formats.getPriceFormat().format(optionInstrument.getStrikePrice()), contractTypeString$default);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static /* synthetic */ String getOrderTypeString$default(UiOptionOrder uiOptionOrder, Resources resources, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return getOrderTypeString(uiOptionOrder, resources, i);
    }

    public static final String getOrderTypeString(UiOptionOrder uiOptionOrder, Resources resources, int i) throws Resources.NotFoundException {
        int i2;
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        OrderSide side = uiOptionOrder.getLegs().get(i).getLeg().getSide();
        int i3 = WhenMappings.$EnumSwitchMapping$2[uiOptionOrder.getOptionOrder().getTrigger().ordinal()];
        if (i3 == 1) {
            int i4 = WhenMappings.$EnumSwitchMapping$1[uiOptionOrder.getOptionOrder().getType().ordinal()];
            if (i4 == 1) {
                int i5 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                if (i5 == 1) {
                    i2 = C23086R.string.option_order_detail_stop_market_buy;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23086R.string.option_order_detail_stop_market_sell;
                }
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                if (i6 == 1) {
                    i2 = C23086R.string.option_order_detail_stop_limit_buy;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23086R.string.option_order_detail_stop_limit_sell;
                }
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = WhenMappings.$EnumSwitchMapping$1[uiOptionOrder.getOptionOrder().getType().ordinal()];
            if (i7 == 1) {
                int i8 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                if (i8 == 1) {
                    i2 = C23086R.string.option_order_detail_market_buy;
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23086R.string.option_order_detail_market_sell;
                }
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i9 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                if (i9 == 1) {
                    i2 = C23086R.string.option_order_detail_limit_buy;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23086R.string.option_order_detail_limit_sell;
                }
            }
        }
        String string2 = resources.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getEffectString(UiOptionOrderLeg uiOptionOrder2, Resources resources) {
        Intrinsics.checkNotNullParameter(uiOptionOrder2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getEffectString(resources, uiOptionOrder2.getLeg().getPositionEffect());
    }

    private static final String getEffectString(Resources resources, OrderPositionEffect orderPositionEffect) throws Resources.NotFoundException {
        int i = WhenMappings.$EnumSwitchMapping$3[orderPositionEffect.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C23386R.string.option_effect_open);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = resources.getString(C23386R.string.option_effect_close);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final CharSequence getDayTradeTitle(UiOptionOrder uiOptionOrder, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiOptionOrderLeg uiOptionOrder2 = (UiOptionOrderLeg) CollectionsKt.singleOrNull((List) uiOptionOrder.getLegs());
        if (uiOptionOrder2 == null) {
            return OptionExtensions2.getStrategyTitle(uiOptionOrder, resources, true, OptionChain.UnderlyingType.EQUITY);
        }
        OptionInstrument optionInstrument = uiOptionOrder2.getOptionInstrument();
        CharSequence contractTypeString$default = OptionExtensions.getContractTypeString$default(resources, optionInstrument.getContractType(), 0, 4, null);
        String string2 = resources.getString(C23086R.string.option_history_day_trade_title, uiOptionOrder.getOptionChain().getSymbol(), Formats.getPriceFormat().format(optionInstrument.getStrikePrice()), contractTypeString$default, OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate()));
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public static final String getTimeInForceString(UiOptionOrder uiOptionOrder, Context context) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return getTimeInForceString(uiOptionOrder, resources);
    }

    public static final String getTimeInForceString(UiOptionOrder uiOptionOrder, Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$4[uiOptionOrder.getOptionOrder().getTimeInForce().ordinal()]) {
            case 1:
                i = C23086R.string.option_time_in_force_gfd;
                break;
            case 2:
                i = C23086R.string.option_time_in_force_gtc;
                break;
            case 3:
                i = C23086R.string.option_time_in_force_fok;
                break;
            case 4:
                i = C23086R.string.option_time_in_force_ioc;
                break;
            case 5:
                i = C23086R.string.option_time_in_force_opg;
                break;
            case 6:
                i = C23086R.string.option_time_in_force_gfw;
                break;
            case 7:
                i = C23086R.string.option_time_in_force_gfm;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final OptionOrderDetailLegContext getOptionOrderDetailLegContext(OptionOrderLeg optionOrderLeg, OrderState orderState) {
        String serverValue;
        Intrinsics.checkNotNullParameter(optionOrderLeg, "<this>");
        String serverValue2 = optionOrderLeg.getPositionEffect().getServerValue();
        if (orderState == null || (serverValue = orderState.getServerValue()) == null) {
            serverValue = "";
        }
        String str = serverValue;
        String string2 = optionOrderLeg.getOptionId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = optionOrderLeg.getOrderId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new OptionOrderDetailLegContext(serverValue2, str, string2, string3, null, 16, null);
    }

    public static final OptionOrderDetailContext getOptionOrderDetailContext(UiOptionOrder uiOptionOrder, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        String string2 = uiOptionOrder.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        BigDecimal price = uiOptionOrder.getOptionOrder().getPrice();
        float fFloatValue = price != null ? price.floatValue() : 0.0f;
        float fFloatValue2 = bigDecimal != null ? bigDecimal.floatValue() : 0.0f;
        float fFloatValue3 = bigDecimal2 != null ? bigDecimal2.floatValue() : 0.0f;
        int iIntValue = uiOptionOrder.getOptionOrder().getQuantity().intValue();
        UiOptionOrderLeg uiOptionOrder2 = (UiOptionOrderLeg) CollectionsKt.singleOrNull((List) uiOptionOrder.getLegs());
        return new OptionOrderDetailContext(string2, fFloatValue, fFloatValue2, fFloatValue3, iIntValue, uiOptionOrder2 != null ? uiOptionOrder2.filledQuantity() : 0, uiOptionOrder.getOptionOrder().getStopPrice() != null, uiOptionOrder.getOptionOrder().getState().getServerValue(), uiOptionOrder.getOptionChain().getSymbol(), OptionOrderMeta.Source.SOURCE_UNSPECIFIED, null, 1024, null);
    }

    public static final BigDecimal getTotalExecutionPrice(UiOptionOrder uiOptionOrder) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Sequence<Tuples2> sequenceFlatMapIterable = SequencesKt.flatMapIterable(CollectionsKt.asSequence(uiOptionOrder.getLegs()), new Function1() { // from class: com.robinhood.android.options.history.detail.extensions.UiOptionOrdersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiOptionOrders.getTotalExecutionPrice$lambda$1((UiOptionOrderLeg) obj);
            }
        });
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (Tuples2 tuples2 : sequenceFlatMapIterable) {
            OptionOrderExecution optionOrder3 = (OptionOrderExecution) tuples2.component1();
            OrderSide orderSide = (OrderSide) tuples2.component2();
            BigDecimal bigDecimalMultiply = optionOrder3.getQuantity().multiply(optionOrder3.getPrice());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(orderSide.getDirection().getMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        BigDecimal bigDecimalMultiply3 = bigDecimalValueOf.multiply(uiOptionOrder.getDirection().getMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        return bigDecimalMultiply3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable getTotalExecutionPrice$lambda$1(UiOptionOrderLeg leg) {
        Intrinsics.checkNotNullParameter(leg, "leg");
        List<OptionOrderExecution> executions = leg.getExecutions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
        Iterator<T> it = executions.iterator();
        while (it.hasNext()) {
            arrayList.add(Tuples4.m3642to((OptionOrderExecution) it.next(), leg.getLeg().getSide()));
        }
        return arrayList;
    }

    public static final boolean isReplaceable(UiOptionOrder uiOptionOrder) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        return uiOptionOrder.getOptionOrder().isCancelable() && Intrinsics.areEqual((UUID) SequencesKt.singleOrNull(SequencesKt.distinct(SequencesKt.map(CollectionsKt.asSequence(uiOptionOrder.getLegs()), new Function1() { // from class: com.robinhood.android.options.history.detail.extensions.UiOptionOrdersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiOptionOrders.isReplaceable$lambda$3((UiOptionOrderLeg) obj);
            }
        }))), uiOptionOrder.getOptionOrder().getOptionChainId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID isReplaceable$lambda$3(UiOptionOrderLeg it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOptionInstrument().getOptionChainId();
    }
}
