package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.ApiCryptoTradeBonusEligibility;
import com.robinhood.models.api.ApiCryptoTradeBonusInputType;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility2;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoTradeBonusStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoTradeBonusStore;", "Lcom/robinhood/store/Store;", "nummusApi", "Lcom/robinhood/models/api/retrofit/NummusApi;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/api/retrofit/NummusApi;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "getCryptoTradeBonusEligibility", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "currencyPairId", "Ljava/util/UUID;", "inputType", "Lcom/robinhood/models/api/ApiCryptoTradeBonusInputType;", "limitPrice", "Ljava/math/BigDecimal;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCryptoTradeBonusInputType;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoTradeBonusStore extends Store {
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final NummusApi nummusApi;

    /* compiled from: CryptoTradeBonusStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTradeBonusStore", m3645f = "CryptoTradeBonusStore.kt", m3646l = {31, 34}, m3647m = "getCryptoTradeBonusEligibility")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTradeBonusStore$getCryptoTradeBonusEligibility$1 */
    static final class C337611 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C337611(Continuation<? super C337611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoTradeBonusStore.this.getCryptoTradeBonusEligibility(null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTradeBonusStore(NummusApi nummusApi, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(nummusApi, "nummusApi");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummusApi = nummusApi;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r0 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCryptoTradeBonusEligibility(UUID uuid, ApiCryptoTradeBonusInputType apiCryptoTradeBonusInputType, BigDecimal bigDecimal, OrderSide orderSide, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Continuation<? super UiCryptoTradeBonusEligibility> continuation) {
        C337611 c337611;
        ApiCryptoTradeBonusInputType apiCryptoTradeBonusInputType2;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimal5;
        OrderSide orderSide2;
        BigDecimal bigDecimal6;
        if (continuation instanceof C337611) {
            c337611 = (C337611) continuation;
            int i = c337611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337611.label = i - Integer.MIN_VALUE;
            } else {
                c337611 = new C337611(continuation);
            }
        }
        C337611 c3376112 = c337611;
        Object objFirst = c3376112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3376112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Boolean> flowStreamCryptoTradeBonusUsExperimentState = this.cryptoExperimentsStore.streamCryptoTradeBonusUsExperimentState();
            c3376112.L$0 = uuid;
            c3376112.L$1 = apiCryptoTradeBonusInputType;
            c3376112.L$2 = bigDecimal;
            c3376112.L$3 = orderSide;
            c3376112.L$4 = bigDecimal2;
            c3376112.L$5 = bigDecimal3;
            c3376112.label = 1;
            objFirst = FlowKt.first(flowStreamCryptoTradeBonusUsExperimentState, c3376112);
            if (objFirst != coroutine_suspended) {
                apiCryptoTradeBonusInputType2 = apiCryptoTradeBonusInputType;
                bigDecimal4 = bigDecimal2;
                bigDecimal5 = bigDecimal3;
                orderSide2 = orderSide;
                bigDecimal6 = bigDecimal;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
            return UiCryptoTradeBonusEligibility2.toUiModel((ApiCryptoTradeBonusEligibility) objFirst);
        }
        BigDecimal bigDecimal7 = (BigDecimal) c3376112.L$5;
        BigDecimal bigDecimal8 = (BigDecimal) c3376112.L$4;
        OrderSide orderSide3 = (OrderSide) c3376112.L$3;
        BigDecimal bigDecimal9 = (BigDecimal) c3376112.L$2;
        ApiCryptoTradeBonusInputType apiCryptoTradeBonusInputType3 = (ApiCryptoTradeBonusInputType) c3376112.L$1;
        UUID uuid2 = (UUID) c3376112.L$0;
        ResultKt.throwOnFailure(objFirst);
        bigDecimal5 = bigDecimal7;
        bigDecimal4 = bigDecimal8;
        uuid = uuid2;
        apiCryptoTradeBonusInputType2 = apiCryptoTradeBonusInputType3;
        bigDecimal6 = bigDecimal9;
        orderSide2 = orderSide3;
        if (!((Boolean) objFirst).booleanValue()) {
            return null;
        }
        NummusApi nummusApi = this.nummusApi;
        c3376112.L$0 = null;
        c3376112.L$1 = null;
        c3376112.L$2 = null;
        c3376112.L$3 = null;
        c3376112.L$4 = null;
        c3376112.L$5 = null;
        c3376112.label = 2;
        objFirst = nummusApi.getTradeBonusEligibility(uuid, apiCryptoTradeBonusInputType2, bigDecimal6, bigDecimal4, bigDecimal5, orderSide2, c3376112);
    }
}
