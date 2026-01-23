package com.robinhood.android.futures.charts;

import android.os.Parcelable;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.coroutines.flow.BuildersKt;
import com.robinhood.futures.charts.contracts.FuturesChartsService;
import com.robinhood.futures.charts.contracts.models.EventContractRequest;
import com.robinhood.futures.charts.contracts.models.FuturesChartResponseJson;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical4;
import com.robinhood.futures.charts.contracts.models.FuturesPerformanceChartResponseJson;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import microgram.android.ConnectToMicrogramState;
import microgram.android.MicrogramLaunchId;
import microgram.android.Monitoring;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.p507ui.sdui.SduiDisplaySpan;

/* compiled from: FuturesChartsServiceManager.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016JB\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0096@¢\u0006\u0002\u0010%J8\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00152\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020#H\u0096@¢\u0006\u0002\u0010+J*\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001a0\u00152\u0006\u0010.\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020/H\u0096@¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0002022\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/RealFuturesChartsServiceManager;", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "sduiChartAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "Lkotlin/jvm/JvmSuppressWildcards;", "cursorDataAdapter", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "futuresChartsService", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "Lmicrogram/android/inject/MicrogramComponent;", "getFuturesChartsService", "(Lmicrogram/android/inject/MicrogramComponent;)Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "monitorState", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/android/MicrogramState;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "streamFuturesChartResult", "Lkotlin/Result;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;", "contractId", "Ljava/util/UUID;", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "chartType", "Lcom/robinhood/store/futures/ChartType;", "isContinuous", "", "isSparkline", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/store/futures/ChartType;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamEagleChartResult", "requests", "", "Lcom/robinhood/futures/charts/contracts/models/EventContractRequest;", "fillEntireWidth", "(Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamFuturesPerformanceChartResult", "Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;", "accountNumber", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesChartsServiceManager9 implements FuturesChartsServiceManager {
    public static final int $stable = 8;
    private final JsonAdapter<CursorData> cursorDataAdapter;
    private final MicrogramManager microgramManager;
    private final JsonAdapter<Chart<Parcelable>> sduiChartAdapter;

    /* compiled from: FuturesChartsServiceManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.CANDLESTICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FuturesChartsServiceManager9(MicrogramManager microgramManager, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.microgramManager = microgramManager;
        Types types = Types.INSTANCE;
        this.sduiChartAdapter = moshi.adapter(new TypeToken<Chart<Parcelable>>() { // from class: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$special$$inlined$getAdapter$1
        }.getType());
        this.cursorDataAdapter = moshi.adapter(new TypeToken<CursorData>() { // from class: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$special$$inlined$getAdapter$2
        }.getType());
    }

    private final FuturesChartsService getFuturesChartsService(MicrogramComponent microgramComponent) {
        return (FuturesChartsService) microgramComponent.getServiceLocator().getClient(FuturesChartsService.class);
    }

    @Override // com.robinhood.android.futures.charts.FuturesChartsServiceManager
    public Flow<Monitoring> monitorState(CoroutineScope lifecycleScope) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        return getInstance(lifecycleScope).getComponent().getMicrogramMonitor().getState();
    }

    @Override // com.robinhood.android.futures.charts.FuturesChartsServiceManager
    public Object streamFuturesChartResult(UUID uuid, DisplaySpan displaySpan, ChartType chartType, boolean z, boolean z2, Continuation<? super Flow<Result<FuturesChartResult>>> continuation) {
        FuturesHistorical4 futuresHistorical4;
        MicrogramComponent component = getInstance(CoroutineScope2.CoroutineScope(continuation.getContext())).getComponent();
        FuturesChartsService futuresChartsService = getFuturesChartsService(component);
        String strSafeToString = Uuids.safeToString(uuid);
        SduiDisplaySpan microgramDisplaySpan = DisplaySpans2.toMicrogramDisplaySpan(displaySpan);
        int i = WhenMappings.$EnumSwitchMapping$0[chartType.ordinal()];
        if (i == 1) {
            futuresHistorical4 = FuturesHistorical4.LINE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            futuresHistorical4 = FuturesHistorical4.CANDLESTICK;
        }
        final Flow<FuturesChartResponseJson> flowStreamFuturesChartJson = futuresChartsService.streamFuturesChartJson(strSafeToString, microgramDisplaySpan, futuresHistorical4, z, boxing.boxBoolean(z2));
        return ConnectToMicrogramState.connectToMicrogramState$default(BuildersKt.mapCatchingResult(new Flow<FuturesChartResult>() { // from class: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamFuturesChartResult$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesChartResult> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamFuturesChartJson.collect(new AnonymousClass2(flowCollector, this), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamFuturesChartResult$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ FuturesChartsServiceManager9 this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamFuturesChartResult$$inlined$mapNotNull$1$2", m3645f = "FuturesChartsServiceManager.kt", m3646l = {63}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamFuturesChartResult$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, FuturesChartsServiceManager9 futuresChartsServiceManager9) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = futuresChartsServiceManager9;
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
                        FuturesChartResponseJson futuresChartResponseJson = (FuturesChartResponseJson) obj;
                        String chartJson = futuresChartResponseJson.getChartJson();
                        Chart chart = chartJson != null ? (Chart) this.this$0.sduiChartAdapter.fromJson(chartJson) : null;
                        FuturesChartResult futuresChartResult = (chart == null && futuresChartResponseJson.getComparisonPoint() == null) ? null : new FuturesChartResult(chart, futuresChartResponseJson.getComparisonPoint(), futuresChartResponseJson.isUp(), futuresChartResponseJson.getScrubData());
                        if (futuresChartResult != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(futuresChartResult, anonymousClass1) == coroutine_suspended) {
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
        }), component.getMicrogramMonitor().getState(), null, 2, null);
    }

    @Override // com.robinhood.android.futures.charts.FuturesChartsServiceManager
    public Object streamEagleChartResult(List<EventContractRequest> list, DisplaySpan displaySpan, boolean z, Continuation<? super Flow<Result<FuturesChartResult>>> continuation) {
        MicrogramComponent component = getInstance(CoroutineScope2.CoroutineScope(continuation.getContext())).getComponent();
        final Flow<FuturesChartResponseJson> flowStreamEventContractChartJson = getFuturesChartsService(component).streamEventContractChartJson(list, DisplaySpans2.toMicrogramDisplaySpan(displaySpan), boxing.boxBoolean(z));
        return ConnectToMicrogramState.connectToMicrogramState$default(BuildersKt.mapCatchingResult(new Flow<FuturesChartResult>() { // from class: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamEagleChartResult$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesChartResult> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamEventContractChartJson.collect(new AnonymousClass2(flowCollector, this), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamEagleChartResult$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ FuturesChartsServiceManager9 this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamEagleChartResult$$inlined$mapNotNull$1$2", m3645f = "FuturesChartsServiceManager.kt", m3646l = {63}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamEagleChartResult$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, FuturesChartsServiceManager9 futuresChartsServiceManager9) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = futuresChartsServiceManager9;
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
                        FuturesChartResponseJson futuresChartResponseJson = (FuturesChartResponseJson) obj;
                        String chartJson = futuresChartResponseJson.getChartJson();
                        Chart chart = chartJson != null ? (Chart) this.this$0.sduiChartAdapter.fromJson(chartJson) : null;
                        FuturesChartResult futuresChartResult = chart != null ? new FuturesChartResult(chart, futuresChartResponseJson.getComparisonPoint(), futuresChartResponseJson.isUp(), futuresChartResponseJson.getScrubData()) : null;
                        if (futuresChartResult != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(futuresChartResult, anonymousClass1) == coroutine_suspended) {
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
        }), component.getMicrogramMonitor().getState(), null, 2, null);
    }

    @Override // com.robinhood.android.futures.charts.FuturesChartsServiceManager
    public Object streamFuturesPerformanceChartResult(String str, String str2, Continuation<? super Flow<Result<FuturesPerformanceChartResult>>> continuation) {
        MicrogramComponent component = getInstance(CoroutineScope2.CoroutineScope(continuation.getContext())).getComponent();
        final Flow<FuturesPerformanceChartResponseJson> flowStreamFuturesPerformanceChartJson = getFuturesChartsService(component).streamFuturesPerformanceChartJson(str, DisplaySpans2.toMicrogramDisplaySpan(str2));
        return ConnectToMicrogramState.connectToMicrogramState$default(BuildersKt.mapCatchingResult(new Flow<FuturesPerformanceChartResult>() { // from class: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamFuturesPerformanceChartResult$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesPerformanceChartResult> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamFuturesPerformanceChartJson.collect(new AnonymousClass2(flowCollector, this), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamFuturesPerformanceChartResult$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ FuturesChartsServiceManager9 this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamFuturesPerformanceChartResult$$inlined$mapNotNull$1$2", m3645f = "FuturesChartsServiceManager.kt", m3646l = {66}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.RealFuturesChartsServiceManager$streamFuturesPerformanceChartResult$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, FuturesChartsServiceManager9 futuresChartsServiceManager9) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = futuresChartsServiceManager9;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r5v0, types: [com.robinhood.android.futures.charts.FuturesPerformanceChartResult] */
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
                        FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJson = (FuturesPerformanceChartResponseJson) obj;
                        String chartJson = futuresPerformanceChartResponseJson.getChartJson();
                        Chart chart = chartJson != null ? (Chart) this.this$0.sduiChartAdapter.fromJson(chartJson) : null;
                        String defaultDisplay = futuresPerformanceChartResponseJson.getDefaultDisplay();
                        T futuresPerformanceChartResult = chart != null ? new FuturesPerformanceChartResult(chart, defaultDisplay != null ? (CursorData) this.this$0.cursorDataAdapter.fromJson(defaultDisplay) : null, futuresPerformanceChartResponseJson.getNetReturn(), futuresPerformanceChartResponseJson.getSpanPnl(), futuresPerformanceChartResponseJson.getCommission(), futuresPerformanceChartResponseJson.getExchangeFees()) : null;
                        if (futuresPerformanceChartResult != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(futuresPerformanceChartResult, anonymousClass1) == coroutine_suspended) {
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
        }), component.getMicrogramMonitor().getState(), null, 2, null);
    }

    private final MicrogramManager2 getInstance(CoroutineScope lifecycleScope) {
        MicrogramManager microgramManager = this.microgramManager;
        MicrogramLaunchId microgramLaunchId = new MicrogramLaunchId(new RemoteMicrogramApplication("app-futures-charts", null, 2, null), null, 2, null);
        Duration.Companion companion = Duration.INSTANCE;
        return microgramManager.mo16548getInstancemoChb0s(lifecycleScope, microgramLaunchId, Duration.m28726boximpl(Duration3.toDuration(5, DurationUnitJvm.SECONDS)));
    }
}
