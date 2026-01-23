package com.robinhood.android.rhy.referral.referee;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsRefereeLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$8$1", m3645f = "RhyReferralsRefereeLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$8$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralsRefereeLandingDuxo5 extends ContinuationImpl7 implements Function2<RhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState>, Object> {
    final /* synthetic */ Boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralsRefereeLandingDuxo5(Boolean bool, Continuation<? super RhyReferralsRefereeLandingDuxo5> continuation) {
        super(2, continuation);
        this.$it = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralsRefereeLandingDuxo5 rhyReferralsRefereeLandingDuxo5 = new RhyReferralsRefereeLandingDuxo5(this.$it, continuation);
        rhyReferralsRefereeLandingDuxo5.L$0 = obj;
        return rhyReferralsRefereeLandingDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState> continuation) {
        return ((RhyReferralsRefereeLandingDuxo5) create(rhyReferralsRefereeLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState = (RhyReferralsRefereeLandingDataState) this.L$0;
        Boolean bool = this.$it;
        Intrinsics.checkNotNull(bool);
        return RhyReferralsRefereeLandingDataState.copy$default(rhyReferralsRefereeLandingDataState, null, null, null, false, null, null, bool.booleanValue(), 63, null);
    }
}
