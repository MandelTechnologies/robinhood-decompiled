package com.robinhood.android.equityadvancedorder.ordersummary;

import com.robinhood.equity.ordersummary.contracts.models.OrderTimeInForce;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.libmodelsequity.order.OrderTrigger;
import com.robinhood.libmodelsequity.order.OrderType;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.util.Money;
import com.robinhood.utils.logging.CrashReporter;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService;
import equity_order_summary.proto.p459v1.GetOrderSummaryRequestDto;
import equity_order_summary.proto.p459v1.GetOrderSummaryResponseDto;
import equity_order_summary.proto.p459v1.MarketHoursDto;
import equity_order_summary.proto.p459v1.TrailingPegDto;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import rosetta.order.OrderTypeDto;
import rosetta.order.PegTypeDto;
import rosetta.order.PositionEffectDto;
import rosetta.order.SideDto;
import rosetta.order.TimeInForceDto;
import rosetta.order.TriggerDto;

/* compiled from: EquityOrderSummaryService.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u0012*\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u0015\u0010\u000f\u001a\u00020\u0015*\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u000f\u0010\u0016\u001a\u0015\u0010\u000f\u001a\u00020\u0018*\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u000f\u0010\u0019\u001a\u0015\u0010\u000f\u001a\u00020\u001b*\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u000f\u0010\u001c\u001a\u0015\u0010\u000f\u001a\u00020\u001e*\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u000f\u0010\u001f\u001a\u0013\u0010\u000f\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\u000f\u0010\"\u001a\u0013\u0010\u000f\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b\u000f\u0010%¨\u0006&"}, m3636d2 = {"Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "Lcom/robinhood/models/db/DirectOrderRequestDraft;", "draft", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "", "hasSalesTaxes", "", "getOrderSummary", "(Lequity_order_summary/proto/v1/EquityOrderSummaryService;Lcom/robinhood/models/db/DirectOrderRequestDraft;Lcom/robinhood/models/db/MarketHours;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/Instant", "kotlin.jvm.PlatformType", "toIdlInstant", "(Lj$/time/Instant;)Lj$/time/Instant;", "Lequity_order_summary/proto/v1/MarketHoursDto;", "toIdlModel", "(Lcom/robinhood/models/db/MarketHours;)Lequity_order_summary/proto/v1/MarketHoursDto;", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderTimeInForce;", "Lrosetta/order/TimeInForceDto;", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderTimeInForce;)Lrosetta/order/TimeInForceDto;", "Lcom/robinhood/libmodelsequity/order/OrderType;", "Lrosetta/order/OrderTypeDto;", "(Lcom/robinhood/libmodelsequity/order/OrderType;)Lrosetta/order/OrderTypeDto;", "Lcom/robinhood/libmodelsequity/order/OrderTrigger;", "Lrosetta/order/TriggerDto;", "(Lcom/robinhood/libmodelsequity/order/OrderTrigger;)Lrosetta/order/TriggerDto;", "Lcom/robinhood/models/db/OrderPositionEffect;", "Lrosetta/order/PositionEffectDto;", "(Lcom/robinhood/models/db/OrderPositionEffect;)Lrosetta/order/PositionEffectDto;", "Lcom/robinhood/models/db/OrderMarketHours;", "Lrosetta/order/MarketHoursDto;", "(Lcom/robinhood/models/db/OrderMarketHours;)Lrosetta/order/MarketHoursDto;", "Lcom/robinhood/models/db/OrderTrailingPeg;", "Lequity_order_summary/proto/v1/TrailingPegDto;", "(Lcom/robinhood/models/db/OrderTrailingPeg;)Lequity_order_summary/proto/v1/TrailingPegDto;", "Lcom/robinhood/models/db/OrderTrailingPeg$TrailingPegType;", "Lrosetta/order/PegTypeDto;", "(Lcom/robinhood/models/db/OrderTrailingPeg$TrailingPegType;)Lrosetta/order/PegTypeDto;", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.ordersummary.EquityOrderSummaryServiceKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrderSummaryService2 {

    /* compiled from: EquityOrderSummaryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityadvancedorder.ordersummary.EquityOrderSummaryServiceKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[OrderTimeInForce.values().length];
            try {
                iArr[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderTimeInForce.GFW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderTimeInForce.GFM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderTimeInForce.IOC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderTimeInForce.OPG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderType.values().length];
            try {
                iArr2[OrderType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderTrigger.values().length];
            try {
                iArr3[OrderTrigger.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OrderTrigger.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderPositionEffect.values().length];
            try {
                iArr4[OrderPositionEffect.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[OrderPositionEffect.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[OrderMarketHours.values().length];
            try {
                iArr5[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[OrderMarketHours.REGULAR_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[OrderTrailingPeg.TrailingPegType.values().length];
            try {
                iArr6[OrderTrailingPeg.TrailingPegType.PERCENTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[OrderTrailingPeg.TrailingPegType.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* compiled from: EquityOrderSummaryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.ordersummary.EquityOrderSummaryServiceKt", m3645f = "EquityOrderSummaryService.kt", m3646l = {32}, m3647m = "getOrderSummary")
    /* renamed from: com.robinhood.android.equityadvancedorder.ordersummary.EquityOrderSummaryServiceKt$getOrderSummary$1 */
    static final class C153101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C153101(Continuation<? super C153101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityOrderSummaryService2.getOrderSummary(null, null, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getOrderSummary(EquityOrderSummaryService equityOrderSummaryService, DirectOrderRequestDraft directOrderRequestDraft, MarketHours marketHours, boolean z, Continuation<? super String> continuation) {
        C153101 c153101;
        SideDto next;
        UUID id;
        BigDecimal decimalValue;
        if (continuation instanceof C153101) {
            c153101 = (C153101) continuation;
            int i = c153101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c153101.label = i - Integer.MIN_VALUE;
            } else {
                c153101 = new C153101(continuation);
            }
        }
        Object objGetOrderSummary = c153101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c153101.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetOrderSummary);
                MarketHoursDto idlModel = toIdlModel(marketHours);
                TimeInForceDto idlModel2 = toIdlModel(OrderTimeInForce.INSTANCE.fromServerValue(directOrderRequestDraft.getTimeInForce().getServerValue()));
                OrderTypeDto idlModel3 = toIdlModel(OrderType.INSTANCE.fromServerValue(directOrderRequestDraft.getType().getServerValue()));
                TriggerDto idlModel4 = toIdlModel(OrderTrigger.INSTANCE.fromServerValue(directOrderRequestDraft.getTrigger().getServerValue()));
                rosetta.order.MarketHoursDto idlModel5 = toIdlModel(directOrderRequestDraft.getMarketHours());
                BigDecimal quantity = directOrderRequestDraft.getQuantity();
                if (quantity == null) {
                    quantity = BigDecimal.ZERO;
                }
                Intrinsics.checkNotNull(quantity);
                IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(quantity);
                String displaySymbol = directOrderRequestDraft.getInstrument().getDisplaySymbol();
                IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(directOrderRequestDraft.getDisplayPrice());
                BigDecimal stopPrice = directOrderRequestDraft.getStopPrice();
                IdlDecimal idlDecimal3 = stopPrice != null ? IdlDecimal2.toIdlDecimal(stopPrice) : null;
                BigDecimal lastTradePrice = directOrderRequestDraft.getLastTradePrice();
                IdlDecimal idlDecimal4 = lastTradePrice != null ? IdlDecimal2.toIdlDecimal(lastTradePrice) : null;
                Money dollarBasedAmount = directOrderRequestDraft.getDollarBasedAmount();
                IdlDecimal idlDecimal5 = (dollarBasedAmount == null || (decimalValue = dollarBasedAmount.getDecimalValue()) == null) ? null : IdlDecimal2.toIdlDecimal(decimalValue);
                BigDecimal presetPercentLimit = directOrderRequestDraft.getPresetPercentLimit();
                IdlDecimal idlDecimal6 = presetPercentLimit != null ? IdlDecimal2.toIdlDecimal(presetPercentLimit) : null;
                Iterator<SideDto> it = SideDto.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getJson_value(), directOrderRequestDraft.getSide().getServerValue())) {
                        break;
                    }
                }
                SideDto sideDto = next;
                if (sideDto == null) {
                    sideDto = SideDto.SIDE_UNSPECIFIED;
                }
                SideDto sideDto2 = sideDto;
                long notionalEstimatedQuantityDecimals = directOrderRequestDraft.getInstrument().getNotionalEstimatedQuantityDecimals();
                Order orderToReplace = directOrderRequestDraft.getOrderToReplace();
                String string2 = (orderToReplace == null || (id = orderToReplace.getId()) == null) ? null : id.toString();
                OrderTrailingPeg trailingPeg = directOrderRequestDraft.getTrailingPeg();
                GetOrderSummaryRequestDto getOrderSummaryRequestDto = new GetOrderSummaryRequestDto(idlModel, idlModel2, idlModel3, idlModel4, idlModel5, idlDecimal, displaySymbol, idlDecimal2, idlDecimal3, idlDecimal4, idlDecimal5, idlDecimal6, sideDto2, notionalEstimatedQuantityDecimals, string2, trailingPeg != null ? toIdlModel(trailingPeg) : null, directOrderRequestDraft.getInstrument().getId().toString(), toIdlModel(directOrderRequestDraft.getPositionEffect()), boxing.boxBoolean(z));
                c153101.label = 1;
                objGetOrderSummary = equityOrderSummaryService.GetOrderSummary(getOrderSummaryRequestDto, c153101);
                if (objGetOrderSummary == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetOrderSummary);
            }
            return ((GetOrderSummaryResponseDto) objGetOrderSummary).getSummary();
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            throw th;
        }
    }

    public static /* synthetic */ Object getOrderSummary$default(EquityOrderSummaryService equityOrderSummaryService, DirectOrderRequestDraft directOrderRequestDraft, MarketHours marketHours, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return getOrderSummary(equityOrderSummaryService, directOrderRequestDraft, marketHours, z, continuation);
    }

    private static final Instant toIdlInstant(Instant instant) {
        return Instant.ofEpochMilli(instant.toEpochMilli());
    }

    private static final MarketHoursDto toIdlModel(MarketHours marketHours) {
        boolean zIsOpen = marketHours.isOpen();
        Instant extendedHoursClosesAt = marketHours.getExtendedHoursClosesAt();
        Instant idlInstant = extendedHoursClosesAt != null ? toIdlInstant(extendedHoursClosesAt) : null;
        Instant extendedHoursOpensAt = marketHours.getExtendedHoursOpensAt();
        Instant idlInstant2 = extendedHoursOpensAt != null ? toIdlInstant(extendedHoursOpensAt) : null;
        Instant regularHoursClosesAt = marketHours.getRegularHoursClosesAt();
        Instant idlInstant3 = regularHoursClosesAt != null ? toIdlInstant(regularHoursClosesAt) : null;
        Instant regularHoursOpensAt = marketHours.getRegularHoursOpensAt();
        return new MarketHoursDto(zIsOpen, idlInstant2, idlInstant, idlInstant3, regularHoursOpensAt != null ? toIdlInstant(regularHoursOpensAt) : null);
    }

    private static final TimeInForceDto toIdlModel(OrderTimeInForce orderTimeInForce) {
        switch (orderTimeInForce == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
                return TimeInForceDto.TIME_IN_FORCE_UNSPECIFIED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return TimeInForceDto.GFD;
            case 2:
                return TimeInForceDto.GTC;
            case 3:
                return TimeInForceDto.GFW;
            case 4:
                return TimeInForceDto.GFM;
        }
    }

    private static final OrderTypeDto toIdlModel(OrderType orderType) {
        int i = orderType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[orderType.ordinal()];
        if (i == -1) {
            return OrderTypeDto.ORDER_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return OrderTypeDto.LIMIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderTypeDto.MARKET;
    }

    private static final TriggerDto toIdlModel(OrderTrigger orderTrigger) {
        int i = orderTrigger == null ? -1 : WhenMappings.$EnumSwitchMapping$2[orderTrigger.ordinal()];
        if (i == -1) {
            return TriggerDto.TRIGGER_UNSPECIFIED;
        }
        if (i == 1) {
            return TriggerDto.IMMEDIATE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return TriggerDto.STOP;
    }

    private static final PositionEffectDto toIdlModel(OrderPositionEffect orderPositionEffect) {
        int i = orderPositionEffect == null ? -1 : WhenMappings.$EnumSwitchMapping$3[orderPositionEffect.ordinal()];
        if (i == -1) {
            return PositionEffectDto.POSITION_EFFECT_UNSPECIFIED;
        }
        if (i == 1) {
            return PositionEffectDto.CLOSE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PositionEffectDto.OPEN;
    }

    private static final rosetta.order.MarketHoursDto toIdlModel(OrderMarketHours orderMarketHours) {
        int i = orderMarketHours == null ? -1 : WhenMappings.$EnumSwitchMapping$4[orderMarketHours.ordinal()];
        if (i == -1) {
            return rosetta.order.MarketHoursDto.MARKET_HOURS_UNSPECIFIED;
        }
        if (i == 1) {
            return rosetta.order.MarketHoursDto.ALL_DAY_HOURS;
        }
        if (i == 2) {
            return rosetta.order.MarketHoursDto.EXTENDED_HOURS;
        }
        if (i == 3) {
            return rosetta.order.MarketHoursDto.HYPER_EXTENDED_HOURS;
        }
        if (i == 4) {
            return rosetta.order.MarketHoursDto.REGULAR_CURB_HOURS;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return rosetta.order.MarketHoursDto.REGULAR_HOURS;
    }

    private static final TrailingPegDto toIdlModel(OrderTrailingPeg orderTrailingPeg) {
        IdlDecimal idlDecimal;
        Integer percentage = orderTrailingPeg.getPercentage();
        Money price = orderTrailingPeg.getPrice();
        if (price != null) {
            String string2 = price.getDecimalValue().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            idlDecimal = new IdlDecimal(string2);
        } else {
            idlDecimal = null;
        }
        return new TrailingPegDto(percentage, idlDecimal, toIdlModel(orderTrailingPeg.getType()));
    }

    private static final PegTypeDto toIdlModel(OrderTrailingPeg.TrailingPegType trailingPegType) {
        int i = WhenMappings.$EnumSwitchMapping$5[trailingPegType.ordinal()];
        if (i == 1) {
            return PegTypeDto.PERCENTAGE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PegTypeDto.PRICE;
    }
}
