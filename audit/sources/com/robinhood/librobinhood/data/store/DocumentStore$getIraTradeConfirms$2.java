package com.robinhood.librobinhood.data.store;

import com.robinhood.android.documents.models.ApiIraDocument;
import com.robinhood.models.PaginatedResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "page", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/documents/models/ApiIraDocument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getIraTradeConfirms$2", m3645f = "DocumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentStore$getIraTradeConfirms$2 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiIraDocument>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentStore$getIraTradeConfirms$2(DocumentStore documentStore, Continuation<? super DocumentStore$getIraTradeConfirms$2> continuation) {
        super(2, continuation);
        this.this$0 = documentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentStore$getIraTradeConfirms$2 documentStore$getIraTradeConfirms$2 = new DocumentStore$getIraTradeConfirms$2(this.this$0, continuation);
        documentStore$getIraTradeConfirms$2.L$0 = obj;
        return documentStore$getIraTradeConfirms$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiIraDocument> paginatedResult, Continuation<? super Unit> continuation) {
        return ((DocumentStore$getIraTradeConfirms$2) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiIraDocument> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiIraDocument>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insertIraTradeConfirms((PaginatedResult) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
