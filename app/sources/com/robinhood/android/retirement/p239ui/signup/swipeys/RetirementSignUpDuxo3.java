package com.robinhood.android.retirement.p239ui.signup.swipeys;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$fetchSwipeys$3$1", m3645f = "RetirementSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$fetchSwipeys$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpDuxo3 extends ContinuationImpl7 implements Function2<RetirementSignUpDataState, Continuation<? super RetirementSignUpDataState>, Object> {
    final /* synthetic */ Throwable $throwable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpDuxo3(Throwable th, Continuation<? super RetirementSignUpDuxo3> continuation) {
        super(2, continuation);
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementSignUpDuxo3 retirementSignUpDuxo3 = new RetirementSignUpDuxo3(this.$throwable, continuation);
        retirementSignUpDuxo3.L$0 = obj;
        return retirementSignUpDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementSignUpDataState retirementSignUpDataState, Continuation<? super RetirementSignUpDataState> continuation) {
        return ((RetirementSignUpDuxo3) create(retirementSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RetirementSignUpDataState.copy$default((RetirementSignUpDataState) this.L$0, false, null, this.$throwable, 0, false, 27, null);
    }
}
