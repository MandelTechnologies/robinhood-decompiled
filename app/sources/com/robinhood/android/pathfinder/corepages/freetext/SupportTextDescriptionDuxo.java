package com.robinhood.android.pathfinder.corepages.freetext;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.librobinhood.data.store.CxVoiceContentIds;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.contexts.ContactTextDescriptionContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.support.contracts.pathfinder.FreeTextDescriptionFragmentKey;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SupportTextDescriptionDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onClickContinue", "input", "", "handleInputError", "", "t", "", "handleInputError$feature_pathfinder_core_pages_externalDebug", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class SupportTextDescriptionDuxo extends BaseDuxo5<SupportTextDescriptionViewState, SupportTextDescriptionEvent> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SupportTextDescriptionDuxo(StaticContentStore staticContentStore, PathfinderStore pathfinderStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        ContactTextDescriptionContext context = ((UserViewStatePageContext.ContactTextDescription) ((FreeTextDescriptionFragmentKey) companion.getArgs(savedStateHandle)).getUserViewState().getTypeContext()).getContext();
        super(new SupportTextDescriptionViewState(((FreeTextDescriptionFragmentKey) companion.getArgs(savedStateHandle)).getInquiryId(), context.getTitle(), context.getSubtitle(), context.getFormLengthLimit(), context.getWarningLengthLimit(), context.getPlaceholderText(), context.getFormLengthMinimum(), context.getFooterText(), null, "", false), duxoBundle);
        this.staticContentStore = staticContentStore;
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C253101(null), 3, null);
    }

    /* compiled from: SupportTextDescriptionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onCreate$1", m3645f = "SupportTextDescriptionDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onCreate$1 */
    static final class C253101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C253101(Continuation<? super C253101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportTextDescriptionDuxo.this.new C253101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C253101 c253101;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = SupportTextDescriptionDuxo.this.staticContentStore;
                this.label = 1;
                c253101 = this;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CxVoiceContentIds.CX_VOICE_CONTENT_CONTENTFUL_ID, null, c253101, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c253101 = this;
            }
            SupportTextDescriptionDuxo.this.applyMutation(new AnonymousClass1((CxVoiceContent) ((EntryResource) obj).getValue(), null));
            return Unit.INSTANCE;
        }

        /* compiled from: SupportTextDescriptionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onCreate$1$1", m3645f = "SupportTextDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportTextDescriptionViewState, Continuation<? super SupportTextDescriptionViewState>, Object> {
            final /* synthetic */ CxVoiceContent $copies;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CxVoiceContent cxVoiceContent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$copies = cxVoiceContent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$copies, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportTextDescriptionViewState supportTextDescriptionViewState, Continuation<? super SupportTextDescriptionViewState> continuation) {
                return ((AnonymousClass1) create(supportTextDescriptionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportTextDescriptionViewState.copy$default((SupportTextDescriptionViewState) this.L$0, null, null, null, 0, 0, null, null, null, this.$copies, null, false, 1791, null);
            }
        }
    }

    /* compiled from: SupportTextDescriptionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onClickContinue$1", m3645f = "SupportTextDescriptionDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onClickContinue$1 */
    static final class C253091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C253091(String str, Continuation<? super C253091> continuation) {
            super(2, continuation);
            this.$input = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportTextDescriptionDuxo.this.new C253091(this.$input, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SupportTextDescriptionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onClickContinue$1$1", m3645f = "SupportTextDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onClickContinue$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportTextDescriptionViewState, Continuation<? super SupportTextDescriptionViewState>, Object> {
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
            public final Object invoke(SupportTextDescriptionViewState supportTextDescriptionViewState, Continuation<? super SupportTextDescriptionViewState> continuation) {
                return ((AnonymousClass1) create(supportTextDescriptionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportTextDescriptionViewState.copy$default((SupportTextDescriptionViewState) this.L$0, null, null, null, 0, 0, null, null, null, null, null, true, 1023, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C253091 c253091;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SupportTextDescriptionDuxo.this.applyMutation(new AnonymousClass1(null));
                PathfinderStore pathfinderStore = SupportTextDescriptionDuxo.this.pathfinderStore;
                Companion companion = SupportTextDescriptionDuxo.INSTANCE;
                UUID inquiryId = ((FreeTextDescriptionFragmentKey) companion.getArgs((HasSavedState) SupportTextDescriptionDuxo.this)).getInquiryId();
                int sequence = ((FreeTextDescriptionFragmentKey) companion.getArgs((HasSavedState) SupportTextDescriptionDuxo.this)).getUserViewState().getSequence();
                UserViewInput.ContactTextDescription contactTextDescription = new UserViewInput.ContactTextDescription(this.$input);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SupportTextDescriptionDuxo.this);
                this.label = 1;
                c253091 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, contactTextDescription, anonymousClass2, c253091) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c253091 = this;
            }
            SupportTextDescriptionDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: SupportTextDescriptionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onClickContinue$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
            AnonymousClass2(Object obj) {
                super(1, obj, SupportTextDescriptionDuxo.class, "handleInputError", "handleInputError$feature_pathfinder_core_pages_externalDebug(Ljava/lang/Throwable;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(((SupportTextDescriptionDuxo) this.receiver).handleInputError$feature_pathfinder_core_pages_externalDebug(p0));
            }
        }

        /* compiled from: SupportTextDescriptionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onClickContinue$1$3", m3645f = "SupportTextDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionDuxo$onClickContinue$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<SupportTextDescriptionViewState, Continuation<? super SupportTextDescriptionViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportTextDescriptionViewState supportTextDescriptionViewState, Continuation<? super SupportTextDescriptionViewState> continuation) {
                return ((AnonymousClass3) create(supportTextDescriptionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportTextDescriptionViewState.copy$default((SupportTextDescriptionViewState) this.L$0, null, null, null, 0, 0, null, null, null, null, null, false, 1023, null);
            }
        }
    }

    public final void onClickContinue(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C253091(input, null), 3, null);
    }

    public final boolean handleInputError$feature_pathfinder_core_pages_externalDebug(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        boolean zIsNetworkRelated = Throwables.isNetworkRelated(t);
        if (zIsNetworkRelated) {
            submit(new SupportTextDescriptionEvent.SendInputErrorEvent(t));
        }
        return zIsNetworkRelated;
    }

    /* compiled from: SupportTextDescriptionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/FreeTextDescriptionFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SupportTextDescriptionDuxo, FreeTextDescriptionFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FreeTextDescriptionFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (FreeTextDescriptionFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FreeTextDescriptionFragmentKey getArgs(SupportTextDescriptionDuxo supportTextDescriptionDuxo) {
            return (FreeTextDescriptionFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, supportTextDescriptionDuxo);
        }
    }
}
