package com.robinhood.shared.documents.statements;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/documents/statements/DocumentsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.documents.statements.DocumentsDuxo$onResume$6$1", m3645f = "DocumentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.documents.statements.DocumentsDuxo$onResume$6$1, reason: use source file name */
/* loaded from: classes6.dex */
final class DocumentsDuxo7 extends ContinuationImpl7 implements Function2<DocumentsViewState, Continuation<? super DocumentsViewState>, Object> {
    final /* synthetic */ boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentsDuxo7(boolean z, Continuation<? super DocumentsDuxo7> continuation) {
        super(2, continuation);
        this.$it = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentsDuxo7 documentsDuxo7 = new DocumentsDuxo7(this.$it, continuation);
        documentsDuxo7.L$0 = obj;
        return documentsDuxo7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DocumentsViewState documentsViewState, Continuation<? super DocumentsViewState> continuation) {
        return ((DocumentsDuxo7) create(documentsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DocumentsViewState.copy$default((DocumentsViewState) this.L$0, null, null, null, null, null, null, this.$it, 63, null);
    }
}
