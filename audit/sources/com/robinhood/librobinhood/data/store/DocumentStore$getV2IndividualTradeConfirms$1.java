package com.robinhood.librobinhood.data.store;

import com.robinhood.android.documents.models.ApiIndividualDocument;
import com.robinhood.android.documents.models.DocumentsBrokebackApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.p320db.Document;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.LocalDate;

/* compiled from: DocumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/documents/models/ApiIndividualDocument;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/EdocsV2Params;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getV2IndividualTradeConfirms$1", m3645f = "DocumentStore.kt", m3646l = {83}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentStore$getV2IndividualTradeConfirms$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends EdocsV2Params, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiIndividualDocument>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentStore$getV2IndividualTradeConfirms$1(DocumentStore documentStore, Continuation<? super DocumentStore$getV2IndividualTradeConfirms$1> continuation) {
        super(2, continuation);
        this.this$0 = documentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentStore$getV2IndividualTradeConfirms$1 documentStore$getV2IndividualTradeConfirms$1 = new DocumentStore$getV2IndividualTradeConfirms$1(this.this$0, continuation);
        documentStore$getV2IndividualTradeConfirms$1.L$0 = obj;
        return documentStore$getV2IndividualTradeConfirms$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends EdocsV2Params, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiIndividualDocument>> continuation) {
        return invoke2((Tuples2<EdocsV2Params, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiIndividualDocument>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<EdocsV2Params, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiIndividualDocument>> continuation) {
        return ((DocumentStore$getV2IndividualTradeConfirms$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EdocsV2Params edocsV2Params = (EdocsV2Params) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        DocumentsBrokebackApi documentsBrokebackApi = this.this$0.brokeback;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        Document.Category category = Document.Category.TRADE_CONFIRM;
        LocalDate date = edocsV2Params.getDate();
        String accountNumber = edocsV2Params.getAccountNumber();
        this.label = 1;
        Object individualDocuments$default = DocumentsBrokebackApi.DefaultImpls.getIndividualDocuments$default(documentsBrokebackApi, value, category, accountNumber, date, null, this, 16, null);
        return individualDocuments$default == coroutine_suspended ? coroutine_suspended : individualDocuments$default;
    }
}
