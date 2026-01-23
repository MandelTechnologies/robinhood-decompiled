package com.robinhood.android.margin.upgrade.agreements;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementState3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeAgreementState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "<init>", "()V", "reduce", "dataState", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementStateProvider, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeAgreementState2 implements StateProvider<MarginUpgradeAgreementDataState, MarginUpgradeAgreementState3> {
    public static final int $stable = 0;
    public static final String ERROR_MSG_BUYING_POWER_MISSING = "Margin upgrade error - newBuyingPower missing";
    public static final String ERROR_MSG_ERROR_REASON_MISSING = "Margin upgrade error - errorReason missing";
    public static final String ERROR_MSG_ILLEGAL_STATE = "Margin upgrade error - illegal state reached";

    @Override // com.robinhood.android.udf.StateProvider
    public MarginUpgradeAgreementState3 reduce(MarginUpgradeAgreementDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isLoading()) {
            return MarginUpgradeAgreementState3.Loading.INSTANCE;
        }
        ApiToggleMarginInvestingResponse2 result = dataState.getResult();
        ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2 = ApiToggleMarginInvestingResponse2.SUCCESS;
        if (result == apiToggleMarginInvestingResponse2 && dataState.getNewBuyingPower() != null && dataState.getAccount() != null) {
            return new MarginUpgradeAgreementState3.UpgradeSuccess(dataState.getResult(), dataState.getNewBuyingPower(), AccountDisplayNames.getDisplayName(dataState.getAccount()));
        }
        if (dataState.getResult() == apiToggleMarginInvestingResponse2 && dataState.getNewBuyingPower() == null) {
            return new MarginUpgradeAgreementState3.GenericError(new Throwable(ERROR_MSG_BUYING_POWER_MISSING));
        }
        if (dataState.getResult() != null && dataState.getErrorReason() != null) {
            return new MarginUpgradeAgreementState3.UpgradeError(dataState.getResult(), dataState.getErrorReason());
        }
        if (dataState.getResult() != null && dataState.getErrorReason() == null) {
            return new MarginUpgradeAgreementState3.GenericError(new Throwable(ERROR_MSG_ERROR_REASON_MISSING));
        }
        if (dataState.getThrowable() != null) {
            return new MarginUpgradeAgreementState3.GenericError(dataState.getThrowable());
        }
        if (dataState.getMarkdown() != null && dataState.getAgreement() != null && dataState.getDisclaimerStringRes() != null) {
            Account account = dataState.getAccount();
            if ((account != null ? account.getBrokerageAccountType() : null) == BrokerageAccountType.JOINT_TENANCY_WITH_ROS && dataState.getJointAccountCoOwnerFirstName() != null) {
                return new MarginUpgradeAgreementState3.JointAccountAgreementLoaded(dataState.getMarkdown(), dataState.getAccount().getAccountNumber(), dataState.getJointAccountCoOwnerFirstName(), dataState.getFirstCheckboxChecked(), dataState.getSecondCheckboxChecked(), dataState.getAgreement());
            }
            return new MarginUpgradeAgreementState3.IndividualAgreementLoaded(dataState.getMarkdown(), dataState.getAgreement(), dataState.getDisclaimerStringRes().intValue());
        }
        return new MarginUpgradeAgreementState3.GenericError(new Throwable(ERROR_MSG_ILLEGAL_STATE));
    }
}
