package com.robinhood.android.options.p208ui.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.util.Money;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C23845x88f1e64f extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends Optional<? extends ApiOptionTodayTotalReturnResponse2>, ? extends Integer>>, Tuples2<? extends Tuples2<? extends Optional<? extends CuratedListItem>, ? extends UiOptionStrategyInfo>, ? extends Integer>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionsDetailPageDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23845x88f1e64f(Continuation continuation, OptionsDetailPageDuxo optionsDetailPageDuxo) {
        super(3, continuation);
        this.this$0 = optionsDetailPageDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends Optional<? extends ApiOptionTodayTotalReturnResponse2>, ? extends Integer>> flowCollector, Tuples2<? extends Tuples2<? extends Optional<? extends CuratedListItem>, ? extends UiOptionStrategyInfo>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
        C23845x88f1e64f c23845x88f1e64f = new C23845x88f1e64f(continuation, this.this$0);
        c23845x88f1e64f.L$0 = flowCollector;
        c23845x88f1e64f.L$1 = tuples2;
        return c23845x88f1e64f.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Money optionOpenPrice;
        OrderDirection optionOpenPriceDirection;
        Flow<Tuples2<? extends Optional<? extends ApiOptionTodayTotalReturnResponse2>, ? extends Integer>> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            Tuples2 tuples22 = (Tuples2) tuples2.component1();
            final int iIntValue = ((Number) tuples2.component2()).intValue();
            Optional optional = (Optional) tuples22.component1();
            UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples22.component2();
            CuratedListItem curatedListItem = (CuratedListItem) optional.getOrNull();
            if (curatedListItem == null || (optionOpenPrice = curatedListItem.getOptionOpenPrice()) == null || (optionOpenPriceDirection = curatedListItem.getOptionOpenPriceDirection()) == null) {
                flowFlowOf = FlowKt.flowOf(Tuples4.m3642to(Optional2.INSTANCE, boxing.boxInt(iIntValue)));
            } else {
                final Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.aggregateOptionStrategyQuoteStore.streamAndPollQuote(uiOptionStrategyInfo.getOptionStrategyInfo()), new C23846xd70f7cf4(null, uiOptionStrategyInfo, curatedListItem, optionOpenPrice, optionOpenPriceDirection, this.this$0));
                flowFlowOf = new Flow<Tuples2<? extends Optional<? extends ApiOptionTodayTotalReturnResponse2>, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$invokeSuspend$lambda$2$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends Optional<? extends ApiOptionTodayTotalReturnResponse2>, ? extends Integer>> flowCollector2, Continuation continuation) {
                        Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector2, iIntValue), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$invokeSuspend$lambda$2$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ int $i$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$invokeSuspend$lambda$2$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$invokeSuspend$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, int i) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$i$inlined = i;
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
                                Tuples2 tuples2M3642to = Tuples4.m3642to(Optional3.asOptional((ApiOptionTodayTotalReturnResponse2) obj), boxing.boxInt(this.$i$inlined));
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
