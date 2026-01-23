package com.robinhood.shared.documents.statements;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Document;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DocumentsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/documents/statements/DocumentsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.documents.statements.DocumentsDuxo$onResume$2$1", m3645f = "DocumentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.documents.statements.DocumentsDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class DocumentsDuxo4 extends ContinuationImpl7 implements Function2<DocumentsViewState, Continuation<? super DocumentsViewState>, Object> {
    final /* synthetic */ List<Document> $managedDocs;
    final /* synthetic */ List<Document> $selfDirectedDocs;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentsDuxo4(List<Document> list, List<Document> list2, Continuation<? super DocumentsDuxo4> continuation) {
        super(2, continuation);
        this.$selfDirectedDocs = list;
        this.$managedDocs = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentsDuxo4 documentsDuxo4 = new DocumentsDuxo4(this.$selfDirectedDocs, this.$managedDocs, continuation);
        documentsDuxo4.L$0 = obj;
        return documentsDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DocumentsViewState documentsViewState, Continuation<? super DocumentsViewState> continuation) {
        return ((DocumentsDuxo4) create(documentsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DocumentsViewState.copy$default((DocumentsViewState) this.L$0, null, extensions2.toImmutableList(this.$selfDirectedDocs), extensions2.toImmutableList(this.$managedDocs), null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, null);
    }
}
