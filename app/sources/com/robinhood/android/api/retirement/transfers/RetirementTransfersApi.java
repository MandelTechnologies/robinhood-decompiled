package com.robinhood.android.api.retirement.transfers;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionFee;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraDistributionType;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: RetirementTransfersApi.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;", "", "getIraDistributionTaxWithholding", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "amount", "Ljava/math/BigDecimal;", "accountNumber", "", "accountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "distributionType", "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "stateWithholdingPercent", "federalWithholdingPercent", "(Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/bonfire/IraDistributionType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDistributionFee", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", "(Ljava/math/BigDecimal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-retirement-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RetirementTransfersApi {
    @GET("transfer/calculate_distribution_fee/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getDistributionFee(@Query("amount") BigDecimal bigDecimal, @Query("account_number") String str, Continuation<? super ApiIraDistributionFee> continuation);

    @GET("transfer/calculate_tax_withholdings/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getIraDistributionTaxWithholding(@Query("amount") BigDecimal bigDecimal, @Query("account_number") String str, @Query(InstantCashConstants.ACCOUNT_TYPE_KEY) ApiTransferAccount.TransferAccountType transferAccountType, @Query("distribution_type") IraDistributionType iraDistributionType, @Query("state_withholding_percent") BigDecimal bigDecimal2, @Query("federal_withholding_percent") BigDecimal bigDecimal3, Continuation<? super ApiIraDistributionTaxWithholding> continuation);
}
