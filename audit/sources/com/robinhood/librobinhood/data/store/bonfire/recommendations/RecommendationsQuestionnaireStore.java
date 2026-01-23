package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.recommendations.models.api.ApiRecommendationsQuestionnaireConfirmationPostBody;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.util.UUID;
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

/* compiled from: RecommendationsQuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u0010J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire;", "confirmationEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsQuestionnaireConfirmationPostBody;", "fetchRecommendationQuestionnaire", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "confirmAnswers", "submissionId", "Ljava/util/UUID;", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationsQuestionnaireStore extends Store {
    private final PostEndpoint<ApiRecommendationsQuestionnaireConfirmationPostBody, Unit> confirmationEndpoint;
    private final Endpoint<Unit, UiRecommendationsQuestionnaire> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsQuestionnaireStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RecommendationsQuestionnaireStore4(recommendationsApi, null), getLogoutKillswitch(), new RecommendationsQuestionnaireStore5(null), storeBundle.getClock(), null, 16, null);
        this.confirmationEndpoint = PostEndpoint.INSTANCE.create(new RecommendationsQuestionnaireStore2(recommendationsApi, null), new RecommendationsQuestionnaireStore3(null));
    }

    /* compiled from: RecommendationsQuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore$fetchRecommendationQuestionnaire$1", m3645f = "RecommendationsQuestionnaireStore.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore$fetchRecommendationQuestionnaire$1 */
    static final class C347041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiRecommendationsQuestionnaire>>, Object> {
        Object L$0;
        int label;

        C347041(Continuation<? super C347041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsQuestionnaireStore.this.new C347041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiRecommendationsQuestionnaire>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiRecommendationsQuestionnaire>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiRecommendationsQuestionnaire>> continuation) {
            return ((C347041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                Endpoint endpoint = RecommendationsQuestionnaireStore.this.endpoint;
                Unit unit = Unit.INSTANCE;
                this.L$0 = companion2;
                this.label = 1;
                Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
                if (objForceFetch$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = objForceFetch$default;
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

    public final Single<Optional<UiRecommendationsQuestionnaire>> fetchRecommendationQuestionnaire() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347041(null), 1, null);
    }

    /* compiled from: RecommendationsQuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore$confirmAnswers$1", m3645f = "RecommendationsQuestionnaireStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore$confirmAnswers$1 */
    static final class C347031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Unit>>, Object> {
        final /* synthetic */ ApiRecommendationsQuestionnaireConfirmationPostBody $requestBody;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347031(ApiRecommendationsQuestionnaireConfirmationPostBody apiRecommendationsQuestionnaireConfirmationPostBody, Continuation<? super C347031> continuation) {
            super(2, continuation);
            this.$requestBody = apiRecommendationsQuestionnaireConfirmationPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsQuestionnaireStore.this.new C347031(this.$requestBody, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Unit>> continuation) {
            return ((C347031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                PostEndpoint postEndpoint = RecommendationsQuestionnaireStore.this.confirmationEndpoint;
                ApiRecommendationsQuestionnaireConfirmationPostBody apiRecommendationsQuestionnaireConfirmationPostBody = this.$requestBody;
                this.L$0 = companion2;
                this.label = 1;
                Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiRecommendationsQuestionnaireConfirmationPostBody, null, this, 2, null);
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

    public final Single<Optional<Unit>> confirmAnswers(UUID submissionId) {
        Intrinsics.checkNotNullParameter(submissionId, "submissionId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347031(new ApiRecommendationsQuestionnaireConfirmationPostBody(submissionId), null), 1, null);
    }
}
