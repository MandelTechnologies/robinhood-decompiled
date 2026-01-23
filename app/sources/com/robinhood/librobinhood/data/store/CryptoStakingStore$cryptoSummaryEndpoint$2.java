package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.retrofit.CryptoStakingBonfireApi;
import com.robinhood.models.api.staking.ApiCryptoStakingSummaryModel;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingSummaryModel;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingSummaryModel2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStakingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingSummaryModel;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStakingStore$cryptoSummaryEndpoint$2", m3645f = "CryptoStakingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoStakingStore$cryptoSummaryEndpoint$2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super CryptoStakingSummaryModel>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoStakingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoStakingStore$cryptoSummaryEndpoint$2(CryptoStakingStore cryptoStakingStore, Continuation<? super CryptoStakingStore$cryptoSummaryEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoStakingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoStakingStore$cryptoSummaryEndpoint$2 cryptoStakingStore$cryptoSummaryEndpoint$2 = new CryptoStakingStore$cryptoSummaryEndpoint$2(this.this$0, continuation);
        cryptoStakingStore$cryptoSummaryEndpoint$2.L$0 = obj;
        return cryptoStakingStore$cryptoSummaryEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super CryptoStakingSummaryModel> continuation) {
        return ((CryptoStakingStore$cryptoSummaryEndpoint$2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            CryptoStakingBonfireApi cryptoStakingBonfireApi = this.this$0.cryptoStakingBonfireApi;
            this.label = 1;
            obj = cryptoStakingBonfireApi.getStakingSummary(uuid, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CryptoStakingSummaryModel2.toUiModel((ApiCryptoStakingSummaryModel) obj);
    }
}
