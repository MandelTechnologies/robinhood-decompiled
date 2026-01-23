package com.robinhood.android.retirement.onboarding.description;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementSignUpAccountDescriptionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.description.RetirementSignUpAccountDescriptionDuxo$loadAccountDescription$2$1", m3645f = "RetirementSignUpAccountDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.description.RetirementSignUpAccountDescriptionDuxo$loadAccountDescription$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpAccountDescriptionDuxo3 extends ContinuationImpl7 implements Function2<AccountDescriptionDataState, Continuation<? super AccountDescriptionDataState>, Object> {

    /* renamed from: $t */
    final /* synthetic */ Throwable f4889$t;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpAccountDescriptionDuxo3(Throwable th, Continuation<? super RetirementSignUpAccountDescriptionDuxo3> continuation) {
        super(2, continuation);
        this.f4889$t = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementSignUpAccountDescriptionDuxo3 retirementSignUpAccountDescriptionDuxo3 = new RetirementSignUpAccountDescriptionDuxo3(this.f4889$t, continuation);
        retirementSignUpAccountDescriptionDuxo3.L$0 = obj;
        return retirementSignUpAccountDescriptionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountDescriptionDataState accountDescriptionDataState, Continuation<? super AccountDescriptionDataState> continuation) {
        return ((RetirementSignUpAccountDescriptionDuxo3) create(accountDescriptionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AccountDescriptionDataState.copy$default((AccountDescriptionDataState) this.L$0, null, null, this.f4889$t, 3, null);
    }
}
