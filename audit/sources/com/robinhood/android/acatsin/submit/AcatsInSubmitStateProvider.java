package com.robinhood.android.acatsin.submit;

import android.graphics.Bitmap;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.submit.AcatsInSubmitViewState;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInSubmitStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDataState;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState;", "<init>", "()V", "reduce", "dataState", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInSubmitStateProvider implements StateProvider<AcatsInSubmitDataState, AcatsInSubmitViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInSubmitViewState reduce(AcatsInSubmitDataState dataState) {
        ManagementType managementType;
        StringResource title;
        DisplayName displayName;
        DisplayName.Variants withInvesting;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID refId = dataState.getRefId();
        Either<ApiBrokerage, String> brokerageOrDtcNumber = dataState.getBrokerageOrDtcNumber();
        String rhsAccountType = dataState.getRhsAccountType();
        String contraAccountNumber = dataState.getContraAccountNumber();
        NamesOnAccount namesOnAccount = dataState.getNamesOnAccount();
        List<UiAcatsAsset> assets = dataState.getAssets();
        String rhsAccountNumber = dataState.getRhsAccountNumber();
        BrokerageAccountType selectedAccountType = dataState.getSelectedAccountType();
        Account account = dataState.getAccount();
        if (account == null || (managementType = account.getManagementType()) == null) {
            managementType = ManagementType.UNKNOWN;
        }
        ManagementType managementType2 = managementType;
        AcatsInSubmitViewState.AcatsTransferRequestState acatsTransferRequestState = dataState.getAcatsTransferRequestState();
        Bitmap contraBrokerLogo = dataState.getContraBrokerLogo();
        BigDecimal retirementMatchRate = dataState.getRetirementMatchRate();
        String taxableAccountBonusRateString = dataState.getTaxableAccountBonusRateString();
        boolean zIsAcatsBrokerageMatchSupported = dataState.isAcatsBrokerageMatchSupported();
        Account account2 = dataState.getAccount();
        if (account2 == null || (title = AccountDisplayNames.nicknameDotFormat(account2)) == null) {
            Account account3 = dataState.getAccount();
            title = (account3 == null || (displayName = AccountDisplayNames.getDisplayName(account3)) == null || (withInvesting = displayName.getWithInvesting()) == null) ? null : withInvesting.getTitle();
        }
        return new AcatsInSubmitViewState(refId, brokerageOrDtcNumber, rhsAccountType, contraAccountNumber, namesOnAccount, assets, rhsAccountNumber, selectedAccountType, managementType2, acatsTransferRequestState, contraBrokerLogo, retirementMatchRate, taxableAccountBonusRateString, zIsAcatsBrokerageMatchSupported, title, dataState.getRequiresCoOwnerSignature());
    }
}
