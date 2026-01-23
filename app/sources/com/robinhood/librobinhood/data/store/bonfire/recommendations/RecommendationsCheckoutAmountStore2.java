package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.ApiRecommendationsCheckoutAmount;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutAmount;
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

/* compiled from: RecommendationsCheckoutAmountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutAmount;", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutAmountStore$endpoint$1", m3645f = "RecommendationsCheckoutAmountStore.kt", m3646l = {24}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutAmountStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecommendationsCheckoutAmountStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends UUID>, Continuation<? super UiRecommendationsCheckoutAmount>, Object> {
    final /* synthetic */ RecommendationsApi $recommendationsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsCheckoutAmountStore2(RecommendationsApi recommendationsApi, Continuation<? super RecommendationsCheckoutAmountStore2> continuation) {
        super(2, continuation);
        this.$recommendationsApi = recommendationsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsCheckoutAmountStore2 recommendationsCheckoutAmountStore2 = new RecommendationsCheckoutAmountStore2(this.$recommendationsApi, continuation);
        recommendationsCheckoutAmountStore2.L$0 = obj;
        return recommendationsCheckoutAmountStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends UUID> tuples2, Continuation<? super UiRecommendationsCheckoutAmount> continuation) {
        return invoke2((Tuples2<String, UUID>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, UUID> tuples2, Continuation<? super UiRecommendationsCheckoutAmount> continuation) {
        return ((RecommendationsCheckoutAmountStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            String str = (String) tuples2.component1();
            UUID uuid = (UUID) tuples2.component2();
            RecommendationsApi recommendationsApi = this.$recommendationsApi;
            this.label = 1;
            obj = recommendationsApi.getRecommendationsCheckoutAmount(uuid, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiRecommendationsCheckoutAmount) obj).toUiModel();
    }
}
