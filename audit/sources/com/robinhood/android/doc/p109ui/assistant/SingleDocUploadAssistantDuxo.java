package com.robinhood.android.doc.p109ui.assistant;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.doc.p109ui.assistant.SingleDocUploadAssistantFragment;
import com.robinhood.android.doc.p109ui.assistant.SingleDocUploadAssistantViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SingleDocUploadAssistantDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "handleNotFoundError", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SingleDocUploadAssistantDuxo extends BaseDuxo4<SingleDocUploadAssistantViewState> implements HasSavedState {
    private final DocumentRequestStore documentRequestStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleDocUploadAssistantDuxo(DocumentRequestStore documentRequestStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(SingleDocUploadAssistantViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.documentRequestStore = documentRequestStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C143421(null), 3, null);
    }

    /* compiled from: SingleDocUploadAssistantDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$onResume$1", m3645f = "SingleDocUploadAssistantDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$onResume$1 */
    static final class C143421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143421(Continuation<? super C143421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingleDocUploadAssistantDuxo.this.new C143421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SingleDocUploadAssistantDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$onResume$1$1", m3645f = "SingleDocUploadAssistantDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$onResume$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SingleDocUploadAssistantViewState, Continuation<? super SingleDocUploadAssistantViewState>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SingleDocUploadAssistantViewState singleDocUploadAssistantViewState, Continuation<? super SingleDocUploadAssistantViewState> continuation) {
                return ((AnonymousClass1) create(singleDocUploadAssistantViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SingleDocUploadAssistantViewState.Loading.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SingleDocUploadAssistantDuxo.this.applyMutation(new AnonymousClass1(null));
                    DocumentRequestStore documentRequestStore = SingleDocUploadAssistantDuxo.this.documentRequestStore;
                    UUID id = ((SingleDocUploadAssistantFragment.Args) SingleDocUploadAssistantDuxo.INSTANCE.getArgs((HasSavedState) SingleDocUploadAssistantDuxo.this)).getDocumentRequest().getId();
                    if (id != null) {
                        this.label = 1;
                        obj = documentRequestStore.getDocumentRequest(id, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SingleDocUploadAssistantDuxo.this.applyMutation(new AnonymousClass2((DocumentRequest) obj, null));
            } catch (Exception e) {
                Integer httpStatusCode = Throwables.getHttpStatusCode(e);
                if (httpStatusCode != null && httpStatusCode.intValue() == 404) {
                    SingleDocUploadAssistantDuxo.this.handleNotFoundError();
                } else {
                    SingleDocUploadAssistantDuxo.this.applyMutation(new AnonymousClass3(e, null));
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SingleDocUploadAssistantDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$onResume$1$2", m3645f = "SingleDocUploadAssistantDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$onResume$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SingleDocUploadAssistantViewState, Continuation<? super SingleDocUploadAssistantViewState>, Object> {
            final /* synthetic */ DocumentRequest $documentRequest;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DocumentRequest documentRequest, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$documentRequest = documentRequest;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$documentRequest, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SingleDocUploadAssistantViewState singleDocUploadAssistantViewState, Continuation<? super SingleDocUploadAssistantViewState> continuation) {
                return ((AnonymousClass2) create(singleDocUploadAssistantViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new SingleDocUploadAssistantViewState.Loaded(this.$documentRequest);
            }
        }

        /* compiled from: SingleDocUploadAssistantDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$onResume$1$3", m3645f = "SingleDocUploadAssistantDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$onResume$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<SingleDocUploadAssistantViewState, Continuation<? super SingleDocUploadAssistantViewState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f4111$e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.f4111$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.f4111$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SingleDocUploadAssistantViewState singleDocUploadAssistantViewState, Continuation<? super SingleDocUploadAssistantViewState> continuation) {
                return ((AnonymousClass3) create(singleDocUploadAssistantViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new SingleDocUploadAssistantViewState.Error(this.f4111$e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNotFoundError() {
        Companion companion = INSTANCE;
        if (((SingleDocUploadAssistantFragment.Args) companion.getArgs((HasSavedState) this)).isMockingRequest()) {
            applyMutation(new C143411(null));
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(((SingleDocUploadAssistantFragment.Args) companion.getArgs((HasSavedState) this)).getDocumentRequest());
            throw new ExceptionsH();
        }
    }

    /* compiled from: SingleDocUploadAssistantDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$handleNotFoundError$1", m3645f = "SingleDocUploadAssistantDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantDuxo$handleNotFoundError$1 */
    static final class C143411 extends ContinuationImpl7 implements Function2<SingleDocUploadAssistantViewState, Continuation<? super SingleDocUploadAssistantViewState>, Object> {
        int label;

        C143411(Continuation<? super C143411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingleDocUploadAssistantDuxo.this.new C143411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SingleDocUploadAssistantViewState singleDocUploadAssistantViewState, Continuation<? super SingleDocUploadAssistantViewState> continuation) {
            return ((C143411) create(singleDocUploadAssistantViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new SingleDocUploadAssistantViewState.Loaded(((SingleDocUploadAssistantFragment.Args) SingleDocUploadAssistantDuxo.INSTANCE.getArgs((HasSavedState) SingleDocUploadAssistantDuxo.this)).getDocumentRequest());
        }
    }

    /* compiled from: SingleDocUploadAssistantDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantDuxo;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SingleDocUploadAssistantDuxo, SingleDocUploadAssistantFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SingleDocUploadAssistantFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SingleDocUploadAssistantFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SingleDocUploadAssistantFragment.Args getArgs(SingleDocUploadAssistantDuxo singleDocUploadAssistantDuxo) {
            return (SingleDocUploadAssistantFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, singleDocUploadAssistantDuxo);
        }
    }
}
