package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggings;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderEvent;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionChain;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import org.threeten.extra.Days;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDuxo;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDuxo;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "", "draggedPercent", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "dragState", "onSliderDragged", "(FLcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;)V", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;", "anchor", "onSliderQuotePillTapped", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;)V", "", "isHiddenOrNull", "onBottomSheetStateChanged", "(Z)V", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "loggingState", "bind", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;)V", "Lj$/time/Clock;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnTimeSliderDuxo extends OptionsSimulatedReturnSliderDuxo<OptionsSimulatedReturnTimeSliderDataState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final EventLogger eventLogger;
    private final OptionMarketHoursStore optionMarketHoursStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsSimulatedReturnTimeSliderDuxo(Clock clock, EventLogger eventLogger, OptionMarketHoursStore optionMarketHoursStore, OptionsSimulatedReturnTimeSliderStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new OptionsSimulatedReturnTimeSliderDataState(null, null, null, null, null, null, null, false, null, null, 1023, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.clock = clock;
        this.eventLogger = eventLogger;
        this.optionMarketHoursStore = optionMarketHoursStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C233711(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C233722(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C233733(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C233744(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C233755(null));
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$1 */
    static final class C233711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233711(Continuation<? super C233711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnTimeSliderDuxo.this.new C233711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<Long> observableInterval = Observable.interval(0L, 5L, TimeUnit.SECONDS);
                Intrinsics.checkNotNullExpressionValue(observableInterval, "interval(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableInterval), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsSimulatedReturnTimeSliderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$1$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Long, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Long l, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(l, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503351(Instant.now(this.this$0.clock), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$1$1$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503351 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
                final /* synthetic */ Instant $now;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503351(Instant instant, Continuation<? super C503351> continuation) {
                    super(2, continuation);
                    this.$now = instant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503351 c503351 = new C503351(this.$now, continuation);
                    c503351.L$0 = obj;
                    return c503351;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
                    return ((C503351) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState = (OptionsSimulatedReturnTimeSliderDataState) this.L$0;
                    return OptionsSimulatedReturnTimeSliderDataState.copy$default(optionsSimulatedReturnTimeSliderDataState, null, this.$now, null, null, null, null, null, false, null, optionsSimulatedReturnTimeSliderDataState.updatePointerPositionWithUpdatedNow(r2.getEpochSecond()), 509, null);
                }
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2 */
    static final class C233722 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233722(Continuation<? super C233722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnTimeSliderDuxo.this.new C233722(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow = OptionsSimulatedReturnTimeSliderDuxo.this.getStateFlow();
                final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OptionsSimulatedReturnSliderLaunchMode.Time>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnSliderLaunchMode launchMode = ((OptionsSimulatedReturnSliderViewState) obj).getLaunchMode();
                                OptionsSimulatedReturnSliderLaunchMode.Time time = launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Time ? (OptionsSimulatedReturnSliderLaunchMode.Time) launchMode : null;
                                if (time != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(time, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnSliderLaunchMode.Time> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Tuples2<? extends OptionChain, ? extends LocalDate>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$2

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$2$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                                Tuples2<OptionChain, LocalDate> optionChainToExpDateForExpTime = ((OptionsSimulatedReturnSliderLaunchMode.Time) obj).getOptionChainToExpDateForExpTime();
                                if (optionChainToExpDateForExpTime != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionChainToExpDateForExpTime, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super Tuples2<? extends OptionChain, ? extends LocalDate>> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new C23352x8009b2d9(null, OptionsSimulatedReturnTimeSliderDuxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(OptionsSimulatedReturnTimeSliderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "expTime", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$4", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$4$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
                final /* synthetic */ Instant $expTime;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Instant instant, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$expTime = instant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$expTime, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState = (OptionsSimulatedReturnTimeSliderDataState) this.L$0;
                    return OptionsSimulatedReturnTimeSliderDataState.copy$default(optionsSimulatedReturnTimeSliderDataState, null, null, this.$expTime, null, null, null, null, false, null, boxing.boxDouble(optionsSimulatedReturnTimeSliderDataState.updatePointerPositionWithUpdatedExp(r3.getEpochSecond())), 507, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Instant) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {117}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3 */
    static final class C233733 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233733(Continuation<? super C233733> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnTimeSliderDuxo.this.new C233733(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233733) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow = OptionsSimulatedReturnTimeSliderDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnSliderLaunchMode launchMode = ((OptionsSimulatedReturnSliderViewState) obj).getLaunchMode();
                                OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer portfolioRiskAnalyzer = launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer ? (OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer) launchMode : null;
                                if (portfolioRiskAnalyzer != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(portfolioRiskAnalyzer, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), new C23356xd727a3b8(null, OptionsSimulatedReturnTimeSliderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsSimulatedReturnTimeSliderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "mergedMap", "", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$3", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Map<Long, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<Long, ? extends Integer> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<Long, Integer>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<Long, Integer> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$3$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
                final /* synthetic */ Map<Long, Integer> $mergedMap;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<Long, Integer> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$mergedMap = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mergedMap, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState = (OptionsSimulatedReturnTimeSliderDataState) this.L$0;
                    Map<Long, Integer> map = this.$mergedMap;
                    return OptionsSimulatedReturnTimeSliderDataState.copy$default(optionsSimulatedReturnTimeSliderDataState, null, null, null, map, CollectionsKt.sorted(CollectionsKt.toList(map.keySet())), null, null, false, null, null, 999, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4 */
    static final class C233744 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233744(Continuation<? super C233744> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnTimeSliderDuxo.this.new C233744(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233744) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow = OptionsSimulatedReturnTimeSliderDuxo.this.getStateFlow();
                final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnSliderLaunchMode launchMode = ((OptionsSimulatedReturnSliderViewState) obj).getLaunchMode();
                                OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer portfolioRiskAnalyzer = launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer ? (OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer) launchMode : null;
                                if (portfolioRiskAnalyzer != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(portfolioRiskAnalyzer, anonymousClass1) == coroutine_suspended) {
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
                });
                Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Boolean boolBoxBoolean = boxing.boxBoolean(((OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer) obj).getShowEmptySlider());
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
                };
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsSimulatedReturnTimeSliderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showEmptySlider", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$3", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.this$0.applyMutation(new AnonymousClass1(null));
                } else {
                    this.this$0.applyMutation(new AnonymousClass2(null));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$3$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
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
                public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Instant instantPlus;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState = (OptionsSimulatedReturnTimeSliderDataState) this.L$0;
                    Instant now = optionsSimulatedReturnTimeSliderDataState.getNow();
                    if (now != null) {
                        instantPlus = now.plus((TemporalAmount) Days.m3991of(30));
                        Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
                    } else {
                        instantPlus = null;
                    }
                    return OptionsSimulatedReturnTimeSliderDataState.copy$default(optionsSimulatedReturnTimeSliderDataState, null, null, instantPlus, null, null, null, null, true, null, optionsSimulatedReturnTimeSliderDataState.getNow() != null ? boxing.boxDouble(r14.getEpochSecond()) : optionsSimulatedReturnTimeSliderDataState.getSnappedPointerPosition(), 379, null);
                }
            }

            /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$3$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$4$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
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
                public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
                    return ((AnonymousClass2) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnTimeSliderDataState.copy$default((OptionsSimulatedReturnTimeSliderDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, 895, null);
                }
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5 */
    static final class C233755 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233755(Continuation<? super C233755> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnTimeSliderDuxo.this.new C233755(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233755) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow = OptionsSimulatedReturnTimeSliderDuxo.this.getStateFlow();
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(new Flow<Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnSliderViewState optionsSimulatedReturnSliderViewState = (OptionsSimulatedReturnSliderViewState) obj;
                                Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(optionsSimulatedReturnSliderViewState.getLoggingState(), optionsSimulatedReturnSliderViewState.getDragState()));
                                if (nullable != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(nullable, anonymousClass1) == coroutine_suspended) {
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
                }, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionsSimulatedReturnTimeSliderDuxo.C233755.invokeSuspend$lambda$1((Tuples2) obj2);
                    }
                });
                final Flow<Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>> flow = new Flow<Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                if (((Tuples2) obj).getSecond() == OptionsSimulatedReturnSliderViewState2.DRAGGING) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
                };
                Flow<OptionsSimulatedReturnLoggingState> flow2 = new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$2$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                                Object first = ((Tuples2) obj).getFirst();
                                if (first != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(first, anonymousClass1) == coroutine_suspended) {
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
                };
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(OptionsSimulatedReturnTimeSliderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass5, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionsSimulatedReturnSliderViewState2 invokeSuspend$lambda$1(Tuples2 tuples2) {
            return (OptionsSimulatedReturnSliderViewState2) tuples2.getSecond();
        }

        /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$5", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$5$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnSliderDrag(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderDragged$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderDragged$1 */
    static final class C233761 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
        final /* synthetic */ OptionsSimulatedReturnSliderViewState2 $dragState;
        final /* synthetic */ float $draggedPercent;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C233761(float f, OptionsSimulatedReturnSliderViewState2 optionsSimulatedReturnSliderViewState2, OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, Continuation<? super C233761> continuation) {
            super(2, continuation);
            this.$draggedPercent = f;
            this.$dragState = optionsSimulatedReturnSliderViewState2;
            this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C233761 c233761 = new C233761(this.$draggedPercent, this.$dragState, this.this$0, continuation);
            c233761.L$0 = obj;
            return c233761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
            return ((C233761) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState = (OptionsSimulatedReturnTimeSliderDataState) this.L$0;
            if (optionsSimulatedReturnTimeSliderDataState.getShowEmptySlider()) {
                return optionsSimulatedReturnTimeSliderDataState;
            }
            Tuples2<Double, Double> pointerPositionsBeforeAndAfterDrag = optionsSimulatedReturnTimeSliderDataState.getPointerPositionsBeforeAndAfterDrag(this.$draggedPercent, this.$dragState);
            Double dComponent1 = pointerPositionsBeforeAndAfterDrag.component1();
            Double dComponent2 = pointerPositionsBeforeAndAfterDrag.component2();
            List<OptionsSimulatedReturnSliderEvent.SliderHapticFeedback> hapticFeedbacks = optionsSimulatedReturnTimeSliderDataState.getHapticFeedbacks(dComponent1, dComponent2);
            OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo = this.this$0;
            Iterator<T> it = hapticFeedbacks.iterator();
            while (it.hasNext()) {
                optionsSimulatedReturnTimeSliderDuxo.submit((OptionsSimulatedReturnSliderEvent.SliderHapticFeedback) it.next());
            }
            return OptionsSimulatedReturnTimeSliderDataState.copy$default(optionsSimulatedReturnTimeSliderDataState, this.$dragState, null, null, null, null, null, null, false, null, dComponent2, 510, null);
        }
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDuxo
    public void onSliderDragged(float draggedPercent, OptionsSimulatedReturnSliderViewState2 dragState) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        applyMutation(new C233761(draggedPercent, dragState, this, null));
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$1 */
    static final class C233771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionsSimulatedReturnSliderViewState3 $anchor;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C233771(OptionsSimulatedReturnSliderViewState3 optionsSimulatedReturnSliderViewState3, Continuation<? super C233771> continuation) {
            super(2, continuation);
            this.$anchor = optionsSimulatedReturnSliderViewState3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnTimeSliderDuxo.this.new C233771(this.$anchor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:14:0x002f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                i = 0;
                if (i < 20) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo = OptionsSimulatedReturnTimeSliderDuxo.this;
                optionsSimulatedReturnTimeSliderDuxo.applyMutation(new AnonymousClass1(i, this.$anchor, optionsSimulatedReturnTimeSliderDuxo, null));
                i++;
                if (i < 20) {
                    this.I$0 = i;
                    this.label = 1;
                    if (DelayKt.delay(10L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo2 = OptionsSimulatedReturnTimeSliderDuxo.this;
                    optionsSimulatedReturnTimeSliderDuxo2.applyMutation(new AnonymousClass1(i, this.$anchor, optionsSimulatedReturnTimeSliderDuxo2, null));
                    i++;
                    if (i < 20) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$1$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
            final /* synthetic */ OptionsSimulatedReturnSliderViewState3 $anchor;

            /* renamed from: $i */
            final /* synthetic */ int f4736$i;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(int i, OptionsSimulatedReturnSliderViewState3 optionsSimulatedReturnSliderViewState3, OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.f4736$i = i;
                this.$anchor = optionsSimulatedReturnSliderViewState3;
                this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4736$i, this.$anchor, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
                return ((AnonymousClass1) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState = (OptionsSimulatedReturnTimeSliderDataState) this.L$0;
                if (optionsSimulatedReturnTimeSliderDataState.getShowEmptySlider()) {
                    return optionsSimulatedReturnTimeSliderDataState;
                }
                Double pointerPositionAfterQuotePillAnimationProgress = optionsSimulatedReturnTimeSliderDataState.getPointerPositionAfterQuotePillAnimationProgress(this.f4736$i, 20, this.$anchor);
                this.this$0.submit(new OptionsSimulatedReturnSliderEvent.SliderHapticFeedback(false));
                return OptionsSimulatedReturnTimeSliderDataState.copy$default(optionsSimulatedReturnTimeSliderDataState, null, null, null, null, null, null, null, false, null, pointerPositionAfterQuotePillAnimationProgress, 511, null);
            }
        }
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDuxo
    public void onSliderQuotePillTapped(OptionsSimulatedReturnSliderViewState3 anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C233771(anchor, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C233782(null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {202}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$2 */
    static final class C233782 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233782(Continuation<? super C233782> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnTimeSliderDuxo.this.new C233782(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow = OptionsSimulatedReturnTimeSliderDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsSimulatedReturnSliderViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnTimeSliderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$2$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onSliderQuotePillTapped$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnButtonTap(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0, OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_FLOATING_PILL_IDENTIFIER);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onBottomSheetStateChanged$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onBottomSheetStateChanged$1 */
    static final class C233701 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C233701(Continuation<? super C233701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C233701 c233701 = new C233701(continuation);
            c233701.L$0 = obj;
            return c233701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
            return ((C233701) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState = (OptionsSimulatedReturnTimeSliderDataState) this.L$0;
            return OptionsSimulatedReturnTimeSliderDataState.copy$default(optionsSimulatedReturnTimeSliderDataState, null, null, null, null, null, null, null, false, null, optionsSimulatedReturnTimeSliderDataState.getMaxPointerPosition(), 511, null);
        }
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDuxo
    public void onBottomSheetStateChanged(boolean isHiddenOrNull) {
        if (isHiddenOrNull) {
            applyMutation(new C233701(null));
        }
    }

    /* compiled from: OptionsSimulatedReturnTimeSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$bind$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$bind$1 */
    static final class C233691 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState>, Object> {
        final /* synthetic */ OptionsSimulatedReturnSliderLaunchMode.Time $launchMode;
        final /* synthetic */ OptionsSimulatedReturnLoggingState $loggingState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C233691(OptionsSimulatedReturnSliderLaunchMode.Time time, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super C233691> continuation) {
            super(2, continuation);
            this.$launchMode = time;
            this.$loggingState = optionsSimulatedReturnLoggingState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C233691 c233691 = new C233691(this.$launchMode, this.$loggingState, continuation);
            c233691.L$0 = obj;
            return c233691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, Continuation<? super OptionsSimulatedReturnTimeSliderDataState> continuation) {
            return ((C233691) create(optionsSimulatedReturnTimeSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsSimulatedReturnTimeSliderDataState.copy$default((OptionsSimulatedReturnTimeSliderDataState) this.L$0, null, null, null, null, null, this.$launchMode, this.$loggingState, false, null, null, 927, null);
        }
    }

    public final void bind(OptionsSimulatedReturnSliderLaunchMode.Time launchMode, OptionsSimulatedReturnLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        applyMutation(new C233691(launchMode, loggingState, null));
    }
}
