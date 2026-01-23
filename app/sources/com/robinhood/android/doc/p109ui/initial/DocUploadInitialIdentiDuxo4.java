package com.robinhood.android.doc.p109ui.initial;

import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiResidencyDocument;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocUploadInitialIdentiDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiResidencyDocument;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getDocumentRequestsStates$cryptoResidencyDocSingle$1", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {112}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getDocumentRequestsStates$cryptoResidencyDocSingle$1, reason: use source file name */
/* loaded from: classes7.dex */
final class DocUploadInitialIdentiDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiResidencyDocument>>, Object> {
    int label;
    final /* synthetic */ DocUploadInitialIdentiDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocUploadInitialIdentiDuxo4(DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo, Continuation<? super DocUploadInitialIdentiDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = docUploadInitialIdentiDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocUploadInitialIdentiDuxo4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiResidencyDocument>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiResidencyDocument>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiResidencyDocument>> continuation) {
        return ((DocUploadInitialIdentiDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.this$0.cryptoResidencyDocumentStore;
        this.label = 1;
        Object residencyDocuments$default = CryptoResidencyDocumentStore.getResidencyDocuments$default(cryptoResidencyDocumentStore, null, this, 1, null);
        return residencyDocuments$default == coroutine_suspended ? coroutine_suspended : residencyDocuments$default;
    }
}
