package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptoPositionDetails;
import com.robinhood.models.crypto.p314db.CryptoPositionDetails;
import com.robinhood.models.serverdriven.experimental.api.Money;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"dbModel", "Lcom/robinhood/models/crypto/db/CryptoPositionDetails;", "Lcom/robinhood/models/api/ApiCryptoPositionDetails;", "getDbModel$annotations", "(Lcom/robinhood/models/api/ApiCryptoPositionDetails;)V", "getDbModel", "(Lcom/robinhood/models/api/ApiCryptoPositionDetails;)Lcom/robinhood/models/crypto/db/CryptoPositionDetails;", "lib-store-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoPositionDetailsStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class CryptoPositionDetailsStore5 {
    public static /* synthetic */ void getDbModel$annotations(ApiCryptoPositionDetails apiCryptoPositionDetails) {
    }

    public static final CryptoPositionDetails getDbModel(ApiCryptoPositionDetails apiCryptoPositionDetails) {
        Intrinsics.checkNotNullParameter(apiCryptoPositionDetails, "<this>");
        UUID accountId = apiCryptoPositionDetails.getAccountId();
        UUID currencyPairId = apiCryptoPositionDetails.getCurrencyPairId();
        Money totalMarketValue = apiCryptoPositionDetails.getTotalMarketValue();
        BigDecimal averageCost = apiCryptoPositionDetails.getAverageCost();
        BigDecimal totalReturn = apiCryptoPositionDetails.getTotalReturn();
        BigDecimal totalReturnPercentage = apiCryptoPositionDetails.getTotalReturnPercentage();
        BigDecimal todayReturn = apiCryptoPositionDetails.getTodayReturn();
        BigDecimal todayReturnPercentage = apiCryptoPositionDetails.getTodayReturnPercentage();
        String averageCostTotalReturnStatus = apiCryptoPositionDetails.getAverageCostTotalReturnStatus();
        return new CryptoPositionDetails(accountId, currencyPairId, totalMarketValue, averageCost, totalReturn, totalReturnPercentage, todayReturn, todayReturnPercentage, averageCostTotalReturnStatus != null ? CryptoPositionDetails.AverageCostTotalReturnStatus.INSTANCE.fromServerValue(averageCostTotalReturnStatus) : null);
    }
}
