package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.util.Money;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderPostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderResponse;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsOrderReceipt;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecommendationsOrderStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u000e\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;)V", "orderSubmissionEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderPostBody;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderResponse;", "orderReceiptEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderReceipt;", "submitOrder", "Lio/reactivex/Single;", "recommendationId", "amount", "Lcom/robinhood/models/util/Money;", "rhsAccountNumber", "pollOrderReceipt", "Lio/reactivex/Observable;", "investmentId", "transferIds", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationsOrderStore extends Store {
    private final Endpoint<Tuples2<UUID, List<String>>, UiRecommendationsOrderReceipt> orderReceiptEndpoint;
    private final PostEndpoint<Tuples2<UUID, ApiRecommendationsOrderPostBody>, ApiRecommendationsOrderResponse> orderSubmissionEndpoint;
    private final RecommendationsApi recommendationsApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsOrderStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.recommendationsApi = recommendationsApi;
        this.orderSubmissionEndpoint = PostEndpoint.INSTANCE.create(new RecommendationsOrderStore4(this, null), new RecommendationsOrderStore5(null));
        this.orderReceiptEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RecommendationsOrderStore2(this, null), getLogoutKillswitch(), new RecommendationsOrderStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Single<ApiRecommendationsOrderResponse> submitOrder(UUID recommendationId, Money amount, String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347001(recommendationId, new ApiRecommendationsOrderPostBody(amount, rhsAccountNumber), null), 1, null);
    }

    /* compiled from: RecommendationsOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderStore$submitOrder$1", m3645f = "RecommendationsOrderStore.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderStore$submitOrder$1 */
    static final class C347001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRecommendationsOrderResponse>, Object> {
        final /* synthetic */ UUID $recommendationId;
        final /* synthetic */ ApiRecommendationsOrderPostBody $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347001(UUID uuid, ApiRecommendationsOrderPostBody apiRecommendationsOrderPostBody, Continuation<? super C347001> continuation) {
            super(2, continuation);
            this.$recommendationId = uuid;
            this.$request = apiRecommendationsOrderPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsOrderStore.this.new C347001(this.$recommendationId, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRecommendationsOrderResponse> continuation) {
            return ((C347001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = RecommendationsOrderStore.this.orderSubmissionEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$recommendationId, this.$request);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Observable<UiRecommendationsOrderReceipt> pollOrderReceipt(UUID investmentId, List<String> transferIds) {
        Intrinsics.checkNotNullParameter(investmentId, "investmentId");
        Intrinsics.checkNotNullParameter(transferIds, "transferIds");
        return asObservable(Endpoint.DefaultImpls.poll$default(this.orderReceiptEndpoint, Tuples4.m3642to(investmentId, transferIds), null, null, 6, null));
    }
}
