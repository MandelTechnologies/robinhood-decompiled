package com.robinhood.android.p148fx.tooltip;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.p148fx.tooltip.FxQuoteState;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.fx.tooltip.FxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1", m3645f = "FxDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super FxQuoteState>, ApiFxQuote, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FxDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1(Continuation continuation, FxDuxo fxDuxo) {
        super(3, continuation);
        this.this$0 = fxDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super FxQuoteState> flowCollector, ApiFxQuote apiFxQuote, Continuation<? super Unit> continuation) {
        FxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1 fxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1 = new FxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1(continuation, this.this$0);
        fxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1.L$0 = flowCollector;
        fxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1.L$1 = apiFxQuote;
        return fxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll((kotlinx.coroutines.flow.FlowCollector) r1, r6, r5) != r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object success;
        Flow flowOnStart;
        ?? r1;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (Exception unused) {
            success = FxQuoteState.Error.INSTANCE;
            i = i2;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ?? r12 = (FlowCollector) this.L$0;
            ApiFxQuote apiFxQuote = (ApiFxQuote) this.L$1;
            if (apiFxQuote == null) {
                FxRatesProvider fxRatesProvider = this.this$0.fxRatesProvider;
                this.L$0 = r12;
                this.label = 1;
                obj = fxRatesProvider.forceFetchFxRate(this);
                i2 = r12;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                flowOnStart = FlowKt.flowOf(new FxQuoteState.Success(apiFxQuote));
                r1 = r12;
                this.L$0 = null;
                this.label = 2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ?? r13 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2 = r13;
        }
        success = new FxQuoteState.Success((ApiFxQuote) obj);
        i = i2;
        flowOnStart = FlowKt.onStart(FlowKt.flowOf(success), new FxDuxo2(null));
        r1 = i;
        this.L$0 = null;
        this.label = 2;
    }
}
