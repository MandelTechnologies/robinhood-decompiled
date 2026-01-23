package com.robinhood.onboarding.goldearningspotential.contracts;

import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: GoldEarningsPotentialService.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService;", "", "getPotentialGoldEarningsCalculator", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;", CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initPotentialGoldEarningsCalculator", "Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;", "balance", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "sample.com.robinhood.onboarding.goldearningspotential")
/* loaded from: classes22.dex */
public interface GoldEarningsPotentialService {
    Object getPotentialGoldEarningsCalculator(double d, Continuation<? super GoldEarningsCalculatorModel> continuation);

    Object initPotentialGoldEarningsCalculator(double d, Continuation<? super InitializeGoldEarningsCalculatorResponse> continuation);
}
