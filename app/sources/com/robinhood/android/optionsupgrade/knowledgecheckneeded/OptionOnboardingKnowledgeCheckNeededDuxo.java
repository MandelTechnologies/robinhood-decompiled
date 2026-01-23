package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededEvent;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.OptionOnboardingStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.AppointmentData;
import com.robinhood.models.p320db.ChatData;
import com.robinhood.staticcontent.model.OtherMarkdown;
import java.util.UUID;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001$B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededStateProvider;", "stateProvider", "Lcom/robinhood/contentful/StaticContentStore;", "staticContentStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "optionOnboardingStore", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededStateProvider;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "onChatNowCardClicked", "onScheduleCallCardClicked", "Lcom/robinhood/contentful/StaticContentStore;", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lkotlinx/coroutines/flow/Flow;", "j$/time/Instant", "kotlin.jvm.PlatformType", "currentInstantFlow", "Lkotlinx/coroutines/flow/Flow;", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionOnboardingKnowledgeCheckNeededDuxo extends BaseDuxo3<OptionOnboardingKnowledgeCheckNeededDataState, OptionOnboardingKnowledgeCheckNeededViewState, OptionOnboardingKnowledgeCheckNeededEvent> implements HasSavedState {
    private final Clock clock;
    private final Flow<Instant> currentInstantFlow;
    private final OptionOnboardingStore optionOnboardingStore;
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
    public OptionOnboardingKnowledgeCheckNeededDuxo(OptionOnboardingKnowledgeCheckNeededStateProvider stateProvider, StaticContentStore staticContentStore, OptionOnboardingStore optionOnboardingStore, Clock clock, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new OptionOnboardingKnowledgeCheckNeededDataState(((OptionOnboardingKnowledgeCheckNeededFragment.Args) companion.getArgs(savedStateHandle)).getScreenArgs().getAppointmentEnabled(), ((OptionOnboardingKnowledgeCheckNeededFragment.Args) companion.getArgs(savedStateHandle)).getScreenArgs().getChatEnabled(), ((OptionOnboardingKnowledgeCheckNeededFragment.Args) companion.getArgs(savedStateHandle)).getScreenArgs().getChatHidden(), null, ((OptionOnboardingKnowledgeCheckNeededFragment.Args) companion.getArgs(savedStateHandle)).getScreenArgs().getChatStartTime(), ((OptionOnboardingKnowledgeCheckNeededFragment.Args) companion.getArgs(savedStateHandle)).getScreenArgs().getChatEndTime(), ((OptionOnboardingKnowledgeCheckNeededFragment.Args) companion.getArgs(savedStateHandle)).getScreenArgs().isHalfDay(), ((OptionOnboardingKnowledgeCheckNeededFragment.Args) companion.getArgs(savedStateHandle)).getScreenArgs().isWeekend(), ((OptionOnboardingKnowledgeCheckNeededFragment.Args) companion.getArgs(savedStateHandle)).getScreenArgs().isHoliday(), null, false, false, 3592, null), stateProvider, duxoBundle);
        this.staticContentStore = staticContentStore;
        this.optionOnboardingStore = optionOnboardingStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        this.currentInstantFlow = FlowKt.flow(new OptionOnboardingKnowledgeCheckNeededDuxo2(this, null));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C251461(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C251472(null));
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$1 */
    static final class C251461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C251461(Continuation<? super C251461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingKnowledgeCheckNeededDuxo.this.new C251461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C251461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"j$/time/Instant", "kotlin.jvm.PlatformType", "it", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$1$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOnboardingKnowledgeCheckNeededDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingKnowledgeCheckNeededDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$1$1$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504331 extends ContinuationImpl7 implements Function2<OptionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState>, Object> {
                final /* synthetic */ Instant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504331(Instant instant, Continuation<? super C504331> continuation) {
                    super(2, continuation);
                    this.$it = instant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504331 c504331 = new C504331(this.$it, continuation);
                    c504331.L$0 = obj;
                    return c504331;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState> continuation) {
                    return ((C504331) create(optionOnboardingKnowledgeCheckNeededDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOnboardingKnowledgeCheckNeededDataState.copy$default((OptionOnboardingKnowledgeCheckNeededDataState) this.L$0, false, false, false, this.$it, null, null, false, false, false, null, false, false, 4087, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504331((Instant) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = OptionOnboardingKnowledgeCheckNeededDuxo.this.currentInstantFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionOnboardingKnowledgeCheckNeededDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$2", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$2 */
    static final class C251472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C251472(Continuation<? super C251472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingKnowledgeCheckNeededDuxo.this.new C251472(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C251472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C251472 c251472;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = OptionOnboardingKnowledgeCheckNeededDuxo.this.staticContentStore;
                String disclosureContentfulId = ((OptionOnboardingKnowledgeCheckNeededFragment.Args) OptionOnboardingKnowledgeCheckNeededDuxo.INSTANCE.getArgs((HasSavedState) OptionOnboardingKnowledgeCheckNeededDuxo.this)).getScreenArgs().getDisclosureContentfulId();
                this.label = 1;
                c251472 = this;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, disclosureContentfulId, null, c251472, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c251472 = this;
            }
            OptionOnboardingKnowledgeCheckNeededDuxo.this.applyMutation(new AnonymousClass1(((OtherMarkdown) ((EntryResource) obj).getValue()).getMarkdown2(), null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$2$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState>, Object> {
            final /* synthetic */ String $disclosureMarkdown;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$disclosureMarkdown = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$disclosureMarkdown, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState> continuation) {
                return ((AnonymousClass1) create(optionOnboardingKnowledgeCheckNeededDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionOnboardingKnowledgeCheckNeededDataState.copy$default((OptionOnboardingKnowledgeCheckNeededDataState) this.L$0, false, false, false, null, null, null, false, false, false, this.$disclosureMarkdown, false, false, 3583, null);
            }
        }
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onChatNowCardClicked$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onChatNowCardClicked$1 */
    static final class C251451 extends ContinuationImpl7 implements Function2<OptionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C251451(Continuation<? super C251451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C251451 c251451 = OptionOnboardingKnowledgeCheckNeededDuxo.this.new C251451(continuation);
            c251451.L$0 = obj;
            return c251451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState> continuation) {
            return ((C251451) create(optionOnboardingKnowledgeCheckNeededDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState = (OptionOnboardingKnowledgeCheckNeededDataState) this.L$0;
            if (optionOnboardingKnowledgeCheckNeededDataState.getChatNowCardIsLoading()) {
                return optionOnboardingKnowledgeCheckNeededDataState;
            }
            BuildersKt__Builders_commonKt.launch$default(OptionOnboardingKnowledgeCheckNeededDuxo.this.getLifecycleScope(), null, null, new AnonymousClass1(OptionOnboardingKnowledgeCheckNeededDuxo.this, null), 3, null);
            return OptionOnboardingKnowledgeCheckNeededDataState.copy$default(optionOnboardingKnowledgeCheckNeededDataState, false, false, false, null, null, null, false, false, false, null, true, false, 3071, null);
        }

        /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onChatNowCardClicked$1$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onChatNowCardClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionOnboardingKnowledgeCheckNeededDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingKnowledgeCheckNeededDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo;
                C504321 c504321;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            OptionOnboardingStore optionOnboardingStore = this.this$0.optionOnboardingStore;
                            String accountNumber = ((OptionOnboardingKnowledgeCheckNeededFragment.Args) OptionOnboardingKnowledgeCheckNeededDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                            this.label = 1;
                            obj = optionOnboardingStore.createChat(accountNumber, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        ChatData chatData = (ChatData) obj;
                        String appointmentId = chatData.getAppointmentId();
                        UUID chatInquiryId = chatData.getChatInquiryId();
                        if (chatInquiryId != null) {
                            this.this$0.submit(new OptionOnboardingKnowledgeCheckNeededEvent.OpenChat(chatInquiryId));
                        } else if (appointmentId != null) {
                            this.this$0.submit(new OptionOnboardingKnowledgeCheckNeededEvent.OpenAppointment(appointmentId));
                        }
                        optionOnboardingKnowledgeCheckNeededDuxo = this.this$0;
                        c504321 = new C504321(null);
                    } catch (Exception e) {
                        this.this$0.submit(new OptionOnboardingKnowledgeCheckNeededEvent.Error(e));
                        optionOnboardingKnowledgeCheckNeededDuxo = this.this$0;
                        c504321 = new C504321(null);
                    }
                    optionOnboardingKnowledgeCheckNeededDuxo.applyMutation(c504321);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    this.this$0.applyMutation(new C504321(null));
                    throw th;
                }
            }

            /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onChatNowCardClicked$1$1$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onChatNowCardClicked$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504321 extends ContinuationImpl7 implements Function2<OptionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C504321(Continuation<? super C504321> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504321 c504321 = new C504321(continuation);
                    c504321.L$0 = obj;
                    return c504321;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState> continuation) {
                    return ((C504321) create(optionOnboardingKnowledgeCheckNeededDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOnboardingKnowledgeCheckNeededDataState.copy$default((OptionOnboardingKnowledgeCheckNeededDataState) this.L$0, false, false, false, null, null, null, false, false, false, null, false, false, 3071, null);
                }
            }
        }
    }

    public final void onChatNowCardClicked() {
        applyMutation(new C251451(null));
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onScheduleCallCardClicked$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onScheduleCallCardClicked$1 */
    static final class C251481 extends ContinuationImpl7 implements Function2<OptionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C251481(Continuation<? super C251481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C251481 c251481 = OptionOnboardingKnowledgeCheckNeededDuxo.this.new C251481(continuation);
            c251481.L$0 = obj;
            return c251481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState> continuation) {
            return ((C251481) create(optionOnboardingKnowledgeCheckNeededDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState = (OptionOnboardingKnowledgeCheckNeededDataState) this.L$0;
            if (optionOnboardingKnowledgeCheckNeededDataState.getScheduleCallCardIsLoading()) {
                return optionOnboardingKnowledgeCheckNeededDataState;
            }
            BuildersKt__Builders_commonKt.launch$default(OptionOnboardingKnowledgeCheckNeededDuxo.this.getLifecycleScope(), null, null, new AnonymousClass1(OptionOnboardingKnowledgeCheckNeededDuxo.this, null), 3, null);
            return OptionOnboardingKnowledgeCheckNeededDataState.copy$default(optionOnboardingKnowledgeCheckNeededDataState, false, false, false, null, null, null, false, false, false, null, false, true, 2047, null);
        }

        /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onScheduleCallCardClicked$1$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onScheduleCallCardClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionOnboardingKnowledgeCheckNeededDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingKnowledgeCheckNeededDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo;
                C504341 c504341;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            OptionOnboardingStore optionOnboardingStore = this.this$0.optionOnboardingStore;
                            String accountNumber = ((OptionOnboardingKnowledgeCheckNeededFragment.Args) OptionOnboardingKnowledgeCheckNeededDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                            this.label = 1;
                            obj = optionOnboardingStore.getAppointmentData(accountNumber, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        AppointmentData appointmentData = (AppointmentData) obj;
                        String appointmentId = appointmentData.getAppointmentId();
                        UUID chatInquiryId = appointmentData.getChatInquiryId();
                        if (appointmentData.isNew()) {
                            this.this$0.submit(new OptionOnboardingKnowledgeCheckNeededEvent.ScheduleAppointment(appointmentData.getCampaignId()));
                        } else if (appointmentId != null) {
                            this.this$0.submit(new OptionOnboardingKnowledgeCheckNeededEvent.OpenAppointment(appointmentId));
                        } else if (chatInquiryId != null) {
                            this.this$0.submit(new OptionOnboardingKnowledgeCheckNeededEvent.OpenChat(chatInquiryId));
                        }
                        optionOnboardingKnowledgeCheckNeededDuxo = this.this$0;
                        c504341 = new C504341(null);
                    } catch (Exception e) {
                        this.this$0.submit(new OptionOnboardingKnowledgeCheckNeededEvent.Error(e));
                        optionOnboardingKnowledgeCheckNeededDuxo = this.this$0;
                        c504341 = new C504341(null);
                    }
                    optionOnboardingKnowledgeCheckNeededDuxo.applyMutation(c504341);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    this.this$0.applyMutation(new C504341(null));
                    throw th;
                }
            }

            /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onScheduleCallCardClicked$1$1$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$onScheduleCallCardClicked$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504341 extends ContinuationImpl7 implements Function2<OptionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C504341(Continuation<? super C504341> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504341 c504341 = new C504341(continuation);
                    c504341.L$0 = obj;
                    return c504341;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState, Continuation<? super OptionOnboardingKnowledgeCheckNeededDataState> continuation) {
                    return ((C504341) create(optionOnboardingKnowledgeCheckNeededDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOnboardingKnowledgeCheckNeededDataState.copy$default((OptionOnboardingKnowledgeCheckNeededDataState) this.L$0, false, false, false, null, null, null, false, false, false, null, false, false, 2047, null);
                }
            }
        }
    }

    public final void onScheduleCallCardClicked() {
        applyMutation(new C251481(null));
    }

    /* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDuxo;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionOnboardingKnowledgeCheckNeededDuxo, OptionOnboardingKnowledgeCheckNeededFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOnboardingKnowledgeCheckNeededFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionOnboardingKnowledgeCheckNeededFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOnboardingKnowledgeCheckNeededFragment.Args getArgs(OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo) {
            return (OptionOnboardingKnowledgeCheckNeededFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionOnboardingKnowledgeCheckNeededDuxo);
        }
    }
}
