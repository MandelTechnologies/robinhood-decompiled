package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDataState;
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
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$handleUserInputError$1$1", m3645f = "DocumentRequestsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$handleUserInputError$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class DocumentRequestsListDuxo3 extends ContinuationImpl7 implements Function2<DocumentRequestsListDataState, Continuation<? super DocumentRequestsListDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    DocumentRequestsListDuxo3(Continuation<? super DocumentRequestsListDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentRequestsListDuxo3 documentRequestsListDuxo3 = new DocumentRequestsListDuxo3(continuation);
        documentRequestsListDuxo3.L$0 = obj;
        return documentRequestsListDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DocumentRequestsListDataState documentRequestsListDataState, Continuation<? super DocumentRequestsListDataState> continuation) {
        return ((DocumentRequestsListDuxo3) create(documentRequestsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DocumentRequestsListDataState.copy$default((DocumentRequestsListDataState) this.L$0, null, null, DocumentRequestsListDataState.InputState.SendInputFailed, 3, null);
    }
}
