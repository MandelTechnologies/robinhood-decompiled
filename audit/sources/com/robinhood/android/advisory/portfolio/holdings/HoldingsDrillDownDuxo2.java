package com.robinhood.android.advisory.portfolio.holdings;

import com.robinhood.staticcontent.model.disclosure.Disclosure;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: HoldingsDrillDownDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$2$1$1", m3645f = "HoldingsDrillDownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownDuxo$onStart$1$2$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HoldingsDrillDownDuxo2 extends ContinuationImpl7 implements Function2<HoldingsDrillDownDataState, Continuation<? super HoldingsDrillDownDataState>, Object> {
    final /* synthetic */ Disclosure $disclosure;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoldingsDrillDownDuxo2(Disclosure disclosure, Continuation<? super HoldingsDrillDownDuxo2> continuation) {
        super(2, continuation);
        this.$disclosure = disclosure;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HoldingsDrillDownDuxo2 holdingsDrillDownDuxo2 = new HoldingsDrillDownDuxo2(this.$disclosure, continuation);
        holdingsDrillDownDuxo2.L$0 = obj;
        return holdingsDrillDownDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HoldingsDrillDownDataState holdingsDrillDownDataState, Continuation<? super HoldingsDrillDownDataState> continuation) {
        return ((HoldingsDrillDownDuxo2) create(holdingsDrillDownDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return HoldingsDrillDownDataState.copy$default((HoldingsDrillDownDataState) this.L$0, null, null, null, this.$disclosure, null, 23, null);
    }
}
