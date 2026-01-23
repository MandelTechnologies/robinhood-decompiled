package com.robinhood.android.api.crypto.gifting;

import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.bonfire.cryptogifting.ApiCryptoGift;
import com.robinhood.models.api.bonfire.cryptogifting.ApiCryptoGiftDetails;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: CryptoGiftingApi.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/api/crypto/gifting/CryptoGiftingApi;", "", "getCryptoGiftDetails", "Lcom/robinhood/models/api/bonfire/cryptogifting/ApiCryptoGiftDetails;", "giftId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCryptoGifts", "", "Lcom/robinhood/models/api/bonfire/cryptogifting/ApiCryptoGift;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface CryptoGiftingApi {
    @GET("rewards/reward/gift/crypto/{gift_id}/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object getCryptoGiftDetails(@Path("gift_id") UUID uuid, Continuation<? super ApiCryptoGiftDetails> continuation);

    @GET("rewards/reward/gift/crypto/list/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object getCryptoGifts(Continuation<? super List<ApiCryptoGift>> continuation);
}
