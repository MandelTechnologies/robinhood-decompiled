package com.robinhood.librobinhood.data.store;

import com.robinhood.api.rhy.referral.RhyReferralBonfireApi;
import com.robinhood.models.rhy.referral.api.ApiRhyReferralAttribution;
import com.robinhood.models.rhy.referral.api.ApiRhyReferralAttributionList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralAttributionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralAttribution;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$listEndpoint$1", m3645f = "RhyReferralAttributionStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$listEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyReferralAttributionStore4 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super List<? extends ApiRhyReferralAttribution>>, Object> {
    int label;
    final /* synthetic */ RhyReferralAttributionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralAttributionStore4(RhyReferralAttributionStore rhyReferralAttributionStore, Continuation<? super RhyReferralAttributionStore4> continuation) {
        super(2, continuation);
        this.this$0 = rhyReferralAttributionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyReferralAttributionStore4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super List<? extends ApiRhyReferralAttribution>> continuation) {
        return invoke2(unit, (Continuation<? super List<ApiRhyReferralAttribution>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super List<ApiRhyReferralAttribution>> continuation) {
        return ((RhyReferralAttributionStore4) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RhyReferralBonfireApi rhyReferralBonfireApi = this.this$0.bonfireApi;
            this.label = 1;
            obj = rhyReferralBonfireApi.getRhyReferralAttributionList(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiRhyReferralAttributionList) obj).getAttributions();
    }
}
