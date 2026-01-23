package com.robinhood.android.acatsin.landed;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsLandedDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/landed/AcatsLandedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.landed.AcatsLandedDuxo$onCreate$1$3$1", m3645f = "AcatsLandedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.landed.AcatsLandedDuxo$onCreate$1$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsLandedDuxo3 extends ContinuationImpl7 implements Function2<AcatsLandedViewState, Continuation<? super AcatsLandedViewState>, Object> {

    /* renamed from: $t */
    final /* synthetic */ Throwable f3878$t;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsLandedDuxo3(Throwable th, Continuation<? super AcatsLandedDuxo3> continuation) {
        super(2, continuation);
        this.f3878$t = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsLandedDuxo3 acatsLandedDuxo3 = new AcatsLandedDuxo3(this.f3878$t, continuation);
        acatsLandedDuxo3.L$0 = obj;
        return acatsLandedDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsLandedViewState acatsLandedViewState, Continuation<? super AcatsLandedViewState> continuation) {
        return ((AcatsLandedDuxo3) create(acatsLandedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsLandedViewState.copy$default((AcatsLandedViewState) this.L$0, null, null, new UiEvent(this.f3878$t), 3, null);
    }
}
