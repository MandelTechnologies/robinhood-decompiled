package com.robinhood.android.rhy.referral.fund.select;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundSelectDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectDuxo$onStart$1$1", m3645f = "RhyReferralFundSelectDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralFundSelectDuxo2 extends ContinuationImpl7 implements Function2<RhyReferralFundSelectDataState, Continuation<? super RhyReferralFundSelectDataState>, Object> {
    final /* synthetic */ List<TransferAccount> $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralFundSelectDuxo2(List<TransferAccount> list, Continuation<? super RhyReferralFundSelectDuxo2> continuation) {
        super(2, continuation);
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralFundSelectDuxo2 rhyReferralFundSelectDuxo2 = new RhyReferralFundSelectDuxo2(this.$it, continuation);
        rhyReferralFundSelectDuxo2.L$0 = obj;
        return rhyReferralFundSelectDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyReferralFundSelectDataState rhyReferralFundSelectDataState, Continuation<? super RhyReferralFundSelectDataState> continuation) {
        return ((RhyReferralFundSelectDuxo2) create(rhyReferralFundSelectDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RhyReferralFundSelectDataState rhyReferralFundSelectDataState = (RhyReferralFundSelectDataState) this.L$0;
        List<TransferAccount> list = this.$it;
        Intrinsics.checkNotNull(list);
        return rhyReferralFundSelectDataState.copy(list);
    }
}
