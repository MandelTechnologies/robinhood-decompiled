package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDataState;
import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest;
import com.robinhood.shared.support.contracts.pathfinder.DocumentRequestListFragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocumentRequestsListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$sendUserInputIfAllDocumentRequestsSubmitted$2", m3645f = "DocumentRequestsListDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$sendUserInputIfAllDocumentRequestsSubmitted$2, reason: use source file name */
/* loaded from: classes11.dex */
final class DocumentRequestsListDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<DocumentRequest> $documentRequests;
    int label;
    final /* synthetic */ DocumentRequestsListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestsListDuxo4(DocumentRequestsListDuxo documentRequestsListDuxo, List<DocumentRequest> list, Continuation<? super DocumentRequestsListDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = documentRequestsListDuxo;
        this.$documentRequests = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocumentRequestsListDuxo4(this.this$0, this.$documentRequests, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DocumentRequestsListDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DocumentRequestsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$sendUserInputIfAllDocumentRequestsSubmitted$2$1", m3645f = "DocumentRequestsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$sendUserInputIfAllDocumentRequestsSubmitted$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DocumentRequestsListDataState, Continuation<? super DocumentRequestsListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DocumentRequestsListDataState documentRequestsListDataState, Continuation<? super DocumentRequestsListDataState> continuation) {
            return ((AnonymousClass1) create(documentRequestsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DocumentRequestsListDataState.copy$default((DocumentRequestsListDataState) this.L$0, null, null, DocumentRequestsListDataState.InputState.SendingInput, 3, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        DocumentRequestsListDuxo4 documentRequestsListDuxo4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new AnonymousClass1(null));
            List<DocumentRequest> list = this.$documentRequests;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((DocumentRequest) it.next()).getId());
            }
            PathfinderStore pathfinderStore = this.this$0.pathfinderStore;
            DocumentRequestsListDuxo.Companion companion = DocumentRequestsListDuxo.INSTANCE;
            UUID inquiryId = ((DocumentRequestListFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getInquiryId();
            int sequence = ((DocumentRequestListFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getUserViewState().getSequence();
            UserViewInput.DocumentRequestsList documentRequestsList = new UserViewInput.DocumentRequestsList(arrayList);
            DocumentRequestsListDuxo5 documentRequestsListDuxo5 = new DocumentRequestsListDuxo5(this.this$0);
            this.label = 1;
            documentRequestsListDuxo4 = this;
            obj = pathfinderStore.handleUserInput(inquiryId, sequence, documentRequestsList, documentRequestsListDuxo5, documentRequestsListDuxo4);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            documentRequestsListDuxo4 = this;
        }
        if (((UserViewState) obj) != null) {
            documentRequestsListDuxo4.this$0.applyMutation(new AnonymousClass2(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DocumentRequestsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$sendUserInputIfAllDocumentRequestsSubmitted$2$2", m3645f = "DocumentRequestsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$sendUserInputIfAllDocumentRequestsSubmitted$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DocumentRequestsListDataState, Continuation<? super DocumentRequestsListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DocumentRequestsListDataState documentRequestsListDataState, Continuation<? super DocumentRequestsListDataState> continuation) {
            return ((AnonymousClass2) create(documentRequestsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DocumentRequestsListDataState.copy$default((DocumentRequestsListDataState) this.L$0, null, null, DocumentRequestsListDataState.InputState.SendInputSuccess, 3, null);
        }
    }
}
