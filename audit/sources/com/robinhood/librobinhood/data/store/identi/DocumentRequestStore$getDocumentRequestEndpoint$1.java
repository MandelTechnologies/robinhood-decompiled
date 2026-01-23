package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentRequestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/DocumentRequest;", "it", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$GetDocumentRequestParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$getDocumentRequestEndpoint$1", m3645f = "DocumentRequestStore.kt", m3646l = {87}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentRequestStore$getDocumentRequestEndpoint$1 extends ContinuationImpl7 implements Function2<DocumentRequestStore.GetDocumentRequestParams, Continuation<? super DocumentRequest>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentRequestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestStore$getDocumentRequestEndpoint$1(DocumentRequestStore documentRequestStore, Continuation<? super DocumentRequestStore$getDocumentRequestEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = documentRequestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentRequestStore$getDocumentRequestEndpoint$1 documentRequestStore$getDocumentRequestEndpoint$1 = new DocumentRequestStore$getDocumentRequestEndpoint$1(this.this$0, continuation);
        documentRequestStore$getDocumentRequestEndpoint$1.L$0 = obj;
        return documentRequestStore$getDocumentRequestEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DocumentRequestStore.GetDocumentRequestParams getDocumentRequestParams, Continuation<? super DocumentRequest> continuation) {
        return ((DocumentRequestStore$getDocumentRequestEndpoint$1) create(getDocumentRequestParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DocumentRequestStore.GetDocumentRequestParams getDocumentRequestParams = (DocumentRequestStore.GetDocumentRequestParams) this.L$0;
            DocUploadApi docUploadApi = this.this$0.api;
            UUID id = getDocumentRequestParams.getId();
            this.label = 1;
            obj = docUploadApi.getDocumentRequest(id, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return DocumentRequest2.toUiModel((ApiDocumentRequest) obj);
    }
}
