package com.robinhood.android.advancedchart;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AdvancedChartParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5", m3645f = "AdvancedChartParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5, reason: use source file name */
/* loaded from: classes24.dex */
final class AdvancedChartParentFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstrumentSpanSelectorView $this_apply;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedChartParentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedChartParentFragment3(AdvancedChartParentFragment advancedChartParentFragment, InstrumentSpanSelectorView instrumentSpanSelectorView, Continuation<? super AdvancedChartParentFragment3> continuation) {
        super(2, continuation);
        this.this$0 = advancedChartParentFragment;
        this.$this_apply = instrumentSpanSelectorView;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedChartParentFragment3 advancedChartParentFragment3 = new AdvancedChartParentFragment3(this.this$0, this.$this_apply, continuation);
        advancedChartParentFragment3.L$0 = obj;
        return advancedChartParentFragment3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedChartParentFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$1", m3645f = "AdvancedChartParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$1 */
    static final class C84871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AdvancedChartParentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84871(AdvancedChartParentFragment advancedChartParentFragment, Continuation<? super C84871> continuation) {
            super(2, continuation);
            this.this$0 = advancedChartParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C84871(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C84871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.getBinding().advancedChartView.getScrubbingProgressObs()), Integer.MAX_VALUE, null, 2, null);
                final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flowCombine(flowBuffer$default, FlowKt.distinctUntilChanged(new Flow<Integer>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$1$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Integer numBoxInt = boxing.boxInt(((AdvancedChartViewState) obj).getIndicatorListViewHeight());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
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
                }), new AnonymousClass2(null)));
                final AdvancedChartParentFragment advancedChartParentFragment = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.2.5.1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Tuples2<Float, Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Tuples2<Float, Integer> tuples2, Continuation<? super Unit> continuation) {
                        advancedChartParentFragment.getBinding().indicatorListView.setTranslationY((-tuples2.component1().floatValue()) * tuples2.component2().intValue());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: AdvancedChartParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "scrubbingProgress", "indicatorHeight"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<Float, Integer, Continuation<? super Tuples2<? extends Float, ? extends Integer>>, Object> {
            /* synthetic */ float F$0;
            /* synthetic */ int I$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            public final Object invoke(float f, int i, Continuation<? super Tuples2<Float, Integer>> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.F$0 = f;
                anonymousClass2.I$0 = i;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Float f, Integer num, Continuation<? super Tuples2<? extends Float, ? extends Integer>> continuation) {
                return invoke(f.floatValue(), num.intValue(), (Continuation<? super Tuples2<Float, Integer>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Tuples4.m3642to(boxing.boxFloat(this.F$0), boxing.boxInt(this.I$0));
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C84871(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C84882(this.this$0, this.$this_apply, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C84893(this.this$0, this.$this_apply, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C84904(this.this$0, this.$this_apply, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C84915(this.this$0, this.$this_apply, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$2 */
    static final class C84882 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InstrumentSpanSelectorView $this_apply;
        int label;
        final /* synthetic */ AdvancedChartParentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84882(AdvancedChartParentFragment advancedChartParentFragment, InstrumentSpanSelectorView instrumentSpanSelectorView, Continuation<? super C84882> continuation) {
            super(2, continuation);
            this.this$0 = advancedChartParentFragment;
            this.$this_apply = instrumentSpanSelectorView;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C84882(this.this$0, this.$this_apply, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C84882) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<InstrumentChartSpans>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super InstrumentChartSpans> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                InstrumentChartSpans chartSpans = ((AdvancedChartViewState) obj).getChartSpans();
                                if (chartSpans != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(chartSpans, anonymousClass1) == coroutine_suspended) {
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
                final InstrumentSpanSelectorView instrumentSpanSelectorView = this.$this_apply;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.2.5.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((InstrumentChartSpans) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(InstrumentChartSpans instrumentChartSpans, Continuation<? super Unit> continuation) {
                        instrumentSpanSelectorView.setChartSpans(instrumentChartSpans);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$3", m3645f = "AdvancedChartParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$3 */
    static final class C84893 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InstrumentSpanSelectorView $this_apply;
        int label;
        final /* synthetic */ AdvancedChartParentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84893(AdvancedChartParentFragment advancedChartParentFragment, InstrumentSpanSelectorView instrumentSpanSelectorView, Continuation<? super C84893> continuation) {
            super(2, continuation);
            this.this$0 = advancedChartParentFragment;
            this.$this_apply = instrumentSpanSelectorView;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C84893(this.this$0, this.$this_apply, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C84893) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$3$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                String displaySpan = ((AdvancedChartViewState) obj).getDisplaySpan();
                                if (displaySpan != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(displaySpan, anonymousClass1) == coroutine_suspended) {
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
                final InstrumentSpanSelectorView instrumentSpanSelectorView = this.$this_apply;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.2.5.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        instrumentSpanSelectorView.setDisplaySpan(str);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$4", m3645f = "AdvancedChartParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$4 */
    static final class C84904 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InstrumentSpanSelectorView $this_apply;
        int label;
        final /* synthetic */ AdvancedChartParentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84904(AdvancedChartParentFragment advancedChartParentFragment, InstrumentSpanSelectorView instrumentSpanSelectorView, Continuation<? super C84904> continuation) {
            super(2, continuation);
            this.this$0 = advancedChartParentFragment;
            this.$this_apply = instrumentSpanSelectorView;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C84904(this.this$0, this.$this_apply, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C84904) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Optional<? extends InstrumentChartIntervals>>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$4$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Optional<? extends InstrumentChartIntervals>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$4$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Optional optionalAsOptional = Optional3.asOptional(((AdvancedChartViewState) obj).getChartIntervals());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
                });
                final InstrumentSpanSelectorView instrumentSpanSelectorView = this.$this_apply;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.2.5.4.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Optional<InstrumentChartIntervals>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Optional<InstrumentChartIntervals> optional, Continuation<? super Unit> continuation) {
                        instrumentSpanSelectorView.setChartIntervals(optional.getOrNull());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$5", m3645f = "AdvancedChartParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$5 */
    static final class C84915 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InstrumentSpanSelectorView $this_apply;
        int label;
        final /* synthetic */ AdvancedChartParentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84915(AdvancedChartParentFragment advancedChartParentFragment, InstrumentSpanSelectorView instrumentSpanSelectorView, Continuation<? super C84915> continuation) {
            super(2, continuation);
            this.this$0 = advancedChartParentFragment;
            this.$this_apply = instrumentSpanSelectorView;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C84915(this.this$0, this.$this_apply, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C84915) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$5$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$5$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$5$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$2$5$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Boolean boolBoxBoolean = boxing.boxBoolean(((AdvancedChartViewState) obj).getShowCustomIntervalsTooltip());
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
                });
                final InstrumentSpanSelectorView instrumentSpanSelectorView = this.$this_apply;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.2.5.5.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        instrumentSpanSelectorView.setShowCustomIntervalTooltip(z);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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
}
