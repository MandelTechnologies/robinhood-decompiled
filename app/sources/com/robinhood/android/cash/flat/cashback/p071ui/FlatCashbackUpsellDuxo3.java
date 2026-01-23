package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDataState;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FlatCashbackUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo$loadContent$6$1", m3645f = "FlatCashbackUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellDuxo$loadContent$6$1, reason: use source file name */
/* loaded from: classes7.dex */
final class FlatCashbackUpsellDuxo3 extends ContinuationImpl7 implements Function2<BaseFlatCashbackDataState<MerchantOfferV2>, Continuation<? super BaseFlatCashbackDataState<MerchantOfferV2>>, Object> {
    final /* synthetic */ Throwable $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatCashbackUpsellDuxo3(Throwable th, Continuation<? super FlatCashbackUpsellDuxo3> continuation) {
        super(2, continuation);
        this.$it = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlatCashbackUpsellDuxo3 flatCashbackUpsellDuxo3 = new FlatCashbackUpsellDuxo3(this.$it, continuation);
        flatCashbackUpsellDuxo3.L$0 = obj;
        return flatCashbackUpsellDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseFlatCashbackDataState<MerchantOfferV2> baseFlatCashbackDataState, Continuation<? super BaseFlatCashbackDataState<MerchantOfferV2>> continuation) {
        return ((FlatCashbackUpsellDuxo3) create(baseFlatCashbackDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BaseFlatCashbackDataState.copy$default((BaseFlatCashbackDataState) this.L$0, null, this.$it, null, 5, null);
    }
}
