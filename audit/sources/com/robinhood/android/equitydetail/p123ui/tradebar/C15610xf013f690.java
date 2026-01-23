package com.robinhood.android.equitydetail.p123ui.tradebar;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$4$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$4$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C15610xf013f690 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Optional<? extends Account>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15610xf013f690(Continuation continuation, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo) {
        super(3, continuation);
        this.this$0 = instrumentDetailTradeBarDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Optional<? extends Account> optional, Continuation<? super Unit> continuation) {
        C15610xf013f690 c15610xf013f690 = new C15610xf013f690(continuation, this.this$0);
        c15610xf013f690.L$0 = flowCollector;
        c15610xf013f690.L$1 = optional;
        return c15610xf013f690.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Account account = (Account) ((Optional) this.L$1).component1();
            if (account != null) {
                Observable<Boolean> observable = this.this$0.getPositionStore().hasAccountPositions(account.getAccountNumber()).toObservable();
                Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                Flow flowFlowOf = Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null);
                if (flowFlowOf == null) {
                    flowFlowOf = FlowKt.flowOf(boxing.boxBoolean(false));
                }
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
