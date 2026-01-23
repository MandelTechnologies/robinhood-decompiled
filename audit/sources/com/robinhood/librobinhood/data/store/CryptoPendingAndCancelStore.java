package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Nummus;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrdersRequest;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CryptoPendingAndCancelStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "Lcom/robinhood/store/Store;", "nummusApi", "Lcom/robinhood/api/retrofit/Nummus;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Nummus;Lcom/robinhood/store/StoreBundle;)V", "cancelAllBuySidePendingOrdersAndReturnResponse", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrders;", "cancelAllBuySidePendingOrders", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoPendingAndCancelStore extends Store {
    private final Nummus nummusApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPendingAndCancelStore(Nummus nummusApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(nummusApi, "nummusApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummusApi = nummusApi;
    }

    /* compiled from: CryptoPendingAndCancelStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrders;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore$cancelAllBuySidePendingOrdersAndReturnResponse$1", m3645f = "CryptoPendingAndCancelStore.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore$cancelAllBuySidePendingOrdersAndReturnResponse$1 */
    static final class C337421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiCryptoCancelAllPendingOrders>>, Object> {
        int label;

        C337421(Continuation<? super C337421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPendingAndCancelStore.this.new C337421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiCryptoCancelAllPendingOrders>> continuation) {
            return ((C337421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Nummus nummus2 = CryptoPendingAndCancelStore.this.nummusApi;
            ApiCryptoCancelAllPendingOrdersRequest apiCryptoCancelAllPendingOrdersRequest = new ApiCryptoCancelAllPendingOrdersRequest(OrderSide.BUY);
            this.label = 1;
            Object objCancelAllPendingOrders = nummus2.cancelAllPendingOrders(apiCryptoCancelAllPendingOrdersRequest, this);
            return objCancelAllPendingOrders == coroutine_suspended ? coroutine_suspended : objCancelAllPendingOrders;
        }
    }

    public final Single<Response<ApiCryptoCancelAllPendingOrders>> cancelAllBuySidePendingOrdersAndReturnResponse() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337421(null), 1, null);
    }

    /* compiled from: CryptoPendingAndCancelStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrders;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore$cancelAllBuySidePendingOrders$1", m3645f = "CryptoPendingAndCancelStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore$cancelAllBuySidePendingOrders$1 */
    static final class C337411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoCancelAllPendingOrders>, Object> {
        int label;

        C337411(Continuation<? super C337411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPendingAndCancelStore.this.new C337411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoCancelAllPendingOrders> continuation) {
            return ((C337411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Nummus nummus2 = CryptoPendingAndCancelStore.this.nummusApi;
                ApiCryptoCancelAllPendingOrdersRequest apiCryptoCancelAllPendingOrdersRequest = new ApiCryptoCancelAllPendingOrdersRequest(OrderSide.BUY);
                this.label = 1;
                obj = nummus2.cancelAllPendingOrders(apiCryptoCancelAllPendingOrdersRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                return (ApiCryptoCancelAllPendingOrders) objBody;
            }
            throw new HttpException(response);
        }
    }

    public final Single<ApiCryptoCancelAllPendingOrders> cancelAllBuySidePendingOrders() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337411(null), 1, null);
    }
}
