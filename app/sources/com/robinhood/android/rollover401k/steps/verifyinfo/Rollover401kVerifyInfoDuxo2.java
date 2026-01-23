package com.robinhood.android.rollover401k.steps.verifyinfo;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Rollover401kVerifyInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$submitUserInfo$1$response$1", m3645f = "Rollover401kVerifyInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo$submitUserInfo$1$response$1, reason: use source file name */
/* loaded from: classes5.dex */
final class Rollover401kVerifyInfoDuxo2 extends ContinuationImpl7 implements Function2<Rollover401kVerifyInfoViewState, Continuation<? super Rollover401kVerifyInfoViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    Rollover401kVerifyInfoDuxo2(Continuation<? super Rollover401kVerifyInfoDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Rollover401kVerifyInfoDuxo2 rollover401kVerifyInfoDuxo2 = new Rollover401kVerifyInfoDuxo2(continuation);
        rollover401kVerifyInfoDuxo2.L$0 = obj;
        return rollover401kVerifyInfoDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Rollover401kVerifyInfoViewState rollover401kVerifyInfoViewState, Continuation<? super Rollover401kVerifyInfoViewState> continuation) {
        return ((Rollover401kVerifyInfoDuxo2) create(rollover401kVerifyInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Rollover401kVerifyInfoViewState.copy$default((Rollover401kVerifyInfoViewState) this.L$0, null, false, 1, null);
    }
}
