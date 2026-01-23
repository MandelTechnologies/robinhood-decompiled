package com.robinhood.onboarding.nggoldearningsindepositstep.contracts;

import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: NGGoldEarningsService.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ \u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ \u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;", "", "getExistingUserAlertContent", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "", "entryPoint", "", "(Ljava/lang/Double;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewUserAlertContent", "showExistingUserBottomSheetIfEligible", "", "showNewUserBottomSheetIfEligible", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "sample.com.robinhood.onboarding.nggoldearningsindepositstep")
/* loaded from: classes22.dex */
public interface NGGoldEarningsService {
    Object getExistingUserAlertContent(Double d, String str, Continuation<? super NGEarningsFirstDepositAlertContent> continuation);

    Object getNewUserAlertContent(Double d, String str, Continuation<? super NGEarningsFirstDepositAlertContent> continuation);

    Object showExistingUserBottomSheetIfEligible(Double d, String str, Continuation<? super Unit> continuation);

    Object showNewUserBottomSheetIfEligible(Double d, String str, Continuation<? super Unit> continuation);
}
