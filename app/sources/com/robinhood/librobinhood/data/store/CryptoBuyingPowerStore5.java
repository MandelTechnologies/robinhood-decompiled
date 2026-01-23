package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.models.api.ApiCryptoBuyingPower;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower2;
import com.robinhood.models.dao.CryptoBuyingPowerDao;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: CryptoBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore$BuyingPowerQuery;", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiCryptoBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$cryptoEndpoint$2", m3645f = "CryptoBuyingPowerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$cryptoEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoBuyingPowerStore5 extends ContinuationImpl7 implements Function3<CryptoBuyingPowerStore.BuyingPowerQuery, Optional<? extends ApiCryptoBuyingPower>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoBuyingPowerStore5(CryptoBuyingPowerStore cryptoBuyingPowerStore, Continuation<? super CryptoBuyingPowerStore5> continuation) {
        super(3, continuation);
        this.this$0 = cryptoBuyingPowerStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CryptoBuyingPowerStore.BuyingPowerQuery buyingPowerQuery, Optional<ApiCryptoBuyingPower> optional, Continuation<? super Unit> continuation) {
        CryptoBuyingPowerStore5 cryptoBuyingPowerStore5 = new CryptoBuyingPowerStore5(this.this$0, continuation);
        cryptoBuyingPowerStore5.L$0 = optional;
        return cryptoBuyingPowerStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CryptoBuyingPowerStore.BuyingPowerQuery buyingPowerQuery, Optional<? extends ApiCryptoBuyingPower> optional, Continuation<? super Unit> continuation) {
        return invoke2(buyingPowerQuery, (Optional<ApiCryptoBuyingPower>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiCryptoBuyingPower apiCryptoBuyingPower = (ApiCryptoBuyingPower) ((Optional) this.L$0).component1();
        if (apiCryptoBuyingPower != null) {
            this.this$0.dao.insert((CryptoBuyingPowerDao) CryptoBuyingPower2.toDbModel(apiCryptoBuyingPower));
        }
        return Unit.INSTANCE;
    }
}
