package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.util.Money;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderSummaryPostBody;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsOrderSummary;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
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

/* compiled from: RecommendationsOrderSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R&\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderSummaryStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderSummaryPostBody;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderSummary;", "createRecommendationOrderSummary", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "recommendationId", "amount", "Lcom/robinhood/models/util/Money;", "accountNumber", "", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationsOrderSummaryStore extends Store {
    private final PostEndpoint<Tuples2<UUID, ApiRecommendationsOrderSummaryPostBody>, UiRecommendationsOrderSummary> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsOrderSummaryStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = PostEndpoint.INSTANCE.create(new RecommendationsOrderSummaryStore2(recommendationsApi, null), new RecommendationsOrderSummaryStore3(null));
    }

    public final Single<Optional<UiRecommendationsOrderSummary>> createRecommendationOrderSummary(UUID recommendationId, Money amount, String accountNumber) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347011(recommendationId, new ApiRecommendationsOrderSummaryPostBody(accountNumber, amount), null), 1, null);
    }

    /* compiled from: RecommendationsOrderSummaryStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderSummary;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderSummaryStore$createRecommendationOrderSummary$1", m3645f = "RecommendationsOrderSummaryStore.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderSummaryStore$createRecommendationOrderSummary$1 */
    static final class C347011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiRecommendationsOrderSummary>>, Object> {
        final /* synthetic */ UUID $recommendationId;
        final /* synthetic */ ApiRecommendationsOrderSummaryPostBody $request;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347011(UUID uuid, ApiRecommendationsOrderSummaryPostBody apiRecommendationsOrderSummaryPostBody, Continuation<? super C347011> continuation) {
            super(2, continuation);
            this.$recommendationId = uuid;
            this.$request = apiRecommendationsOrderSummaryPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsOrderSummaryStore.this.new C347011(this.$recommendationId, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiRecommendationsOrderSummary>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiRecommendationsOrderSummary>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiRecommendationsOrderSummary>> continuation) {
            return ((C347011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                PostEndpoint postEndpoint = RecommendationsOrderSummaryStore.this.endpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$recommendationId, this.$request);
                this.L$0 = companion2;
                this.label = 1;
                Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
                if (objPost$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = objPost$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Optional.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.m2972of(obj);
        }
    }
}
