package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MerchantRewardsWelcomeFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$getContentfulResources$3$1", m3645f = "MerchantRewardsWelcomeFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragmentDuxo$getContentfulResources$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class MerchantRewardsWelcomeFragmentDuxo3 extends ContinuationImpl7 implements Function2<MerchantRewardsWelcomeFragmentDataState, Continuation<? super MerchantRewardsWelcomeFragmentDataState>, Object> {
    final /* synthetic */ Tuples2<ProductMarketing, List<ProductMarketing.Feature>> $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MerchantRewardsWelcomeFragmentDuxo3(Tuples2<ProductMarketing, ? extends List<ProductMarketing.Feature>> tuples2, Continuation<? super MerchantRewardsWelcomeFragmentDuxo3> continuation) {
        super(2, continuation);
        this.$it = tuples2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchantRewardsWelcomeFragmentDuxo3 merchantRewardsWelcomeFragmentDuxo3 = new MerchantRewardsWelcomeFragmentDuxo3(this.$it, continuation);
        merchantRewardsWelcomeFragmentDuxo3.L$0 = obj;
        return merchantRewardsWelcomeFragmentDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MerchantRewardsWelcomeFragmentDataState merchantRewardsWelcomeFragmentDataState, Continuation<? super MerchantRewardsWelcomeFragmentDataState> continuation) {
        return ((MerchantRewardsWelcomeFragmentDuxo3) create(merchantRewardsWelcomeFragmentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MerchantRewardsWelcomeFragmentDataState.copy$default((MerchantRewardsWelcomeFragmentDataState) this.L$0, null, null, null, this.$it.getFirst(), this.$it.getSecond(), null, 39, null);
    }
}
