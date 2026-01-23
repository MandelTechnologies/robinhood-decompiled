package com.robinhood.shared.trade.crypto.p397ui.tradeBonus;

import com.robinhood.librobinhood.data.store.CryptoTradeBonusStore;
import com.robinhood.models.api.ApiCryptoTradeBonusInputType;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradeBonusEligibilityProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "", "cryptoTradeBonusStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradeBonusStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoTradeBonusStore;)V", "get", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "requestContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTradeBonusEligibilityProvider {
    public static final int $stable = 8;
    private final CryptoTradeBonusStore cryptoTradeBonusStore;

    /* compiled from: CryptoTradeBonusEligibilityProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: CryptoTradeBonusEligibilityProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.tradeBonus.CryptoTradeBonusEligibilityProvider", m3645f = "CryptoTradeBonusEligibilityProvider.kt", m3646l = {32}, m3647m = "get")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.CryptoTradeBonusEligibilityProvider$get$1 */
    static final class C408331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C408331(Continuation<? super C408331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoTradeBonusEligibilityProvider.this.get(null, this);
        }
    }

    public CryptoTradeBonusEligibilityProvider(CryptoTradeBonusStore cryptoTradeBonusStore) {
        Intrinsics.checkNotNullParameter(cryptoTradeBonusStore, "cryptoTradeBonusStore");
        this.cryptoTradeBonusStore = cryptoTradeBonusStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(CryptoOrderContext.RequestContext requestContext, Continuation<? super UiCryptoTradeBonusEligibility> continuation) {
        C408331 c408331;
        Object objM28550constructorimpl;
        ApiCryptoTradeBonusInputType apiCryptoTradeBonusInputType;
        BigDecimal bigDecimalCompat;
        BigDecimal purchaseCost;
        if (continuation instanceof C408331) {
            c408331 = (C408331) continuation;
            int i = c408331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c408331.label = i - Integer.MIN_VALUE;
            } else {
                c408331 = new C408331(continuation);
            }
        }
        C408331 c4083312 = c408331;
        Object cryptoTradeBonusEligibility = c4083312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4083312.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(cryptoTradeBonusEligibility);
                Result.Companion companion = Result.INSTANCE;
                CryptoTradeBonusStore cryptoTradeBonusStore = this.cryptoTradeBonusStore;
                UUID id = requestContext.getCurrencyPair().getId();
                int i3 = WhenMappings.$EnumSwitchMapping$0[requestContext.getRequestInputs().getInputMode().ordinal()];
                if (i3 == 1) {
                    apiCryptoTradeBonusInputType = ApiCryptoTradeBonusInputType.QUOTE;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    apiCryptoTradeBonusInputType = ApiCryptoTradeBonusInputType.ASSET;
                }
                CryptoOrderPrices orderPrices = requestContext.getRequestInputs().getOrderPrices();
                CryptoOrderPrices.Limit limit = orderPrices instanceof CryptoOrderPrices.Limit ? (CryptoOrderPrices.Limit) orderPrices : null;
                BigDecimal limitPrice = limit != null ? limit.getLimitPrice() : null;
                OrderSide side = requestContext.getRequestInputs().getSide();
                int i4 = WhenMappings.$EnumSwitchMapping$1[requestContext.getRequestInputs().getSide().ordinal()];
                if (i4 == 1) {
                    bigDecimalCompat = Money3.getBigDecimalCompat(requestContext.getQuote().getAskPrice());
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimalCompat = Money3.getBigDecimalCompat(requestContext.getQuote().getBidPrice());
                }
                RequestInputs requestInputs = requestContext.getRequestInputs();
                if (requestInputs instanceof RequestInputs.AsAsset) {
                    purchaseCost = ((RequestInputs.AsAsset) requestContext.getRequestInputs()).getPurchaseSize();
                } else {
                    if (!(requestInputs instanceof RequestInputs.AsQuote)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    purchaseCost = ((RequestInputs.AsQuote) requestContext.getRequestInputs()).getPurchaseCost();
                }
                BigDecimal bigDecimal = purchaseCost;
                c4083312.label = 1;
                cryptoTradeBonusEligibility = cryptoTradeBonusStore.getCryptoTradeBonusEligibility(id, apiCryptoTradeBonusInputType, limitPrice, side, bigDecimalCompat, bigDecimal, c4083312);
                if (cryptoTradeBonusEligibility == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(cryptoTradeBonusEligibility);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((UiCryptoTradeBonusEligibility) cryptoTradeBonusEligibility);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            return (UiCryptoTradeBonusEligibility) objM28550constructorimpl;
        }
        return null;
    }
}
