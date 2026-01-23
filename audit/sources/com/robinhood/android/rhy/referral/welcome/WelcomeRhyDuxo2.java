package com.robinhood.android.rhy.referral.welcome;

import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: WelcomeRhyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$onStart$5$1", m3645f = "WelcomeRhyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$onStart$5$1, reason: use source file name */
/* loaded from: classes5.dex */
final class WelcomeRhyDuxo2 extends ContinuationImpl7 implements Function2<WelcomeRhyDataState, Continuation<? super WelcomeRhyDataState>, Object> {
    final /* synthetic */ RhyReferralOnboardingStore4 $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WelcomeRhyDuxo2(RhyReferralOnboardingStore4 rhyReferralOnboardingStore4, Continuation<? super WelcomeRhyDuxo2> continuation) {
        super(2, continuation);
        this.$it = rhyReferralOnboardingStore4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WelcomeRhyDuxo2 welcomeRhyDuxo2 = new WelcomeRhyDuxo2(this.$it, continuation);
        welcomeRhyDuxo2.L$0 = obj;
        return welcomeRhyDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WelcomeRhyDataState welcomeRhyDataState, Continuation<? super WelcomeRhyDataState> continuation) {
        return ((WelcomeRhyDuxo2) create(welcomeRhyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return WelcomeRhyDataState.copy$default((WelcomeRhyDataState) this.L$0, false, this.$it, null, null, null, 29, null);
    }
}
