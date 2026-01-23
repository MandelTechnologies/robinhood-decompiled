package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.coroutines.RetryOnError;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation2;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.utils.OrderSides3;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nummus.p512v1.FeeEstimationRequestDto;
import nummus.p512v1.FeeEstimationResponseDto;
import nummus.p512v1.RestNummusService;
import rosetta.nummus.order.SideDto;

/* compiled from: CryptoFeeStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fJ*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeStore;", "Lcom/robinhood/store/Store;", "nummusService", "Lnummus/v1/RestNummusService;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lnummus/v1/RestNummusService;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/store/StoreBundle;)V", "getCryptoAccountId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeeEstimation", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "currencyPairId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "cryptoAccountId", "(Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoFeeStore extends Store {
    private final CryptoAccountStore cryptoAccountStore;
    private final RestNummusService nummusService;

    /* compiled from: CryptoFeeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeStore", m3645f = "CryptoFeeStore.kt", m3646l = {28}, m3647m = "getCryptoAccountId")
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeStore$getCryptoAccountId$1 */
    static final class C348011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348011(Continuation<? super C348011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoFeeStore.this.getCryptoAccountId(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoFeeStore(RestNummusService nummusService, CryptoAccountStore cryptoAccountStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummusService = nummusService;
        this.cryptoAccountStore = cryptoAccountStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCryptoAccountId(Continuation<? super String> continuation) {
        C348011 c348011;
        if (continuation instanceof C348011) {
            c348011 = (C348011) continuation;
            int i = c348011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348011.label = i - Integer.MIN_VALUE;
            } else {
                c348011 = new C348011(continuation);
            }
        }
        Object objFirstOrNull = c348011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<CryptoAccount> flowStreamAccount = this.cryptoAccountStore.streamAccount();
            c348011.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamAccount, c348011);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        CryptoAccount cryptoAccount = (CryptoAccount) objFirstOrNull;
        String id = cryptoAccount != null ? cryptoAccount.getId() : null;
        return id == null ? "" : id;
    }

    public static /* synthetic */ Object getFeeEstimation$default(CryptoFeeStore cryptoFeeStore, UUID uuid, OrderSide orderSide, UUID uuid2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            uuid2 = null;
        }
        return cryptoFeeStore.getFeeEstimation(uuid, orderSide, uuid2, continuation);
    }

    public final Object getFeeEstimation(UUID uuid, OrderSide orderSide, UUID uuid2, Continuation<? super UiFeeEstimation> continuation) {
        return RetryOnError.retryExponential(3, new Function1() { // from class: com.robinhood.librobinhood.data.store.fee.CryptoFeeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CryptoFeeStore.getFeeEstimation$lambda$0((Throwable) obj));
            }
        }, new C348023(uuid, orderSide, uuid2, null), continuation);
    }

    /* compiled from: CryptoFeeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeStore$getFeeEstimation$3", m3645f = "CryptoFeeStore.kt", m3646l = {57, 53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeStore$getFeeEstimation$3 */
    static final class C348023 extends ContinuationImpl7 implements Function1<Continuation<? super UiFeeEstimation>, Object> {
        final /* synthetic */ UUID $cryptoAccountId;
        final /* synthetic */ UUID $currencyPairId;
        final /* synthetic */ OrderSide $orderSide;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348023(UUID uuid, OrderSide orderSide, UUID uuid2, Continuation<? super C348023> continuation) {
            super(1, continuation);
            this.$currencyPairId = uuid;
            this.$orderSide = orderSide;
            this.$cryptoAccountId = uuid2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CryptoFeeStore.this.new C348023(this.$currencyPairId, this.$orderSide, this.$cryptoAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super UiFeeEstimation> continuation) {
            return ((C348023) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
        
            if (r2 != r1) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RestNummusService restNummusService;
            Object cryptoAccountId;
            String str;
            SideDto sideDto;
            RestNummusService restNummusService2;
            String str2;
            SideDto sideDto2;
            Object objFeeEstimation;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                restNummusService = CryptoFeeStore.this.nummusService;
                String string2 = this.$currencyPairId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                SideDto sideDto3 = OrderSides3.getSideDto(this.$orderSide);
                UUID uuid = this.$cryptoAccountId;
                if (uuid == null || (string = uuid.toString()) == null) {
                    CryptoFeeStore cryptoFeeStore = CryptoFeeStore.this;
                    this.L$0 = restNummusService;
                    this.L$1 = string2;
                    this.L$2 = sideDto3;
                    this.label = 1;
                    cryptoAccountId = cryptoFeeStore.getCryptoAccountId(this);
                    if (cryptoAccountId != coroutine_suspended) {
                        str = string2;
                        sideDto = sideDto3;
                        restNummusService2 = restNummusService;
                    }
                    return coroutine_suspended;
                }
                str2 = string2;
                sideDto2 = sideDto3;
                FeeEstimationRequestDto feeEstimationRequestDto = new FeeEstimationRequestDto(str2, sideDto2, null, null, null, null, null, null, string, null, 764, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                objFeeEstimation = restNummusService.FeeEstimation(feeEstimationRequestDto, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objFeeEstimation = obj;
                    return UiFeeEstimation2.getUiModel((FeeEstimationResponseDto) objFeeEstimation);
                }
                sideDto = (SideDto) this.L$2;
                String str3 = (String) this.L$1;
                RestNummusService restNummusService3 = (RestNummusService) this.L$0;
                ResultKt.throwOnFailure(obj);
                restNummusService2 = restNummusService3;
                str = str3;
                cryptoAccountId = obj;
            }
            String string3 = (String) cryptoAccountId;
            sideDto2 = sideDto;
            str2 = str;
            restNummusService = restNummusService2;
            FeeEstimationRequestDto feeEstimationRequestDto2 = new FeeEstimationRequestDto(str2, sideDto2, null, null, null, null, null, null, string3, null, 764, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            objFeeEstimation = restNummusService.FeeEstimation(feeEstimationRequestDto2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFeeEstimation$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }
}
