package com.robinhood.android.feature.linking;

import androidx.compose.p011ui.graphics.Color;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.blackwidow.contracts.MobileLinkingHostIntentKey;
import com.robinhood.android.linking.AuraColors;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import hippo.model.p469v1.BackgroundAuraVariantDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MobileLinkingHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2, reason: use source file name */
/* loaded from: classes3.dex */
final class MobileLinkingHostDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<String> $sharedAccountNumberFlow;
    final /* synthetic */ Flow<BackgroundAuraVariantDto> $sharedAuraFlow;
    int label;
    final /* synthetic */ MobileLinkingHostDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MobileLinkingHostDuxo4(Flow<String> flow, MobileLinkingHostDuxo mobileLinkingHostDuxo, Flow<? extends BackgroundAuraVariantDto> flow2, Continuation<? super MobileLinkingHostDuxo4> continuation) {
        super(2, continuation);
        this.$sharedAccountNumberFlow = flow;
        this.this$0 = mobileLinkingHostDuxo;
        this.$sharedAuraFlow = flow2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileLinkingHostDuxo4(this.$sharedAccountNumberFlow, this.this$0, this.$sharedAuraFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MobileLinkingHostDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow<String> flow = this.$sharedAccountNumberFlow;
            final MobileLinkingHostDuxo mobileLinkingHostDuxo = this.this$0;
            final Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.onEach(new Flow<PerformanceChartStore.PerformanceChartRequest>() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super PerformanceChartStore.PerformanceChartRequest> flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector, mobileLinkingHostDuxo), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ MobileLinkingHostDuxo this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$invokeSuspend$$inlined$map$1$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, MobileLinkingHostDuxo mobileLinkingHostDuxo) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = mobileLinkingHostDuxo;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
                            String accountNumber = (String) obj;
                            if (accountNumber == null) {
                                accountNumber = ((MobileLinkingHostIntentKey) MobileLinkingHostDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getAccountNumber();
                            }
                            PerformanceChartStore.PerformanceChartRequest performanceChartRequest = new PerformanceChartStore.PerformanceChartRequest(accountNumber, PerformanceChartType.HISTORICAL_PORTFOLIO.getServerValue(), null, null, false, null, null, false, null, 496, null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(performanceChartRequest, anonymousClass1) == coroutine_suspended) {
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
            }, new C167472(this.this$0, null)), new C16737x357d414c(null, this.$sharedAuraFlow, this.this$0));
            Flow<Tuples2<? extends BackgroundAuraVariantDto, ? extends Direction>> flow2 = new Flow<Tuples2<? extends BackgroundAuraVariantDto, ? extends Direction>>() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends BackgroundAuraVariantDto, ? extends Direction>> flowCollector, Continuation continuation) {
                    Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$invokeSuspend$$inlined$filter$1$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                            if (((BackgroundAuraVariantDto) ((Tuples2) obj).component1()) == BackgroundAuraVariantDto.BACKGROUND_AURA_VARIANT_PORTFOLIO_PERFORMANCE) {
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
            C167485 c167485 = new C167485(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow2, c167485, this) == coroutine_suspended) {
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

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$2 */
    static final class C167472 extends ContinuationImpl7 implements Function2<PerformanceChartStore.PerformanceChartRequest, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MobileLinkingHostDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167472(MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super C167472> continuation) {
            super(2, continuation);
            this.this$0 = mobileLinkingHostDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167472 c167472 = new C167472(this.this$0, continuation);
            c167472.L$0 = obj;
            return c167472;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PerformanceChartStore.PerformanceChartRequest performanceChartRequest, Continuation<? super Unit> continuation) {
            return ((C167472) create(performanceChartRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceChartStore.PerformanceChartRequest performanceChartRequest = (PerformanceChartStore.PerformanceChartRequest) this.L$0;
                PerformanceChartStore performanceChartStore = this.this$0.performanceChartStore;
                this.label = 1;
                if (performanceChartStore.refreshChartIfStale(performanceChartRequest, this) == coroutine_suspended) {
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

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lhippo/model/v1/BackgroundAuraVariantDto;", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$5", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$5 */
    static final class C167485 extends ContinuationImpl7 implements Function2<Tuples2<? extends BackgroundAuraVariantDto, ? extends Direction>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MobileLinkingHostDuxo this$0;

        /* compiled from: MobileLinkingHostDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$5$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Direction.values().length];
                try {
                    iArr[Direction.f5855UP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Direction.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167485(MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super C167485> continuation) {
            super(2, continuation);
            this.this$0 = mobileLinkingHostDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167485 c167485 = new C167485(this.this$0, continuation);
            c167485.L$0 = obj;
            return c167485;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Tuples2<? extends BackgroundAuraVariantDto, ? extends Direction> tuples2, Continuation<? super Unit> continuation) {
            return ((C167485) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<Color> up;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[((Direction) ((Tuples2) this.L$0).component2()).ordinal()];
            if (i == 1) {
                up = AuraColors.INSTANCE.getUp();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                up = AuraColors.INSTANCE.getDown();
            }
            this.this$0.applyMutation(new AnonymousClass1(up, null));
            return Unit.INSTANCE;
        }

        /* compiled from: MobileLinkingHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/linking/MobileLinkingHostState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$5$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MobileLinkingHostState, Continuation<? super MobileLinkingHostState>, Object> {
            final /* synthetic */ List<Color> $colors;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<Color> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$colors = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$colors, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MobileLinkingHostState mobileLinkingHostState, Continuation<? super MobileLinkingHostState> continuation) {
                return ((AnonymousClass1) create(mobileLinkingHostState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MobileLinkingHostState.copy$default((MobileLinkingHostState) this.L$0, null, null, null, this.$colors, 7, null);
            }
        }
    }
}
