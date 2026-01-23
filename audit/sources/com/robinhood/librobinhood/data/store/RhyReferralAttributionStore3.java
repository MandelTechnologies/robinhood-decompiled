package com.robinhood.librobinhood.data.store;

import com.robinhood.models.rhy.referral.api.ApiRhyReferralAttribution;
import com.robinhood.models.rhy.referral.dao.RhyReferralAttributionDao;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralAttributionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "attribution", "Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralAttribution;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$endpoint$2", m3645f = "RhyReferralAttributionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyReferralAttributionStore3 extends ContinuationImpl7 implements Function2<ApiRhyReferralAttribution, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyReferralAttributionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralAttributionStore3(RhyReferralAttributionStore rhyReferralAttributionStore, Continuation<? super RhyReferralAttributionStore3> continuation) {
        super(2, continuation);
        this.this$0 = rhyReferralAttributionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralAttributionStore3 rhyReferralAttributionStore3 = new RhyReferralAttributionStore3(this.this$0, continuation);
        rhyReferralAttributionStore3.L$0 = obj;
        return rhyReferralAttributionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRhyReferralAttribution apiRhyReferralAttribution, Continuation<? super Unit> continuation) {
        return ((RhyReferralAttributionStore3) create(apiRhyReferralAttribution, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert((RhyReferralAttributionDao) RhyReferralAttribution2.toDbModel((ApiRhyReferralAttribution) this.L$0, true));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
