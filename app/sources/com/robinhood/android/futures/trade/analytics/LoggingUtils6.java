package com.robinhood.android.futures.trade.analytics;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState;
import com.robinhood.android.futures.trade.p147ui.orderform.OrderSubmissionState;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.futures.api.account.FuturesAccountStatus;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.FuturesAccountStatusContext;
import com.robinhood.rosetta.eventlogging.FuturesLadderContext;
import com.robinhood.rosetta.eventlogging.FuturesOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.Uuids;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u001d\u0010\r\u001a\u00020\u000e*\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0014\u001a\f\u0010\r\u001a\u00020\u0015*\u00020\u0016H\u0002\u001a\f\u0010\r\u001a\u00020\u0017*\u00020\u0018H\u0002\u001a\f\u0010\r\u001a\u00020\u0019*\u00020\u001aH\u0002\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\b\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002\u001a\f\u0010\r\u001a\u00020\u001e*\u00020\u001fH\u0002\u001a\f\u0010\r\u001a\u00020 *\u00020\nH\u0000\u001a\u001d\u0010!\u001a\u00020\"*\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\u0010#\u001a\f\u0010$\u001a\u00020%*\u00020&H\u0000\u001a\u000e\u0010'\u001a\u00020(*\u0004\u0018\u00010)H\u0000¨\u0006*"}, m3636d2 = {"updateWithOrderData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "orderSubmissionState", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderSubmissionState;", "candidateOrder", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "contractId", "Ljava/util/UUID;", "refId", "orderSide", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "toEventLoggingProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderRequestContext;", "isAutoSendEnabled", "", "(Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;Ljava/lang/Boolean;)Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderRequestContext;", "getAutoSendContext", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "(Ljava/lang/Boolean;)Lcom/robinhood/rosetta/eventlogging/Boolean;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderLeg;", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$Leg;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "Lcom/robinhood/android/models/futures/api/order/FuturesContractType;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "toFuturesOrderContext", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext;", "(Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;Ljava/lang/Boolean;)Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext;", "toFuturesAccountStatusContext", "Lcom/robinhood/rosetta/eventlogging/FuturesAccountStatusContext;", "Lcom/robinhood/android/models/futures/api/account/FuturesAccountStatus;", "toNuxProgressLoggingContext", "Lcom/robinhood/rosetta/eventlogging/FuturesLadderContext$NuxProgress;", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.analytics.LoggingUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LoggingUtils6 {

    /* compiled from: LoggingUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.analytics.LoggingUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[FuturesOrderType.values().length];
            try {
                iArr[FuturesOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesOrderTrigger.values().length];
            try {
                iArr2[FuturesOrderTrigger.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FuturesOrderTrigger.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FuturesTimeInForce.values().length];
            try {
                iArr3[FuturesTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[FuturesTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FuturesTimeInForce.IOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[FuturesTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[FuturesTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[FuturesContractType.values().length];
            try {
                iArr4[FuturesContractType.OPTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[FuturesContractType.OUTRIGHTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[FuturesContractType.EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[FuturesOrderSide.values().length];
            try {
                iArr5[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[FuturesAccountStatus.values().length];
            try {
                iArr6[FuturesAccountStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[FuturesAccountStatus.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[FuturesAccountStatus.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[FuturesAccountStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[FuturesAccountStatus.INACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public static final UserInteractionEventDescriptor updateWithOrderData(UserInteractionEventDescriptor userInteractionEventDescriptor, OrderSubmissionState orderSubmissionState, UiFuturesOrderContext uiFuturesOrderContext, UUID contractId, UUID refId, FuturesOrderSide orderSide, Screen sourceScreen) {
        Screen.Name name;
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        if (orderSubmissionState instanceof OrderSubmissionState.Editing) {
            name = Screen.Name.FUTURES_ORDER_FORM_SCREEN;
        } else if (orderSubmissionState instanceof OrderSubmissionState.Reviewing) {
            name = Screen.Name.FUTURES_ORDER_FORM_REVIEW_SCREEN;
        } else {
            boolean z = orderSubmissionState instanceof OrderSubmissionState.Submitting;
            if (z && (((OrderSubmissionState.Submitting) orderSubmissionState).getResult() instanceof OrderSubmissionManager.Result.Sending)) {
                name = Screen.Name.FUTURES_ORDER_PLACEMENT_LOADING_SCREEN;
            } else {
                if (!z || !(((OrderSubmissionState.Submitting) orderSubmissionState).getResult() instanceof OrderSubmissionManager.Result.Submitted)) {
                    return null;
                }
                name = Screen.Name.FUTURES_ORDER_CONFIRMATION_SCREEN;
            }
        }
        Screen screen = new Screen(name, null, null, null, 14, null);
        String string2 = contractId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = refId.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, sourceScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FuturesOrderContext(string2, string3, toEventLoggingProto(orderSide), uiFuturesOrderContext != null ? toEventLoggingProto$default(uiFuturesOrderContext, null, 1, null) : null, null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -9, 16383, null), null, null, 53, null));
    }

    public static /* synthetic */ FuturesOrderContext.OrderRequestContext toEventLoggingProto$default(UiFuturesOrderContext uiFuturesOrderContext, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return toEventLoggingProto(uiFuturesOrderContext, bool);
    }

    public static final FuturesOrderContext.OrderRequestContext toEventLoggingProto(UiFuturesOrderContext uiFuturesOrderContext, Boolean bool) {
        Intrinsics.checkNotNullParameter(uiFuturesOrderContext, "<this>");
        String strSafeToString = Uuids.safeToString(uiFuturesOrderContext.getAccountId());
        String strSafeToString2 = Uuids.safeToString(uiFuturesOrderContext.getOrderRequest().getRefId());
        FuturesOrderContext.OrderType eventLoggingProto = toEventLoggingProto(uiFuturesOrderContext.getOrderRequest().getOrderType());
        long jLongValue = uiFuturesOrderContext.getOrderRequest().getQuantity().longValue();
        FuturesOrderContext.OrderTrigger eventLoggingProto2 = toEventLoggingProto(uiFuturesOrderContext.getOrderRequest().getOrderTrigger());
        FuturesOrderContext.TimeInForce eventLoggingProto3 = toEventLoggingProto(uiFuturesOrderContext.getOrderRequest().getTimeInForce());
        BigDecimal stopPrice = uiFuturesOrderContext.getOrderRequest().getStopPrice();
        double dDoubleValue = stopPrice != null ? stopPrice.doubleValue() : 0.0d;
        BigDecimal limitPrice = uiFuturesOrderContext.getOrderRequest().getLimitPrice();
        return new FuturesOrderContext.OrderRequestContext(strSafeToString, strSafeToString2, eventLoggingProto, jLongValue, eventLoggingProto2, eventLoggingProto3, dDoubleValue, limitPrice != null ? limitPrice.doubleValue() : 0.0d, toEventLoggingProto(uiFuturesOrderContext.getOrderRequest().getLegs()), getAutoSendContext(bool), null, 1024, null);
    }

    private static final Boolean getAutoSendContext(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return Boolean.FALSE;
        }
        if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.BOOLEAN_UNSPECIFIED;
    }

    private static final FuturesOrderContext.OrderType toEventLoggingProto(FuturesOrderType futuresOrderType) {
        int i = WhenMappings.$EnumSwitchMapping$0[futuresOrderType.ordinal()];
        if (i == 1) {
            return FuturesOrderContext.OrderType.MARKET;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FuturesOrderContext.OrderType.LIMIT;
    }

    private static final FuturesOrderContext.OrderTrigger toEventLoggingProto(FuturesOrderTrigger futuresOrderTrigger) {
        int i = WhenMappings.$EnumSwitchMapping$1[futuresOrderTrigger.ordinal()];
        if (i == 1) {
            return FuturesOrderContext.OrderTrigger.STOP;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FuturesOrderContext.OrderTrigger.IMMEDIATE;
    }

    private static final FuturesOrderContext.TimeInForce toEventLoggingProto(FuturesTimeInForce futuresTimeInForce) {
        int i = WhenMappings.$EnumSwitchMapping$2[futuresTimeInForce.ordinal()];
        if (i == 1) {
            return FuturesOrderContext.TimeInForce.GFD;
        }
        if (i == 2) {
            return FuturesOrderContext.TimeInForce.GTC;
        }
        if (i == 3) {
            return FuturesOrderContext.TimeInForce.IOC;
        }
        if (i == 4) {
            return FuturesOrderContext.TimeInForce.GTD;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return FuturesOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
    }

    private static final List<FuturesOrderContext.OrderLeg> toEventLoggingProto(List<UiFuturesOrderContext.Leg> list) {
        List<UiFuturesOrderContext.Leg> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (UiFuturesOrderContext.Leg leg : list2) {
            arrayList.add(new FuturesOrderContext.OrderLeg(toEventLoggingProto(leg.getContractType()), Uuids.safeToString(leg.getContractId()), leg.getRatioQuantity(), toEventLoggingProto(leg.getOrderSide()), null, 16, null));
        }
        return arrayList;
    }

    private static final FuturesOrderContext.ContractType toEventLoggingProto(FuturesContractType futuresContractType) {
        int i = WhenMappings.$EnumSwitchMapping$3[futuresContractType.ordinal()];
        if (i == 1) {
            return FuturesOrderContext.ContractType.OPTIONS;
        }
        if (i == 2) {
            return FuturesOrderContext.ContractType.OUTRIGHTS;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return FuturesOrderContext.ContractType.CONTRACT_TYPE_UNSPECIFIED;
    }

    public static final FuturesOrderContext.OrderSide toEventLoggingProto(FuturesOrderSide futuresOrderSide) {
        Intrinsics.checkNotNullParameter(futuresOrderSide, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[futuresOrderSide.ordinal()];
        if (i == 1) {
            return FuturesOrderContext.OrderSide.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FuturesOrderContext.OrderSide.SELL;
    }

    public static /* synthetic */ FuturesOrderContext toFuturesOrderContext$default(UiFuturesOrderContext uiFuturesOrderContext, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return toFuturesOrderContext(uiFuturesOrderContext, bool);
    }

    public static final FuturesOrderContext toFuturesOrderContext(UiFuturesOrderContext uiFuturesOrderContext, Boolean bool) {
        Intrinsics.checkNotNullParameter(uiFuturesOrderContext, "<this>");
        return new FuturesOrderContext(Uuids.safeToString(uiFuturesOrderContext.getOrderRequest().getContractId()), Uuids.safeToString(uiFuturesOrderContext.getOrderRequest().getRefId()), toEventLoggingProto(uiFuturesOrderContext.getOrderRequest().getOrderSide()), toEventLoggingProto(uiFuturesOrderContext, bool), null, 16, null);
    }

    public static final FuturesAccountStatusContext toFuturesAccountStatusContext(FuturesAccountStatus futuresAccountStatus) {
        FuturesAccountStatusContext.AccountStatus accountStatus;
        Intrinsics.checkNotNullParameter(futuresAccountStatus, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$5[futuresAccountStatus.ordinal()];
        if (i == 1) {
            accountStatus = FuturesAccountStatusContext.AccountStatus.PENDING;
        } else if (i == 2) {
            accountStatus = FuturesAccountStatusContext.AccountStatus.ACTIVE;
        } else if (i == 3) {
            accountStatus = FuturesAccountStatusContext.AccountStatus.REJECTED;
        } else {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            accountStatus = FuturesAccountStatusContext.AccountStatus.ACCOUNT_STATUS_UNSPECIFIED;
        }
        return new FuturesAccountStatusContext(accountStatus, null, 2, null);
    }

    public static final FuturesLadderContext.NuxProgress toNuxProgressLoggingContext(LadderFtuxProgressState ladderFtuxProgressState) {
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.LadderIntroduction.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.LADDER_INTRODUCTION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.AskBarsInformation.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.ASK_BARS_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.BidBarsInformation.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.BID_BARS_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.LadderRowAveragePrice.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.LADDER_ROW_AVERAGE_PRICE_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.LadderRowCancelOrder.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.LADDER_ROW_CANCEL_ORDER_INFORMATION;
        }
        if (ladderFtuxProgressState instanceof LadderFtuxProgressState.LadderEducation.LadderRowClosePosition) {
            return FuturesLadderContext.NuxProgress.LADDER_ROW_CLOSE_POSITION_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.LadderRowEditOrder.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.LADDER_ROW_EDIT_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.LadderRowOrderInformation.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.LADDER_ROW_ORDER_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.LastTradedPriceInformation.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.LAST_TRADED_PRICE_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.MarketOrderInformation.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.MARKET_ORDER_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.LadderEducation.TickSizeInformation.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.TICK_SIZE_INFORMATION;
        }
        if (Intrinsics.areEqual(ladderFtuxProgressState, LadderFtuxProgressState.TransitionToLadderUi.INSTANCE)) {
            return FuturesLadderContext.NuxProgress.TRANSITION_TO_REAL_LADDER_UI;
        }
        if (ladderFtuxProgressState != null) {
            throw new NoWhenBranchMatchedException();
        }
        return FuturesLadderContext.NuxProgress.UNSPECIFIED;
    }
}
