package com.robinhood.shared.crypto.microgram.service;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import contracts.crypto.rewards.proto.p430v1.CryptoRewardsService;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonRequestDto;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonResponseDto;
import contracts.crypto.rewards.proto.p430v1.GetHomeRewardsButtonResponseDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: CryptoRewardsCachedService.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/shared/crypto/microgram/service/CryptoRewardsCachedService;", "Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;", "lib-crypto-microgram-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoRewardsCachedService extends CryptoRewardsService {
    /* synthetic */ Object GetCryptoDetailRewardButton(Request request, Continuation continuation);

    @Override // contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    /* synthetic */ Object GetCryptoDetailRewardButton(GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto, Continuation continuation);

    @Override // contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    /* synthetic */ Object GetHomeRewardsButton(Request request, Continuation continuation);

    @Override // contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    /* synthetic */ Object GetHomeRewardsButton(Continuation continuation);

    /* compiled from: CryptoRewardsCachedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Object GetCryptoDetailRewardButton(CryptoRewardsCachedService cryptoRewardsCachedService, Request<GetCryptoDetailRewardButtonRequestDto> request, Continuation<? super Response<GetCryptoDetailRewardButtonResponseDto>> continuation) {
            return CryptoRewardsService.DefaultImpls.GetCryptoDetailRewardButton(cryptoRewardsCachedService, request, continuation);
        }

        public static Object GetHomeRewardsButton(CryptoRewardsCachedService cryptoRewardsCachedService, Request<Unit> request, Continuation<? super Response<GetHomeRewardsButtonResponseDto>> continuation) {
            return CryptoRewardsService.DefaultImpls.GetHomeRewardsButton(cryptoRewardsCachedService, request, continuation);
        }
    }
}
