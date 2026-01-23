package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.documents.models.ApiIraDocument;
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
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/documents/models/ApiIraDocument;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/EdocsV2Params;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getIraTradeConfirms$1", m3645f = "DocumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentStore$getIraTradeConfirms$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends EdocsV2Params, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiIraDocument>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentStore$getIraTradeConfirms$1(DocumentStore documentStore, Continuation<? super DocumentStore$getIraTradeConfirms$1> continuation) {
        super(2, continuation);
        this.this$0 = documentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentStore$getIraTradeConfirms$1 documentStore$getIraTradeConfirms$1 = new DocumentStore$getIraTradeConfirms$1(this.this$0, continuation);
        documentStore$getIraTradeConfirms$1.L$0 = obj;
        return documentStore$getIraTradeConfirms$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends EdocsV2Params, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiIraDocument>> continuation) {
        return invoke2((Tuples2<EdocsV2Params, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiIraDocument>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<EdocsV2Params, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiIraDocument>> continuation) {
        return ((DocumentStore$getIraTradeConfirms$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EdocsV2Params edocsV2Params = (EdocsV2Params) ((Tuples2) this.L$0).component1();
        DocumentsBrokebackApi documentsBrokebackApi = this.this$0.brokeback;
        Document.Category category = Document.Category.IRA_TRADE_CONFIRM;
        LocalDate date = edocsV2Params.getDate();
        String accountNumber = edocsV2Params.getAccountNumber();
        this.label = 1;
        Object iraDocuments$default = DocumentsBrokebackApi.DefaultImpls.getIraDocuments$default(documentsBrokebackApi, category, accountNumber, date, null, this, 8, null);
        return iraDocuments$default == coroutine_suspended ? coroutine_suspended : iraDocuments$default;
    }
}
