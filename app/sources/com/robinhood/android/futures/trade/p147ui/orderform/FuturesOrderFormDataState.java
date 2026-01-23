package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.extensions.FutureOrders;
import com.robinhood.android.futures.trade.extensions.Moneys;
import com.robinhood.android.futures.trade.extensions.TextFieldValues2;
import com.robinhood.android.futures.trade.extensions.UiFuturesOrderRequests;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormViewState;
import com.robinhood.android.futures.trade.p147ui.orderform.OrderSubmissionState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.ceres.p284v1.GetBuyingPowerEffectResponseDto;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderCheckRequest;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import microgram.android.Monitoring;
import p479j$.time.Instant;

/* compiled from: FuturesOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 \u009c\u00012\u00020\u0001:\u0006\u009a\u0001\u009b\u0001\u009c\u0001Bé\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010$\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\bHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0012HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0014HÂ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u001aHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u001cHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020 HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\"HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\"HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\"HÆ\u0003J\u0012\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001cHÂ\u0003¢\u0006\u0003\u0010\u0091\u0001J\n\u0010\u0092\u0001\u001a\u00020'HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u001cHÆ\u0003Jú\u0001\u0010\u0094\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u001cHÆ\u0001¢\u0006\u0003\u0010\u0095\u0001J\u0015\u0010\u0096\u0001\u001a\u00020\u001c2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0098\u0001\u001a\u00020jHÖ\u0001J\n\u0010\u0099\u0001\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010#\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010IR\u0011\u0010$\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bK\u0010IR\u0012\u0010%\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010LR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010(\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bO\u0010CR\u0013\u0010P\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bQ\u00105R\u0014\u0010R\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010IR\u0013\u0010T\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bU\u00105R\u0014\u0010V\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010IR\u0016\u0010X\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[R\u0016\u0010^\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010[R\u0016\u0010`\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010[R\u0016\u0010b\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010[R\u001a\u0010d\u001a\u0004\u0018\u00010Y*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010g\u001a\u0004\u0018\u00010Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010[R\u0011\u0010i\u001a\u00020j8G¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010m\u001a\u0004\u0018\u00010n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010q\u001a\u0004\u0018\u00010r8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0011\u0010u\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010y\u001a\u00020z8F¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u009d\u0001"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;", "", "refId", "Ljava/util/UUID;", "contractId", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "account", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "buyingPower", "Ljava/math/BigDecimal;", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "quote", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormQuoteWrapper;", "_buyingPowerEffect", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "nextOpenTradingSession", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "microgramState", "Lmicrogram/android/MicrogramState;", "orderConfig", "Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "showingTimeInForceSelector", "", "focusedText", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "quantityText", "", "userInputtedLimitPrice", "userInputtedStopPrice", "hasGoldSubscription", "orderSubmissionState", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderSubmissionState;", "showReviewAsLoading", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/models/futures/db/FuturesAccount;Ljava/math/BigDecimal;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormQuoteWrapper;Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Lmicrogram/android/MicrogramState;Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;ZLcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/android/futures/trade/ui/orderform/OrderSubmissionState;Z)V", "getRefId", "()Ljava/util/UUID;", "getContractId", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getBuyingPower", "()Ljava/math/BigDecimal;", "getContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "getProduct", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "getQuote", "()Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormQuoteWrapper;", "getNextOpenTradingSession", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "getMicrogramState", "()Lmicrogram/android/MicrogramState;", "getOrderConfig", "()Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "getShowingTimeInForceSelector", "()Z", "getFocusedText", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "getTimeInForce", "()Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "getQuantityText", "()Ljava/lang/String;", "getUserInputtedLimitPrice", "getUserInputtedStopPrice", "Ljava/lang/Boolean;", "getOrderSubmissionState", "()Lcom/robinhood/android/futures/trade/ui/orderform/OrderSubmissionState;", "getShowReviewAsLoading", "limitPrice", "getLimitPrice", "limitPriceDisplay", "getLimitPriceDisplay", "stopPrice", "getStopPrice", "stopPriceDisplay", "getStopPriceDisplay", "buyingPowerEffectDisplayAmount", "Lcom/robinhood/rosetta/common/MoneyDto;", "getBuyingPowerEffectDisplayAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "totalFeesDisplayAmount", "getTotalFeesDisplayAmount", "marginRequiredDisplayAmount", "getMarginRequiredDisplayAmount", "totalCommissionDisplayAmount", "getTotalCommissionDisplayAmount", "totalGoldSavingsDisplayAmount", "getTotalGoldSavingsDisplayAmount", "regulatoryAndExchangeFees", "getRegulatoryAndExchangeFees", "(Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;)Lcom/robinhood/rosetta/common/MoneyDto;", "regulatoryAndExchangeFeesDisplayAmount", "getRegulatoryAndExchangeFeesDisplayAmount", "orderTypeLabel", "", "getOrderTypeLabel", "()I", "orderContext", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "getOrderContext", "()Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "orderCheckRequest", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;", "getOrderCheckRequest", "()Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;", "orderFormContentData", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;", "getOrderFormContentData", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;", "orderReceiptContentData", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderReceiptContentData;", "getOrderReceiptContentData", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderReceiptContentData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Ljava/lang/Boolean;", "component21", "component22", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/models/futures/db/FuturesAccount;Ljava/math/BigDecimal;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormQuoteWrapper;Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Lmicrogram/android/MicrogramState;Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;ZLcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/android/futures/trade/ui/orderform/OrderSubmissionState;Z)Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;", "equals", "other", "hashCode", "toString", "FocusedText", "DisabledClickSource", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class FuturesOrderFormDataState {
    private final GetBuyingPowerEffectResponseDto _buyingPowerEffect;
    private final FuturesAccount account;
    private final BigDecimal buyingPower;
    private final FuturesContract contract;
    private final UUID contractId;
    private final FocusedText focusedText;
    private final Boolean hasGoldSubscription;
    private final Monitoring microgramState;
    private final FuturesTradingHours.Session nextOpenTradingSession;
    private final FuturesOrderConfiguration orderConfig;
    private final OrderSubmissionState orderSubmissionState;
    private final FuturesProduct product;
    private final String quantityText;
    private final OrderFormQuoteWrapper quote;
    private final UUID refId;
    private final boolean showReviewAsLoading;
    private final boolean showingTimeInForceSelector;
    private final FuturesOrderSide side;
    private final Screen sourceScreen;
    private final FuturesTimeInForce timeInForce;
    private final String userInputtedLimitPrice;
    private final String userInputtedStopPrice;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FuturesOrderConfiguration.values().length];
            try {
                iArr[FuturesOrderConfiguration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderConfiguration.STOP_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesOrderConfiguration.LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FuturesOrderConfiguration.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesOrderSide.values().length];
            try {
                iArr2[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component10, reason: from getter */
    private final GetBuyingPowerEffectResponseDto get_buyingPowerEffect() {
        return this._buyingPowerEffect;
    }

    /* renamed from: component20, reason: from getter */
    private final Boolean getHasGoldSubscription() {
        return this.hasGoldSubscription;
    }

    public static /* synthetic */ FuturesOrderFormDataState copy$default(FuturesOrderFormDataState futuresOrderFormDataState, UUID uuid, UUID uuid2, FuturesOrderSide futuresOrderSide, Screen screen, FuturesAccount futuresAccount, BigDecimal bigDecimal, FuturesContract futuresContract, FuturesProduct futuresProduct, OrderFormQuoteWrapper orderFormQuoteWrapper, GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto, FuturesTradingHours.Session session, Monitoring monitoring, FuturesOrderConfiguration futuresOrderConfiguration, boolean z, FocusedText focusedText, FuturesTimeInForce futuresTimeInForce, String str, String str2, String str3, Boolean bool, OrderSubmissionState orderSubmissionState, boolean z2, int i, Object obj) {
        boolean z3;
        OrderSubmissionState orderSubmissionState2;
        UUID uuid3 = (i & 1) != 0 ? futuresOrderFormDataState.refId : uuid;
        UUID uuid4 = (i & 2) != 0 ? futuresOrderFormDataState.contractId : uuid2;
        FuturesOrderSide futuresOrderSide2 = (i & 4) != 0 ? futuresOrderFormDataState.side : futuresOrderSide;
        Screen screen2 = (i & 8) != 0 ? futuresOrderFormDataState.sourceScreen : screen;
        FuturesAccount futuresAccount2 = (i & 16) != 0 ? futuresOrderFormDataState.account : futuresAccount;
        BigDecimal bigDecimal2 = (i & 32) != 0 ? futuresOrderFormDataState.buyingPower : bigDecimal;
        FuturesContract futuresContract2 = (i & 64) != 0 ? futuresOrderFormDataState.contract : futuresContract;
        FuturesProduct futuresProduct2 = (i & 128) != 0 ? futuresOrderFormDataState.product : futuresProduct;
        OrderFormQuoteWrapper orderFormQuoteWrapper2 = (i & 256) != 0 ? futuresOrderFormDataState.quote : orderFormQuoteWrapper;
        GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto2 = (i & 512) != 0 ? futuresOrderFormDataState._buyingPowerEffect : getBuyingPowerEffectResponseDto;
        FuturesTradingHours.Session session2 = (i & 1024) != 0 ? futuresOrderFormDataState.nextOpenTradingSession : session;
        Monitoring monitoring2 = (i & 2048) != 0 ? futuresOrderFormDataState.microgramState : monitoring;
        FuturesOrderConfiguration futuresOrderConfiguration2 = (i & 4096) != 0 ? futuresOrderFormDataState.orderConfig : futuresOrderConfiguration;
        boolean z4 = (i & 8192) != 0 ? futuresOrderFormDataState.showingTimeInForceSelector : z;
        UUID uuid5 = uuid3;
        FocusedText focusedText2 = (i & 16384) != 0 ? futuresOrderFormDataState.focusedText : focusedText;
        FuturesTimeInForce futuresTimeInForce2 = (i & 32768) != 0 ? futuresOrderFormDataState.timeInForce : futuresTimeInForce;
        String str4 = (i & 65536) != 0 ? futuresOrderFormDataState.quantityText : str;
        String str5 = (i & 131072) != 0 ? futuresOrderFormDataState.userInputtedLimitPrice : str2;
        String str6 = (i & 262144) != 0 ? futuresOrderFormDataState.userInputtedStopPrice : str3;
        Boolean bool2 = (i & 524288) != 0 ? futuresOrderFormDataState.hasGoldSubscription : bool;
        OrderSubmissionState orderSubmissionState3 = (i & 1048576) != 0 ? futuresOrderFormDataState.orderSubmissionState : orderSubmissionState;
        if ((i & 2097152) != 0) {
            orderSubmissionState2 = orderSubmissionState3;
            z3 = futuresOrderFormDataState.showReviewAsLoading;
        } else {
            z3 = z2;
            orderSubmissionState2 = orderSubmissionState3;
        }
        return futuresOrderFormDataState.copy(uuid5, uuid4, futuresOrderSide2, screen2, futuresAccount2, bigDecimal2, futuresContract2, futuresProduct2, orderFormQuoteWrapper2, getBuyingPowerEffectResponseDto2, session2, monitoring2, futuresOrderConfiguration2, z4, focusedText2, futuresTimeInForce2, str4, str5, str6, bool2, orderSubmissionState2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component11, reason: from getter */
    public final FuturesTradingHours.Session getNextOpenTradingSession() {
        return this.nextOpenTradingSession;
    }

    /* renamed from: component12, reason: from getter */
    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    /* renamed from: component13, reason: from getter */
    public final FuturesOrderConfiguration getOrderConfig() {
        return this.orderConfig;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowingTimeInForceSelector() {
        return this.showingTimeInForceSelector;
    }

    /* renamed from: component15, reason: from getter */
    public final FocusedText getFocusedText() {
        return this.focusedText;
    }

    /* renamed from: component16, reason: from getter */
    public final FuturesTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component17, reason: from getter */
    public final String getQuantityText() {
        return this.quantityText;
    }

    /* renamed from: component18, reason: from getter */
    public final String getUserInputtedLimitPrice() {
        return this.userInputtedLimitPrice;
    }

    /* renamed from: component19, reason: from getter */
    public final String getUserInputtedStopPrice() {
        return this.userInputtedStopPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component21, reason: from getter */
    public final OrderSubmissionState getOrderSubmissionState() {
        return this.orderSubmissionState;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getShowReviewAsLoading() {
        return this.showReviewAsLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component4, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesAccount getAccount() {
        return this.account;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: component7, reason: from getter */
    public final FuturesContract getContract() {
        return this.contract;
    }

    /* renamed from: component8, reason: from getter */
    public final FuturesProduct getProduct() {
        return this.product;
    }

    /* renamed from: component9, reason: from getter */
    public final OrderFormQuoteWrapper getQuote() {
        return this.quote;
    }

    public final FuturesOrderFormDataState copy(UUID refId, UUID contractId, FuturesOrderSide side, Screen sourceScreen, FuturesAccount account, BigDecimal buyingPower, FuturesContract contract, FuturesProduct product, OrderFormQuoteWrapper quote, GetBuyingPowerEffectResponseDto _buyingPowerEffect, FuturesTradingHours.Session nextOpenTradingSession, Monitoring microgramState, FuturesOrderConfiguration orderConfig, boolean showingTimeInForceSelector, FocusedText focusedText, FuturesTimeInForce timeInForce, String quantityText, String userInputtedLimitPrice, String userInputtedStopPrice, Boolean hasGoldSubscription, OrderSubmissionState orderSubmissionState, boolean showReviewAsLoading) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(microgramState, "microgramState");
        Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
        Intrinsics.checkNotNullParameter(focusedText, "focusedText");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(quantityText, "quantityText");
        Intrinsics.checkNotNullParameter(userInputtedLimitPrice, "userInputtedLimitPrice");
        Intrinsics.checkNotNullParameter(userInputtedStopPrice, "userInputtedStopPrice");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        return new FuturesOrderFormDataState(refId, contractId, side, sourceScreen, account, buyingPower, contract, product, quote, _buyingPowerEffect, nextOpenTradingSession, microgramState, orderConfig, showingTimeInForceSelector, focusedText, timeInForce, quantityText, userInputtedLimitPrice, userInputtedStopPrice, hasGoldSubscription, orderSubmissionState, showReviewAsLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOrderFormDataState)) {
            return false;
        }
        FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) other;
        return Intrinsics.areEqual(this.refId, futuresOrderFormDataState.refId) && Intrinsics.areEqual(this.contractId, futuresOrderFormDataState.contractId) && this.side == futuresOrderFormDataState.side && Intrinsics.areEqual(this.sourceScreen, futuresOrderFormDataState.sourceScreen) && Intrinsics.areEqual(this.account, futuresOrderFormDataState.account) && Intrinsics.areEqual(this.buyingPower, futuresOrderFormDataState.buyingPower) && Intrinsics.areEqual(this.contract, futuresOrderFormDataState.contract) && Intrinsics.areEqual(this.product, futuresOrderFormDataState.product) && Intrinsics.areEqual(this.quote, futuresOrderFormDataState.quote) && Intrinsics.areEqual(this._buyingPowerEffect, futuresOrderFormDataState._buyingPowerEffect) && Intrinsics.areEqual(this.nextOpenTradingSession, futuresOrderFormDataState.nextOpenTradingSession) && Intrinsics.areEqual(this.microgramState, futuresOrderFormDataState.microgramState) && this.orderConfig == futuresOrderFormDataState.orderConfig && this.showingTimeInForceSelector == futuresOrderFormDataState.showingTimeInForceSelector && this.focusedText == futuresOrderFormDataState.focusedText && this.timeInForce == futuresOrderFormDataState.timeInForce && Intrinsics.areEqual(this.quantityText, futuresOrderFormDataState.quantityText) && Intrinsics.areEqual(this.userInputtedLimitPrice, futuresOrderFormDataState.userInputtedLimitPrice) && Intrinsics.areEqual(this.userInputtedStopPrice, futuresOrderFormDataState.userInputtedStopPrice) && Intrinsics.areEqual(this.hasGoldSubscription, futuresOrderFormDataState.hasGoldSubscription) && Intrinsics.areEqual(this.orderSubmissionState, futuresOrderFormDataState.orderSubmissionState) && this.showReviewAsLoading == futuresOrderFormDataState.showReviewAsLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((this.refId.hashCode() * 31) + this.contractId.hashCode()) * 31) + this.side.hashCode()) * 31) + this.sourceScreen.hashCode()) * 31;
        FuturesAccount futuresAccount = this.account;
        int iHashCode2 = (iHashCode + (futuresAccount == null ? 0 : futuresAccount.hashCode())) * 31;
        BigDecimal bigDecimal = this.buyingPower;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        FuturesContract futuresContract = this.contract;
        int iHashCode4 = (iHashCode3 + (futuresContract == null ? 0 : futuresContract.hashCode())) * 31;
        FuturesProduct futuresProduct = this.product;
        int iHashCode5 = (((iHashCode4 + (futuresProduct == null ? 0 : futuresProduct.hashCode())) * 31) + this.quote.hashCode()) * 31;
        GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto = this._buyingPowerEffect;
        int iHashCode6 = (iHashCode5 + (getBuyingPowerEffectResponseDto == null ? 0 : getBuyingPowerEffectResponseDto.hashCode())) * 31;
        FuturesTradingHours.Session session = this.nextOpenTradingSession;
        int iHashCode7 = (((((((((((((((((iHashCode6 + (session == null ? 0 : session.hashCode())) * 31) + this.microgramState.hashCode()) * 31) + this.orderConfig.hashCode()) * 31) + Boolean.hashCode(this.showingTimeInForceSelector)) * 31) + this.focusedText.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.quantityText.hashCode()) * 31) + this.userInputtedLimitPrice.hashCode()) * 31) + this.userInputtedStopPrice.hashCode()) * 31;
        Boolean bool = this.hasGoldSubscription;
        return ((((iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 31) + this.orderSubmissionState.hashCode()) * 31) + Boolean.hashCode(this.showReviewAsLoading);
    }

    public String toString() {
        return "FuturesOrderFormDataState(refId=" + this.refId + ", contractId=" + this.contractId + ", side=" + this.side + ", sourceScreen=" + this.sourceScreen + ", account=" + this.account + ", buyingPower=" + this.buyingPower + ", contract=" + this.contract + ", product=" + this.product + ", quote=" + this.quote + ", _buyingPowerEffect=" + this._buyingPowerEffect + ", nextOpenTradingSession=" + this.nextOpenTradingSession + ", microgramState=" + this.microgramState + ", orderConfig=" + this.orderConfig + ", showingTimeInForceSelector=" + this.showingTimeInForceSelector + ", focusedText=" + this.focusedText + ", timeInForce=" + this.timeInForce + ", quantityText=" + this.quantityText + ", userInputtedLimitPrice=" + this.userInputtedLimitPrice + ", userInputtedStopPrice=" + this.userInputtedStopPrice + ", hasGoldSubscription=" + this.hasGoldSubscription + ", orderSubmissionState=" + this.orderSubmissionState + ", showReviewAsLoading=" + this.showReviewAsLoading + ")";
    }

    public FuturesOrderFormDataState(UUID refId, UUID contractId, FuturesOrderSide side, Screen sourceScreen, FuturesAccount futuresAccount, BigDecimal bigDecimal, FuturesContract futuresContract, FuturesProduct futuresProduct, OrderFormQuoteWrapper quote, GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto, FuturesTradingHours.Session session, Monitoring microgramState, FuturesOrderConfiguration orderConfig, boolean z, FocusedText focusedText, FuturesTimeInForce timeInForce, String quantityText, String userInputtedLimitPrice, String userInputtedStopPrice, Boolean bool, OrderSubmissionState orderSubmissionState, boolean z2) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(microgramState, "microgramState");
        Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
        Intrinsics.checkNotNullParameter(focusedText, "focusedText");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(quantityText, "quantityText");
        Intrinsics.checkNotNullParameter(userInputtedLimitPrice, "userInputtedLimitPrice");
        Intrinsics.checkNotNullParameter(userInputtedStopPrice, "userInputtedStopPrice");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        this.refId = refId;
        this.contractId = contractId;
        this.side = side;
        this.sourceScreen = sourceScreen;
        this.account = futuresAccount;
        this.buyingPower = bigDecimal;
        this.contract = futuresContract;
        this.product = futuresProduct;
        this.quote = quote;
        this._buyingPowerEffect = getBuyingPowerEffectResponseDto;
        this.nextOpenTradingSession = session;
        this.microgramState = microgramState;
        this.orderConfig = orderConfig;
        this.showingTimeInForceSelector = z;
        this.focusedText = focusedText;
        this.timeInForce = timeInForce;
        this.quantityText = quantityText;
        this.userInputtedLimitPrice = userInputtedLimitPrice;
        this.userInputtedStopPrice = userInputtedStopPrice;
        this.hasGoldSubscription = bool;
        this.orderSubmissionState = orderSubmissionState;
        this.showReviewAsLoading = z2;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final FuturesOrderSide getSide() {
        return this.side;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final FuturesAccount getAccount() {
        return this.account;
    }

    public final BigDecimal getBuyingPower() {
        return this.buyingPower;
    }

    public final FuturesContract getContract() {
        return this.contract;
    }

    public final FuturesProduct getProduct() {
        return this.product;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FuturesOrderFormDataState(java.util.UUID r27, java.util.UUID r28, com.robinhood.android.models.futures.api.order.FuturesOrderSide r29, com.robinhood.rosetta.eventlogging.Screen r30, com.robinhood.android.models.futures.p189db.FuturesAccount r31, java.math.BigDecimal r32, com.robinhood.android.models.futures.arsenal.p188db.FuturesContract r33, com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct r34, com.robinhood.android.futures.trade.p147ui.orderform.OrderFormQuoteWrapper r35, com.robinhood.ceres.p284v1.GetBuyingPowerEffectResponseDto r36, com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours.Session r37, microgram.android.Monitoring r38, com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration r39, boolean r40, com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDataState.FocusedText r41, com.robinhood.android.models.futures.api.order.FuturesTimeInForce r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.Boolean r46, com.robinhood.android.futures.trade.p147ui.orderform.OrderSubmissionState r47, boolean r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState.<init>(java.util.UUID, java.util.UUID, com.robinhood.android.models.futures.api.order.FuturesOrderSide, com.robinhood.rosetta.eventlogging.Screen, com.robinhood.android.models.futures.db.FuturesAccount, java.math.BigDecimal, com.robinhood.android.models.futures.arsenal.db.FuturesContract, com.robinhood.android.models.futures.arsenal.db.FuturesProduct, com.robinhood.android.futures.trade.ui.orderform.OrderFormQuoteWrapper, com.robinhood.ceres.v1.GetBuyingPowerEffectResponseDto, com.robinhood.android.models.futures.arsenal.db.FuturesTradingHours$Session, microgram.android.MicrogramState, com.robinhood.android.models.futures.db.FuturesOrderConfiguration, boolean, com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDataState$FocusedText, com.robinhood.android.models.futures.api.order.FuturesTimeInForce, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.robinhood.android.futures.trade.ui.orderform.OrderSubmissionState, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final OrderFormQuoteWrapper getQuote() {
        return this.quote;
    }

    public final FuturesTradingHours.Session getNextOpenTradingSession() {
        return this.nextOpenTradingSession;
    }

    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    public final FuturesOrderConfiguration getOrderConfig() {
        return this.orderConfig;
    }

    public final boolean getShowingTimeInForceSelector() {
        return this.showingTimeInForceSelector;
    }

    public final FocusedText getFocusedText() {
        return this.focusedText;
    }

    public final FuturesTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final String getQuantityText() {
        return this.quantityText;
    }

    public final String getUserInputtedLimitPrice() {
        return this.userInputtedLimitPrice;
    }

    public final String getUserInputtedStopPrice() {
        return this.userInputtedStopPrice;
    }

    public final OrderSubmissionState getOrderSubmissionState() {
        return this.orderSubmissionState;
    }

    public final boolean getShowReviewAsLoading() {
        return this.showReviewAsLoading;
    }

    public final BigDecimal getLimitPrice() {
        if (this.orderConfig.getOrderType() != FuturesOrderType.LIMIT) {
            return null;
        }
        if (this.userInputtedLimitPrice.length() == 0) {
            return this.quote.getSuggestedPrice(this.side);
        }
        return BigDecimals7.toBigDecimalOrNull(StringsKt.replace$default(this.userInputtedLimitPrice, ",", "", false, 4, (Object) null));
    }

    private final String getLimitPriceDisplay() {
        if (this.userInputtedLimitPrice.length() == 0) {
            String nullable$default = FuturesProduct5.formatNullable$default(this.product, this.quote.getSuggestedPrice(this.side), null, 2, null);
            return nullable$default == null ? "" : nullable$default;
        }
        if (this.orderSubmissionState instanceof OrderSubmissionState.Editing) {
            return this.userInputtedLimitPrice;
        }
        String nullable$default2 = FuturesProduct5.formatNullable$default(this.product, BigDecimals7.toBigDecimalOrNull(this.userInputtedLimitPrice), null, 2, null);
        return nullable$default2 == null ? "" : nullable$default2;
    }

    public final BigDecimal getStopPrice() {
        if (this.orderConfig.getOrderTrigger() != FuturesOrderTrigger.STOP) {
            return null;
        }
        if (this.userInputtedStopPrice.length() == 0) {
            return this.quote.getSuggestedPrice(this.side);
        }
        return BigDecimals7.toBigDecimalOrNull(StringsKt.replace$default(this.userInputtedStopPrice, ",", "", false, 4, (Object) null));
    }

    private final String getStopPriceDisplay() {
        if (this.userInputtedStopPrice.length() == 0) {
            String nullable$default = FuturesProduct5.formatNullable$default(this.product, this.quote.getSuggestedPrice(this.side), null, 2, null);
            return nullable$default == null ? "" : nullable$default;
        }
        if (this.orderSubmissionState instanceof OrderSubmissionState.Editing) {
            return this.userInputtedStopPrice;
        }
        String nullable$default2 = FuturesProduct5.formatNullable$default(this.product, BigDecimals7.toBigDecimalOrNull(this.userInputtedStopPrice), null, 2, null);
        return nullable$default2 == null ? "" : nullable$default2;
    }

    private final MoneyDto getBuyingPowerEffectDisplayAmount() {
        if (this.quantityText.length() == 0 || Intrinsics.areEqual(BigDecimals7.toBigDecimalOrNull(this.quantityText), BigDecimal.ZERO)) {
            return FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE);
        }
        GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto = this._buyingPowerEffect;
        if (getBuyingPowerEffectResponseDto != null) {
            return getBuyingPowerEffectResponseDto.getBuying_power_effect();
        }
        return null;
    }

    private final MoneyDto getTotalFeesDisplayAmount() {
        if (this.quantityText.length() == 0 || Intrinsics.areEqual(BigDecimals7.toBigDecimalOrNull(this.quantityText), BigDecimal.ZERO)) {
            return FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE);
        }
        GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto = this._buyingPowerEffect;
        if (getBuyingPowerEffectResponseDto != null) {
            return getBuyingPowerEffectResponseDto.getTotal_fee();
        }
        return null;
    }

    private final MoneyDto getMarginRequiredDisplayAmount() {
        if (this.quantityText.length() == 0 || Intrinsics.areEqual(BigDecimals7.toBigDecimalOrNull(this.quantityText), BigDecimal.ZERO)) {
            return FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE);
        }
        GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto = this._buyingPowerEffect;
        if (getBuyingPowerEffectResponseDto != null) {
            return getBuyingPowerEffectResponseDto.getEstimated_margin_required();
        }
        return null;
    }

    private final MoneyDto getTotalCommissionDisplayAmount() {
        if (this.quantityText.length() == 0 || Intrinsics.areEqual(BigDecimals7.toBigDecimalOrNull(this.quantityText), BigDecimal.ZERO)) {
            return FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE);
        }
        GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto = this._buyingPowerEffect;
        if (getBuyingPowerEffectResponseDto != null) {
            return getBuyingPowerEffectResponseDto.getTotal_commission();
        }
        return null;
    }

    private final MoneyDto getTotalGoldSavingsDisplayAmount() {
        if ((this.quantityText.length() == 0 || Intrinsics.areEqual(BigDecimals7.toBigDecimalOrNull(this.quantityText), BigDecimal.ZERO)) && Intrinsics.areEqual(this.hasGoldSubscription, Boolean.TRUE)) {
            return FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE);
        }
        GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto = this._buyingPowerEffect;
        if (getBuyingPowerEffectResponseDto != null) {
            return getBuyingPowerEffectResponseDto.getTotal_gold_savings();
        }
        return null;
    }

    private final MoneyDto getRegulatoryAndExchangeFees(GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto) {
        MoneyDto total_commission;
        BigDecimal bigDecimalOrNull;
        BigDecimal bigDecimalOrNull2;
        MoneyDto total_fee = getBuyingPowerEffectResponseDto.getTotal_fee();
        if (total_fee == null || (total_commission = getBuyingPowerEffectResponseDto.getTotal_commission()) == null || total_fee.getCurrency() != total_commission.getCurrency() || (bigDecimalOrNull = total_fee.getAmount().toBigDecimalOrNull()) == null || (bigDecimalOrNull2 = total_commission.getAmount().toBigDecimalOrNull()) == null) {
            return null;
        }
        BigDecimal bigDecimalSubtract = bigDecimalOrNull.subtract(bigDecimalOrNull2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimalSubtract == null) {
            return null;
        }
        return new MoneyDto(IdlDecimal2.toIdlDecimal(bigDecimalSubtract), total_fee.getCurrency());
    }

    private final MoneyDto getRegulatoryAndExchangeFeesDisplayAmount() {
        if (this.quantityText.length() == 0 || Intrinsics.areEqual(BigDecimals7.toBigDecimalOrNull(this.quantityText), BigDecimal.ZERO)) {
            return FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE);
        }
        GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto = this._buyingPowerEffect;
        if (getBuyingPowerEffectResponseDto != null) {
            return getRegulatoryAndExchangeFees(getBuyingPowerEffectResponseDto);
        }
        return null;
    }

    public final int getOrderTypeLabel() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderConfig.ordinal()];
        if (i == 1) {
            return C17462R.string.futures_order_form_market_order_label;
        }
        if (i == 2) {
            return C17462R.string.futures_order_form_stop_order_label;
        }
        if (i == 3) {
            return C17462R.string.futures_order_form_limit_order_label;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Unsupported order config: " + this.orderConfig).toString());
    }

    public final UiFuturesOrderContext getOrderContext() {
        BigDecimal bigDecimalOrNull;
        FuturesAccount futuresAccount = this.account;
        if (futuresAccount == null || futuresAccount.getId() == null || (bigDecimalOrNull = BigDecimals7.toBigDecimalOrNull(this.quantityText)) == null) {
            return null;
        }
        return new UiFuturesOrderContext(new UiFuturesOrderContext.OrderRequest(this.refId, this.orderConfig.getOrderType(), bigDecimalOrNull, this.orderConfig.getOrderTrigger(), this.timeInForce, getStopPrice(), getLimitPrice(), CollectionsKt.listOf(new UiFuturesOrderContext.Leg(FuturesContractType.OUTRIGHTS, this.contractId, 1, this.side))), new UiFuturesOrderContext.RequestContext(this.account));
    }

    public final FuturesOrderCheckRequest getOrderCheckRequest() {
        UiFuturesOrderContext orderContext = getOrderContext();
        if (orderContext != null) {
            return UiFuturesOrderRequests.toOrderCheckRequest(orderContext);
        }
        return null;
    }

    public final FuturesOrderFormViewState.OrderFormContentData getOrderFormContentData() {
        StringResource stringResourceInvoke;
        int i;
        FuturesOrderFormViewState.TextDisplay textDisplay;
        boolean z;
        String str;
        StringResource stringResourceInvoke2;
        String str2;
        StringResource stringResource;
        StringResource stringResourceInvoke3;
        FuturesOrderFormViewState.TextDisplay textDisplay2;
        StringResource stringResourceInvoke4;
        FuturesOrderFormViewState.TextDisplay textDisplay3;
        StringResource stringResourceInvoke5;
        String currency;
        String currency2;
        String currency3;
        String currency4;
        String currency5;
        Instant endTime;
        String displaySymbol;
        FuturesOrderConfiguration futuresOrderConfiguration = this.orderConfig;
        FuturesContract futuresContract = this.contract;
        if (futuresContract == null || (displaySymbol = futuresContract.getDisplaySymbol()) == null) {
            stringResourceInvoke = null;
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$1[this.side.ordinal()];
            if (i2 == 1) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C17462R.string.futures_order_form_buy_title, displaySymbol);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C17462R.string.futures_order_form_sell_title, displaySymbol);
            }
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i3 = C17462R.string.futures_order_form_buying_power_available;
        BigDecimal bigDecimal = this.buyingPower;
        StringResource stringResourceInvoke6 = companion.invoke(i3, bigDecimal != null ? Formats.getCurrencyFormat().format(bigDecimal) : null);
        OrderSubmissionState orderSubmissionState = this.orderSubmissionState;
        OrderSubmissionState.Editing editing = OrderSubmissionState.Editing.INSTANCE;
        boolean zAreEqual = Intrinsics.areEqual(orderSubmissionState, editing);
        boolean z2 = false;
        FuturesOrderFormViewState.TextDisplay textDisplay4 = new FuturesOrderFormViewState.TextDisplay(TextFieldValues2.toTextFieldValue$default(this.quantityText, "0", false, 2, null), this.quantityText.length() == 0);
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.orderConfig.ordinal()];
        if (i4 == 1) {
            i = C17462R.string.futures_order_form_market_order_price_label;
        } else if (i4 == 2) {
            i = C17462R.string.futures_order_form_stop_order_price_label;
        } else {
            if (i4 != 3) {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Unsupported order configuration: " + this.orderConfig).toString());
            }
            i = C17462R.string.futures_order_form_limit_order_price_label;
        }
        String nullable$default = FuturesProduct5.formatNullable$default(this.product, this.quote.getBidPrice(), null, 2, null);
        String nullable$default2 = FuturesProduct5.formatNullable$default(this.product, this.quote.getAskPrice(), null, 2, null);
        StringResource stringResource2 = stringResourceInvoke;
        FuturesOrderFormViewState.TextDisplay textDisplay5 = new FuturesOrderFormViewState.TextDisplay(TextFieldValues2.toTextFieldValue$default(this.quote.getSuggestedPriceDisplay(this.side, this.product), null, false, 3, null), false);
        int i5 = i;
        FuturesOrderFormViewState.TextDisplay textDisplay6 = new FuturesOrderFormViewState.TextDisplay(TextFieldValues2.toTextFieldValue$default(getLimitPriceDisplay(), null, false, 3, null), this.userInputtedLimitPrice.length() == 0 && Intrinsics.areEqual(this.orderSubmissionState, editing));
        TextFieldValue textFieldValue$default = TextFieldValues2.toTextFieldValue$default(getStopPriceDisplay(), null, false, 3, null);
        if (this.userInputtedStopPrice.length() == 0 && Intrinsics.areEqual(this.orderSubmissionState, editing)) {
            z2 = true;
        }
        FuturesOrderFormViewState.TextDisplay textDisplay7 = new FuturesOrderFormViewState.TextDisplay(textFieldValue$default, z2);
        FuturesTimeInForce futuresTimeInForce = this.timeInForce;
        FuturesTradingHours.Session session = this.nextOpenTradingSession;
        if (session == null || (endTime = session.getEndTime()) == null) {
            textDisplay = textDisplay7;
            z = zAreEqual;
            str = nullable$default;
            stringResourceInvoke2 = null;
        } else {
            textDisplay = textDisplay7;
            z = zAreEqual;
            str = nullable$default;
            stringResourceInvoke2 = companion.invoke(C17462R.string.futures_trade_gfd_desc, InstantFormatter.DATE_NO_YEAR_IN_SYSTEM_ZONE.format(endTime), InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(endTime));
        }
        MoneyDto buyingPowerEffectDisplayAmount = getBuyingPowerEffectDisplayAmount();
        String deltaCurrency = buyingPowerEffectDisplayAmount != null ? Moneys.formatDeltaCurrency(buyingPowerEffectDisplayAmount) : null;
        MoneyDto totalFeesDisplayAmount = getTotalFeesDisplayAmount();
        StringResource stringResourceInvoke7 = (totalFeesDisplayAmount == null || (currency5 = Moneys.formatCurrency(totalFeesDisplayAmount)) == null) ? null : companion.invoke(currency5);
        MoneyDto regulatoryAndExchangeFeesDisplayAmount = getRegulatoryAndExchangeFeesDisplayAmount();
        if (regulatoryAndExchangeFeesDisplayAmount == null || (currency4 = Moneys.formatCurrency(regulatoryAndExchangeFeesDisplayAmount)) == null) {
            str2 = nullable$default2;
            stringResource = stringResource2;
            stringResourceInvoke3 = null;
        } else {
            str2 = nullable$default2;
            stringResource = stringResource2;
            stringResourceInvoke3 = companion.invoke(currency4);
        }
        MoneyDto totalCommissionDisplayAmount = getTotalCommissionDisplayAmount();
        StringResource stringResourceInvoke8 = (totalCommissionDisplayAmount == null || (currency3 = Moneys.formatCurrency(totalCommissionDisplayAmount)) == null) ? null : companion.invoke(currency3);
        MoneyDto marginRequiredDisplayAmount = getMarginRequiredDisplayAmount();
        if (marginRequiredDisplayAmount == null || (currency2 = Moneys.formatCurrency(marginRequiredDisplayAmount)) == null) {
            textDisplay2 = textDisplay4;
            stringResourceInvoke4 = null;
        } else {
            stringResourceInvoke4 = companion.invoke(currency2);
            textDisplay2 = textDisplay4;
        }
        MoneyDto totalGoldSavingsDisplayAmount = getTotalGoldSavingsDisplayAmount();
        if (totalGoldSavingsDisplayAmount == null || (currency = Moneys.formatCurrency(totalGoldSavingsDisplayAmount)) == null) {
            textDisplay3 = textDisplay2;
            stringResourceInvoke5 = null;
        } else {
            textDisplay3 = textDisplay2;
            stringResourceInvoke5 = companion.invoke(C17462R.string.futures_order_gold_savings_label, currency);
        }
        return new FuturesOrderFormViewState.OrderFormContentData(futuresOrderConfiguration, stringResource, stringResourceInvoke6, z, textDisplay3, i5, str, str2, textDisplay5, textDisplay6, textDisplay, futuresTimeInForce, stringResourceInvoke2, deltaCurrency, stringResourceInvoke7, stringResourceInvoke8, stringResourceInvoke3, stringResourceInvoke4, stringResourceInvoke5, OrderSummaryString.getOrderSummaryString(this), OrderSummaryString.getQuoteSummaryString(this));
    }

    public final FuturesOrderFormViewState.OrderReceiptContentData getOrderReceiptContentData() {
        OrderSubmissionState orderSubmissionState = this.orderSubmissionState;
        OrderSubmissionState.Submitting submitting = orderSubmissionState instanceof OrderSubmissionState.Submitting ? (OrderSubmissionState.Submitting) orderSubmissionState : null;
        OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result = submitting != null ? submitting.getResult() : null;
        OrderSubmissionManager.Result.Submitted submitted = result instanceof OrderSubmissionManager.Result.Submitted ? (OrderSubmissionManager.Result.Submitted) result : null;
        UiFuturesOrder uiFuturesOrder = submitted != null ? (UiFuturesOrder) submitted.getData() : null;
        return new FuturesOrderFormViewState.OrderReceiptContentData(uiFuturesOrder != null ? FutureOrders.getOrderReceiptTitle(uiFuturesOrder, this.contract) : null, uiFuturesOrder != null ? FutureOrders.getOrderReceiptDesc(uiFuturesOrder, this.contract, this.product) : null, uiFuturesOrder != null ? FutureOrders.getOrderReceiptQuantityStr(uiFuturesOrder) : null, uiFuturesOrder != null ? FutureOrders.getOrderReceiptFilledQuantityStr(uiFuturesOrder) : null, uiFuturesOrder != null ? FutureOrders.getOrderReceiptAvgFilledPriceStr(uiFuturesOrder, this.product) : null, uiFuturesOrder != null ? FutureOrders.getOrderReceiptBuyingPowerEffectStr(uiFuturesOrder, getBuyingPowerEffectDisplayAmount()) : null, uiFuturesOrder != null ? FutureOrders.getOrderReceiptCommissionAndFeesStr(uiFuturesOrder, getTotalFeesDisplayAmount()) : null, uiFuturesOrder != null ? FutureOrders.getOrderReceiptGoldSavingsStr(uiFuturesOrder) : null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "", "<init>", "(Ljava/lang/String;I)V", "QUANTITY", "LIMIT_PRICE", "STOP_PRICE", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FocusedText {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FocusedText[] $VALUES;
        public static final FocusedText QUANTITY = new FocusedText("QUANTITY", 0);
        public static final FocusedText LIMIT_PRICE = new FocusedText("LIMIT_PRICE", 1);
        public static final FocusedText STOP_PRICE = new FocusedText("STOP_PRICE", 2);

        private static final /* synthetic */ FocusedText[] $values() {
            return new FocusedText[]{QUANTITY, LIMIT_PRICE, STOP_PRICE};
        }

        public static EnumEntries<FocusedText> getEntries() {
            return $ENTRIES;
        }

        private FocusedText(String str, int i) {
        }

        static {
            FocusedText[] focusedTextArr$values = $values();
            $VALUES = focusedTextArr$values;
            $ENTRIES = EnumEntries2.enumEntries(focusedTextArr$values);
        }

        public static FocusedText valueOf(String str) {
            return (FocusedText) Enum.valueOf(FocusedText.class, str);
        }

        public static FocusedText[] values() {
            return (FocusedText[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$DisabledClickSource;", "", "<init>", "(Ljava/lang/String;I)V", "QUANTITY", "PRICE", "TIME_IN_FORCE", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisabledClickSource {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisabledClickSource[] $VALUES;
        public static final DisabledClickSource QUANTITY = new DisabledClickSource("QUANTITY", 0);
        public static final DisabledClickSource PRICE = new DisabledClickSource("PRICE", 1);
        public static final DisabledClickSource TIME_IN_FORCE = new DisabledClickSource("TIME_IN_FORCE", 2);

        private static final /* synthetic */ DisabledClickSource[] $values() {
            return new DisabledClickSource[]{QUANTITY, PRICE, TIME_IN_FORCE};
        }

        public static EnumEntries<DisabledClickSource> getEntries() {
            return $ENTRIES;
        }

        private DisabledClickSource(String str, int i) {
        }

        static {
            DisabledClickSource[] disabledClickSourceArr$values = $values();
            $VALUES = disabledClickSourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(disabledClickSourceArr$values);
        }

        public static DisabledClickSource valueOf(String str) {
            return (DisabledClickSource) Enum.valueOf(DisabledClickSource.class, str);
        }

        public static DisabledClickSource[] values() {
            return (DisabledClickSource[]) $VALUES.clone();
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$Companion;", "", "<init>", "()V", "initialState", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;", "args", "Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FuturesOrderFormDataState initialState(FuturesOrderFormFragmentKey args) {
            String string2;
            Intrinsics.checkNotNullParameter(args, "args");
            if (args instanceof FuturesOrderFormFragmentKey.Default) {
                FuturesOrderFormFragmentKey.Default r0 = (FuturesOrderFormFragmentKey.Default) args;
                UUID refId = r0.getRefId();
                UUID futuresContractId = r0.getFuturesContractId();
                FuturesOrderSide side = r0.getSide();
                Screen sourceScreen = r0.getSourceScreen();
                Screen screen = sourceScreen == null ? new Screen(null, null, null, null, 15, null) : sourceScreen;
                Integer defaultQuantity = r0.getDefaultQuantity();
                return new FuturesOrderFormDataState(refId, futuresContractId, side, screen, null, null, null, null, null, null, null, null, null, false, null, null, (defaultQuantity == null || (string2 = defaultQuantity.toString()) == null) ? "" : string2, null, null, null, null, false, 4128752, null);
            }
            if (!(args instanceof FuturesOrderFormFragmentKey.WithOrderToReview)) {
                throw new NoWhenBranchMatchedException();
            }
            FuturesOrderFormFragmentKey.WithOrderToReview withOrderToReview = (FuturesOrderFormFragmentKey.WithOrderToReview) args;
            UiFuturesOrderContext.OrderRequest orderToReview = withOrderToReview.getOrderToReview();
            UUID refId2 = withOrderToReview.getRefId();
            UUID futuresContractId2 = withOrderToReview.getFuturesContractId();
            FuturesOrderSide side2 = withOrderToReview.getSide();
            FuturesOrderConfiguration futuresOrderConfigurationInvoke = FuturesOrderConfiguration.INSTANCE.invoke(orderToReview.getOrderType(), orderToReview.getOrderTrigger());
            FocusedText focusedText = FocusedText.QUANTITY;
            String string3 = orderToReview.getQuantity().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            FuturesTimeInForce timeInForce = orderToReview.getTimeInForce();
            BigDecimal limitPrice = orderToReview.getLimitPrice();
            String string4 = limitPrice != null ? limitPrice.toString() : null;
            String str = string4 == null ? "" : string4;
            BigDecimal stopPrice = orderToReview.getStopPrice();
            String string5 = stopPrice != null ? stopPrice.toString() : null;
            String str2 = string5 == null ? "" : string5;
            OrderSubmissionState.Reviewing reviewing = OrderSubmissionState.Reviewing.INSTANCE;
            Screen sourceScreen2 = withOrderToReview.getSourceScreen();
            return new FuturesOrderFormDataState(refId2, futuresContractId2, side2, sourceScreen2 == null ? new Screen(null, null, null, null, 15, null) : sourceScreen2, null, null, null, null, null, null, null, null, futuresOrderConfigurationInvoke, false, focusedText, timeInForce, string3, str, str2, null, reviewing, false, 2633712, null);
        }
    }
}
