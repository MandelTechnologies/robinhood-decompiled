package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.api.docupload.DocUploadBonfireApi;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent;", "id", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$getDocumentRequestContentEndpoint$1", m3645f = "DocumentRequestStore.kt", m3646l = {96}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentRequestStore$getDocumentRequestContentEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiDocumentRequestContent>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentRequestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestStore$getDocumentRequestContentEndpoint$1(DocumentRequestStore documentRequestStore, Continuation<? super DocumentRequestStore$getDocumentRequestContentEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = documentRequestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentRequestStore$getDocumentRequestContentEndpoint$1 documentRequestStore$getDocumentRequestContentEndpoint$1 = new DocumentRequestStore$getDocumentRequestContentEndpoint$1(this.this$0, continuation);
        documentRequestStore$getDocumentRequestContentEndpoint$1.L$0 = obj;
        return documentRequestStore$getDocumentRequestContentEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiDocumentRequestContent> continuation) {
        return ((DocumentRequestStore$getDocumentRequestContentEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        DocUploadBonfireApi docUploadBonfireApi = this.this$0.bonfireApi;
        this.label = 1;
        Object documentRequestContent = docUploadBonfireApi.getDocumentRequestContent(uuid, this);
        return documentRequestContent == coroutine_suspended ? coroutine_suspended : documentRequestContent;
    }
}
