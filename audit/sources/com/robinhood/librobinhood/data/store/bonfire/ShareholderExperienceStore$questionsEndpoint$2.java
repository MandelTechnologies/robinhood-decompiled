package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestion;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestionsPaginatedResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShareholderExperienceStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion$OnlyQuestionsRequest;", "Lcom/robinhood/models/PaginationCursor;", "response", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$questionsEndpoint$2", m3645f = "ShareholderExperienceStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class ShareholderExperienceStore$questionsEndpoint$2 extends ContinuationImpl7 implements Function3<Tuples2<? extends ApiShareholderQuestion.OnlyQuestionsRequest, ? extends PaginationCursor>, PaginatedResult<? extends ApiShareholderQuestion>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareholderExperienceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareholderExperienceStore$questionsEndpoint$2(ShareholderExperienceStore shareholderExperienceStore, Continuation<? super ShareholderExperienceStore$questionsEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = shareholderExperienceStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiShareholderQuestion.OnlyQuestionsRequest, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiShareholderQuestion> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ApiShareholderQuestion.OnlyQuestionsRequest, PaginationCursor>) tuples2, (PaginatedResult<ApiShareholderQuestion>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiShareholderQuestion.OnlyQuestionsRequest, PaginationCursor> tuples2, PaginatedResult<ApiShareholderQuestion> paginatedResult, Continuation<? super Unit> continuation) {
        ShareholderExperienceStore$questionsEndpoint$2 shareholderExperienceStore$questionsEndpoint$2 = new ShareholderExperienceStore$questionsEndpoint$2(this.this$0, continuation);
        shareholderExperienceStore$questionsEndpoint$2.L$0 = paginatedResult;
        return shareholderExperienceStore$questionsEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        Intrinsics.checkNotNull(paginatedResult, "null cannot be cast to non-null type com.robinhood.shareholderx.models.api.ApiShareholderQuestionsPaginatedResponse<com.robinhood.shareholderx.models.api.ApiShareholderQuestion>");
        Iterable<ApiShareholderQuestion> results = ((ApiShareholderQuestionsPaginatedResponse) paginatedResult).getResults();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ApiShareholderQuestion apiShareholderQuestion : results) {
            linkedHashMap.put(apiShareholderQuestion.getId(), apiShareholderQuestion.toDbModel());
        }
        this.this$0.questionsLookup.setValue(MapsKt.plus((Map) this.this$0.questionsLookup.getValue(), linkedHashMap));
        return Unit.INSTANCE;
    }
}
