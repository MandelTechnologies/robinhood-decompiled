package com.robinhood.android.rhy.referral.referee;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralsRefereeLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$7$1", m3645f = "RhyReferralsRefereeLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$7$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralsRefereeLandingDuxo4 extends ContinuationImpl7 implements Function2<RhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState>, Object> {
    final /* synthetic */ boolean $isActiveAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralsRefereeLandingDuxo4(boolean z, Continuation<? super RhyReferralsRefereeLandingDuxo4> continuation) {
        super(2, continuation);
        this.$isActiveAccount = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralsRefereeLandingDuxo4 rhyReferralsRefereeLandingDuxo4 = new RhyReferralsRefereeLandingDuxo4(this.$isActiveAccount, continuation);
        rhyReferralsRefereeLandingDuxo4.L$0 = obj;
        return rhyReferralsRefereeLandingDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState> continuation) {
        return ((RhyReferralsRefereeLandingDuxo4) create(rhyReferralsRefereeLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RhyReferralsRefereeLandingDataState.copy$default((RhyReferralsRefereeLandingDataState) this.L$0, null, null, null, false, boxing.boxBoolean(this.$isActiveAccount), null, false, 111, null);
    }
}
