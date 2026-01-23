package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import com.robinhood.staticcontent.model.OtherMarkdown;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OtherMarkdownDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDataState;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "contentStore", "Lcom/robinhood/contentful/StaticContentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class OtherMarkdownDuxo extends BaseDuxo<OtherMarkdownDataState, OtherMarkdownStateProvider3> implements HasSavedState {
    private final StaticContentStore contentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherMarkdownDuxo(OtherMarkdownStateProvider stateProvider, SavedStateHandle savedStateHandle, StaticContentStore contentStore, DuxoBundle duxoBundle) {
        super(new OtherMarkdownDataState(null, false, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(contentStore, "contentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.contentStore = contentStore;
    }

    /* compiled from: OtherMarkdownDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDuxo;", "Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey;", "<init>", "()V", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OtherMarkdownDuxo, OtherMarkdownFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OtherMarkdownFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OtherMarkdownFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OtherMarkdownFragmentKey getArgs(OtherMarkdownDuxo otherMarkdownDuxo) {
            return (OtherMarkdownFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, otherMarkdownDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C287191(null));
    }

    /* compiled from: OtherMarkdownDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownDuxo$onCreate$1", m3645f = "OtherMarkdownDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownDuxo$onCreate$1 */
    static final class C287191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C287191(Continuation<? super C287191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OtherMarkdownDuxo.this.new C287191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C287191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C287191 c287191;
            OtherMarkdown otherMarkdown;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StaticContentStore staticContentStore = OtherMarkdownDuxo.this.contentStore;
                    String contentfulId = ((OtherMarkdownFragmentKey) OtherMarkdownDuxo.INSTANCE.getArgs((HasSavedState) OtherMarkdownDuxo.this)).getContentfulId();
                    this.label = 1;
                    c287191 = this;
                    try {
                        obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, contentfulId, null, c287191, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception unused) {
                        otherMarkdown = null;
                        OtherMarkdownDuxo.this.applyMutation(new AnonymousClass1(otherMarkdown, null));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c287191 = this;
                }
                otherMarkdown = (OtherMarkdown) ((EntryResource) obj).getValue();
            } catch (Exception unused2) {
                c287191 = this;
            }
            OtherMarkdownDuxo.this.applyMutation(new AnonymousClass1(otherMarkdown, null));
            return Unit.INSTANCE;
        }

        /* compiled from: OtherMarkdownDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownDuxo$onCreate$1$1", m3645f = "OtherMarkdownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OtherMarkdownDataState, Continuation<? super OtherMarkdownDataState>, Object> {
            final /* synthetic */ OtherMarkdown $markdown;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OtherMarkdown otherMarkdown, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$markdown = otherMarkdown;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$markdown, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OtherMarkdownDataState otherMarkdownDataState, Continuation<? super OtherMarkdownDataState> continuation) {
                return ((AnonymousClass1) create(otherMarkdownDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((OtherMarkdownDataState) this.L$0).copy(this.$markdown, true);
            }
        }
    }
}
