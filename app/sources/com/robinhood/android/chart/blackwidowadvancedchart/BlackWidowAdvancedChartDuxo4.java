package com.robinhood.android.chart.blackwidowadvancedchart;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BlackWidowAdvancedChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$accountNumberStream$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$accountNumberStream$2, reason: use source file name */
/* loaded from: classes7.dex */
final class BlackWidowAdvancedChartDuxo4 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlackWidowAdvancedChartDuxo4(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super BlackWidowAdvancedChartDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = blackWidowAdvancedChartDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BlackWidowAdvancedChartDuxo4 blackWidowAdvancedChartDuxo4 = new BlackWidowAdvancedChartDuxo4(this.this$0, continuation);
        blackWidowAdvancedChartDuxo4.L$0 = obj;
        return blackWidowAdvancedChartDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((BlackWidowAdvancedChartDuxo4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            BwWebViewManager bwWebViewManager = this.this$0.getBwWebViewManager();
            this.label = 1;
            if (bwWebViewManager.setAccountNumber(str, this) == coroutine_suspended) {
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
