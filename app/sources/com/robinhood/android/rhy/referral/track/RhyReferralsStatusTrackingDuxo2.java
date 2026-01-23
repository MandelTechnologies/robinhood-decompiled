package com.robinhood.android.rhy.referral.track;

import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsStatusTrackingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$onStart$1$1", m3645f = "RhyReferralsStatusTrackingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralsStatusTrackingDuxo2 extends ContinuationImpl7 implements Function2<RhyReferralsStatusTrackingDataState, Continuation<? super RhyReferralsStatusTrackingDataState>, Object> {
    final /* synthetic */ List<RhyReferralAttribution> $list;
    final /* synthetic */ RhyReferralAttribution $refereeAttribution;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralsStatusTrackingDuxo2(List<RhyReferralAttribution> list, RhyReferralAttribution rhyReferralAttribution, Continuation<? super RhyReferralsStatusTrackingDuxo2> continuation) {
        super(2, continuation);
        this.$list = list;
        this.$refereeAttribution = rhyReferralAttribution;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralsStatusTrackingDuxo2 rhyReferralsStatusTrackingDuxo2 = new RhyReferralsStatusTrackingDuxo2(this.$list, this.$refereeAttribution, continuation);
        rhyReferralsStatusTrackingDuxo2.L$0 = obj;
        return rhyReferralsStatusTrackingDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralsStatusTrackingDataState rhyReferralsStatusTrackingDataState, Continuation<? super RhyReferralsStatusTrackingDataState> continuation) {
        return ((RhyReferralsStatusTrackingDuxo2) create(rhyReferralsStatusTrackingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RhyReferralsStatusTrackingDataState rhyReferralsStatusTrackingDataState = (RhyReferralsStatusTrackingDataState) this.L$0;
        List<RhyReferralAttribution> list = this.$list;
        Intrinsics.checkNotNull(list);
        return RhyReferralsStatusTrackingDataState.copy$default(rhyReferralsStatusTrackingDataState, CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOfNotNull(this.$refereeAttribution)), false, 2, null);
    }
}
