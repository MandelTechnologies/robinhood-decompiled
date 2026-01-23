package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.shareholderx.ShareholderXApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestion;
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

/* compiled from: ShareholderExperienceStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion$OnlyQuestionsRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$questionsEndpoint$1", m3645f = "ShareholderExperienceStore.kt", m3646l = {80}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ShareholderExperienceStore$questionsEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiShareholderQuestion.OnlyQuestionsRequest, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiShareholderQuestion>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareholderExperienceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareholderExperienceStore$questionsEndpoint$1(ShareholderExperienceStore shareholderExperienceStore, Continuation<? super ShareholderExperienceStore$questionsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = shareholderExperienceStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareholderExperienceStore$questionsEndpoint$1 shareholderExperienceStore$questionsEndpoint$1 = new ShareholderExperienceStore$questionsEndpoint$1(this.this$0, continuation);
        shareholderExperienceStore$questionsEndpoint$1.L$0 = obj;
        return shareholderExperienceStore$questionsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiShareholderQuestion.OnlyQuestionsRequest, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiShareholderQuestion>> continuation) {
        return invoke2((Tuples2<ApiShareholderQuestion.OnlyQuestionsRequest, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiShareholderQuestion>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiShareholderQuestion.OnlyQuestionsRequest, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiShareholderQuestion>> continuation) {
        return ((ShareholderExperienceStore$questionsEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        ApiShareholderQuestion.OnlyQuestionsRequest onlyQuestionsRequest = (ApiShareholderQuestion.OnlyQuestionsRequest) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        ShareholderXApi shareholderXApi = this.this$0.shareholderXApi;
        UUID instrumentId = onlyQuestionsRequest.getInstrumentId();
        String slug = onlyQuestionsRequest.getSlug();
        String filter = onlyQuestionsRequest.getFilter();
        String sort = onlyQuestionsRequest.getSort();
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object shareholderQuestions = shareholderXApi.getShareholderQuestions(instrumentId, slug, filter, sort, value, this);
        return shareholderQuestions == coroutine_suspended ? coroutine_suspended : shareholderQuestions;
    }
}
