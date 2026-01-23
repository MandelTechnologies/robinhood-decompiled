package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentRequestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/ui/DocumentRequest;", "it", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore$GetDocumentRequestsParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$getDocumentRequestsEndpoint$1", m3645f = "DocumentRequestStore.kt", m3646l = {58}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class DocumentRequestStore$getDocumentRequestsEndpoint$1 extends ContinuationImpl7 implements Function2<DocumentRequestStore.GetDocumentRequestsParams, Continuation<? super List<? extends DocumentRequest>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentRequestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestStore$getDocumentRequestsEndpoint$1(DocumentRequestStore documentRequestStore, Continuation<? super DocumentRequestStore$getDocumentRequestsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = documentRequestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentRequestStore$getDocumentRequestsEndpoint$1 documentRequestStore$getDocumentRequestsEndpoint$1 = new DocumentRequestStore$getDocumentRequestsEndpoint$1(this.this$0, continuation);
        documentRequestStore$getDocumentRequestsEndpoint$1.L$0 = obj;
        return documentRequestStore$getDocumentRequestsEndpoint$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(DocumentRequestStore.GetDocumentRequestsParams getDocumentRequestsParams, Continuation<? super List<DocumentRequest>> continuation) {
        return ((DocumentRequestStore$getDocumentRequestsEndpoint$1) create(getDocumentRequestsParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(DocumentRequestStore.GetDocumentRequestsParams getDocumentRequestsParams, Continuation<? super List<? extends DocumentRequest>> continuation) {
        return invoke2(getDocumentRequestsParams, (Continuation<? super List<DocumentRequest>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DocumentRequestStore.GetDocumentRequestsParams getDocumentRequestsParams = (DocumentRequestStore.GetDocumentRequestsParams) this.L$0;
            DocUploadApi docUploadApi = this.this$0.api;
            ApiDocumentRequest.Type type2 = getDocumentRequestsParams.getType();
            ApiDocumentRequest.State state = getDocumentRequestsParams.getState();
            this.label = 1;
            obj = docUploadApi.getDocumentRequests(type2, state, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(DocumentRequest2.toUiModel((ApiDocumentRequest) it.next()));
        }
        return arrayList;
    }
}
