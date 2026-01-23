package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation;

import com.robinhood.android.acats.contracts.AcatsIn;
import com.robinhood.android.advisory.contracts.AdvisoryPostCreationFundingMethodsKey;
import com.robinhood.android.advisory.dashboard.ManagedDashboardKey;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransfer;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.retirement.contracts.Retirement401kRollover;
import com.robinhood.android.transfers.contracts.CreateRetirementContribution;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel3;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FundingSelectionIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"getFundingSelectionIntentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "key", "Lcom/robinhood/android/advisory/contracts/AdvisoryPostCreationFundingMethodsKey;", "selection", "Lcom/robinhood/models/advisory/api/contribution/FirstTimeTransferType;", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.FundingSelectionIntentKeyKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class FundingSelectionIntentKey {

    /* compiled from: FundingSelectionIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.FundingSelectionIntentKeyKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAdvisoryFirstTimeContributionViewModel3.values().length];
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.ACAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.ROLLOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.INTERNAL_ASSET_TRANSFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.IRA_TO_IRA_DEPOSIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final IntentKey getFundingSelectionIntentKey(AdvisoryPostCreationFundingMethodsKey key, ApiAdvisoryFirstTimeContributionViewModel3 selection, TransferAccountInfo transferAccountInfo) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(selection, "selection");
        switch (WhenMappings.$EnumSwitchMapping$0[selection.ordinal()]) {
            case 1:
                if (key.getBrokerageAccountType().isRetirement()) {
                    return new CreateRetirementContribution(null, key.getAccountNumber(), TransferContext.RobinhoodAccountType.INSTANCE.from(key.getBrokerageAccountType()), false, false, MAXTransferContext.EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW, 9, null);
                }
                return new TransferV2(TransferDirectionV2.DEPOSIT, new TransferConfiguration.Standard(null, null, false, transferAccountInfo != null ? new TransferConfiguration.TransferAccountSelection(transferAccountInfo.getTransfer_account_id(), false, null, 6, null) : null, new TransferConfiguration.TransferAccountSelection(key.getAccountNumber(), true, null, 4, null), null, MAXTransferContext.EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW, key.getSource(), false, false, null, null, true, 3879, null), null, 4, null);
            case 2:
                return new AcatsIn(key.getSource(), false, false, key.getAccountNumber(), false, 22, null);
            case 3:
                return new Retirement401kRollover(Retirement401kRollover.Step.Education.INSTANCE, key.getSource(), true);
            case 4:
                return new InternalAssetTransfer(key.getSource(), true, key.getBrokerageAccountType(), null, 8, null);
            case 5:
                return new TransferV2(TransferDirectionV2.INTER_ENTITY, new TransferConfiguration.Standard(null, null, false, transferAccountInfo != null ? new TransferConfiguration.TransferAccountSelection(transferAccountInfo.getTransfer_account_id(), false, null, 6, null) : null, new TransferConfiguration.TransferAccountSelection(key.getAccountNumber(), true, null, 4, null), null, MAXTransferContext.EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW, key.getSource(), false, false, null, null, true, 3879, null), null, 4, null);
            case 6:
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Unexpected first time transfer type"), false, null, 6, null);
                return ManagedDashboardKey.buildManagedDashboardKey(key.getAccountNumber(), key.getBrokerageAccountType());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
