package com.robinhood.android.trade.equity.p261ui.dollar;

import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityDollarOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onStart$7$1$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class EquityDollarOrderDuxo$onStart$7$1$1 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
    final /* synthetic */ InstrumentAccountSwitcher $switcher;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityDollarOrderDuxo$onStart$7$1$1(InstrumentAccountSwitcher instrumentAccountSwitcher, Continuation<? super EquityDollarOrderDuxo$onStart$7$1$1> continuation) {
        super(2, continuation);
        this.$switcher = instrumentAccountSwitcher;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityDollarOrderDuxo$onStart$7$1$1 equityDollarOrderDuxo$onStart$7$1$1 = new EquityDollarOrderDuxo$onStart$7$1$1(this.$switcher, continuation);
        equityDollarOrderDuxo$onStart$7$1$1.L$0 = obj;
        return equityDollarOrderDuxo$onStart$7$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
        return ((EquityDollarOrderDuxo$onStart$7$1$1) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, this.$switcher, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -65, 3, null);
    }
}
