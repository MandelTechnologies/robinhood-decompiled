package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ShareholderExperienceStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion$QuestionsAndAnswersRequest;", "Lcom/robinhood/models/PaginationCursor;", "<unused var>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$answeredQuestionsEndpoint$2", m3645f = "ShareholderExperienceStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ShareholderExperienceStore$answeredQuestionsEndpoint$2 extends ContinuationImpl7 implements Function3<Tuples2<? extends ApiShareholderQuestion.QuestionsAndAnswersRequest, ? extends PaginationCursor>, PaginatedResult<? extends ApiShareholderQuestion>, Continuation<? super Unit>, Object> {
    int label;

    ShareholderExperienceStore$answeredQuestionsEndpoint$2(Continuation<? super ShareholderExperienceStore$answeredQuestionsEndpoint$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiShareholderQuestion.QuestionsAndAnswersRequest, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiShareholderQuestion> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ApiShareholderQuestion.QuestionsAndAnswersRequest, PaginationCursor>) tuples2, (PaginatedResult<ApiShareholderQuestion>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiShareholderQuestion.QuestionsAndAnswersRequest, PaginationCursor> tuples2, PaginatedResult<ApiShareholderQuestion> paginatedResult, Continuation<? super Unit> continuation) {
        return new ShareholderExperienceStore$answeredQuestionsEndpoint$2(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
