package com.robinhood.android.engagement.l2improvements;

import com.robinhood.android.engagement.l2improvements.experiments.Equities2025H1HoldoutV2;
import com.robinhood.android.engagement.l2improvements.experiments.GoldL2DataUpsellImprovements;
import com.robinhood.android.engagement.l2improvements.experiments.GoldL2SdpEntrypointExperiment;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: GoldL2ImprovementsStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/engagement/l2improvements/GoldL2ImprovementsStore;", "Lcom/robinhood/store/Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/store/StoreBundle;)V", "streamGoldL2ImprovementExperiments", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "streamGoldL2SdpEntrypointExperiment", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;", "shouldExpose", "", "lib-l2-improvements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class GoldL2ImprovementsStore extends Store {
    private final ExperimentsStore experimentsStore;
    private final MarginSubscriptionStore marginSubscriptionStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldL2ImprovementsStore(ExperimentsStore experimentsStore, MarginSubscriptionStore marginSubscriptionStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.experimentsStore = experimentsStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
    }

    public final Flow<GoldL2DataUpsellImprovements.Variant> streamGoldL2ImprovementExperiments() {
        return FlowKt.distinctUntilChanged(FlowKt.onStart(FlowKt.transformLatest(FlowKt.combine(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, Equities2025H1HoldoutV2.INSTANCE, Equities2025H1HoldoutV2.Variant.EXCLUDED, false, 4, null)), Integer.MAX_VALUE, null, 2, null)), FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.marginSubscriptionStore.streamCurrentMarginSubscription()), Integer.MAX_VALUE, null, 2, null)), new C145971(null)), new C14594xa4a4f052(null, this)), new C145983(null)));
    }

    /* compiled from: GoldL2ImprovementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "holdout", "Lcom/robinhood/android/engagement/l2improvements/experiments/Equities2025H1HoldoutV2$Variant;", "marginSub", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/subscription/db/MarginSubscription;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2ImprovementExperiments$1", m3645f = "GoldL2ImprovementsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2ImprovementExperiments$1 */
    static final class C145971 extends ContinuationImpl7 implements Function3<Equities2025H1HoldoutV2.Variant, Optional<? extends MarginSubscription>, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C145971(Continuation<? super C145971> continuation) {
            super(3, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Equities2025H1HoldoutV2.Variant variant, Optional<MarginSubscription> optional, Continuation<? super Boolean> continuation) {
            C145971 c145971 = new C145971(continuation);
            c145971.L$0 = variant;
            c145971.L$1 = optional;
            return c145971.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Equities2025H1HoldoutV2.Variant variant, Optional<? extends MarginSubscription> optional, Continuation<? super Boolean> continuation) {
            return invoke2(variant, (Optional<MarginSubscription>) optional, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Equities2025H1HoldoutV2.Variant variant = (Equities2025H1HoldoutV2.Variant) this.L$0;
            Optional optional = (Optional) this.L$1;
            boolean z = false;
            boolean z2 = variant == Equities2025H1HoldoutV2.Variant.INCLUDED;
            MarginSubscription marginSubscription = (MarginSubscription) optional.getOrNull();
            boolean z3 = marginSubscription != null && marginSubscription.is24Karat();
            if (z2 && !z3) {
                z = true;
            }
            return boxing.boxBoolean(z);
        }
    }

    /* compiled from: GoldL2ImprovementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2ImprovementExperiments$3", m3645f = "GoldL2ImprovementsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2ImprovementExperiments$3 */
    static final class C145983 extends ContinuationImpl7 implements Function2<FlowCollector<? super GoldL2DataUpsellImprovements.Variant>, Continuation<? super Unit>, Object> {
        int label;

        C145983(Continuation<? super C145983> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldL2ImprovementsStore.this.new C145983(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super GoldL2DataUpsellImprovements.Variant> flowCollector, Continuation<? super Unit> continuation) {
            return ((C145983) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                GoldL2ImprovementsStore.this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ Flow streamGoldL2SdpEntrypointExperiment$default(GoldL2ImprovementsStore goldL2ImprovementsStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return goldL2ImprovementsStore.streamGoldL2SdpEntrypointExperiment(z);
    }

    public final Flow<GoldL2SdpEntrypointExperiment.Variant> streamGoldL2SdpEntrypointExperiment(boolean shouldExpose) {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.marginSubscriptionStore.streamCurrentMarginSubscription()), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.onStart(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2SdpEntrypointExperiment$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2SdpEntrypointExperiment$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2SdpEntrypointExperiment$$inlined$map$1$2", m3645f = "GoldL2ImprovementsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2SdpEntrypointExperiment$$inlined$map$1$2$1, reason: invalid class name */
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
                        MarginSubscription marginSubscription = (MarginSubscription) ((Optional) obj).getOrNull();
                        boolean z = false;
                        if (marginSubscription != null && marginSubscription.is24Karat()) {
                            z = true;
                        }
                        Boolean boolBoxBoolean = boxing.boxBoolean(z);
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
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C14595xaadce8f0(null, this, shouldExpose)), new C145993(null));
    }

    /* compiled from: GoldL2ImprovementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2SdpEntrypointExperiment$3", m3645f = "GoldL2ImprovementsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore$streamGoldL2SdpEntrypointExperiment$3 */
    static final class C145993 extends ContinuationImpl7 implements Function2<FlowCollector<? super GoldL2SdpEntrypointExperiment.Variant>, Continuation<? super Unit>, Object> {
        int label;

        C145993(Continuation<? super C145993> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldL2ImprovementsStore.this.new C145993(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super GoldL2SdpEntrypointExperiment.Variant> flowCollector, Continuation<? super Unit> continuation) {
            return ((C145993) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                GoldL2ImprovementsStore.this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
