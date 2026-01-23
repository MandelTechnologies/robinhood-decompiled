package com.robinhood.android.rhyrewards.p246ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: MerchantRewardsOfferDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$1$1", m3645f = "MerchantRewardsOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class MerchantRewardsOfferDetailsDuxo2 extends ContinuationImpl7 implements Function2<MerchantRewardsOfferDetailsViewState, Continuation<? super MerchantRewardsOfferDetailsViewState>, Object> {
    final /* synthetic */ boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantRewardsOfferDetailsDuxo2(boolean z, Continuation<? super MerchantRewardsOfferDetailsDuxo2> continuation) {
        super(2, continuation);
        this.$it = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchantRewardsOfferDetailsDuxo2 merchantRewardsOfferDetailsDuxo2 = new MerchantRewardsOfferDetailsDuxo2(this.$it, continuation);
        merchantRewardsOfferDetailsDuxo2.L$0 = obj;
        return merchantRewardsOfferDetailsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState, Continuation<? super MerchantRewardsOfferDetailsViewState> continuation) {
        return ((MerchantRewardsOfferDetailsDuxo2) create(merchantRewardsOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MerchantRewardsOfferDetailsViewState.copy$default((MerchantRewardsOfferDetailsViewState) this.L$0, null, false, null, null, boxing.boxBoolean(this.$it), null, 47, null);
    }
}
