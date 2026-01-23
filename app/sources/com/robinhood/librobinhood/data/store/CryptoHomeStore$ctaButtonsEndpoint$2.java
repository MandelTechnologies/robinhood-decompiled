package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.home.ApiCryptoHomeCtaButtons;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/home/CryptoHomeCtaButtons;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHomeStore$ctaButtonsEndpoint$2", m3645f = "CryptoHomeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoHomeStore$ctaButtonsEndpoint$2 extends ContinuationImpl7 implements Function2<String, Continuation<? super CryptoHomeCtaButtons>, Object> {
    int label;
    final /* synthetic */ CryptoHomeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeStore$ctaButtonsEndpoint$2(CryptoHomeStore cryptoHomeStore, Continuation<? super CryptoHomeStore$ctaButtonsEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHomeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoHomeStore$ctaButtonsEndpoint$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super CryptoHomeCtaButtons> continuation) {
        return ((CryptoHomeStore$ctaButtonsEndpoint$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoBonfireApi cryptoBonfireApi = this.this$0.cryptoBonfireApi;
            this.label = 1;
            obj = cryptoBonfireApi.getCryptoHomeTabCtaButtons(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CryptoHomeCtaButtons2.getDbModel((ApiCryptoHomeCtaButtons) obj);
    }
}
