package com.robinhood.android.rhyrewards.p246ui;

import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsOfferDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$2$1", m3645f = "MerchantRewardsOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class MerchantRewardsOfferDetailsDuxo3 extends ContinuationImpl7 implements Function2<MerchantRewardsOfferDetailsViewState, Continuation<? super MerchantRewardsOfferDetailsViewState>, Object> {
    final /* synthetic */ MerchantOfferV2 $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantRewardsOfferDetailsDuxo3(MerchantOfferV2 merchantOfferV2, Continuation<? super MerchantRewardsOfferDetailsDuxo3> continuation) {
        super(2, continuation);
        this.$it = merchantOfferV2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchantRewardsOfferDetailsDuxo3 merchantRewardsOfferDetailsDuxo3 = new MerchantRewardsOfferDetailsDuxo3(this.$it, continuation);
        merchantRewardsOfferDetailsDuxo3.L$0 = obj;
        return merchantRewardsOfferDetailsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState, Continuation<? super MerchantRewardsOfferDetailsViewState> continuation) {
        return ((MerchantRewardsOfferDetailsDuxo3) create(merchantRewardsOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState = (MerchantRewardsOfferDetailsViewState) this.L$0;
        MerchantOfferV2 merchantOfferV2 = this.$it;
        Intrinsics.checkNotNull(merchantOfferV2);
        return MerchantRewardsOfferDetailsViewState.copy$default(merchantRewardsOfferDetailsViewState, merchantOfferV2, false, null, null, null, null, 62, null);
    }
}
