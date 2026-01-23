package com.robinhood.android.event.detail.duel;

import com.robinhood.android.event.detail.EventDetailLiveDataSectionViewState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtil;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.EventStateStore;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: StreamLiveEventStateUseCase.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/event/detail/duel/StreamLiveEventStateUseCase;", "", "Lcom/robinhood/store/event/EventStateStore;", "eventStateStore", "<init>", "(Lcom/robinhood/store/event/EventStateStore;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "eventStateFlow", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "leftContract", "rightContract", "Lkotlin/Function0;", "j$/time/Instant", "getNow", "", "forceRefreshEventState", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "getEventDetailLiveDataSectionViewState", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/android/models/event/db/arsenal/EventContract;Lcom/robinhood/android/models/event/db/arsenal/EventContract;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;", "gameStartTimestampFlow", "Lcom/robinhood/utils/resource/StringResource;", "streamCountDown", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "eventState", "getViewState", "(Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;Lcom/robinhood/android/models/event/db/arsenal/EventContract;Lcom/robinhood/android/models/event/db/arsenal/EventContract;)Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "Ljava/util/UUID;", "eventId", "j$/time/Clock", Card.Icon.CLOCK, "invoke", "(Ljava/util/UUID;Lcom/robinhood/android/models/event/db/arsenal/EventContract;Lcom/robinhood/android/models/event/db/arsenal/EventContract;Lj$/time/Clock;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/event/EventStateStore;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StreamLiveEventStateUseCase {
    public static final int $stable = 8;
    private final EventStateStore eventStateStore;

    public StreamLiveEventStateUseCase(EventStateStore eventStateStore) {
        Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
        this.eventStateStore = eventStateStore;
    }

    /* compiled from: StreamLiveEventStateUseCase.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "viewState", "countDownString", "Lcom/robinhood/utils/resource/StringResource;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$1", m3645f = "StreamLiveEventStateUseCase.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$1 */
    static final class C161921 extends ContinuationImpl7 implements Function3<EventDetailLiveDataSectionViewState, StringResource, Continuation<? super EventDetailLiveDataSectionViewState>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C161921(Continuation<? super C161921> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, StringResource stringResource, Continuation<? super EventDetailLiveDataSectionViewState> continuation) {
            C161921 c161921 = new C161921(continuation);
            c161921.L$0 = eventDetailLiveDataSectionViewState;
            c161921.L$1 = stringResource;
            return c161921.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState = (EventDetailLiveDataSectionViewState) this.L$0;
            StringResource stringResource = (StringResource) this.L$1;
            return (stringResource == null || eventDetailLiveDataSectionViewState == null) ? eventDetailLiveDataSectionViewState : EventDetailLiveDataSectionViewState.copy$default(eventDetailLiveDataSectionViewState, null, null, null, null, null, stringResource, 31, null);
        }
    }

    /* compiled from: StreamLiveEventStateUseCase.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/resource/StringResource;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$streamCountDown$2", m3645f = "StreamLiveEventStateUseCase.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$streamCountDown$2 */
    static final class C161932 extends ContinuationImpl7 implements Function2<FlowCollector<? super StringResource>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C161932(Continuation<? super C161932> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C161932 c161932 = new C161932(continuation);
            c161932.L$0 = obj;
            return c161932;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super StringResource> flowCollector, Continuation<? super Unit> continuation) {
            return ((C161932) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                this.label = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final EventDetailLiveDataSectionViewState getViewState(PredictionMarketEventState eventState, EventContract leftContract, EventContract rightContract) {
        StringResource stringResourceInvoke;
        StringResource stringResource;
        UUID contractId = leftContract.getContractId();
        UUID contractId2 = rightContract.getContractId();
        Instant gameStartTimestamp = eventState.getGameStartTimestamp();
        String edpLiveDataPrimaryLabel = eventState.getEdpLiveDataPrimaryLabel();
        if (gameStartTimestamp != null) {
            stringResourceInvoke = EventStartTimeStringUtil.getEventStartTimeText(gameStartTimestamp, eventState.getGameStartFormat());
            if (stringResourceInvoke == null) {
                if (edpLiveDataPrimaryLabel != null) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(edpLiveDataPrimaryLabel);
                }
                stringResource = null;
            }
            stringResource = stringResourceInvoke;
        } else {
            if (edpLiveDataPrimaryLabel != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(edpLiveDataPrimaryLabel);
                stringResource = stringResourceInvoke;
            }
            stringResource = null;
        }
        if (stringResource == null) {
            return null;
        }
        String str = eventState.getContractIdToEventScore().get(contractId);
        EventDetailLiveDataSectionViewState.ContractViewState contractViewState = str != null ? new EventDetailLiveDataSectionViewState.ContractViewState(Intrinsics.areEqual(eventState.getContractIdToVisualIndicator().get(contractId), Boolean.TRUE), str) : null;
        String str2 = eventState.getContractIdToEventScore().get(contractId2);
        EventDetailLiveDataSectionViewState.ContractViewState contractViewState2 = str2 != null ? new EventDetailLiveDataSectionViewState.ContractViewState(Intrinsics.areEqual(eventState.getContractIdToVisualIndicator().get(contractId2), Boolean.TRUE), str2) : null;
        String edpLiveDataSecondaryLabel = eventState.getEdpLiveDataSecondaryLabel();
        return new EventDetailLiveDataSectionViewState(contractViewState, contractViewState2, DayNightColor2.getDayNightColor(leftContract), DayNightColor2.getDayNightColor(rightContract), stringResource, edpLiveDataSecondaryLabel != null ? StringResource.INSTANCE.invoke(edpLiveDataSecondaryLabel) : null);
    }

    private final Flow<EventDetailLiveDataSectionViewState> getEventDetailLiveDataSectionViewState(final Flow<PredictionMarketEventState> eventStateFlow, final EventContract leftContract, final EventContract rightContract, Function0<Instant> getNow, Function0<Unit> forceRefreshEventState) {
        return Operators.connectWhen(FlowKt.combine(new Flow<EventDetailLiveDataSectionViewState>() { // from class: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ EventContract $leftContract$inlined;
                final /* synthetic */ EventContract $rightContract$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ StreamLiveEventStateUseCase this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$2$2", m3645f = "StreamLiveEventStateUseCase.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$2$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, StreamLiveEventStateUseCase streamLiveEventStateUseCase, EventContract eventContract, EventContract eventContract2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = streamLiveEventStateUseCase;
                    this.$leftContract$inlined = eventContract;
                    this.$rightContract$inlined = eventContract2;
                }

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
                        EventDetailLiveDataSectionViewState viewState = this.this$0.getViewState((PredictionMarketEventState) obj, this.$leftContract$inlined, this.$rightContract$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(viewState, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
            public Object collect(FlowCollector<? super EventDetailLiveDataSectionViewState> flowCollector, Continuation continuation) {
                Object objCollect = eventStateFlow.collect(new AnonymousClass2(flowCollector, this, leftContract, rightContract), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, streamCountDown(getNow, forceRefreshEventState, FlowKt.distinctUntilChanged(new Flow<Instant>() { // from class: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$1$2", m3645f = "StreamLiveEventStateUseCase.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

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
                        Instant gameStartTimestamp = ((PredictionMarketEventState) obj).getGameStartTimestamp();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(gameStartTimestamp, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
            public Object collect(FlowCollector<? super Instant> flowCollector, Continuation continuation) {
                Object objCollect = eventStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        })), new C161921(null)), FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$3

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$3$2", m3645f = "StreamLiveEventStateUseCase.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$getEventDetailLiveDataSectionViewState$$inlined$map$3$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((PredictionMarketEventState) obj).getSupportLiveData());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = eventStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), FlowKt.flowOf((Object) null));
    }

    public final Flow<EventDetailLiveDataSectionViewState> invoke(final UUID eventId, EventContract leftContract, EventContract rightContract, final Clock clock, Flow<PredictionMarketEventState> eventStateFlow) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(leftContract, "leftContract");
        Intrinsics.checkNotNullParameter(rightContract, "rightContract");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(eventStateFlow, "eventStateFlow");
        return getEventDetailLiveDataSectionViewState(eventStateFlow, leftContract, rightContract, new Function0() { // from class: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamLiveEventStateUseCase.invoke$lambda$10(clock);
            }
        }, new Function0() { // from class: com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamLiveEventStateUseCase.invoke$lambda$11(this.f$0, eventId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Instant invoke$lambda$10(Clock clock) {
        Instant instant = clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        return instant;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11(StreamLiveEventStateUseCase streamLiveEventStateUseCase, UUID uuid) {
        streamLiveEventStateUseCase.eventStateStore.refreshEventState(uuid, true);
        return Unit.INSTANCE;
    }

    private final Flow<StringResource> streamCountDown(Function0<Instant> getNow, Function0<Unit> forceRefreshEventState, Flow<Instant> gameStartTimestampFlow) {
        return FlowKt.onEmpty(FlowKt.transformLatest(gameStartTimestampFlow, new C16191x545ce17d(null, getNow, forceRefreshEventState)), new C161932(null));
    }
}
