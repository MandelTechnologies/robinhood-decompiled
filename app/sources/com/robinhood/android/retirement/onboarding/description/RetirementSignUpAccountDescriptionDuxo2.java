package com.robinhood.android.retirement.onboarding.description;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
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
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.description.RetirementSignUpAccountDescriptionDuxo$loadAccountDescription$1$1", m3645f = "RetirementSignUpAccountDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.description.RetirementSignUpAccountDescriptionDuxo$loadAccountDescription$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpAccountDescriptionDuxo2 extends ContinuationImpl7 implements Function2<AccountDescriptionDataState, Continuation<? super AccountDescriptionDataState>, Object> {
    final /* synthetic */ ApiRetirementSignUpFlow $signUpFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpAccountDescriptionDuxo2(ApiRetirementSignUpFlow apiRetirementSignUpFlow, Continuation<? super RetirementSignUpAccountDescriptionDuxo2> continuation) {
        super(2, continuation);
        this.$signUpFlow = apiRetirementSignUpFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementSignUpAccountDescriptionDuxo2 retirementSignUpAccountDescriptionDuxo2 = new RetirementSignUpAccountDescriptionDuxo2(this.$signUpFlow, continuation);
        retirementSignUpAccountDescriptionDuxo2.L$0 = obj;
        return retirementSignUpAccountDescriptionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountDescriptionDataState accountDescriptionDataState, Continuation<? super AccountDescriptionDataState> continuation) {
        return ((RetirementSignUpAccountDescriptionDuxo2) create(accountDescriptionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AccountDescriptionDataState.copy$default((AccountDescriptionDataState) this.L$0, null, this.$signUpFlow, null, 5, null);
    }
}
