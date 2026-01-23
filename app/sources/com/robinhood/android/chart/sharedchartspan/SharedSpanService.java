package com.robinhood.android.chart.sharedchartspan;

import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: SharedSpanService.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/store/StoreBundle;)V", "sharedSpanEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/chart/sharedchartspan/UnifiedSpan;", "sharedSpanEventsWithReplay", "Lkotlinx/coroutines/flow/SharedFlow;", "sendSharedSpanEvent", "", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "streamSpanStringWithReplay", "Lkotlinx/coroutines/flow/Flow;", "", "streamCurrentDisplaySpan", "lib-shared-chart-span_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SharedSpanService extends Store {
    private final SharedFlow2<UnifiedSpan> sharedSpanEvents;
    private final SharedFlow<UnifiedSpan> sharedSpanEventsWithReplay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSpanService(StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        SharedFlow2<UnifiedSpan> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.sharedSpanEvents = sharedFlow2MutableSharedFlow$default;
        this.sharedSpanEventsWithReplay = FlowKt.shareIn(sharedFlow2MutableSharedFlow$default, getStoreScope(), SharingStarted.INSTANCE.getEagerly(), 1);
    }

    /* compiled from: SharedSpanService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.sharedchartspan.SharedSpanService$sendSharedSpanEvent$1", m3645f = "SharedSpanService.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanService$sendSharedSpanEvent$1 */
    static final class C109671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DisplaySpan $span;
        int label;

        /* compiled from: SharedSpanService.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanService$sendSharedSpanEvent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DisplaySpan.values().length];
                try {
                    iArr[DisplaySpan.CORTEX_INSIGHTS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DisplaySpan.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DisplaySpan.HOUR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DisplaySpan.f93684HOUR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DisplaySpan.DAY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DisplaySpan.WEEK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DisplaySpan.MONTH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[DisplaySpan.f93673MONTH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[DisplaySpan.YTD.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[DisplaySpan.YEAR.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[DisplaySpan.f93695YEAR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[DisplaySpan.ALL.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109671(DisplaySpan displaySpan, Continuation<? super C109671> continuation) {
            super(2, continuation);
            this.$span = displaySpan;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedSpanService.this.new C109671(this.$span, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UnifiedSpan unifiedSpan;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = SharedSpanService.this.sharedSpanEvents;
                switch (WhenMappings.$EnumSwitchMapping$0[this.$span.ordinal()]) {
                    case 1:
                    case 2:
                        unifiedSpan = UnifiedSpan.UNKNOWN;
                        break;
                    case 3:
                        unifiedSpan = UnifiedSpan.LIVE;
                        break;
                    case 4:
                        unifiedSpan = UnifiedSpan.FOUR_HOUR;
                        break;
                    case 5:
                        unifiedSpan = UnifiedSpan.DAY;
                        break;
                    case 6:
                        unifiedSpan = UnifiedSpan.WEEK;
                        break;
                    case 7:
                        unifiedSpan = UnifiedSpan.MONTH;
                        break;
                    case 8:
                        unifiedSpan = UnifiedSpan.THREE_MONTH;
                        break;
                    case 9:
                        unifiedSpan = UnifiedSpan.YTD;
                        break;
                    case 10:
                        unifiedSpan = UnifiedSpan.YEAR;
                        break;
                    case 11:
                        unifiedSpan = UnifiedSpan.FIVE_YEAR;
                        break;
                    case 12:
                        unifiedSpan = UnifiedSpan.ALL;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                this.label = 1;
                if (sharedFlow2.emit(unifiedSpan, this) == coroutine_suspended) {
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

    public final void sendSharedSpanEvent(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C109671(span, null), 3, null);
    }

    /* compiled from: SharedSpanService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.sharedchartspan.SharedSpanService$sendSharedSpanEvent$2", m3645f = "SharedSpanService.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanService$sendSharedSpanEvent$2 */
    static final class C109682 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TimeSpanDto $span;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109682(TimeSpanDto timeSpanDto, Continuation<? super C109682> continuation) {
            super(2, continuation);
            this.$span = timeSpanDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedSpanService.this.new C109682(this.$span, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UnifiedSpan unifiedSpan;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = SharedSpanService.this.sharedSpanEvents;
                String id = this.$span.getId();
                switch (id.hashCode()) {
                    case 1619:
                        if (!id.equals("1d")) {
                            unifiedSpan = UnifiedSpan.UNKNOWN;
                            break;
                        } else {
                            unifiedSpan = UnifiedSpan.DAY;
                            break;
                        }
                    case 1638:
                        if (id.equals("1w")) {
                            unifiedSpan = UnifiedSpan.WEEK;
                            break;
                        }
                        break;
                    case 1640:
                        if (id.equals("1y")) {
                            unifiedSpan = UnifiedSpan.YEAR;
                            break;
                        }
                        break;
                    case 1764:
                        if (id.equals("5y")) {
                            unifiedSpan = UnifiedSpan.FIVE_YEAR;
                            break;
                        }
                        break;
                    case 50579:
                        if (id.equals("1mo")) {
                            unifiedSpan = UnifiedSpan.MONTH;
                            break;
                        }
                        break;
                    case 52501:
                        if (id.equals("3mo")) {
                            unifiedSpan = UnifiedSpan.THREE_MONTH;
                            break;
                        }
                        break;
                    case 96673:
                        if (id.equals(ApiRenderablePlatforms.VERSIONS_ALL)) {
                            unifiedSpan = UnifiedSpan.ALL;
                            break;
                        }
                        break;
                    case 119977:
                        if (id.equals("ytd")) {
                            unifiedSpan = UnifiedSpan.YTD;
                            break;
                        }
                        break;
                }
                this.label = 1;
                if (sharedFlow2.emit(unifiedSpan, this) == coroutine_suspended) {
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

    public final void sendSharedSpanEvent(TimeSpanDto span) {
        Intrinsics.checkNotNullParameter(span, "span");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C109682(span, null), 3, null);
    }

    public final Flow<String> streamSpanStringWithReplay() {
        final SharedFlow<UnifiedSpan> sharedFlow = this.sharedSpanEventsWithReplay;
        return new Flow<String>() { // from class: com.robinhood.android.chart.sharedchartspan.SharedSpanService$streamSpanStringWithReplay$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanService$streamSpanStringWithReplay$$inlined$map$1$2 */
            public static final class C109662<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.sharedchartspan.SharedSpanService$streamSpanStringWithReplay$$inlined$map$1$2", m3645f = "SharedSpanService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanService$streamSpanStringWithReplay$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C109662.this.emit(null, this);
                    }
                }

                public C109662(FlowCollector flowCollector) {
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
                        String spanString = SharedSpanService2.toSpanString((UnifiedSpan) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(spanString, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlow.collect(new C109662(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<DisplaySpan> streamCurrentDisplaySpan() {
        final SharedFlow2<UnifiedSpan> sharedFlow2 = this.sharedSpanEvents;
        return new Flow<DisplaySpan>() { // from class: com.robinhood.android.chart.sharedchartspan.SharedSpanService$streamCurrentDisplaySpan$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanService$streamCurrentDisplaySpan$$inlined$map$1$2 */
            public static final class C109652<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.sharedchartspan.SharedSpanService$streamCurrentDisplaySpan$$inlined$map$1$2", m3645f = "SharedSpanService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.chart.sharedchartspan.SharedSpanService$streamCurrentDisplaySpan$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C109652.this.emit(null, this);
                    }
                }

                public C109652(FlowCollector flowCollector) {
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
                        DisplaySpan displaySpan = SharedSpanService2.toDisplaySpan((UnifiedSpan) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(displaySpan, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super DisplaySpan> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlow2.collect(new C109652(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
