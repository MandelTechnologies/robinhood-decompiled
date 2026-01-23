package com.robinhood.android.pictureinpicture.pip.event;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager5;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PipEventDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/event/PipEventDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/event/PipEventViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PipEventDuxo extends BaseDuxo4<PipEventViewState> implements HasSavedState {
    private final EventMarketdataStore eventMarketdataStore;
    private final EventStore eventStore;
    private final FuturesChartsServiceManager futuresChartsServiceManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PipEventDuxo(EventStore eventStore, EventMarketdataStore eventMarketdataStore, FuturesChartsServiceManager futuresChartsServiceManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Parcelable args = INSTANCE.getArgs(savedStateHandle);
        Intrinsics.checkNotNull(args, "null cannot be cast to non-null type com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey.Event");
        super(new PipEventViewState(extensions2.toPersistentList(((PictureInPictureKey.Event) args).getContractIds()), null, null, null, true, 14, null), duxoBundle);
        this.eventStore = eventStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C255061(null));
    }

    /* compiled from: PipEventDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1", m3645f = "PipEventDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1 */
    static final class C255061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C255061(Continuation<? super C255061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C255061 c255061 = PipEventDuxo.this.new C255061(continuation);
            c255061.L$0 = obj;
            return c255061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C255061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Parcelable args = PipEventDuxo.INSTANCE.getArgs(PipEventDuxo.this.getSavedStateHandle());
            Intrinsics.checkNotNull(args, "null cannot be cast to non-null type com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey.Event");
            PictureInPictureKey.Event event = (PictureInPictureKey.Event) args;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(PipEventDuxo.this, event, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(PipEventDuxo.this, event, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(PipEventDuxo.this, event, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: PipEventDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$1", m3645f = "PipEventDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PictureInPictureKey.Event $args;
            int label;
            final /* synthetic */ PipEventDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PipEventDuxo pipEventDuxo, PictureInPictureKey.Event event, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pipEventDuxo;
                this.$args = event;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$args, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<UiEcEvent> flowStreamEvent = this.this$0.eventStore.streamEvent(this.$args.getEventId());
                    C504421 c504421 = new C504421(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamEvent, c504421, this) == coroutine_suspended) {
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

            /* compiled from: PipEventDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/event/ui/UiEcEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$1$1", m3645f = "PipEventDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504421 extends ContinuationImpl7 implements Function2<UiEcEvent, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PipEventDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504421(PipEventDuxo pipEventDuxo, Continuation<? super C504421> continuation) {
                    super(2, continuation);
                    this.this$0 = pipEventDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504421 c504421 = new C504421(this.this$0, continuation);
                    c504421.L$0 = obj;
                    return c504421;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiEcEvent uiEcEvent, Continuation<? super Unit> continuation) {
                    return ((C504421) create(uiEcEvent, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PipEventDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pictureinpicture/pip/event/PipEventViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$1$1$1", m3645f = "PipEventDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504431 extends ContinuationImpl7 implements Function2<PipEventViewState, Continuation<? super PipEventViewState>, Object> {
                    final /* synthetic */ UiEcEvent $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504431(UiEcEvent uiEcEvent, Continuation<? super C504431> continuation) {
                        super(2, continuation);
                        this.$it = uiEcEvent;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504431 c504431 = new C504431(this.$it, continuation);
                        c504431.L$0 = obj;
                        return c504431;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PipEventViewState pipEventViewState, Continuation<? super PipEventViewState> continuation) {
                        return ((C504431) create(pipEventViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PipEventViewState.copy$default((PipEventViewState) this.L$0, null, this.$it, null, null, false, 29, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504431((UiEcEvent) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: PipEventDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$2", m3645f = "PipEventDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PictureInPictureKey.Event $args;
            int label;
            final /* synthetic */ PipEventDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PipEventDuxo pipEventDuxo, PictureInPictureKey.Event event, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = pipEventDuxo;
                this.$args = event;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$args, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamQuotes$default = EventMarketdataStore.streamQuotes$default(this.this$0.eventMarketdataStore, this.$args.getContractIds(), MarketdataPollLocation.DEFAULT, null, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamQuotes$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: PipEventDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$2$1", m3645f = "PipEventDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventQuote>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PipEventDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PipEventDuxo pipEventDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = pipEventDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventQuote> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventQuote>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventQuote> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PipEventDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pictureinpicture/pip/event/PipEventViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$2$1$1", m3645f = "PipEventDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504441 extends ContinuationImpl7 implements Function2<PipEventViewState, Continuation<? super PipEventViewState>, Object> {
                    final /* synthetic */ Map<UUID, EventQuote> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504441(Map<UUID, EventQuote> map, Continuation<? super C504441> continuation) {
                        super(2, continuation);
                        this.$it = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504441 c504441 = new C504441(this.$it, continuation);
                        c504441.L$0 = obj;
                        return c504441;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PipEventViewState pipEventViewState, Continuation<? super PipEventViewState> continuation) {
                        return ((C504441) create(pipEventViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PipEventViewState.copy$default((PipEventViewState) this.L$0, null, null, extensions2.toPersistentMap(this.$it), null, false, 27, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504441((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: PipEventDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3", m3645f = "PipEventDuxo.kt", m3646l = {65, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PictureInPictureKey.Event $args;
            int label;
            final /* synthetic */ PipEventDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PipEventDuxo pipEventDuxo, PictureInPictureKey.Event event, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = pipEventDuxo;
                this.$args = event;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$args, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r1, r11, r10) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FuturesChartsServiceManager futuresChartsServiceManager = this.this$0.futuresChartsServiceManager;
                    EventContractChartArg eventContractChartArgCreate$default = EventContractChartArg.Companion.create$default(EventContractChartArg.INSTANCE, this.$args.getContractIds(), this.$args.getSpan(), false, 4, null);
                    this.label = 1;
                    obj = FuturesChartsServiceManager5.streamEagleChartResult(futuresChartsServiceManager, eventContractChartArgCreate$default, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                final Flow flow = (Flow) obj;
                Flow<FuturesChartResult> flow2 = new Flow<FuturesChartResult>() { // from class: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C255052<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "PipEventDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C255052.this.emit(null, this);
                            }
                        }

                        public C255052(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Object value = ((Result) obj).getValue();
                                if (Result.m28555isFailureimpl(value)) {
                                    value = null;
                                }
                                if (value != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(value, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super FuturesChartResult> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C255052(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 2;
            }

            /* compiled from: PipEventDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "rsp", "Lcom/robinhood/android/futures/charts/FuturesChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3$2", m3645f = "PipEventDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesChartResult, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PipEventDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(PipEventDuxo pipEventDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = pipEventDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesChartResult futuresChartResult, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(futuresChartResult, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PipEventDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pictureinpicture/pip/event/PipEventViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3$2$1", m3645f = "PipEventDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.pictureinpicture.pip.event.PipEventDuxo$onCreate$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PipEventViewState, Continuation<? super PipEventViewState>, Object> {
                    final /* synthetic */ FuturesChartResult $rsp;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesChartResult futuresChartResult, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$rsp = futuresChartResult;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$rsp, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PipEventViewState pipEventViewState, Continuation<? super PipEventViewState> continuation) {
                        return ((AnonymousClass1) create(pipEventViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PipEventViewState.copy$default((PipEventViewState) this.L$0, null, null, null, this.$rsp.getChart(), false, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesChartResult) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: PipEventDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/event/PipEventDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pictureinpicture/pip/event/PipEventDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "<init>", "()V", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PipEventDuxo, PictureInPictureKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PictureInPictureKey getArgs(SavedStateHandle savedStateHandle) {
            return (PictureInPictureKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PictureInPictureKey getArgs(PipEventDuxo pipEventDuxo) {
            return (PictureInPictureKey) DuxoCompanion.DefaultImpls.getArgs(this, pipEventDuxo);
        }
    }
}
