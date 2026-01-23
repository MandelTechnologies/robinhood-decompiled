package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.home.ApiCryptoTopCrypto;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.p314db.home.CryptoTopCrypto;
import com.robinhood.models.crypto.p314db.home.CryptoTopCrypto2;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;", "instrumentDisplayType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHomeStore$topCryptoEndpoint$2", m3645f = "CryptoHomeStore.kt", m3646l = {120}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoHomeStore$topCryptoEndpoint$2 extends ContinuationImpl7 implements Function2<InstrumentDisplayType, Continuation<? super CryptoTopCrypto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoHomeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeStore$topCryptoEndpoint$2(CryptoHomeStore cryptoHomeStore, Continuation<? super CryptoHomeStore$topCryptoEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHomeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeStore$topCryptoEndpoint$2 cryptoHomeStore$topCryptoEndpoint$2 = new CryptoHomeStore$topCryptoEndpoint$2(this.this$0, continuation);
        cryptoHomeStore$topCryptoEndpoint$2.L$0 = obj;
        return cryptoHomeStore$topCryptoEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentDisplayType instrumentDisplayType, Continuation<? super CryptoTopCrypto> continuation) {
        return ((CryptoHomeStore$topCryptoEndpoint$2) create(instrumentDisplayType, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InstrumentDisplayType instrumentDisplayType = (InstrumentDisplayType) this.L$0;
            CryptoBonfireApi cryptoBonfireApi = this.this$0.cryptoBonfireApi;
            this.label = 1;
            obj = cryptoBonfireApi.getTopCrypto(instrumentDisplayType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CryptoTopCrypto2.getDbModel((ApiCryptoTopCrypto) obj);
    }
}
