package com.robinhood.android.trade.equity.util;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BaseDuxos.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\b*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"handleAdtSheetSeen", "", "Lcom/robinhood/android/udf/BaseDuxo;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "hasShownAdtOnboardingBottomSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "setupInitialLoadLogger", "Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/trade/equity/util/EquityOrderContextHolder;", "traderEventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.BaseDuxosKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BaseDuxos {
    public static final void handleAdtSheetSeen(BaseDuxo<?, ?> baseDuxo, EquityTradingSeenStatusStore equityTradingSeenStatusStore, final BooleanPreference hasShownAdtOnboardingBottomSheetPref) {
        Intrinsics.checkNotNullParameter(baseDuxo, "<this>");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
        LifecycleHost.DefaultImpls.bind$default(baseDuxo, equityTradingSeenStatusStore.updateSeenStatus(new ApiEquityTradingSeenStatusRequest(null, null, null, Boolean.TRUE, null, null, null, 119, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.util.BaseDuxosKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseDuxos.handleAdtSheetSeen$lambda$0(hasShownAdtOnboardingBottomSheetPref, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAdtSheetSeen$lambda$0(BooleanPreference booleanPreference, Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        booleanPreference.set(true);
        return Unit.INSTANCE;
    }

    /* compiled from: BaseDuxos.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.util.BaseDuxosKt$setupInitialLoadLogger$1", m3645f = "BaseDuxos.kt", m3646l = {36}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.util.BaseDuxosKt$setupInitialLoadLogger$1 */
    static final class C296651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseDuxo<?, EquityOrderContextHolder> $this_setupInitialLoadLogger;
        final /* synthetic */ TraderEventLogger $traderEventLogger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C296651(BaseDuxo<?, ? extends EquityOrderContextHolder> baseDuxo, TraderEventLogger traderEventLogger, Continuation<? super C296651> continuation) {
            super(2, continuation);
            this.$this_setupInitialLoadLogger = baseDuxo;
            this.$traderEventLogger = traderEventLogger;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C296651(this.$this_setupInitialLoadLogger, this.$traderEventLogger, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.$this_setupInitialLoadLogger.getStateFlow(), new Function1() { // from class: com.robinhood.android.trade.equity.util.BaseDuxosKt$setupInitialLoadLogger$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ((EquityOrderContextHolder) obj2).getConfiguration();
                    }
                });
                Flow<EquityOrderContext> flow = new Flow<EquityOrderContext>() { // from class: com.robinhood.android.trade.equity.util.BaseDuxosKt$setupInitialLoadLogger$1$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.util.BaseDuxosKt$setupInitialLoadLogger$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.util.BaseDuxosKt$setupInitialLoadLogger$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "BaseDuxos.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.util.BaseDuxosKt$setupInitialLoadLogger$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                EquityOrderContext equityOrderContext = ((EquityOrderContextHolder) obj).getEquityOrderContext();
                                if (equityOrderContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(equityOrderContext, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final TraderEventLogger traderEventLogger = this.$traderEventLogger;
                FlowCollector<? super EquityOrderContext> flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.equity.util.BaseDuxosKt.setupInitialLoadLogger.1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((EquityOrderContext) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(EquityOrderContext equityOrderContext, Continuation<? super Unit> continuation) {
                        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(traderEventLogger, OrderFormStep.INITIAL_LOAD, equityOrderContext.toOrderPayload(), equityOrderContext.getBrokerageAccountType(), null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    public static final Job setupInitialLoadLogger(BaseDuxo<?, ? extends EquityOrderContextHolder> baseDuxo, TraderEventLogger traderEventLogger) {
        Intrinsics.checkNotNullParameter(baseDuxo, "<this>");
        Intrinsics.checkNotNullParameter(traderEventLogger, "traderEventLogger");
        return baseDuxo.getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C296651(baseDuxo, traderEventLogger, null));
    }
}
