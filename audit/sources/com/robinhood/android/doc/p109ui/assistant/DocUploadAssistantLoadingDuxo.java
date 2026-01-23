package com.robinhood.android.doc.p109ui.assistant;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocUploadAssistantLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingViewState;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DocUploadAssistantLoadingDuxo extends BaseDuxo4<DocUploadAssistantLoadingViewState> {
    public static final int $stable = 8;
    private final DocumentRequestStore documentRequestStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocUploadAssistantLoadingDuxo(DocumentRequestStore documentRequestStore, DuxoBundle duxoBundle) {
        super(new DocUploadAssistantLoadingViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.documentRequestStore = documentRequestStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C143301(null), 3, null);
    }

    /* compiled from: DocUploadAssistantLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.assistant.DocUploadAssistantLoadingDuxo$onCreate$1", m3645f = "DocUploadAssistantLoadingDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.assistant.DocUploadAssistantLoadingDuxo$onCreate$1 */
    static final class C143301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143301(Continuation<? super C143301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadAssistantLoadingDuxo.this.new C143301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C143301 c143301;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DocumentRequestStore documentRequestStore = DocUploadAssistantLoadingDuxo.this.documentRequestStore;
                ApiDocumentRequest.State state = ApiDocumentRequest.State.PENDING_UPLOAD;
                this.label = 1;
                c143301 = this;
                obj = DocumentRequestStore.getDocumentRequests$default(documentRequestStore, null, state, c143301, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c143301 = this;
            }
            DocUploadAssistantLoadingDuxo.this.applyMutation(new AnonymousClass1((List) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: DocUploadAssistantLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.assistant.DocUploadAssistantLoadingDuxo$onCreate$1$1", m3645f = "DocUploadAssistantLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.assistant.DocUploadAssistantLoadingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DocUploadAssistantLoadingViewState, Continuation<? super DocUploadAssistantLoadingViewState>, Object> {
            final /* synthetic */ List<DocumentRequest> $documentRequests;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<DocumentRequest> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$documentRequests = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$documentRequests, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DocUploadAssistantLoadingViewState docUploadAssistantLoadingViewState, Continuation<? super DocUploadAssistantLoadingViewState> continuation) {
                return ((AnonymousClass1) create(docUploadAssistantLoadingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((DocUploadAssistantLoadingViewState) this.L$0).copy(this.$documentRequests);
            }
        }
    }
}
