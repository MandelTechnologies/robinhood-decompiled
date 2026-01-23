package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentRequestsListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$_submittedDocumentRequestIds$1", m3645f = "DocumentRequestsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$_submittedDocumentRequestIds$1, reason: use source file name */
/* loaded from: classes11.dex */
final class DocumentRequestsListDuxo2 extends ContinuationImpl7 implements Function2<DocumentRequestsListDataState, Continuation<? super DocumentRequestsListDataState>, Object> {
    final /* synthetic */ List<String> $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestsListDuxo2(List<String> list, Continuation<? super DocumentRequestsListDuxo2> continuation) {
        super(2, continuation);
        this.$value = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentRequestsListDuxo2 documentRequestsListDuxo2 = new DocumentRequestsListDuxo2(this.$value, continuation);
        documentRequestsListDuxo2.L$0 = obj;
        return documentRequestsListDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DocumentRequestsListDataState documentRequestsListDataState, Continuation<? super DocumentRequestsListDataState> continuation) {
        return ((DocumentRequestsListDuxo2) create(documentRequestsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DocumentRequestsListDataState.copy$default((DocumentRequestsListDataState) this.L$0, null, this.$value, null, 5, null);
    }
}
