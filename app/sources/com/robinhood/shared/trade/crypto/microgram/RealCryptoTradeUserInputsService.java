package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import contracts.crypto.trade.proto.p431v1.CryptoTradeUserInputsService;
import contracts.crypto.trade.proto.p431v1.StreamCryptoTradeUserInputsRequestDto;
import contracts.crypto.trade.proto.p431v1.StreamCryptoTradeUserInputsResponseDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RealCryptoTradeUserInputsService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "Lcontracts/crypto/trade/proto/v1/CryptoTradeUserInputsService;", "setCryptoOrderContext", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface RealCryptoTradeUserInputsService extends CryptoTradeUserInputsService {
    /* synthetic */ Flow StreamCryptoTradeUserInputs(Request request);

    @Override // contracts.crypto.trade.proto.p431v1.CryptoTradeUserInputsService
    /* synthetic */ Flow StreamCryptoTradeUserInputs(StreamCryptoTradeUserInputsRequestDto streamCryptoTradeUserInputsRequestDto);

    Object setCryptoOrderContext(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation);

    /* compiled from: RealCryptoTradeUserInputsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Flow<Response<StreamCryptoTradeUserInputsResponseDto>> StreamCryptoTradeUserInputs(RealCryptoTradeUserInputsService realCryptoTradeUserInputsService, Request<StreamCryptoTradeUserInputsRequestDto> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return CryptoTradeUserInputsService.DefaultImpls.StreamCryptoTradeUserInputs(realCryptoTradeUserInputsService, request);
        }
    }
}
