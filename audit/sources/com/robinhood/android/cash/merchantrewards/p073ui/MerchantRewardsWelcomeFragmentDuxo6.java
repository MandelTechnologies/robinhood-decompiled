package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MerchantRewardsWelcomeFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$onCreate$4$1", m3645f = "MerchantRewardsWelcomeFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$onCreate$4$1, reason: use source file name */
/* loaded from: classes7.dex */
final class MerchantRewardsWelcomeFragmentDuxo6 extends ContinuationImpl7 implements Function2<MerchantRewardsWelcomeFragmentDataState, Continuation<? super MerchantRewardsWelcomeFragmentDataState>, Object> {
    final /* synthetic */ MinervaAccount $minervaAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantRewardsWelcomeFragmentDuxo6(MinervaAccount minervaAccount, Continuation<? super MerchantRewardsWelcomeFragmentDuxo6> continuation) {
        super(2, continuation);
        this.$minervaAccount = minervaAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchantRewardsWelcomeFragmentDuxo6 merchantRewardsWelcomeFragmentDuxo6 = new MerchantRewardsWelcomeFragmentDuxo6(this.$minervaAccount, continuation);
        merchantRewardsWelcomeFragmentDuxo6.L$0 = obj;
        return merchantRewardsWelcomeFragmentDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MerchantRewardsWelcomeFragmentDataState merchantRewardsWelcomeFragmentDataState, Continuation<? super MerchantRewardsWelcomeFragmentDataState> continuation) {
        return ((MerchantRewardsWelcomeFragmentDuxo6) create(merchantRewardsWelcomeFragmentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MerchantRewardsWelcomeFragmentDataState.copy$default((MerchantRewardsWelcomeFragmentDataState) this.L$0, null, this.$minervaAccount, null, null, null, null, 61, null);
    }
}
