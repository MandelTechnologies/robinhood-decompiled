package com.robinhood.android.gold.upgrade.unified.screen;

import com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxo;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoViewState;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import gold_flow.proto.p466v1.StreamValuePropsPromoContentRequestDto;
import gold_flow.proto.p466v1.StreamValuePropsPromoContentResponse;
import gold_flow.proto.p466v1.StreamValuePropsPromoContentResponseDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GoldUnifiedValuePropsPromoDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsPromoDuxo;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedBaseDuxo;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsPromoViewState;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "onCreate", "", "perfEvents", "", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "completePerformanceMetrics", "failPerformanceMetrics", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldUnifiedValuePropsPromoDuxo extends GoldUnifiedBaseDuxo<GoldUnifiedValuePropsPromoViewState> {
    public static final int $stable = 8;
    private final List<ContextActionEvent> perfEvents;
    private final PerformanceLogger performanceLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUnifiedValuePropsPromoDuxo(MicrogramManager microgramManager, DuxoBundle duxoBundle, PerformanceLogger performanceLogger) {
        super(microgramManager, duxoBundle, GoldUnifiedValuePropsPromoViewState.Loading.INSTANCE);
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        this.performanceLogger = performanceLogger;
        this.perfEvents = CollectionsKt.listOf((Object[]) new ContextActionEvent[]{new ContextActionEvent.Component(new Component(Component.ComponentType.ACCOUNT_CENTER_UPSELL_BANNER, "gold_upsell_fomo", null, 4, null)), new ContextActionEvent.Action(UserInteractionEventData.Action.GOLD_UPSELL_UPGRADE)});
    }

    /* compiled from: GoldUnifiedValuePropsPromoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1", m3645f = "GoldUnifiedValuePropsPromoDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1 */
    static final class C182821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C182821(Continuation<? super C182821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldUnifiedValuePropsPromoDuxo.this.new C182821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C182821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<StreamValuePropsPromoContentResponseDto> flowStreamValuePropsPromoContent = GoldUnifiedValuePropsPromoDuxo.this.getGoldFlowService().StreamValuePropsPromoContent(new StreamValuePropsPromoContentRequestDto());
                Flow flowM28818catch = FlowKt.m28818catch(new Flow<StreamValuePropsPromoContentResponse>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "GoldUnifiedValuePropsPromoDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                StreamValuePropsPromoContentResponse proto = ((StreamValuePropsPromoContentResponseDto) obj).toProto();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super StreamValuePropsPromoContentResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamValuePropsPromoContent.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new AnonymousClass2(GoldUnifiedValuePropsPromoDuxo.this, null));
                final GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo = GoldUnifiedValuePropsPromoDuxo.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo.onCreate.1.3

                    /* compiled from: GoldUnifiedValuePropsPromoDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsPromoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$3$1", m3645f = "GoldUnifiedValuePropsPromoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$3$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldUnifiedValuePropsPromoViewState, Continuation<? super GoldUnifiedValuePropsPromoViewState>, Object> {
                        final /* synthetic */ StreamValuePropsPromoContentResponse $content;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$content = streamValuePropsPromoContentResponse;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$content, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(GoldUnifiedValuePropsPromoViewState goldUnifiedValuePropsPromoViewState, Continuation<? super GoldUnifiedValuePropsPromoViewState> continuation) {
                            return ((AnonymousClass1) create(goldUnifiedValuePropsPromoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return new GoldUnifiedValuePropsPromoViewState.Loaded(this.$content);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StreamValuePropsPromoContentResponse) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse, Continuation<? super Unit> continuation) {
                        goldUnifiedValuePropsPromoDuxo.applyMutation(new AnonymousClass1(streamValuePropsPromoContentResponse, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowM28818catch.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: GoldUnifiedValuePropsPromoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$2", m3645f = "GoldUnifiedValuePropsPromoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamValuePropsPromoContentResponse>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GoldUnifiedValuePropsPromoDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(GoldUnifiedValuePropsPromoDuxo goldUnifiedValuePropsPromoDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = goldUnifiedValuePropsPromoDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StreamValuePropsPromoContentResponse> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                CrashReporter.INSTANCE.reportNonFatal(th, false, new EventMetadata(SentryTeam.GOLD, null, null, 6, null));
                this.this$0.applyMutation(new AnonymousClass1(th, null));
                return Unit.INSTANCE;
            }

            /* compiled from: GoldUnifiedValuePropsPromoDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedValuePropsPromoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$2$1", m3645f = "GoldUnifiedValuePropsPromoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldUnifiedValuePropsPromoViewState, Continuation<? super GoldUnifiedValuePropsPromoViewState>, Object> {
                final /* synthetic */ Throwable $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Throwable th, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = th;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GoldUnifiedValuePropsPromoViewState goldUnifiedValuePropsPromoViewState, Continuation<? super GoldUnifiedValuePropsPromoViewState> continuation) {
                    return ((AnonymousClass1) create(goldUnifiedValuePropsPromoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new GoldUnifiedValuePropsPromoViewState.Error(this.$it);
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C182821(null));
    }

    public final void completePerformanceMetrics() {
        List<ContextActionEvent> list = this.perfEvents;
        PerformanceLogger performanceLogger = this.performanceLogger;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            performanceLogger.completeMetric((ContextActionEvent) it.next());
        }
    }

    public final void failPerformanceMetrics() {
        List<ContextActionEvent> list = this.perfEvents;
        PerformanceLogger performanceLogger = this.performanceLogger;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            performanceLogger.failMetric((ContextActionEvent) it.next());
        }
    }
}
