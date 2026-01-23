package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$$inlined$flatMapLatest$1", m3645f = "TraderInvestmentScheduleEventStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C34391xd7b026ed extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends UiInvestmentScheduleEvent, ? extends UiCurrencyPair>>, UiInvestmentScheduleEvent, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ TraderInvestmentScheduleEventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34391xd7b026ed(Continuation continuation, TraderInvestmentScheduleEventStore traderInvestmentScheduleEventStore) {
        super(3, continuation);
        this.this$0 = traderInvestmentScheduleEventStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends UiInvestmentScheduleEvent, ? extends UiCurrencyPair>> flowCollector, UiInvestmentScheduleEvent uiInvestmentScheduleEvent, Continuation<? super Unit> continuation) {
        C34391xd7b026ed c34391xd7b026ed = new C34391xd7b026ed(continuation, this.this$0);
        c34391xd7b026ed.L$0 = flowCollector;
        c34391xd7b026ed.L$1 = uiInvestmentScheduleEvent;
        return c34391xd7b026ed.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<Tuples2<? extends UiInvestmentScheduleEvent, ? extends UiCurrencyPair>> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final UiInvestmentScheduleEvent uiInvestmentScheduleEvent = (UiInvestmentScheduleEvent) this.L$1;
            if (uiInvestmentScheduleEvent.getIsCrypto()) {
                UUID assetId = uiInvestmentScheduleEvent.getInvestmentScheduleEvent().getAssetId();
                if (assetId != null) {
                    final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.uiCurrencyPairStore.streamCurrencyPair(assetId)), Integer.MAX_VALUE, null, 2, null);
                    flowFlowOf = new Flow<Tuples2<? extends UiInvestmentScheduleEvent, ? extends UiCurrencyPair>>() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$lambda$1$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends UiInvestmentScheduleEvent, ? extends UiCurrencyPair>> flowCollector2, Continuation continuation) {
                            Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector2, uiInvestmentScheduleEvent), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$lambda$1$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ UiInvestmentScheduleEvent $uiInvestmentScheduleEvent$inlined;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$lambda$1$$inlined$map$1$2", m3645f = "TraderInvestmentScheduleEventStore.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$transactionLoader$1$load$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector, UiInvestmentScheduleEvent uiInvestmentScheduleEvent) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$uiInvestmentScheduleEvent$inlined = uiInvestmentScheduleEvent;
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
                                    Tuples2 tuples2 = new Tuples2(this.$uiInvestmentScheduleEvent$inlined, (UiCurrencyPair) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2, anonymousClass1) == coroutine_suspended) {
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
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                flowFlowOf = FlowKt.flowOf(new Tuples2(uiInvestmentScheduleEvent, null));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
