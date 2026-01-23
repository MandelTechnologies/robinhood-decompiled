package com.robinhood.android.doc.p109ui.persona;

import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.models.api.identi.ApiPersonaDocumentUploadedRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocUploadPersonaSubmittedReportDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportDuxo$onCreate$1$1$1", m3645f = "DocUploadPersonaSubmittedReportDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.doc.ui.persona.DocUploadPersonaSubmittedReportDuxo$onCreate$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class DocUploadPersonaSubmittedReportDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $requestId;
    int label;
    final /* synthetic */ DocUploadPersonaSubmittedReportDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocUploadPersonaSubmittedReportDuxo2(DocUploadPersonaSubmittedReportDuxo docUploadPersonaSubmittedReportDuxo, UUID uuid, Continuation<? super DocUploadPersonaSubmittedReportDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = docUploadPersonaSubmittedReportDuxo;
        this.$requestId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocUploadPersonaSubmittedReportDuxo2(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DocUploadPersonaSubmittedReportDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DocUploadApi api = this.this$0.getApi();
            ApiPersonaDocumentUploadedRequest apiPersonaDocumentUploadedRequest = new ApiPersonaDocumentUploadedRequest(this.$requestId);
            this.label = 1;
            if (api.notifyPersonaDocumentUploaded(apiPersonaDocumentUploadedRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
