package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.home.ApiCryptoHomeDiscover;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.p314db.home.CryptoHomeDiscover;
import com.robinhood.models.crypto.p314db.home.CryptoHomeDiscover2;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/home/CryptoHomeDiscover;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHomeStore$discoverCryptoEndpoint$2", m3645f = "CryptoHomeStore.kt", m3646l = {96}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoHomeStore$discoverCryptoEndpoint$2 extends ContinuationImpl7 implements Function2<Tuples2<? extends InstrumentDisplayType, ? extends Boolean>, Continuation<? super CryptoHomeDiscover>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoHomeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeStore$discoverCryptoEndpoint$2(CryptoHomeStore cryptoHomeStore, Continuation<? super CryptoHomeStore$discoverCryptoEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHomeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeStore$discoverCryptoEndpoint$2 cryptoHomeStore$discoverCryptoEndpoint$2 = new CryptoHomeStore$discoverCryptoEndpoint$2(this.this$0, continuation);
        cryptoHomeStore$discoverCryptoEndpoint$2.L$0 = obj;
        return cryptoHomeStore$discoverCryptoEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends InstrumentDisplayType, ? extends Boolean> tuples2, Continuation<? super CryptoHomeDiscover> continuation) {
        return invoke2((Tuples2<? extends InstrumentDisplayType, Boolean>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends InstrumentDisplayType, Boolean> tuples2, Continuation<? super CryptoHomeDiscover> continuation) {
        return ((CryptoHomeStore$discoverCryptoEndpoint$2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            InstrumentDisplayType instrumentDisplayType = (InstrumentDisplayType) tuples2.component1();
            boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
            CryptoBonfireApi cryptoBonfireApi = this.this$0.cryptoBonfireApi;
            this.label = 1;
            obj = cryptoBonfireApi.getCryptoHomeDiscover(instrumentDisplayType, zBooleanValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CryptoHomeDiscover2.getDbModel((ApiCryptoHomeDiscover) obj);
    }
}
