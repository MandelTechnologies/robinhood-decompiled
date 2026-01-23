package com.robinhood.android.futures.assethome.sections;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.futures.assethome.C16973R;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartEvent;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.futures.charts.FuturesPerformanceChartArg;
import com.robinhood.android.futures.charts.FuturesPerformanceChartResult;
import com.robinhood.android.futures.contracts.FuturesAssetHomeFragmentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.Monitoring;

/* compiled from: FuturesAssetHomeChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001 B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDataState;", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartEvent;", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartCallbacks;", "Lcom/robinhood/android/udf/HasSavedState;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onScrub", "point", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onSpanSelected", "span", "", "showNetReturnsBottomSheet", "hideNetReturnsBottomSheet", "toggleNetReturnsBottomSheet", "show", "", "Companion", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesAssetHomeChartDuxo extends BaseDuxo3<FuturesAssetHomeChartDataState, FuturesAssetHomeChartViewState, FuturesAssetHomeChartEvent> implements FuturesAssetHomeChartDuxo2, HasSavedState {
    public static final String ARG_SELECTED_SPAN = "selected_span";
    public static final String ARG_SHOW_NET_RETURNS_BOTTOM_SHEET = "show_net_returns_bottom_sheet";
    private final FuturesAccountStore futuresAccountStore;
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
    public FuturesAssetHomeChartDuxo(FuturesAccountStore futuresAccountStore, FuturesChartsServiceManager futuresChartsServiceManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        String str = (String) savedStateHandle.get(ARG_SELECTED_SPAN);
        String str2 = str == null ? DisplaySpans.WEEK : str;
        Boolean bool = (Boolean) savedStateHandle.get(ARG_SHOW_NET_RETURNS_BOTTOM_SHEET);
        super(new FuturesAssetHomeChartDataState(str2, null, null, bool != null ? bool.booleanValue() : false, 6, null), FuturesAssetHomeChartStateProvider.INSTANCE, duxoBundle);
        this.futuresAccountStore = futuresAccountStore;
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C169851(null));
    }

    /* compiled from: FuturesAssetHomeChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1 */
    static final class C169851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C169851(Continuation<? super C169851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C169851 c169851 = FuturesAssetHomeChartDuxo.this.new C169851(continuation);
            c169851.L$0 = obj;
            return c169851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C169851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesAssetHomeChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesAssetHomeChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesAssetHomeChartDuxo futuresAssetHomeChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresAssetHomeChartDuxo;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow stateFlow = this.this$0.getSavedStateHandle().getStateFlow(FuturesAssetHomeChartDuxo.ARG_SELECTED_SPAN, DisplaySpans.WEEK);
                    final FuturesAssetHomeChartDuxo futuresAssetHomeChartDuxo = this.this$0;
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<FuturesPerformanceChartArg>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ FuturesAssetHomeChartDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {52, 50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector, FuturesAssetHomeChartDuxo futuresAssetHomeChartDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = futuresAssetHomeChartDuxo;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
                            
                                if (r2.emit(r4, r0) == r1) goto L21;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                FlowCollector flowCollector;
                                String str;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object futuresAccountIdString = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(futuresAccountIdString);
                                    flowCollector = this.$this_unsafeFlow;
                                    str = (String) obj;
                                    FuturesAccountStore futuresAccountStore = this.this$0.futuresAccountStore;
                                    String accountNumber = ((FuturesAssetHomeFragmentKey) FuturesAssetHomeChartDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getAccountNumber();
                                    anonymousClass1.L$0 = flowCollector;
                                    anonymousClass1.L$1 = str;
                                    anonymousClass1.label = 1;
                                    futuresAccountIdString = futuresAccountStore.getFuturesAccountIdString(accountNumber, anonymousClass1);
                                    if (futuresAccountIdString != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(futuresAccountIdString);
                                    return Unit.INSTANCE;
                                }
                                str = (String) anonymousClass1.L$1;
                                flowCollector = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(futuresAccountIdString);
                                FuturesPerformanceChartArg futuresPerformanceChartArg = new FuturesPerformanceChartArg((String) futuresAccountIdString, str);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.label = 2;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super FuturesPerformanceChartArg> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, futuresAssetHomeChartDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, new C16982xc35563ac(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
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

            /* compiled from: FuturesAssetHomeChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$3", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FuturesPerformanceChartResult, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesAssetHomeChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(FuturesAssetHomeChartDuxo futuresAssetHomeChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresAssetHomeChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesPerformanceChartResult futuresPerformanceChartResult, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(futuresPerformanceChartResult, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesAssetHomeChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$3$1", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C500971 extends ContinuationImpl7 implements Function2<FuturesAssetHomeChartDataState, Continuation<? super FuturesAssetHomeChartDataState>, Object> {
                    final /* synthetic */ FuturesPerformanceChartResult $result;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500971(FuturesPerformanceChartResult futuresPerformanceChartResult, Continuation<? super C500971> continuation) {
                        super(2, continuation);
                        this.$result = futuresPerformanceChartResult;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500971 c500971 = new C500971(this.$result, continuation);
                        c500971.L$0 = obj;
                        return c500971;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesAssetHomeChartDataState futuresAssetHomeChartDataState, Continuation<? super FuturesAssetHomeChartDataState> continuation) {
                        return ((C500971) create(futuresAssetHomeChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesAssetHomeChartDataState.copy$default((FuturesAssetHomeChartDataState) this.L$0, null, this.$result, null, false, 13, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500971((FuturesPerformanceChartResult) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(FuturesAssetHomeChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(FuturesAssetHomeChartDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: FuturesAssetHomeChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$2", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {87}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesAssetHomeChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FuturesAssetHomeChartDuxo futuresAssetHomeChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresAssetHomeChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
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
                    Flow<Monitoring> flowMonitorState = this.this$0.futuresChartsServiceManager.monitorState((CoroutineScope) this.L$0);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowMonitorState, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesAssetHomeChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "microgramState", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$2$1", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesAssetHomeChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesAssetHomeChartDuxo futuresAssetHomeChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresAssetHomeChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Monitoring monitoring, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(monitoring, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Monitoring monitoring = (Monitoring) this.L$0;
                    if (monitoring instanceof Monitoring.Terminated.AppUpdateRequired) {
                        this.this$0.submit(new FuturesAssetHomeChartEvent.Toast(StringResource.INSTANCE.invoke(C16973R.string.futures_asset_home_chart_load_error_app_update_required, new Object[0])));
                    } else if (monitoring instanceof Monitoring.Terminated.Failure) {
                        this.this$0.submit(new FuturesAssetHomeChartEvent.Error(((Monitoring.Terminated.Failure) monitoring).getException()));
                    } else if (!Intrinsics.areEqual(monitoring, Monitoring.Loading.INSTANCE) && !Intrinsics.areEqual(monitoring, Monitoring.Ready.INSTANCE) && !Intrinsics.areEqual(monitoring, Monitoring.Terminated.Closed.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* compiled from: FuturesAssetHomeChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onScrub$1", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onScrub$1 */
    static final class C169861 extends ContinuationImpl7 implements Function2<FuturesAssetHomeChartDataState, Continuation<? super FuturesAssetHomeChartDataState>, Object> {
        final /* synthetic */ Point $point;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C169861(Point point, Continuation<? super C169861> continuation) {
            super(2, continuation);
            this.$point = point;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C169861 c169861 = new C169861(this.$point, continuation);
            c169861.L$0 = obj;
            return c169861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesAssetHomeChartDataState futuresAssetHomeChartDataState, Continuation<? super FuturesAssetHomeChartDataState> continuation) {
            return ((C169861) create(futuresAssetHomeChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesAssetHomeChartDataState futuresAssetHomeChartDataState = (FuturesAssetHomeChartDataState) this.L$0;
            Point point = this.$point;
            return FuturesAssetHomeChartDataState.copy$default(futuresAssetHomeChartDataState, null, null, point != null ? point.getCursor_data() : null, false, 11, null);
        }
    }

    @Override // com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo2
    public void onScrub(Point point) {
        applyMutation(new C169861(point, null));
    }

    /* compiled from: FuturesAssetHomeChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onSpanSelected$1", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onSpanSelected$1 */
    static final class C169871 extends ContinuationImpl7 implements Function2<FuturesAssetHomeChartDataState, Continuation<? super FuturesAssetHomeChartDataState>, Object> {
        final /* synthetic */ String $span;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C169871(String str, Continuation<? super C169871> continuation) {
            super(2, continuation);
            this.$span = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C169871 c169871 = new C169871(this.$span, continuation);
            c169871.L$0 = obj;
            return c169871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesAssetHomeChartDataState futuresAssetHomeChartDataState, Continuation<? super FuturesAssetHomeChartDataState> continuation) {
            return ((C169871) create(futuresAssetHomeChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesAssetHomeChartDataState.copy$default((FuturesAssetHomeChartDataState) this.L$0, this.$span, null, null, false, 14, null);
        }
    }

    @Override // com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo2
    public void onSpanSelected(String span) {
        Intrinsics.checkNotNullParameter(span, "span");
        getSavedStateHandle().set(ARG_SELECTED_SPAN, span);
        applyMutation(new C169871(span, null));
    }

    @Override // com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo2
    public void showNetReturnsBottomSheet() {
        toggleNetReturnsBottomSheet(true);
    }

    @Override // com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo2
    public void hideNetReturnsBottomSheet() {
        toggleNetReturnsBottomSheet(false);
    }

    /* compiled from: FuturesAssetHomeChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$toggleNetReturnsBottomSheet$1", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$toggleNetReturnsBottomSheet$1 */
    static final class C169881 extends ContinuationImpl7 implements Function2<FuturesAssetHomeChartDataState, Continuation<? super FuturesAssetHomeChartDataState>, Object> {
        final /* synthetic */ boolean $show;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C169881(boolean z, Continuation<? super C169881> continuation) {
            super(2, continuation);
            this.$show = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C169881 c169881 = new C169881(this.$show, continuation);
            c169881.L$0 = obj;
            return c169881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesAssetHomeChartDataState futuresAssetHomeChartDataState, Continuation<? super FuturesAssetHomeChartDataState> continuation) {
            return ((C169881) create(futuresAssetHomeChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesAssetHomeChartDataState.copy$default((FuturesAssetHomeChartDataState) this.L$0, null, null, null, this.$show, 7, null);
        }
    }

    private final void toggleNetReturnsBottomSheet(boolean show) {
        getSavedStateHandle().set(ARG_SHOW_NET_RETURNS_BOTTOM_SHEET, Boolean.valueOf(show));
        applyMutation(new C169881(show, null));
    }

    /* compiled from: FuturesAssetHomeChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDuxo;", "Lcom/robinhood/android/futures/contracts/FuturesAssetHomeFragmentKey;", "<init>", "()V", "ARG_SELECTED_SPAN", "", "ARG_SHOW_NET_RETURNS_BOTTOM_SHEET", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FuturesAssetHomeChartDuxo, FuturesAssetHomeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesAssetHomeFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesAssetHomeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesAssetHomeFragmentKey getArgs(FuturesAssetHomeChartDuxo futuresAssetHomeChartDuxo) {
            return (FuturesAssetHomeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, futuresAssetHomeChartDuxo);
        }
    }
}
