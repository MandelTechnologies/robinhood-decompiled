package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.util.Money;
import com.robinhood.recommendations.models.api.ApiRecommendationsCheckoutReviewPostBody;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutReview;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
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
import p479j$.time.Duration;

/* compiled from: RecommendationsCheckoutReviewStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00192\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutReviewStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/coroutines/rx/RxFactory;)V", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsCheckoutReviewPostBody;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutReview;", "createCheckoutReview", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "recommendationId", "amount", "Lcom/robinhood/models/util/Money;", "poll", "Lio/reactivex/Observable;", "Companion", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationsCheckoutReviewStore extends Store {
    private static final long NBBO_REFRESH_INTERVAL_MINUTES = 15;
    private final Endpoint<Tuples2<UUID, ApiRecommendationsCheckoutReviewPostBody>, UiRecommendationsCheckoutReview> endpoint;
    private final RxFactory rxFactory;

    public final RxFactory getRxFactory() {
        return this.rxFactory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsCheckoutReviewStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle, RxFactory rxFactory) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.rxFactory = rxFactory;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RecommendationsCheckoutReviewStore2(recommendationsApi, null), getLogoutKillswitch(), new RecommendationsCheckoutReviewStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: RecommendationsCheckoutReviewStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutReview;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutReviewStore$createCheckoutReview$1", m3645f = "RecommendationsCheckoutReviewStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutReviewStore$createCheckoutReview$1 */
    static final class C346961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiRecommendationsCheckoutReview>>, Object> {
        final /* synthetic */ UUID $recommendationId;
        final /* synthetic */ ApiRecommendationsCheckoutReviewPostBody $requestBody;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346961(UUID uuid, ApiRecommendationsCheckoutReviewPostBody apiRecommendationsCheckoutReviewPostBody, Continuation<? super C346961> continuation) {
            super(2, continuation);
            this.$recommendationId = uuid;
            this.$requestBody = apiRecommendationsCheckoutReviewPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsCheckoutReviewStore.this.new C346961(this.$recommendationId, this.$requestBody, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiRecommendationsCheckoutReview>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiRecommendationsCheckoutReview>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiRecommendationsCheckoutReview>> continuation) {
            return ((C346961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                Endpoint endpoint = RecommendationsCheckoutReviewStore.this.endpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$recommendationId, this.$requestBody);
                this.L$0 = companion2;
                this.label = 1;
                Object objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, tuples2M3642to, null, this, 2, null);
                if (objFetch$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = objFetch$default;
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

    public final Single<Optional<UiRecommendationsCheckoutReview>> createCheckoutReview(UUID recommendationId, Money amount) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346961(recommendationId, new ApiRecommendationsCheckoutReviewPostBody(amount), null), 1, null);
    }

    public final Observable<UiRecommendationsCheckoutReview> poll(UUID recommendationId, Money amount) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        ApiRecommendationsCheckoutReviewPostBody apiRecommendationsCheckoutReviewPostBody = new ApiRecommendationsCheckoutReviewPostBody(amount);
        Endpoint<Tuples2<UUID, ApiRecommendationsCheckoutReviewPostBody>, UiRecommendationsCheckoutReview> endpoint = this.endpoint;
        Tuples2 tuples2M3642to = Tuples4.m3642to(recommendationId, apiRecommendationsCheckoutReviewPostBody);
        Duration durationOfMinutes = Duration.ofMinutes(NBBO_REFRESH_INTERVAL_MINUTES);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return this.rxFactory.convertToObservable(Endpoint.DefaultImpls.poll$default(endpoint, tuples2M3642to, durationOfMinutes, null, 4, null));
    }
}
