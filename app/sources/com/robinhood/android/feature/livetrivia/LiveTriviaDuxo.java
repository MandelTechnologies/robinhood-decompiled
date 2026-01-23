package com.robinhood.android.feature.livetrivia;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.engagement.contracts.LiveTriviaKey;
import com.robinhood.android.feature.livetrivia.LiveTriviaEvent;
import com.robinhood.android.lib.livetrivia.LiveTriviaInteractionHandler;
import com.robinhood.android.lib.livetrivia.LiveTriviaManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import trivia.p550v1.GetVideoViewModelRequestDto;
import trivia.p550v1.GetVideoViewModelResponseDto;
import trivia.p550v1.GoldTriviaService;
import trivia.p550v1.SetTriviaEventReminderRequestDto;

/* compiled from: LiveTriviaDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001$B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaViewState;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/livetrivia/LiveTriviaInteractionHandler;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "liveTriviaManager", "Lcom/robinhood/android/lib/livetrivia/LiveTriviaManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/lib/livetrivia/LiveTriviaManager;Landroidx/lifecycle/SavedStateHandle;)V", "getLiveTriviaManager", "()Lcom/robinhood/android/lib/livetrivia/LiveTriviaManager;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "clientService", "Ltrivia/v1/GoldTriviaService;", "onCreate", "", "closeTrivia", "onDestroy", "onBufferingStarted", "onBufferingFinished", "onVideoLoadingChange", "isVideoLoading", "", "dismissProgramView", "seekVideoPlayback", "seekToMs", "", "setTriviaEventReminder", "request", "Ltrivia/v1/SetTriviaEventReminderRequestDto;", "Companion", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class LiveTriviaDuxo extends BaseDuxo5<LiveTriviaViewState, LiveTriviaEvent> implements HasSavedState, LiveTriviaInteractionHandler {
    private final GoldTriviaService clientService;
    private final LiveTriviaManager liveTriviaManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final LiveTriviaManager getLiveTriviaManager() {
        return this.liveTriviaManager;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTriviaDuxo(DuxoBundle duxoBundle, LiveTriviaManager liveTriviaManager, SavedStateHandle savedStateHandle) {
        super(new LiveTriviaViewState(null, false, false, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(liveTriviaManager, "liveTriviaManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.liveTriviaManager = liveTriviaManager;
        this.savedStateHandle = savedStateHandle;
        this.clientService = liveTriviaManager.clientService();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.liveTriviaManager.updateClientInteractionHandler(this);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C167581(null));
    }

    /* compiled from: LiveTriviaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onCreate$1", m3645f = "LiveTriviaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onCreate$1 */
    static final class C167581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C167581(Continuation<? super C167581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167581 c167581 = LiveTriviaDuxo.this.new C167581(continuation);
            c167581.L$0 = obj;
            return c167581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LiveTriviaDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onCreate$1$1", m3645f = "LiveTriviaDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LiveTriviaDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LiveTriviaDuxo liveTriviaDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = liveTriviaDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: LiveTriviaDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Ltrivia/v1/GetVideoViewModelResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onCreate$1$1$1", m3645f = "LiveTriviaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500801 extends ContinuationImpl7 implements Function2<GetVideoViewModelResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ LiveTriviaDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500801(LiveTriviaDuxo liveTriviaDuxo, Continuation<? super C500801> continuation) {
                    super(2, continuation);
                    this.this$0 = liveTriviaDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500801 c500801 = new C500801(this.this$0, continuation);
                    c500801.L$0 = obj;
                    return c500801;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetVideoViewModelResponseDto getVideoViewModelResponseDto, Continuation<? super Unit> continuation) {
                    return ((C500801) create(getVideoViewModelResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: LiveTriviaDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onCreate$1$1$1$1", m3645f = "LiveTriviaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500811 extends ContinuationImpl7 implements Function2<LiveTriviaViewState, Continuation<? super LiveTriviaViewState>, Object> {
                    final /* synthetic */ GetVideoViewModelResponseDto $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500811(GetVideoViewModelResponseDto getVideoViewModelResponseDto, Continuation<? super C500811> continuation) {
                        super(2, continuation);
                        this.$it = getVideoViewModelResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500811 c500811 = new C500811(this.$it, continuation);
                        c500811.L$0 = obj;
                        return c500811;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(LiveTriviaViewState liveTriviaViewState, Continuation<? super LiveTriviaViewState> continuation) {
                        return ((C500811) create(liveTriviaViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return LiveTriviaViewState.copy$default((LiveTriviaViewState) this.L$0, this.$it, false, false, 4, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500811((GetVideoViewModelResponseDto) this.L$0, null));
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
                    Flow<GetVideoViewModelResponseDto> flowGetVideoViewModel = this.this$0.clientService.GetVideoViewModel(new GetVideoViewModelRequestDto());
                    C500801 c500801 = new C500801(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowGetVideoViewModel, c500801, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(LiveTriviaDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeTrivia() {
        withDataState(new Function1() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveTriviaDuxo.closeTrivia$lambda$0(this.f$0, (LiveTriviaViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeTrivia$lambda$0(LiveTriviaDuxo liveTriviaDuxo, LiveTriviaViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.getLoading()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(liveTriviaDuxo), null, null, new LiveTriviaDuxo2(liveTriviaDuxo, null), 3, null);
        } else {
            liveTriviaDuxo.dismissProgramView();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onDestroy() {
        super.onDestroy();
        this.liveTriviaManager.updateClientInteractionHandler(null);
    }

    /* compiled from: LiveTriviaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onBufferingStarted$1", m3645f = "LiveTriviaDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onBufferingStarted$1 */
    static final class C167571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C167571(Continuation<? super C167571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveTriviaDuxo.this.new C167571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveTriviaManager liveTriviaManager = LiveTriviaDuxo.this.getLiveTriviaManager();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.label = 1;
                if (liveTriviaManager.onBufferingStarted(jCurrentTimeMillis, this) == coroutine_suspended) {
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

    public final void onBufferingStarted() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C167571(null), 3, null);
    }

    /* compiled from: LiveTriviaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onBufferingFinished$1", m3645f = "LiveTriviaDuxo.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onBufferingFinished$1 */
    static final class C167561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C167561(Continuation<? super C167561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveTriviaDuxo.this.new C167561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveTriviaManager liveTriviaManager = LiveTriviaDuxo.this.getLiveTriviaManager();
                this.label = 1;
                obj = liveTriviaManager.onBufferingFinished(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Long l = (Long) obj;
            if (l != null) {
                LiveTriviaDuxo.this.submit(new LiveTriviaEvent.PlaybackCatchupEvent(l.longValue()));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onBufferingFinished() {
        onVideoLoadingChange(false);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C167561(null), 3, null);
    }

    /* compiled from: LiveTriviaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onVideoLoadingChange$1", m3645f = "LiveTriviaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaDuxo$onVideoLoadingChange$1 */
    static final class C167591 extends ContinuationImpl7 implements Function2<LiveTriviaViewState, Continuation<? super LiveTriviaViewState>, Object> {
        final /* synthetic */ boolean $isVideoLoading;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167591(boolean z, Continuation<? super C167591> continuation) {
            super(2, continuation);
            this.$isVideoLoading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167591 c167591 = new C167591(this.$isVideoLoading, continuation);
            c167591.L$0 = obj;
            return c167591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveTriviaViewState liveTriviaViewState, Continuation<? super LiveTriviaViewState> continuation) {
            return ((C167591) create(liveTriviaViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return LiveTriviaViewState.copy$default((LiveTriviaViewState) this.L$0, null, false, this.$isVideoLoading, 3, null);
        }
    }

    public final void onVideoLoadingChange(boolean isVideoLoading) {
        applyMutation(new C167591(isVideoLoading, null));
    }

    @Override // com.robinhood.android.lib.livetrivia.LiveTriviaInteractionHandler
    public void dismissProgramView() {
        submit(LiveTriviaEvent.DismissView.INSTANCE);
    }

    @Override // com.robinhood.android.lib.livetrivia.LiveTriviaInteractionHandler
    public void seekVideoPlayback(long seekToMs) {
        submit(new LiveTriviaEvent.PlaybackCatchupEvent(seekToMs));
    }

    @Override // com.robinhood.android.lib.livetrivia.LiveTriviaInteractionHandler
    public void setTriviaEventReminder(SetTriviaEventReminderRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        submit(new LiveTriviaEvent.SetTriviaEventReminder(request.getTitle(), request.getDescription(), request.getEvent_url(), request.getStart_timestamp(), request.getEnd_timestamp()));
    }

    /* compiled from: LiveTriviaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaDuxo;", "Lcom/robinhood/android/engagement/contracts/LiveTriviaKey;", "<init>", "()V", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LiveTriviaDuxo, LiveTriviaKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LiveTriviaKey getArgs(SavedStateHandle savedStateHandle) {
            return (LiveTriviaKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LiveTriviaKey getArgs(LiveTriviaDuxo liveTriviaDuxo) {
            return (LiveTriviaKey) DuxoCompanion.DefaultImpls.getArgs(this, liveTriviaDuxo);
        }
    }
}
