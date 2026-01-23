package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.ApiRecommendationsLearnMore;
import com.robinhood.recommendations.models.api.RecommendationsLearnMoreEntryPoint;
import com.robinhood.recommendations.models.p362db.RecommendationsLearnMore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecommendationsLearnMoreStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/db/RecommendationsLearnMore;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsLearnMoreStore$endpoint$1", m3645f = "RecommendationsLearnMoreStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsLearnMoreStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecommendationsLearnMoreStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends RecommendationsLearnMoreEntryPoint>, Continuation<? super RecommendationsLearnMore>, Object> {
    final /* synthetic */ RecommendationsApi $recommendationsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsLearnMoreStore2(RecommendationsApi recommendationsApi, Continuation<? super RecommendationsLearnMoreStore2> continuation) {
        super(2, continuation);
        this.$recommendationsApi = recommendationsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsLearnMoreStore2 recommendationsLearnMoreStore2 = new RecommendationsLearnMoreStore2(this.$recommendationsApi, continuation);
        recommendationsLearnMoreStore2.L$0 = obj;
        return recommendationsLearnMoreStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends RecommendationsLearnMoreEntryPoint> tuples2, Continuation<? super RecommendationsLearnMore> continuation) {
        return invoke2((Tuples2<UUID, ? extends RecommendationsLearnMoreEntryPoint>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ? extends RecommendationsLearnMoreEntryPoint> tuples2, Continuation<? super RecommendationsLearnMore> continuation) {
        return ((RecommendationsLearnMoreStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid = (UUID) tuples2.component1();
            RecommendationsLearnMoreEntryPoint recommendationsLearnMoreEntryPoint = (RecommendationsLearnMoreEntryPoint) tuples2.component2();
            RecommendationsApi recommendationsApi = this.$recommendationsApi;
            String serverValue = recommendationsLearnMoreEntryPoint.getServerValue();
            this.label = 1;
            obj = recommendationsApi.getRecommendationsLearnMore(uuid, serverValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiRecommendationsLearnMore) obj).toDbModel();
    }
}
