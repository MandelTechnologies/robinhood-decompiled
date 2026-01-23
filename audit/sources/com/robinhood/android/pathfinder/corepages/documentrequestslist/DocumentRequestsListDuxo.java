package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDataState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderInquirySessionStore;
import com.robinhood.librobinhood.data.store.PathfinderInquirySessionStore2;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.support.contracts.pathfinder.DocumentRequestListFragmentKey;
import com.robinhood.utils.extensions.Throwables;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: DocumentRequestsListDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001.B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0014J\u0014\u0010%\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aJ\u001b\u0010'\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0000¢\u0006\u0002\b(J\u0015\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "inquirySessionStore", "Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", DocumentRequestsListDuxo.SAVE_ACTIVE_DOCUMENT_REQUEST, "getActiveDocumentRequest", "()Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "setActiveDocumentRequest", "(Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;)V", "", "", "_submittedDocumentRequestIds", "get_submittedDocumentRequestIds", "()Ljava/util/List;", "set_submittedDocumentRequestIds", "(Ljava/util/List;)V", "onCreate", "", "updateActiveDocumentRequest", "documentRequest", "setActiveDocumentSubmitted", "documentRequests", "sendUserInputIfAllDocumentRequestsSubmitted", "sendUserInputIfAllDocumentRequestsSubmitted$feature_pathfinder_core_pages_externalDebug", "handleUserInputError", "", "throwable", "", "handleUserInputError$feature_pathfinder_core_pages_externalDebug", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DocumentRequestsListDuxo extends BaseDuxo<DocumentRequestsListDataState, DocumentRequestsListViewState> implements HasSavedState {
    private static final String SAVE_ACTIVE_DOCUMENT_REQUEST = "activeDocumentRequest";
    private final PathfinderInquirySessionStore inquirySessionStore;
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentRequestsListDuxo(PathfinderStore pathfinderStore, PathfinderInquirySessionStore inquirySessionStore, SavedStateHandle savedStateHandle, DocumentRequestsListStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new DocumentRequestsListDataState(((UserViewStatePageContext.DocumentRequestsList) ((DocumentRequestListFragmentKey) INSTANCE.getArgs(savedStateHandle)).getUserViewState().getTypeContext()).getContext(), CollectionsKt.emptyList(), DocumentRequestsListDataState.InputState.InputNotSent), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(inquirySessionStore, "inquirySessionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.pathfinderStore = pathfinderStore;
        this.inquirySessionStore = inquirySessionStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final DocumentRequest getActiveDocumentRequest() {
        return (DocumentRequest) getSavedStateHandle().get(SAVE_ACTIVE_DOCUMENT_REQUEST);
    }

    private final void setActiveDocumentRequest(DocumentRequest documentRequest) {
        getSavedStateHandle().set(SAVE_ACTIVE_DOCUMENT_REQUEST, documentRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> get_submittedDocumentRequestIds() {
        List<String> list = PathfinderInquirySessionStore2.getSubmittedDocumentRequestIds(this.inquirySessionStore, ((DocumentRequestListFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInquiryId()).get();
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private final void set_submittedDocumentRequestIds(List<String> list) {
        PathfinderInquirySessionStore2.getSubmittedDocumentRequestIds(this.inquirySessionStore, ((DocumentRequestListFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInquiryId()).set(list);
        applyMutation(new DocumentRequestsListDuxo2(list, null));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C252961(null));
    }

    /* compiled from: DocumentRequestsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$onCreate$1", m3645f = "DocumentRequestsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListDuxo$onCreate$1 */
    static final class C252961 extends ContinuationImpl7 implements Function2<DocumentRequestsListDataState, Continuation<? super DocumentRequestsListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C252961(Continuation<? super C252961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C252961 c252961 = DocumentRequestsListDuxo.this.new C252961(continuation);
            c252961.L$0 = obj;
            return c252961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DocumentRequestsListDataState documentRequestsListDataState, Continuation<? super DocumentRequestsListDataState> continuation) {
            return ((C252961) create(documentRequestsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DocumentRequestsListDataState.copy$default((DocumentRequestsListDataState) this.L$0, null, DocumentRequestsListDuxo.this.get_submittedDocumentRequestIds(), null, 5, null);
        }
    }

    public final void updateActiveDocumentRequest(DocumentRequest documentRequest) {
        Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
        setActiveDocumentRequest(documentRequest);
    }

    public final void setActiveDocumentSubmitted(List<DocumentRequest> documentRequests) {
        Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
        List<String> list = get_submittedDocumentRequestIds();
        DocumentRequest activeDocumentRequest = getActiveDocumentRequest();
        Intrinsics.checkNotNull(activeDocumentRequest);
        set_submittedDocumentRequestIds(CollectionsKt.plus((Collection<? extends String>) list, activeDocumentRequest.getId()));
        setActiveDocumentRequest(null);
        m2364x84795383(documentRequests);
    }

    /* renamed from: sendUserInputIfAllDocumentRequestsSubmitted$feature_pathfinder_core_pages_externalDebug */
    public final void m2364x84795383(List<DocumentRequest> documentRequests) {
        Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
        List<DocumentRequest> list = documentRequests;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((DocumentRequest) it.next()).isSubmitted()) {
                    return;
                }
            }
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new DocumentRequestsListDuxo4(this, documentRequests, null), 3, null);
    }

    public final boolean handleUserInputError$feature_pathfinder_core_pages_externalDebug(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean zIsNetworkRelated = Throwables.isNetworkRelated(throwable);
        applyMutation(new DocumentRequestsListDuxo3(null));
        return zIsNetworkRelated;
    }

    /* compiled from: DocumentRequestsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/DocumentRequestListFragmentKey;", "<init>", "()V", "SAVE_ACTIVE_DOCUMENT_REQUEST", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DocumentRequestsListDuxo, DocumentRequestListFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocumentRequestListFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (DocumentRequestListFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocumentRequestListFragmentKey getArgs(DocumentRequestsListDuxo documentRequestsListDuxo) {
            return (DocumentRequestListFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, documentRequestsListDuxo);
        }
    }
}
