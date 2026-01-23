package com.robinhood.android.taxcenter;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: TaxCenterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/taxcenter/TaxCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.taxcenter.TaxCenterDuxo$onCreate$2$1", m3645f = "TaxCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.taxcenter.TaxCenterDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TaxCenterDuxo2 extends ContinuationImpl7 implements Function2<TaxCenterDataState, Continuation<? super TaxCenterDataState>, Object> {
    final /* synthetic */ boolean $enabled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxCenterDuxo2(boolean z, Continuation<? super TaxCenterDuxo2> continuation) {
        super(2, continuation);
        this.$enabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TaxCenterDuxo2 taxCenterDuxo2 = new TaxCenterDuxo2(this.$enabled, continuation);
        taxCenterDuxo2.L$0 = obj;
        return taxCenterDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TaxCenterDataState taxCenterDataState, Continuation<? super TaxCenterDataState> continuation) {
        return ((TaxCenterDuxo2) create(taxCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return TaxCenterDataState.copy$default((TaxCenterDataState) this.L$0, null, boxing.boxBoolean(this.$enabled), 1, null);
    }
}
