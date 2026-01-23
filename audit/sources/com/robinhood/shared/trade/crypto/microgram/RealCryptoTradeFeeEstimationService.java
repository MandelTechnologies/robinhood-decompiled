package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradeFeeEstimationService;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamCryptoTradeFeeEstimationAmountRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamCryptoTradeFeeEstimationAmountResponseDto;

/* compiled from: RealCryptoTradeFeeEstimationService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradeFeeEstimationService;", "setUiFeeEstimation", "", "uiFeeEstimation", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "(Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface RealCryptoTradeFeeEstimationService extends CryptoTradeFeeEstimationService {
    /* synthetic */ Flow StreamCryptoTradeFeeEstimationAmount(Request request);

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradeFeeEstimationService
    /* synthetic */ Flow StreamCryptoTradeFeeEstimationAmount(StreamCryptoTradeFeeEstimationAmountRequestDto streamCryptoTradeFeeEstimationAmountRequestDto);

    Object setUiFeeEstimation(UiFeeEstimation uiFeeEstimation, Continuation<? super Unit> continuation);

    /* compiled from: RealCryptoTradeFeeEstimationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Flow<Response<StreamCryptoTradeFeeEstimationAmountResponseDto>> StreamCryptoTradeFeeEstimationAmount(RealCryptoTradeFeeEstimationService realCryptoTradeFeeEstimationService, Request<StreamCryptoTradeFeeEstimationAmountRequestDto> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return CryptoTradeFeeEstimationService.DefaultImpls.StreamCryptoTradeFeeEstimationAmount(realCryptoTradeFeeEstimationService, request);
        }
    }
}
