package com.robinhood.librobinhood.data.store;

import com.robinhood.api.rhy.referral.RhyReferralBonfireApi;
import com.robinhood.models.rhy.referral.api.ApiRhyReferralRemindRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralRemindStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyReferralRemindStore$endpoint$1", m3645f = "RhyReferralRemindStore.kt", m3646l = {19}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RhyReferralRemindStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyReferralRemindStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyReferralRemindStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralRemindStore2(RhyReferralRemindStore rhyReferralRemindStore, Continuation<? super RhyReferralRemindStore2> continuation) {
        super(2, continuation);
        this.this$0 = rhyReferralRemindStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralRemindStore2 rhyReferralRemindStore2 = new RhyReferralRemindStore2(this.this$0, continuation);
        rhyReferralRemindStore2.L$0 = obj;
        return rhyReferralRemindStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
        return ((RhyReferralRemindStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            RhyReferralBonfireApi rhyReferralBonfireApi = this.this$0.bonfireApi;
            ApiRhyReferralRemindRequest apiRhyReferralRemindRequest = new ApiRhyReferralRemindRequest(uuid);
            this.label = 1;
            if (rhyReferralBonfireApi.remindRhyReferral(apiRhyReferralRemindRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
