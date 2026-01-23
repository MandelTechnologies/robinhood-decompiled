package com.robinhood.shared.common.earnings;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import com.robinhood.utils.datetime.LocalDates4;
import equity_earnings.proto.p458v1.EarningDto;
import equity_earnings.proto.p458v1.EquityEarningsService;
import equity_earnings.proto.p458v1.StreamEarningsChartRequestDto;
import equity_earnings.proto.p458v1.StreamEarningsChartResponseDto;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "EarningsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class EarningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super ChartGroupDto>, UiEarnings, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EarningsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, EarningsDuxo earningsDuxo) {
        super(3, continuation);
        this.this$0 = earningsDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super ChartGroupDto> flowCollector, UiEarnings uiEarnings, Continuation<? super Unit> continuation) {
        EarningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1 earningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1 = new EarningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        earningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        earningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = uiEarnings;
        return earningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<ChartGroupDto> flowFlowOf;
        List listEmptyList;
        BigDecimal estimate;
        BigDecimal actual;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            UiEarnings uiEarnings = (UiEarnings) this.L$1;
            if (uiEarnings.hasEarningsData()) {
                EarningsDuxo earningsDuxo = this.this$0;
                earningsDuxo.applyMutation(new EarningsDuxo3(uiEarnings, earningsDuxo, null));
                EquityEarningsService equityEarningsService = this.this$0.earningsService;
                List<Earning> earningsForDisplay = uiEarnings.getEarningsForDisplay();
                if (earningsForDisplay == null) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    List<Earning> list = earningsForDisplay;
                    listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (Earning earning : list) {
                        Earning.Eps eps = earning.getEps();
                        Float fBoxFloat = (eps == null || (actual = eps.getActual()) == null) ? null : boxing.boxFloat(actual.floatValue());
                        Earning.Eps eps2 = earning.getEps();
                        Float fBoxFloat2 = (eps2 == null || (estimate = eps2.getEstimate()) == null) ? null : boxing.boxFloat(estimate.floatValue());
                        LocalDate localDateAtEndOfQuarter = earning.getYearQuarter().atEndOfQuarter();
                        Intrinsics.checkNotNullExpressionValue(localDateAtEndOfQuarter, "atEndOfQuarter(...)");
                        listEmptyList.add(new EarningDto(fBoxFloat, fBoxFloat2, Instant.ofEpochMilli(LocalDates4.toEpochMillis$default(localDateAtEndOfQuarter, null, 1, null))));
                    }
                }
                final Flow<StreamEarningsChartResponseDto> flowStreamEarningsChart = equityEarningsService.StreamEarningsChart(new StreamEarningsChartRequestDto((List<EarningDto>) listEmptyList));
                flowFlowOf = new Flow<ChartGroupDto>() { // from class: com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$invokeSuspend$lambda$2$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$invokeSuspend$lambda$2$$inlined$map$1$2 */
                    public static final class C374482<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$invokeSuspend$lambda$2$$inlined$map$1$2", m3645f = "EarningsDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$invokeSuspend$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C374482.this.emit(null, this);
                            }
                        }

                        public C374482(FlowCollector flowCollector) {
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
                                ChartGroupDto chart = ((StreamEarningsChartResponseDto) obj).getChart();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(chart, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super ChartGroupDto> flowCollector2, Continuation continuation) {
                        Object objCollect = flowStreamEarningsChart.collect(new C374482(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            } else {
                flowFlowOf = FlowKt.flowOf((Object) null);
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
