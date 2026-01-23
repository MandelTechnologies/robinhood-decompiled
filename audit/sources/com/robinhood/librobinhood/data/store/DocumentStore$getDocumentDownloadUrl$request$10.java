package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.documents.models.DocumentsBrokebackApi;
import com.robinhood.models.api.ApiDocument;
import com.robinhood.models.p320db.Document;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: DocumentStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiDocument$DownloadResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$10", m3645f = "DocumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentStore$getDocumentDownloadUrl$request$10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDocument.DownloadResponse>, Object> {
    final /* synthetic */ Document $document;
    int label;
    final /* synthetic */ DocumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentStore$getDocumentDownloadUrl$request$10(DocumentStore documentStore, Document document, Continuation<? super DocumentStore$getDocumentDownloadUrl$request$10> continuation) {
        super(2, continuation);
        this.this$0 = documentStore;
        this.$document = document;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocumentStore$getDocumentDownloadUrl$request$10(this.this$0, this.$document, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDocument.DownloadResponse> continuation) {
        return ((DocumentStore$getDocumentDownloadUrl$request$10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DocumentsBrokebackApi documentsBrokebackApi = this.this$0.brokeback;
            String id = this.$document.getId();
            this.label = 1;
            obj = documentsBrokebackApi.getAdhocDocumentDownloadUrl(id, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new ApiDocument.DownloadResponse(this.this$0.requireRedirectUrl((Response) obj, this.$document.getId()));
    }
}
