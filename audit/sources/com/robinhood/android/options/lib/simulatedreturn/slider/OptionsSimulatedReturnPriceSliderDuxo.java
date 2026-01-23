package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggings;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderEvent;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Quote;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
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

/* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDuxo;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDuxo;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "stateProvider", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "onSliderDragged", "draggedPercent", "", "dragState", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "onSliderQuotePillTapped", "anchor", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;", "onBottomSheetStateChanged", "isHiddenOrNull", "", "bind", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Price;", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnPriceSliderDuxo extends OptionsSimulatedReturnSliderDuxo<OptionsSimulatedReturnPriceSliderDataState> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private final IndexStore indexStore;
    private final QuoteStore quoteStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsSimulatedReturnPriceSliderDuxo(EventLogger eventLogger, IndexStore indexStore, QuoteStore quoteStore, OptionsSimulatedReturnPriceSliderStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new OptionsSimulatedReturnPriceSliderDataState(null, null, null, null, null, null, null, null, 255, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventLogger = eventLogger;
        this.indexStore = indexStore;
        this.quoteStore = quoteStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow = getStateFlow();
        Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<OptionsSimulatedReturnSliderLaunchMode.Price>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        OptionsSimulatedReturnSliderLaunchMode.Price price = launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Price ? (OptionsSimulatedReturnSliderLaunchMode.Price) launchMode : null;
                        if (price != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(price, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super OptionsSimulatedReturnSliderLaunchMode.Price> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C23315x6df98f3f(null));
        final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow2 = getStateFlow();
        Flow flowTransformLatest2 = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<OptionsSimulatedReturnSliderLaunchMode.Price>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$$inlined$mapNotNull$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$$inlined$mapNotNull$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$$inlined$mapNotNull$2$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                        OptionsSimulatedReturnSliderLaunchMode.Price price = launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Price ? (OptionsSimulatedReturnSliderLaunchMode.Price) launchMode : null;
                        if (price != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(price, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super OptionsSimulatedReturnSliderLaunchMode.Price> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C23316x6df98f40(null));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C233291(flowTransformLatest, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C233302(flowTransformLatest, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C233313(flowTransformLatest2, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C233324(null));
    }

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$1", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$1 */
    static final class C233291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<UUID> $equityUnderlyingIdFlow;
        int label;
        final /* synthetic */ OptionsSimulatedReturnPriceSliderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C233291(Flow<UUID> flow, OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo, Continuation<? super C233291> continuation) {
            super(2, continuation);
            this.$equityUnderlyingIdFlow = flow;
            this.this$0 = optionsSimulatedReturnPriceSliderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C233291(this.$equityUnderlyingIdFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$equityUnderlyingIdFlow, new C23319x5b9edd12(null, this.this$0));
                this.label = 1;
                if (FlowKt.collect(flowTransformLatest, this) == coroutine_suspended) {
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

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$2 */
    static final class C233302 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<UUID> $equityUnderlyingIdFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C233302(Flow<UUID> flow, Continuation<? super C233302> continuation) {
            super(2, continuation);
            this.$equityUnderlyingIdFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnPriceSliderDuxo.this.new C233302(this.$equityUnderlyingIdFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo = OptionsSimulatedReturnPriceSliderDuxo.this;
                Observable observableThrottleFirst = optionsSimulatedReturnPriceSliderDuxo.asObservable(FlowKt.filterNotNull(FlowKt.transformLatest(this.$equityUnderlyingIdFlow, new C23320xb2bccdf1(null, optionsSimulatedReturnPriceSliderDuxo)))).throttleFirst(5L, TimeUnit.SECONDS);
                Intrinsics.checkNotNullExpressionValue(observableThrottleFirst, "throttleFirst(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableThrottleFirst), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnPriceSliderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/db/Quote;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$2$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Quote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnPriceSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnPriceSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Quote quote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(quote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$2$2$1", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState>, Object> {
                final /* synthetic */ Quote $quote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Quote quote, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$quote = quote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$quote, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnPriceSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState = (OptionsSimulatedReturnPriceSliderDataState) this.L$0;
                    Quote quote = this.$quote;
                    Quote initialEquityQuote = optionsSimulatedReturnPriceSliderDataState.getInitialEquityQuote();
                    if (initialEquityQuote == null) {
                        initialEquityQuote = this.$quote;
                    }
                    return OptionsSimulatedReturnPriceSliderDataState.copy$default(optionsSimulatedReturnPriceSliderDataState, null, null, null, quote, initialEquityQuote, null, null, boxing.boxDouble(optionsSimulatedReturnPriceSliderDataState.updatePointerPositionIfNecessary(this.$quote.getLastTradePrice().getDecimalValue())), 103, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Quote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$3", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {103}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$3 */
    static final class C233313 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<UUID> $indexUnderlyingIdFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C233313(Flow<UUID> flow, Continuation<? super C233313> continuation) {
            super(2, continuation);
            this.$indexUnderlyingIdFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnPriceSliderDuxo.this.new C233313(this.$indexUnderlyingIdFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233313) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo = OptionsSimulatedReturnPriceSliderDuxo.this;
                Observable observableThrottleFirst = optionsSimulatedReturnPriceSliderDuxo.asObservable(FlowKt.transformLatest(this.$indexUnderlyingIdFlow, new C23321x9dabed0(null, optionsSimulatedReturnPriceSliderDuxo))).throttleFirst(5L, TimeUnit.SECONDS);
                Intrinsics.checkNotNullExpressionValue(observableThrottleFirst, "throttleFirst(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableThrottleFirst), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnPriceSliderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$3$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<IndexValue, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnPriceSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnPriceSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IndexValue indexValue, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(indexValue, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$3$2$1", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState>, Object> {
                final /* synthetic */ IndexValue $indexValue;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IndexValue indexValue, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$indexValue = indexValue;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$indexValue, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnPriceSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState = (OptionsSimulatedReturnPriceSliderDataState) this.L$0;
                    IndexValue indexValue = this.$indexValue;
                    IndexValue initialIndexValue = optionsSimulatedReturnPriceSliderDataState.getInitialIndexValue();
                    if (initialIndexValue == null) {
                        initialIndexValue = this.$indexValue;
                    }
                    return OptionsSimulatedReturnPriceSliderDataState.copy$default(optionsSimulatedReturnPriceSliderDataState, null, null, null, null, null, indexValue, initialIndexValue, boxing.boxDouble(optionsSimulatedReturnPriceSliderDataState.updatePointerPositionIfNecessary(this.$indexValue.getTrimmedValue())), 31, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((IndexValue) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {120}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4 */
    static final class C233324 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233324(Continuation<? super C233324> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnPriceSliderDuxo.this.new C233324(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233324) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow = OptionsSimulatedReturnPriceSliderDuxo.this.getStateFlow();
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(new Flow<Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                }, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionsSimulatedReturnPriceSliderDuxo.C233324.invokeSuspend$lambda$1((Tuples2) obj2);
                    }
                });
                final Flow<Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>> flow = new Flow<Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends OptionsSimulatedReturnLoggingState, ? extends OptionsSimulatedReturnSliderViewState2>> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                Flow<OptionsSimulatedReturnLoggingState> flow2 = new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$2$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(OptionsSimulatedReturnPriceSliderDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$5", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onCreate$4$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnPriceSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnPriceSliderDuxo;
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

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderDragged$1", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderDragged$1 */
    static final class C233331 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState>, Object> {
        final /* synthetic */ OptionsSimulatedReturnSliderViewState2 $dragState;
        final /* synthetic */ float $draggedPercent;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OptionsSimulatedReturnPriceSliderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C233331(float f, OptionsSimulatedReturnSliderViewState2 optionsSimulatedReturnSliderViewState2, OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo, Continuation<? super C233331> continuation) {
            super(2, continuation);
            this.$draggedPercent = f;
            this.$dragState = optionsSimulatedReturnSliderViewState2;
            this.this$0 = optionsSimulatedReturnPriceSliderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C233331 c233331 = new C233331(this.$draggedPercent, this.$dragState, this.this$0, continuation);
            c233331.L$0 = obj;
            return c233331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState> continuation) {
            return ((C233331) create(optionsSimulatedReturnPriceSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState = (OptionsSimulatedReturnPriceSliderDataState) this.L$0;
            Tuples2<Double, Double> pointerPositionsBeforeAndAfterDrag = optionsSimulatedReturnPriceSliderDataState.getPointerPositionsBeforeAndAfterDrag(this.$draggedPercent, this.$dragState);
            Double dComponent1 = pointerPositionsBeforeAndAfterDrag.component1();
            Double dComponent2 = pointerPositionsBeforeAndAfterDrag.component2();
            List<OptionsSimulatedReturnSliderEvent.SliderHapticFeedback> hapticFeedbacks = optionsSimulatedReturnPriceSliderDataState.getHapticFeedbacks(dComponent1, dComponent2);
            OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo = this.this$0;
            Iterator<T> it = hapticFeedbacks.iterator();
            while (it.hasNext()) {
                optionsSimulatedReturnPriceSliderDuxo.submit((OptionsSimulatedReturnSliderEvent.SliderHapticFeedback) it.next());
            }
            return OptionsSimulatedReturnPriceSliderDataState.copy$default(optionsSimulatedReturnPriceSliderDataState, this.$dragState, null, null, null, null, null, null, dComponent2, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDuxo
    public void onSliderDragged(float draggedPercent, OptionsSimulatedReturnSliderViewState2 dragState) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        applyMutation(new C233331(draggedPercent, dragState, this, null));
    }

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$1", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$1 */
    static final class C233341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int label;

        C233341(Continuation<? super C233341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnPriceSliderDuxo.this.new C233341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
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
                OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo = OptionsSimulatedReturnPriceSliderDuxo.this;
                optionsSimulatedReturnPriceSliderDuxo.applyMutation(new AnonymousClass1(i, optionsSimulatedReturnPriceSliderDuxo, null));
                i++;
                if (i < 20) {
                    this.I$0 = i;
                    this.label = 1;
                    if (DelayKt.delay(10L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo2 = OptionsSimulatedReturnPriceSliderDuxo.this;
                    optionsSimulatedReturnPriceSliderDuxo2.applyMutation(new AnonymousClass1(i, optionsSimulatedReturnPriceSliderDuxo2, null));
                    i++;
                    if (i < 20) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$1$1", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState>, Object> {

            /* renamed from: $i */
            final /* synthetic */ int f4735$i;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnPriceSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(int i, OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.f4735$i = i;
                this.this$0 = optionsSimulatedReturnPriceSliderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4735$i, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState> continuation) {
                return ((AnonymousClass1) create(optionsSimulatedReturnPriceSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState = (OptionsSimulatedReturnPriceSliderDataState) this.L$0;
                Double pointerPositionAfterQuotePillAnimationProgress = optionsSimulatedReturnPriceSliderDataState.getPointerPositionAfterQuotePillAnimationProgress(this.f4735$i, 20);
                this.this$0.submit(new OptionsSimulatedReturnSliderEvent.SliderHapticFeedback(false));
                return OptionsSimulatedReturnPriceSliderDataState.copy$default(optionsSimulatedReturnPriceSliderDataState, null, null, null, null, null, null, null, pointerPositionAfterQuotePillAnimationProgress, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        }
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDuxo
    public void onSliderQuotePillTapped(OptionsSimulatedReturnSliderViewState3 anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C233341(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C233352(null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$2 */
    static final class C233352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C233352(Continuation<? super C233352> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnPriceSliderDuxo.this.new C233352(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C233352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnSliderViewState> stateFlow = OptionsSimulatedReturnPriceSliderDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnPriceSliderDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$2$2", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onSliderQuotePillTapped$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnPriceSliderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnPriceSliderDuxo;
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

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onBottomSheetStateChanged$1", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$onBottomSheetStateChanged$1 */
    static final class C233281 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C233281(Continuation<? super C233281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C233281 c233281 = new C233281(continuation);
            c233281.L$0 = obj;
            return c233281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState> continuation) {
            return ((C233281) create(optionsSimulatedReturnPriceSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState = (OptionsSimulatedReturnPriceSliderDataState) this.L$0;
            return OptionsSimulatedReturnPriceSliderDataState.copy$default(optionsSimulatedReturnPriceSliderDataState, null, null, null, null, null, null, null, optionsSimulatedReturnPriceSliderDataState.getQuotePosition(), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDuxo
    public void onBottomSheetStateChanged(boolean isHiddenOrNull) {
        if (isHiddenOrNull) {
            applyMutation(new C233281(null));
        }
    }

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$bind$1", m3645f = "OptionsSimulatedReturnPriceSliderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderDuxo$bind$1 */
    static final class C233271 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState>, Object> {
        final /* synthetic */ OptionsSimulatedReturnSliderLaunchMode.Price $launchMode;
        final /* synthetic */ OptionsSimulatedReturnLoggingState $loggingState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C233271(OptionsSimulatedReturnSliderLaunchMode.Price price, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super C233271> continuation) {
            super(2, continuation);
            this.$launchMode = price;
            this.$loggingState = optionsSimulatedReturnLoggingState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C233271 c233271 = new C233271(this.$launchMode, this.$loggingState, continuation);
            c233271.L$0 = obj;
            return c233271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnPriceSliderDataState optionsSimulatedReturnPriceSliderDataState, Continuation<? super OptionsSimulatedReturnPriceSliderDataState> continuation) {
            return ((C233271) create(optionsSimulatedReturnPriceSliderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsSimulatedReturnPriceSliderDataState.copy$default((OptionsSimulatedReturnPriceSliderDataState) this.L$0, null, this.$launchMode, this.$loggingState, null, null, null, null, null, EnumC7081g.f2779x59907a3d, null);
        }
    }

    public final void bind(OptionsSimulatedReturnSliderLaunchMode.Price launchMode, OptionsSimulatedReturnLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        applyMutation(new C233271(launchMode, loggingState, null));
    }
}
