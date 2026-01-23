package com.robinhood.shared.documents.statements;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.documents.contracts.DocumentsFragmentKey;
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
@DebugMetadata(m3644c = "com.robinhood.shared.documents.statements.DocumentsDuxo$onResume$1$1", m3645f = "DocumentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.documents.statements.DocumentsDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class DocumentsDuxo2 extends ContinuationImpl7 implements Function2<DocumentsViewState, Continuation<? super DocumentsViewState>, Object> {
    final /* synthetic */ Account $managedMatch;
    final /* synthetic */ Account $selfDirectedMatch;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentsDuxo2(DocumentsDuxo documentsDuxo, Account account, Account account2, Continuation<? super DocumentsDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = documentsDuxo;
        this.$selfDirectedMatch = account;
        this.$managedMatch = account2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentsDuxo2 documentsDuxo2 = new DocumentsDuxo2(this.this$0, this.$selfDirectedMatch, this.$managedMatch, continuation);
        documentsDuxo2.L$0 = obj;
        return documentsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DocumentsViewState documentsViewState, Continuation<? super DocumentsViewState> continuation) {
        return ((DocumentsDuxo2) create(documentsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DocumentsViewState documentsViewState = (DocumentsViewState) this.L$0;
        DocumentsDuxo documentsDuxo = this.this$0;
        return DocumentsViewState.copy$default(documentsViewState, null, null, null, null, null, new ManagementTypeChipGroupViewState(documentsDuxo.getManagementTypeFromDocumentCategory(((DocumentsFragmentKey) DocumentsDuxo.INSTANCE.getArgs((HasSavedState) documentsDuxo)).getCategory()), true, AccountDisplayNames.getDisplayNameWithoutNickname(this.$selfDirectedMatch).getShort().getTitle(), AccountDisplayNames.getDisplayNameWithoutNickname(this.$managedMatch).getShort().getTitle()), false, 95, null);
    }
}
