package com.robinhood.android.rhy.referral.track.detail;

import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralsTrackingDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.track.detail.RhyReferralsTrackingDetailDuxo$onStart$1$1", m3645f = "RhyReferralsTrackingDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.track.detail.RhyReferralsTrackingDetailDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralsTrackingDetailDuxo2 extends ContinuationImpl7 implements Function2<RhyReferralsTrackingDetailDataState, Continuation<? super RhyReferralsTrackingDetailDataState>, Object> {
    final /* synthetic */ RhyReferralEligibility $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralsTrackingDetailDuxo2(RhyReferralEligibility rhyReferralEligibility, Continuation<? super RhyReferralsTrackingDetailDuxo2> continuation) {
        super(2, continuation);
        this.$it = rhyReferralEligibility;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralsTrackingDetailDuxo2 rhyReferralsTrackingDetailDuxo2 = new RhyReferralsTrackingDetailDuxo2(this.$it, continuation);
        rhyReferralsTrackingDetailDuxo2.L$0 = obj;
        return rhyReferralsTrackingDetailDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralsTrackingDetailDataState rhyReferralsTrackingDetailDataState, Continuation<? super RhyReferralsTrackingDetailDataState> continuation) {
        return ((RhyReferralsTrackingDetailDuxo2) create(rhyReferralsTrackingDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RhyReferralsTrackingDetailDataState.copy$default((RhyReferralsTrackingDetailDataState) this.L$0, null, this.$it, 1, null);
    }
}
