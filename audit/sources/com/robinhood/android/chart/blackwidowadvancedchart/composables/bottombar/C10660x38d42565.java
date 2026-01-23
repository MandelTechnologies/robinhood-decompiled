package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job6;

/* compiled from: TradingButtonsRow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1$1$3$1", m3645f = "TradingButtonsRow.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1$1$3$1 */
/* loaded from: classes7.dex */
final class C10660x38d42565 extends ContinuationImpl7 implements Function2<BwTradeSide, Continuation<? super Unit>, Object> {
    int label;

    C10660x38d42565(Continuation<? super C10660x38d42565> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C10660x38d42565(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BwTradeSide bwTradeSide, Continuation<? super Unit> continuation) {
        return ((C10660x38d42565) create(bwTradeSide, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Job6.Job$default(null, 1, null);
        return Unit.INSTANCE;
    }
}
