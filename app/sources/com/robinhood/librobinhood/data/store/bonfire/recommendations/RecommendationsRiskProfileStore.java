package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.recommendations.models.api.ApiRecommendationsRiskProfilePostBody;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsRiskProfile;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecommendationsRiskProfileStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0012R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsRiskProfileStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsRiskProfilePostBody;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "createRiskProfile", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "questionsAndAnswers", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "submissionId", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RecommendationsRiskProfileStore extends Store {
    private final PostEndpoint<ApiRecommendationsRiskProfilePostBody, UiRecommendationsRiskProfile> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsRiskProfileStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = PostEndpoint.INSTANCE.create(new RecommendationsRiskProfileStore2(recommendationsApi, null), new RecommendationsRiskProfileStore3(null));
    }

    public final Single<Optional<UiRecommendationsRiskProfile>> createRiskProfile(List<Tuples2<UUID, UUID>> questionsAndAnswers, UUID submissionId) {
        Intrinsics.checkNotNullParameter(questionsAndAnswers, "questionsAndAnswers");
        Intrinsics.checkNotNullParameter(submissionId, "submissionId");
        List<Tuples2<UUID, UUID>> list = questionsAndAnswers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            arrayList.add(new ApiRecommendationsRiskProfilePostBody.ApiQuestionAnswerSubmit((UUID) tuples2.getFirst(), (UUID) tuples2.getSecond()));
        }
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347061(new ApiRecommendationsRiskProfilePostBody(arrayList, submissionId), null), 1, null);
    }

    /* compiled from: RecommendationsRiskProfileStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsRiskProfileStore$createRiskProfile$1", m3645f = "RecommendationsRiskProfileStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsRiskProfileStore$createRiskProfile$1 */
    static final class C347061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiRecommendationsRiskProfile>>, Object> {
        final /* synthetic */ ApiRecommendationsRiskProfilePostBody $requestBody;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347061(ApiRecommendationsRiskProfilePostBody apiRecommendationsRiskProfilePostBody, Continuation<? super C347061> continuation) {
            super(2, continuation);
            this.$requestBody = apiRecommendationsRiskProfilePostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsRiskProfileStore.this.new C347061(this.$requestBody, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiRecommendationsRiskProfile>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiRecommendationsRiskProfile>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiRecommendationsRiskProfile>> continuation) {
            return ((C347061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                PostEndpoint postEndpoint = RecommendationsRiskProfileStore.this.endpoint;
                ApiRecommendationsRiskProfilePostBody apiRecommendationsRiskProfilePostBody = this.$requestBody;
                this.L$0 = companion2;
                this.label = 1;
                Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiRecommendationsRiskProfilePostBody, null, this, 2, null);
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
