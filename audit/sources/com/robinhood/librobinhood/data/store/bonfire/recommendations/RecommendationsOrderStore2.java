package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderReceipt;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsOrderReceipt;
import java.util.List;
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

/* compiled from: RecommendationsOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderReceipt;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderStore$orderReceiptEndpoint$1", m3645f = "RecommendationsOrderStore.kt", m3646l = {38}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderStore$orderReceiptEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecommendationsOrderStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends List<? extends String>>, Continuation<? super UiRecommendationsOrderReceipt>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecommendationsOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsOrderStore2(RecommendationsOrderStore recommendationsOrderStore, Continuation<? super RecommendationsOrderStore2> continuation) {
        super(2, continuation);
        this.this$0 = recommendationsOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsOrderStore2 recommendationsOrderStore2 = new RecommendationsOrderStore2(this.this$0, continuation);
        recommendationsOrderStore2.L$0 = obj;
        return recommendationsOrderStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends List<? extends String>> tuples2, Continuation<? super UiRecommendationsOrderReceipt> continuation) {
        return invoke2((Tuples2<UUID, ? extends List<String>>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ? extends List<String>> tuples2, Continuation<? super UiRecommendationsOrderReceipt> continuation) {
        return ((RecommendationsOrderStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid = (UUID) tuples2.component1();
            List list = (List) tuples2.component2();
            RecommendationsApi recommendationsApi = this.this$0.recommendationsApi;
            CommaSeparatedList<String> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(list);
            this.label = 1;
            obj = recommendationsApi.getRecommendationsOrderReceipt(uuid, commaSeparatedList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiRecommendationsOrderReceipt) obj).toUiModel();
    }
}
