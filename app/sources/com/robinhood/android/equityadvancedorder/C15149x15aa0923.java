package com.robinhood.android.equityadvancedorder;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment;
import com.robinhood.android.udf.HasSavedState;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponse;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C15149x15aa0923 extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamTaxLotsSelectionStrategySummaryResponse>, Tuples2<? extends String, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EquityAdvancedOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15149x15aa0923(Continuation continuation, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo) {
        super(3, continuation);
        this.this$0 = equityAdvancedOrderDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super StreamTaxLotsSelectionStrategySummaryResponse> flowCollector, Tuples2<? extends String, ? extends BigDecimal> tuples2, Continuation<? super Unit> continuation) {
        C15149x15aa0923 c15149x15aa0923 = new C15149x15aa0923(continuation, this.this$0);
        c15149x15aa0923.L$0 = flowCollector;
        c15149x15aa0923.L$1 = tuples2;
        return c15149x15aa0923.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r12, r11) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        C15149x15aa0923 c15149x15aa0923;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            String str = (String) tuples2.component1();
            BigDecimal bigDecimal = (BigDecimal) tuples2.component2();
            TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
            EquityAdvancedOrderDuxo.Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
            UUID refId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getRefId();
            UUID instrumentId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId();
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            Intrinsics.checkNotNull(bigDecimal2);
            this.L$0 = flowCollector;
            this.label = 1;
            c15149x15aa0923 = this;
            obj = taxLotsCachedService.streamTaxLotsSelectionStrategySummary(str, refId, instrumentId, bigDecimal2, c15149x15aa0923);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        c15149x15aa0923 = this;
        c15149x15aa0923.L$0 = null;
        c15149x15aa0923.label = 2;
    }
}
