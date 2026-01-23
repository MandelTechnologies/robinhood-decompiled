package com.robinhood.android.transfers.p271ui.max.validation;

import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.limits.CreateTransferLimitsState;
import com.robinhood.android.transfers.lib.validation.TransferValidationInput;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionViewState;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferValidationInputUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"transferValidationInput", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "sessionId", "Ljava/util/UUID;", "state", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.validation.TransferValidationInputUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferValidationInputUtils {
    public static final TransferValidationInput transferValidationInput(UUID sessionId, CreateTransferViewState state) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(state, "state");
        MAXTransferContext.EntryPoint entryPoint = state.getTransferConfiguration().getEntryPoint();
        String entryPointLoggingIdentifier = state.getTransferConfiguration().getEntryPointLoggingIdentifier();
        if (entryPointLoggingIdentifier == null) {
            entryPointLoggingIdentifier = "";
        }
        String str = entryPointLoggingIdentifier;
        BigDecimal amount = state.getAmount();
        TransferAccount sourceAccount = state.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TransferAccount sinkAccount = state.getSinkAccount();
        if (sinkAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TransferConfiguration transferConfiguration = state.getTransferConfiguration();
        Portfolio portfolio = state.getPortfolio();
        UnifiedBalances unifiedBalances = state.getUnifiedBalances();
        boolean areMarketsOpenExtended = state.getAreMarketsOpenExtended();
        CreateTransferLimitsState createTransferLimitsState = state.getCreateTransferLimitsState();
        IraContributionQuestionnaireResult.IraContribution iraContribution = state.getIraContribution();
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution = state.getIraDistribution();
        ApiIraDistributionTaxWithholding iraDistributionTaxWithholding = state.getIraDistributionTaxWithholding();
        return new TransferValidationInput(sessionId, entryPoint, str, amount, sourceAccount, sinkAccount, transferConfiguration, portfolio, unifiedBalances, areMarketsOpenExtended, createTransferLimitsState, iraContribution, iraDistribution, iraDistributionTaxWithholding != null ? iraDistributionTaxWithholding.getPre_review_alert() : null, state.getIraDistributionFee(), state.getOverrideNoEnokiAlert(), state.getOverrideDistributionPreReviewAlert(), state.getOverrideDistributionEnokiRemovalAlert(), state.isInInterEntityMatchExperiment(), state.getOverrideGoldApyBoostMinDepositCheck(), null, state.getAdjustedFrequency(), null, false, state.isMemberPdtRevampV1(), 13631488, null);
    }

    public static final TransferValidationInput transferValidationInput(UUID sessionId, CreateRetirementContributionViewState.Loaded state) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(state, "state");
        MAXTransferContext.EntryPoint entryPoint = state.getEntryPoint();
        String lowerCase = state.getEntryPoint().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        BigDecimal contributionAmount = state.getContributionAmount();
        TransferAccount sourceAccount = state.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TransferAccount sinkAccount = state.getSinkAccount();
        if (sinkAccount != null) {
            return new TransferValidationInput(sessionId, entryPoint, lowerCase, contributionAmount, sourceAccount, sinkAccount, state.getTransferConfiguration(), state.getPortfolio(), state.getUnifiedBalances(), state.getAreMarketsOpenExtended(), CreateTransferLimitsState.None.INSTANCE, state.getIraContribution(), null, null, null, state.getOverrideNoEnokiAlert(), false, false, state.isInInterEntityMatchExperiment(), false, null, null, null, false, false, 32505856, null);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
