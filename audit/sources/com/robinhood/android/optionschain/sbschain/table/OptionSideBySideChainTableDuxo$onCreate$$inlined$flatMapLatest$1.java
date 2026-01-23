package com.robinhood.android.optionschain.sbschain.table;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.models.p320db.OptionInstrument;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>>>, OptionChainExpirationDateState, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1(Continuation continuation, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo) {
        super(3, continuation);
        this.this$0 = optionSideBySideChainTableDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>>> flowCollector, OptionChainExpirationDateState optionChainExpirationDateState, Continuation<? super Unit> continuation) {
        OptionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1 optionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1 = new OptionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1(continuation, this.this$0);
        optionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1.L$0 = flowCollector;
        optionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1.L$1 = optionChainExpirationDateState;
        return optionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<List<OptionInstrument>> tradeableOptionInstrumentsPaginated;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final OptionChainExpirationDateState optionChainExpirationDateState = (OptionChainExpirationDateState) this.L$1;
            if (((OptionSideBySideChainTableDuxo.InitArg) OptionSideBySideChainTableDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getInSbsChainPerfExperiment()) {
                tradeableOptionInstrumentsPaginated = this.this$0.optionInstrumentStore.getTradeableOptionInstrumentsPaginatedWithCache(optionChainExpirationDateState);
            } else {
                tradeableOptionInstrumentsPaginated = this.this$0.optionInstrumentStore.getTradeableOptionInstrumentsPaginated(optionChainExpirationDateState.getUiOptionChain().getOptionChain().getId(), optionChainExpirationDateState.getExpirationDate());
            }
            final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(tradeableOptionInstrumentsPaginated);
            Flow<Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>>> flow = new Flow<Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>>>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$lambda$3$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>>> flowCollector2, Continuation continuation) {
                    Object objCollect = flowDistinctUntilChanged.collect(new C245352(flowCollector2, optionChainExpirationDateState), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$lambda$3$$inlined$map$1$2 */
                public static final class C245352<T> implements FlowCollector {
                    final /* synthetic */ OptionChainExpirationDateState $expirationDateState$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$lambda$3$$inlined$map$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C245352.this.emit(null, this);
                        }
                    }

                    public C245352(FlowCollector flowCollector, OptionChainExpirationDateState optionChainExpirationDateState) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$expirationDateState$inlined = optionChainExpirationDateState;
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
                            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$expirationDateState$inlined, (List) obj);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
