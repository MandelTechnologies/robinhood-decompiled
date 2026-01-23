package com.robinhood.android.transfers.lib.validation;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionFee;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.limits.CreateTransferLimitsState;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferValidationInput.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010+\u001a\u00020\u0014\u0012\b\b\u0002\u0010,\u001a\u00020\u0014¢\u0006\u0004\b-\u0010.J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\tHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\\\u001a\u00020\u000eHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010_\u001a\u00020\u0014HÆ\u0003J\t\u0010`\u001a\u00020\u0016HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010e\u001a\u00020\u0014HÆ\u0003J\t\u0010f\u001a\u00020\u0014HÆ\u0003J\t\u0010g\u001a\u00020\u0014HÆ\u0003J\t\u0010h\u001a\u00020\u0014HÆ\u0003J\t\u0010i\u001a\u00020\u0014HÆ\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010*HÆ\u0003J\t\u0010m\u001a\u00020\u0014HÆ\u0003J\t\u0010n\u001a\u00020\u0014HÆ\u0003J\u009f\u0002\u0010o\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\u00142\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020\u00142\b\b\u0002\u0010,\u001a\u00020\u0014HÆ\u0001J\u0013\u0010p\u001a\u00020\u00142\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020sHÖ\u0001J\t\u0010t\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u001f\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0011\u0010 \u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bM\u0010AR\u0011\u0010!\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bN\u0010AR\u0011\u0010\"\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010AR\u0011\u0010#\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bO\u0010AR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010+\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010AR\u0011\u0010,\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010A¨\u0006u"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "", "sessionId", "Ljava/util/UUID;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "amount", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "areMarketsOpenExtended", "", "createTransferLimitsState", "Lcom/robinhood/android/transfers/lib/limits/CreateTransferLimitsState;", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_DISTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "distributionPreReviewAlert", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding$DistributionAlert;", CreateTransferDuxo.SAVED_STATE_IRA_DISTRIBUTION_FEE, "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", "overrideNoEnokiAlert", "overrideDistributionPreReviewAlert", "overrideDistributionEnokiRemovalAlert", "isInInterEntityMatchExperiment", "overrideGoldApyBoostMinDepositCheck", "transferLimits", "", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "adjustedFrequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "isLimitWireUpsellEnabled", "isMemberPdtRevampV1", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/crypto/db/UnifiedBalances;ZLcom/robinhood/android/transfers/lib/limits/CreateTransferLimitsState;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding$DistributionAlert;Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;ZZZZZLjava/util/List;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;ZZ)V", "getSessionId", "()Ljava/util/UUID;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "getConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getPortfolio", "()Lcom/robinhood/models/db/Portfolio;", "getUnifiedBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getAreMarketsOpenExtended", "()Z", "getCreateTransferLimitsState", "()Lcom/robinhood/android/transfers/lib/limits/CreateTransferLimitsState;", "getIraContribution", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "getIraDistribution", "()Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "getDistributionPreReviewAlert", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding$DistributionAlert;", "getIraDistributionFee", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", "getOverrideNoEnokiAlert", "getOverrideDistributionPreReviewAlert", "getOverrideDistributionEnokiRemovalAlert", "getOverrideGoldApyBoostMinDepositCheck", "getTransferLimits", "()Ljava/util/List;", "getAdjustedFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "other", "hashCode", "", "toString", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferValidationInput {
    private final ApiCreateTransferRequest2 adjustedFrequency;
    private final BigDecimal amount;
    private final boolean areMarketsOpenExtended;
    private final TransferConfiguration configuration;
    private final CreateTransferLimitsState createTransferLimitsState;
    private final TransferDirectionV2 direction;
    private final ApiIraDistributionTaxWithholding.DistributionAlert distributionPreReviewAlert;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final String entryPointLoggingIdentifier;
    private final IraContributionQuestionnaireResult.IraContribution iraContribution;
    private final IraDistributionQuestionnaireResult.IraDistribution iraDistribution;
    private final ApiIraDistributionFee iraDistributionFee;
    private final boolean isInInterEntityMatchExperiment;
    private final boolean isLimitWireUpsellEnabled;
    private final boolean isMemberPdtRevampV1;
    private final boolean overrideDistributionEnokiRemovalAlert;
    private final boolean overrideDistributionPreReviewAlert;
    private final boolean overrideGoldApyBoostMinDepositCheck;
    private final boolean overrideNoEnokiAlert;
    private final Portfolio portfolio;
    private final UUID sessionId;
    private final TransferAccount sinkAccount;
    private final TransferAccount sourceAccount;
    private final List<ApiLimitsHubResponse> transferLimits;
    private final UnifiedBalances unifiedBalances;

    public static /* synthetic */ TransferValidationInput copy$default(TransferValidationInput transferValidationInput, UUID uuid, MAXTransferContext.EntryPoint entryPoint, String str, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, TransferConfiguration transferConfiguration, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean z, CreateTransferLimitsState createTransferLimitsState, IraContributionQuestionnaireResult.IraContribution iraContribution, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, ApiIraDistributionTaxWithholding.DistributionAlert distributionAlert, ApiIraDistributionFee apiIraDistributionFee, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, ApiCreateTransferRequest2 apiCreateTransferRequest2, TransferDirectionV2 transferDirectionV2, boolean z7, boolean z8, int i, Object obj) {
        boolean z9;
        boolean z10;
        UUID uuid2 = (i & 1) != 0 ? transferValidationInput.sessionId : uuid;
        MAXTransferContext.EntryPoint entryPoint2 = (i & 2) != 0 ? transferValidationInput.entryPoint : entryPoint;
        String str2 = (i & 4) != 0 ? transferValidationInput.entryPointLoggingIdentifier : str;
        BigDecimal bigDecimal2 = (i & 8) != 0 ? transferValidationInput.amount : bigDecimal;
        TransferAccount transferAccount3 = (i & 16) != 0 ? transferValidationInput.sourceAccount : transferAccount;
        TransferAccount transferAccount4 = (i & 32) != 0 ? transferValidationInput.sinkAccount : transferAccount2;
        TransferConfiguration transferConfiguration2 = (i & 64) != 0 ? transferValidationInput.configuration : transferConfiguration;
        Portfolio portfolio2 = (i & 128) != 0 ? transferValidationInput.portfolio : portfolio;
        UnifiedBalances unifiedBalances2 = (i & 256) != 0 ? transferValidationInput.unifiedBalances : unifiedBalances;
        boolean z11 = (i & 512) != 0 ? transferValidationInput.areMarketsOpenExtended : z;
        CreateTransferLimitsState createTransferLimitsState2 = (i & 1024) != 0 ? transferValidationInput.createTransferLimitsState : createTransferLimitsState;
        IraContributionQuestionnaireResult.IraContribution iraContribution2 = (i & 2048) != 0 ? transferValidationInput.iraContribution : iraContribution;
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution2 = (i & 4096) != 0 ? transferValidationInput.iraDistribution : iraDistribution;
        ApiIraDistributionTaxWithholding.DistributionAlert distributionAlert2 = (i & 8192) != 0 ? transferValidationInput.distributionPreReviewAlert : distributionAlert;
        UUID uuid3 = uuid2;
        ApiIraDistributionFee apiIraDistributionFee2 = (i & 16384) != 0 ? transferValidationInput.iraDistributionFee : apiIraDistributionFee;
        boolean z12 = (i & 32768) != 0 ? transferValidationInput.overrideNoEnokiAlert : z2;
        boolean z13 = (i & 65536) != 0 ? transferValidationInput.overrideDistributionPreReviewAlert : z3;
        boolean z14 = (i & 131072) != 0 ? transferValidationInput.overrideDistributionEnokiRemovalAlert : z4;
        boolean z15 = (i & 262144) != 0 ? transferValidationInput.isInInterEntityMatchExperiment : z5;
        boolean z16 = (i & 524288) != 0 ? transferValidationInput.overrideGoldApyBoostMinDepositCheck : z6;
        List list2 = (i & 1048576) != 0 ? transferValidationInput.transferLimits : list;
        ApiCreateTransferRequest2 apiCreateTransferRequest22 = (i & 2097152) != 0 ? transferValidationInput.adjustedFrequency : apiCreateTransferRequest2;
        TransferDirectionV2 transferDirectionV22 = (i & 4194304) != 0 ? transferValidationInput.direction : transferDirectionV2;
        boolean z17 = (i & 8388608) != 0 ? transferValidationInput.isLimitWireUpsellEnabled : z7;
        if ((i & 16777216) != 0) {
            z10 = z17;
            z9 = transferValidationInput.isMemberPdtRevampV1;
        } else {
            z9 = z8;
            z10 = z17;
        }
        return transferValidationInput.copy(uuid3, entryPoint2, str2, bigDecimal2, transferAccount3, transferAccount4, transferConfiguration2, portfolio2, unifiedBalances2, z11, createTransferLimitsState2, iraContribution2, iraDistribution2, distributionAlert2, apiIraDistributionFee2, z12, z13, z14, z15, z16, list2, apiCreateTransferRequest22, transferDirectionV22, z10, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getAreMarketsOpenExtended() {
        return this.areMarketsOpenExtended;
    }

    /* renamed from: component11, reason: from getter */
    public final CreateTransferLimitsState getCreateTransferLimitsState() {
        return this.createTransferLimitsState;
    }

    /* renamed from: component12, reason: from getter */
    public final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
        return this.iraContribution;
    }

    /* renamed from: component13, reason: from getter */
    public final IraDistributionQuestionnaireResult.IraDistribution getIraDistribution() {
        return this.iraDistribution;
    }

    /* renamed from: component14, reason: from getter */
    public final ApiIraDistributionTaxWithholding.DistributionAlert getDistributionPreReviewAlert() {
        return this.distributionPreReviewAlert;
    }

    /* renamed from: component15, reason: from getter */
    public final ApiIraDistributionFee getIraDistributionFee() {
        return this.iraDistributionFee;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getOverrideNoEnokiAlert() {
        return this.overrideNoEnokiAlert;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getOverrideDistributionPreReviewAlert() {
        return this.overrideDistributionPreReviewAlert;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getOverrideDistributionEnokiRemovalAlert() {
        return this.overrideDistributionEnokiRemovalAlert;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsInInterEntityMatchExperiment() {
        return this.isInInterEntityMatchExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getOverrideGoldApyBoostMinDepositCheck() {
        return this.overrideGoldApyBoostMinDepositCheck;
    }

    public final List<ApiLimitsHubResponse> component21() {
        return this.transferLimits;
    }

    /* renamed from: component22, reason: from getter */
    public final ApiCreateTransferRequest2 getAdjustedFrequency() {
        return this.adjustedFrequency;
    }

    /* renamed from: component23, reason: from getter */
    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsLimitWireUpsellEnabled() {
        return this.isLimitWireUpsellEnabled;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEntryPointLoggingIdentifier() {
        return this.entryPointLoggingIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final TransferConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component8, reason: from getter */
    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    /* renamed from: component9, reason: from getter */
    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    public final TransferValidationInput copy(UUID sessionId, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount, TransferConfiguration configuration, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean areMarketsOpenExtended, CreateTransferLimitsState createTransferLimitsState, IraContributionQuestionnaireResult.IraContribution iraContribution, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, ApiIraDistributionTaxWithholding.DistributionAlert distributionPreReviewAlert, ApiIraDistributionFee iraDistributionFee, boolean overrideNoEnokiAlert, boolean overrideDistributionPreReviewAlert, boolean overrideDistributionEnokiRemovalAlert, boolean isInInterEntityMatchExperiment, boolean overrideGoldApyBoostMinDepositCheck, List<ApiLimitsHubResponse> transferLimits, ApiCreateTransferRequest2 adjustedFrequency, TransferDirectionV2 direction, boolean isLimitWireUpsellEnabled, boolean isMemberPdtRevampV1) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(createTransferLimitsState, "createTransferLimitsState");
        return new TransferValidationInput(sessionId, entryPoint, entryPointLoggingIdentifier, amount, sourceAccount, sinkAccount, configuration, portfolio, unifiedBalances, areMarketsOpenExtended, createTransferLimitsState, iraContribution, iraDistribution, distributionPreReviewAlert, iraDistributionFee, overrideNoEnokiAlert, overrideDistributionPreReviewAlert, overrideDistributionEnokiRemovalAlert, isInInterEntityMatchExperiment, overrideGoldApyBoostMinDepositCheck, transferLimits, adjustedFrequency, direction, isLimitWireUpsellEnabled, isMemberPdtRevampV1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferValidationInput)) {
            return false;
        }
        TransferValidationInput transferValidationInput = (TransferValidationInput) other;
        return Intrinsics.areEqual(this.sessionId, transferValidationInput.sessionId) && this.entryPoint == transferValidationInput.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, transferValidationInput.entryPointLoggingIdentifier) && Intrinsics.areEqual(this.amount, transferValidationInput.amount) && Intrinsics.areEqual(this.sourceAccount, transferValidationInput.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, transferValidationInput.sinkAccount) && Intrinsics.areEqual(this.configuration, transferValidationInput.configuration) && Intrinsics.areEqual(this.portfolio, transferValidationInput.portfolio) && Intrinsics.areEqual(this.unifiedBalances, transferValidationInput.unifiedBalances) && this.areMarketsOpenExtended == transferValidationInput.areMarketsOpenExtended && Intrinsics.areEqual(this.createTransferLimitsState, transferValidationInput.createTransferLimitsState) && Intrinsics.areEqual(this.iraContribution, transferValidationInput.iraContribution) && Intrinsics.areEqual(this.iraDistribution, transferValidationInput.iraDistribution) && Intrinsics.areEqual(this.distributionPreReviewAlert, transferValidationInput.distributionPreReviewAlert) && Intrinsics.areEqual(this.iraDistributionFee, transferValidationInput.iraDistributionFee) && this.overrideNoEnokiAlert == transferValidationInput.overrideNoEnokiAlert && this.overrideDistributionPreReviewAlert == transferValidationInput.overrideDistributionPreReviewAlert && this.overrideDistributionEnokiRemovalAlert == transferValidationInput.overrideDistributionEnokiRemovalAlert && this.isInInterEntityMatchExperiment == transferValidationInput.isInInterEntityMatchExperiment && this.overrideGoldApyBoostMinDepositCheck == transferValidationInput.overrideGoldApyBoostMinDepositCheck && Intrinsics.areEqual(this.transferLimits, transferValidationInput.transferLimits) && this.adjustedFrequency == transferValidationInput.adjustedFrequency && this.direction == transferValidationInput.direction && this.isLimitWireUpsellEnabled == transferValidationInput.isLimitWireUpsellEnabled && this.isMemberPdtRevampV1 == transferValidationInput.isMemberPdtRevampV1;
    }

    public int hashCode() {
        int iHashCode = ((((((this.sessionId.hashCode() * 31) + this.entryPoint.hashCode()) * 31) + this.entryPointLoggingIdentifier.hashCode()) * 31) + this.amount.hashCode()) * 31;
        TransferAccount transferAccount = this.sourceAccount;
        int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        TransferAccount transferAccount2 = this.sinkAccount;
        int iHashCode3 = (((iHashCode2 + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31) + this.configuration.hashCode()) * 31;
        Portfolio portfolio = this.portfolio;
        int iHashCode4 = (iHashCode3 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        int iHashCode5 = (((((iHashCode4 + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31) + Boolean.hashCode(this.areMarketsOpenExtended)) * 31) + this.createTransferLimitsState.hashCode()) * 31;
        IraContributionQuestionnaireResult.IraContribution iraContribution = this.iraContribution;
        int iHashCode6 = (iHashCode5 + (iraContribution == null ? 0 : iraContribution.hashCode())) * 31;
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution = this.iraDistribution;
        int iHashCode7 = (iHashCode6 + (iraDistribution == null ? 0 : iraDistribution.hashCode())) * 31;
        ApiIraDistributionTaxWithholding.DistributionAlert distributionAlert = this.distributionPreReviewAlert;
        int iHashCode8 = (iHashCode7 + (distributionAlert == null ? 0 : distributionAlert.hashCode())) * 31;
        ApiIraDistributionFee apiIraDistributionFee = this.iraDistributionFee;
        int iHashCode9 = (((((((((((iHashCode8 + (apiIraDistributionFee == null ? 0 : apiIraDistributionFee.hashCode())) * 31) + Boolean.hashCode(this.overrideNoEnokiAlert)) * 31) + Boolean.hashCode(this.overrideDistributionPreReviewAlert)) * 31) + Boolean.hashCode(this.overrideDistributionEnokiRemovalAlert)) * 31) + Boolean.hashCode(this.isInInterEntityMatchExperiment)) * 31) + Boolean.hashCode(this.overrideGoldApyBoostMinDepositCheck)) * 31;
        List<ApiLimitsHubResponse> list = this.transferLimits;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.adjustedFrequency;
        int iHashCode11 = (iHashCode10 + (apiCreateTransferRequest2 == null ? 0 : apiCreateTransferRequest2.hashCode())) * 31;
        TransferDirectionV2 transferDirectionV2 = this.direction;
        return ((((iHashCode11 + (transferDirectionV2 != null ? transferDirectionV2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLimitWireUpsellEnabled)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
    }

    public String toString() {
        return "TransferValidationInput(sessionId=" + this.sessionId + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ", amount=" + this.amount + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", configuration=" + this.configuration + ", portfolio=" + this.portfolio + ", unifiedBalances=" + this.unifiedBalances + ", areMarketsOpenExtended=" + this.areMarketsOpenExtended + ", createTransferLimitsState=" + this.createTransferLimitsState + ", iraContribution=" + this.iraContribution + ", iraDistribution=" + this.iraDistribution + ", distributionPreReviewAlert=" + this.distributionPreReviewAlert + ", iraDistributionFee=" + this.iraDistributionFee + ", overrideNoEnokiAlert=" + this.overrideNoEnokiAlert + ", overrideDistributionPreReviewAlert=" + this.overrideDistributionPreReviewAlert + ", overrideDistributionEnokiRemovalAlert=" + this.overrideDistributionEnokiRemovalAlert + ", isInInterEntityMatchExperiment=" + this.isInInterEntityMatchExperiment + ", overrideGoldApyBoostMinDepositCheck=" + this.overrideGoldApyBoostMinDepositCheck + ", transferLimits=" + this.transferLimits + ", adjustedFrequency=" + this.adjustedFrequency + ", direction=" + this.direction + ", isLimitWireUpsellEnabled=" + this.isLimitWireUpsellEnabled + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
    }

    public TransferValidationInput(UUID sessionId, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, BigDecimal amount, TransferAccount transferAccount, TransferAccount transferAccount2, TransferConfiguration configuration, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean z, CreateTransferLimitsState createTransferLimitsState, IraContributionQuestionnaireResult.IraContribution iraContribution, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, ApiIraDistributionTaxWithholding.DistributionAlert distributionAlert, ApiIraDistributionFee apiIraDistributionFee, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<ApiLimitsHubResponse> list, ApiCreateTransferRequest2 apiCreateTransferRequest2, TransferDirectionV2 transferDirectionV2, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(createTransferLimitsState, "createTransferLimitsState");
        this.sessionId = sessionId;
        this.entryPoint = entryPoint;
        this.entryPointLoggingIdentifier = entryPointLoggingIdentifier;
        this.amount = amount;
        this.sourceAccount = transferAccount;
        this.sinkAccount = transferAccount2;
        this.configuration = configuration;
        this.portfolio = portfolio;
        this.unifiedBalances = unifiedBalances;
        this.areMarketsOpenExtended = z;
        this.createTransferLimitsState = createTransferLimitsState;
        this.iraContribution = iraContribution;
        this.iraDistribution = iraDistribution;
        this.distributionPreReviewAlert = distributionAlert;
        this.iraDistributionFee = apiIraDistributionFee;
        this.overrideNoEnokiAlert = z2;
        this.overrideDistributionPreReviewAlert = z3;
        this.overrideDistributionEnokiRemovalAlert = z4;
        this.isInInterEntityMatchExperiment = z5;
        this.overrideGoldApyBoostMinDepositCheck = z6;
        this.transferLimits = list;
        this.adjustedFrequency = apiCreateTransferRequest2;
        this.direction = transferDirectionV2;
        this.isLimitWireUpsellEnabled = z7;
        this.isMemberPdtRevampV1 = z8;
    }

    public /* synthetic */ TransferValidationInput(UUID uuid, MAXTransferContext.EntryPoint entryPoint, String str, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, TransferConfiguration transferConfiguration, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean z, CreateTransferLimitsState createTransferLimitsState, IraContributionQuestionnaireResult.IraContribution iraContribution, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, ApiIraDistributionTaxWithholding.DistributionAlert distributionAlert, ApiIraDistributionFee apiIraDistributionFee, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, ApiCreateTransferRequest2 apiCreateTransferRequest2, TransferDirectionV2 transferDirectionV2, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, entryPoint, str, bigDecimal, transferAccount, transferAccount2, transferConfiguration, portfolio, unifiedBalances, z, createTransferLimitsState, iraContribution, iraDistribution, distributionAlert, apiIraDistributionFee, z2, z3, z4, z5, z6, (i & 1048576) != 0 ? null : list, (i & 2097152) != 0 ? null : apiCreateTransferRequest2, (i & 4194304) != 0 ? null : transferDirectionV2, (i & 8388608) != 0 ? false : z7, (i & 16777216) != 0 ? false : z8);
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final String getEntryPointLoggingIdentifier() {
        return this.entryPointLoggingIdentifier;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final TransferConfiguration getConfiguration() {
        return this.configuration;
    }

    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    public final boolean getAreMarketsOpenExtended() {
        return this.areMarketsOpenExtended;
    }

    public final CreateTransferLimitsState getCreateTransferLimitsState() {
        return this.createTransferLimitsState;
    }

    public final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
        return this.iraContribution;
    }

    public final IraDistributionQuestionnaireResult.IraDistribution getIraDistribution() {
        return this.iraDistribution;
    }

    public final ApiIraDistributionTaxWithholding.DistributionAlert getDistributionPreReviewAlert() {
        return this.distributionPreReviewAlert;
    }

    public final ApiIraDistributionFee getIraDistributionFee() {
        return this.iraDistributionFee;
    }

    public final boolean getOverrideNoEnokiAlert() {
        return this.overrideNoEnokiAlert;
    }

    public final boolean getOverrideDistributionPreReviewAlert() {
        return this.overrideDistributionPreReviewAlert;
    }

    public final boolean getOverrideDistributionEnokiRemovalAlert() {
        return this.overrideDistributionEnokiRemovalAlert;
    }

    public final boolean isInInterEntityMatchExperiment() {
        return this.isInInterEntityMatchExperiment;
    }

    public final boolean getOverrideGoldApyBoostMinDepositCheck() {
        return this.overrideGoldApyBoostMinDepositCheck;
    }

    public final List<ApiLimitsHubResponse> getTransferLimits() {
        return this.transferLimits;
    }

    public final ApiCreateTransferRequest2 getAdjustedFrequency() {
        return this.adjustedFrequency;
    }

    public final TransferDirectionV2 getDirection() {
        return this.direction;
    }

    public final boolean isLimitWireUpsellEnabled() {
        return this.isLimitWireUpsellEnabled;
    }

    public final boolean isMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }
}
