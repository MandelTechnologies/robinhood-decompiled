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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocumentStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiDocument$DownloadResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$7", m3645f = "DocumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentStore$getDocumentDownloadUrl$request$7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDocument.DownloadResponse>, Object> {
    final /* synthetic */ Document $document;
    int label;
    final /* synthetic */ DocumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentStore$getDocumentDownloadUrl$request$7(DocumentStore documentStore, Document document, Continuation<? super DocumentStore$getDocumentDownloadUrl$request$7> continuation) {
        super(2, continuation);
        this.this$0 = documentStore;
        this.$document = document;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocumentStore$getDocumentDownloadUrl$request$7(this.this$0, this.$document, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDocument.DownloadResponse> continuation) {
        return ((DocumentStore$getDocumentDownloadUrl$request$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DocumentsBrokebackApi documentsBrokebackApi = this.this$0.brokeback;
        Document.Category category = this.$document.getCategory();
        String accountId = this.$document.getAccountId();
        if (accountId == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string2 = this.$document.getDate().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Document.FileType filetype = this.$document.getFiletype();
        this.label = 1;
        Object rhdDocumentDownloadUrl$default = DocumentsBrokebackApi.DefaultImpls.getRhdDocumentDownloadUrl$default(documentsBrokebackApi, category, accountId, string2, filetype, false, this, 16, null);
        return rhdDocumentDownloadUrl$default == coroutine_suspended ? coroutine_suspended : rhdDocumentDownloadUrl$default;
    }
}
