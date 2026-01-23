package com.robinhood.android.rhymigration.p245ui;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.librobinhood.CmSunsetExperiment2;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0002\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0004HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003HÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0019HÂ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\tHÆ\u0003J\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\\\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0003HÆ\u0003J\u0011\u0010]\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0003HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0081\u0003\u0010_\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\t2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00032\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00032\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00032\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010`\u001a\u00020\t2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020cHÖ\u0001J\t\u0010d\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0013\u0010A\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0019\u0010E\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bF\u0010(¨\u0006e"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingViewState;", "", "experimentLoadComplete", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/librobinhood/CmSunsetVariant;", "experimentTreatment", "cmSunsetCohort", "Lcom/robinhood/librobinhood/CmSunsetCohortVariant;", "inCmSunsetExperiment", "", "reviewChangesContinueClicked", "", "optOutClicked", "userRequestedShutdown", "upgradeClicked", "cardSelected", "addressConfirmed", "accountCreatedContinueClicked", "shutdownDate", "", "migrationBlockReason", "noCmAccountError", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "transferChipAmount", "Ljava/math/BigDecimal;", "transferClicked", "transferSkipClicked", "hasActiveDirectDeposits", "fundingFinishContinueClicked", "directDepositContinueClicked", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "pushTokenizeEvent", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "verificationRequired", "Lcom/robinhood/models/api/minerva/VerificationRequiredException;", "googleWalletError", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/librobinhood/CmSunsetVariant;Lcom/robinhood/librobinhood/CmSunsetCohortVariant;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Ljava/math/BigDecimal;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getExperimentLoadComplete", "()Lcom/robinhood/udf/UiEvent;", "getExperimentTreatment", "()Lcom/robinhood/librobinhood/CmSunsetVariant;", "getCmSunsetCohort", "()Lcom/robinhood/librobinhood/CmSunsetCohortVariant;", "getInCmSunsetExperiment", "()Z", "getReviewChangesContinueClicked", "getOptOutClicked", "getUserRequestedShutdown", "getUpgradeClicked", "getCardSelected", "getAddressConfirmed", "getAccountCreatedContinueClicked", "getShutdownDate", "()Ljava/lang/String;", "getMigrationBlockReason", "getNoCmAccountError", "getTransferClicked", "getTransferSkipClicked", "getHasActiveDirectDeposits", "getFundingFinishContinueClicked", "getPushTokenizeEvent", "getVerificationRequired", "getGoogleWalletError", "transferConfig", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getTransferConfig", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "continueToAddToVirtualWallet", "getContinueToAddToVirtualWallet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "hashCode", "", "toString", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyOnboardingViewState {
    public static final int $stable = 8;
    private final UiEvent<Unit> accountCreatedContinueClicked;
    private final UiEvent<Unit> addressConfirmed;
    private final UiEvent<Boolean> cardSelected;
    private final CmSunsetExperiment2 cmSunsetCohort;
    private final UiEvent<PaymentCard> directDepositContinueClicked;
    private final UiEvent<CmSunsetExperiment4> experimentLoadComplete;
    private final CmSunsetExperiment4 experimentTreatment;
    private final UiEvent<Unit> fundingFinishContinueClicked;
    private final UiEvent<Unit> googleWalletError;
    private final boolean hasActiveDirectDeposits;
    private final boolean inCmSunsetExperiment;
    private final String migrationBlockReason;
    private final UiEvent<Unit> noCmAccountError;
    private final UiEvent<Unit> optOutClicked;
    private final UiEvent<PushTokenizeRequest> pushTokenizeEvent;
    private final UiEvent<Unit> reviewChangesContinueClicked;
    private final String shutdownDate;
    private final BigDecimal transferChipAmount;
    private final UiEvent<Unit> transferClicked;
    private final UiEvent<Unit> transferSkipClicked;
    private final UnifiedAccountV2 unifiedAccount;
    private final UiEvent<Unit> upgradeClicked;
    private final UiEvent<Boolean> userRequestedShutdown;
    private final UiEvent<VerificationRequiredException> verificationRequired;

    public RhyOnboardingViewState() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777215, null);
    }

    /* renamed from: component15, reason: from getter */
    private final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    /* renamed from: component16, reason: from getter */
    private final BigDecimal getTransferChipAmount() {
        return this.transferChipAmount;
    }

    private final UiEvent<PaymentCard> component21() {
        return this.directDepositContinueClicked;
    }

    public static /* synthetic */ RhyOnboardingViewState copy$default(RhyOnboardingViewState rhyOnboardingViewState, UiEvent uiEvent, CmSunsetExperiment4 cmSunsetExperiment4, CmSunsetExperiment2 cmSunsetExperiment2, boolean z, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, UiEvent uiEvent7, UiEvent uiEvent8, String str, String str2, UiEvent uiEvent9, UnifiedAccountV2 unifiedAccountV2, BigDecimal bigDecimal, UiEvent uiEvent10, UiEvent uiEvent11, boolean z2, UiEvent uiEvent12, UiEvent uiEvent13, UiEvent uiEvent14, UiEvent uiEvent15, UiEvent uiEvent16, int i, Object obj) {
        UiEvent uiEvent17;
        UiEvent uiEvent18;
        UiEvent uiEvent19 = (i & 1) != 0 ? rhyOnboardingViewState.experimentLoadComplete : uiEvent;
        CmSunsetExperiment4 cmSunsetExperiment42 = (i & 2) != 0 ? rhyOnboardingViewState.experimentTreatment : cmSunsetExperiment4;
        CmSunsetExperiment2 cmSunsetExperiment22 = (i & 4) != 0 ? rhyOnboardingViewState.cmSunsetCohort : cmSunsetExperiment2;
        boolean z3 = (i & 8) != 0 ? rhyOnboardingViewState.inCmSunsetExperiment : z;
        UiEvent uiEvent20 = (i & 16) != 0 ? rhyOnboardingViewState.reviewChangesContinueClicked : uiEvent2;
        UiEvent uiEvent21 = (i & 32) != 0 ? rhyOnboardingViewState.optOutClicked : uiEvent3;
        UiEvent uiEvent22 = (i & 64) != 0 ? rhyOnboardingViewState.userRequestedShutdown : uiEvent4;
        UiEvent uiEvent23 = (i & 128) != 0 ? rhyOnboardingViewState.upgradeClicked : uiEvent5;
        UiEvent uiEvent24 = (i & 256) != 0 ? rhyOnboardingViewState.cardSelected : uiEvent6;
        UiEvent uiEvent25 = (i & 512) != 0 ? rhyOnboardingViewState.addressConfirmed : uiEvent7;
        UiEvent uiEvent26 = (i & 1024) != 0 ? rhyOnboardingViewState.accountCreatedContinueClicked : uiEvent8;
        String str3 = (i & 2048) != 0 ? rhyOnboardingViewState.shutdownDate : str;
        String str4 = (i & 4096) != 0 ? rhyOnboardingViewState.migrationBlockReason : str2;
        UiEvent uiEvent27 = (i & 8192) != 0 ? rhyOnboardingViewState.noCmAccountError : uiEvent9;
        UiEvent uiEvent28 = uiEvent19;
        UnifiedAccountV2 unifiedAccountV22 = (i & 16384) != 0 ? rhyOnboardingViewState.unifiedAccount : unifiedAccountV2;
        BigDecimal bigDecimal2 = (i & 32768) != 0 ? rhyOnboardingViewState.transferChipAmount : bigDecimal;
        UiEvent uiEvent29 = (i & 65536) != 0 ? rhyOnboardingViewState.transferClicked : uiEvent10;
        UiEvent uiEvent30 = (i & 131072) != 0 ? rhyOnboardingViewState.transferSkipClicked : uiEvent11;
        boolean z4 = (i & 262144) != 0 ? rhyOnboardingViewState.hasActiveDirectDeposits : z2;
        UiEvent uiEvent31 = (i & 524288) != 0 ? rhyOnboardingViewState.fundingFinishContinueClicked : uiEvent12;
        UiEvent uiEvent32 = (i & 1048576) != 0 ? rhyOnboardingViewState.directDepositContinueClicked : uiEvent13;
        UiEvent uiEvent33 = (i & 2097152) != 0 ? rhyOnboardingViewState.pushTokenizeEvent : uiEvent14;
        UiEvent uiEvent34 = (i & 4194304) != 0 ? rhyOnboardingViewState.verificationRequired : uiEvent15;
        if ((i & 8388608) != 0) {
            uiEvent18 = uiEvent34;
            uiEvent17 = rhyOnboardingViewState.googleWalletError;
        } else {
            uiEvent17 = uiEvent16;
            uiEvent18 = uiEvent34;
        }
        return rhyOnboardingViewState.copy(uiEvent28, cmSunsetExperiment42, cmSunsetExperiment22, z3, uiEvent20, uiEvent21, uiEvent22, uiEvent23, uiEvent24, uiEvent25, uiEvent26, str3, str4, uiEvent27, unifiedAccountV22, bigDecimal2, uiEvent29, uiEvent30, z4, uiEvent31, uiEvent32, uiEvent33, uiEvent18, uiEvent17);
    }

    public final UiEvent<CmSunsetExperiment4> component1() {
        return this.experimentLoadComplete;
    }

    public final UiEvent<Unit> component10() {
        return this.addressConfirmed;
    }

    public final UiEvent<Unit> component11() {
        return this.accountCreatedContinueClicked;
    }

    /* renamed from: component12, reason: from getter */
    public final String getShutdownDate() {
        return this.shutdownDate;
    }

    /* renamed from: component13, reason: from getter */
    public final String getMigrationBlockReason() {
        return this.migrationBlockReason;
    }

    public final UiEvent<Unit> component14() {
        return this.noCmAccountError;
    }

    public final UiEvent<Unit> component17() {
        return this.transferClicked;
    }

    public final UiEvent<Unit> component18() {
        return this.transferSkipClicked;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getHasActiveDirectDeposits() {
        return this.hasActiveDirectDeposits;
    }

    /* renamed from: component2, reason: from getter */
    public final CmSunsetExperiment4 getExperimentTreatment() {
        return this.experimentTreatment;
    }

    public final UiEvent<Unit> component20() {
        return this.fundingFinishContinueClicked;
    }

    public final UiEvent<PushTokenizeRequest> component22() {
        return this.pushTokenizeEvent;
    }

    public final UiEvent<VerificationRequiredException> component23() {
        return this.verificationRequired;
    }

    public final UiEvent<Unit> component24() {
        return this.googleWalletError;
    }

    /* renamed from: component3, reason: from getter */
    public final CmSunsetExperiment2 getCmSunsetCohort() {
        return this.cmSunsetCohort;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInCmSunsetExperiment() {
        return this.inCmSunsetExperiment;
    }

    public final UiEvent<Unit> component5() {
        return this.reviewChangesContinueClicked;
    }

    public final UiEvent<Unit> component6() {
        return this.optOutClicked;
    }

    public final UiEvent<Boolean> component7() {
        return this.userRequestedShutdown;
    }

    public final UiEvent<Unit> component8() {
        return this.upgradeClicked;
    }

    public final UiEvent<Boolean> component9() {
        return this.cardSelected;
    }

    public final RhyOnboardingViewState copy(UiEvent<CmSunsetExperiment4> experimentLoadComplete, CmSunsetExperiment4 experimentTreatment, CmSunsetExperiment2 cmSunsetCohort, boolean inCmSunsetExperiment, UiEvent<Unit> reviewChangesContinueClicked, UiEvent<Unit> optOutClicked, UiEvent<Boolean> userRequestedShutdown, UiEvent<Unit> upgradeClicked, UiEvent<Boolean> cardSelected, UiEvent<Unit> addressConfirmed, UiEvent<Unit> accountCreatedContinueClicked, String shutdownDate, String migrationBlockReason, UiEvent<Unit> noCmAccountError, UnifiedAccountV2 unifiedAccount, BigDecimal transferChipAmount, UiEvent<Unit> transferClicked, UiEvent<Unit> transferSkipClicked, boolean hasActiveDirectDeposits, UiEvent<Unit> fundingFinishContinueClicked, UiEvent<PaymentCard> directDepositContinueClicked, UiEvent<PushTokenizeRequest> pushTokenizeEvent, UiEvent<VerificationRequiredException> verificationRequired, UiEvent<Unit> googleWalletError) {
        Intrinsics.checkNotNullParameter(experimentTreatment, "experimentTreatment");
        Intrinsics.checkNotNullParameter(cmSunsetCohort, "cmSunsetCohort");
        return new RhyOnboardingViewState(experimentLoadComplete, experimentTreatment, cmSunsetCohort, inCmSunsetExperiment, reviewChangesContinueClicked, optOutClicked, userRequestedShutdown, upgradeClicked, cardSelected, addressConfirmed, accountCreatedContinueClicked, shutdownDate, migrationBlockReason, noCmAccountError, unifiedAccount, transferChipAmount, transferClicked, transferSkipClicked, hasActiveDirectDeposits, fundingFinishContinueClicked, directDepositContinueClicked, pushTokenizeEvent, verificationRequired, googleWalletError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyOnboardingViewState)) {
            return false;
        }
        RhyOnboardingViewState rhyOnboardingViewState = (RhyOnboardingViewState) other;
        return Intrinsics.areEqual(this.experimentLoadComplete, rhyOnboardingViewState.experimentLoadComplete) && this.experimentTreatment == rhyOnboardingViewState.experimentTreatment && this.cmSunsetCohort == rhyOnboardingViewState.cmSunsetCohort && this.inCmSunsetExperiment == rhyOnboardingViewState.inCmSunsetExperiment && Intrinsics.areEqual(this.reviewChangesContinueClicked, rhyOnboardingViewState.reviewChangesContinueClicked) && Intrinsics.areEqual(this.optOutClicked, rhyOnboardingViewState.optOutClicked) && Intrinsics.areEqual(this.userRequestedShutdown, rhyOnboardingViewState.userRequestedShutdown) && Intrinsics.areEqual(this.upgradeClicked, rhyOnboardingViewState.upgradeClicked) && Intrinsics.areEqual(this.cardSelected, rhyOnboardingViewState.cardSelected) && Intrinsics.areEqual(this.addressConfirmed, rhyOnboardingViewState.addressConfirmed) && Intrinsics.areEqual(this.accountCreatedContinueClicked, rhyOnboardingViewState.accountCreatedContinueClicked) && Intrinsics.areEqual(this.shutdownDate, rhyOnboardingViewState.shutdownDate) && Intrinsics.areEqual(this.migrationBlockReason, rhyOnboardingViewState.migrationBlockReason) && Intrinsics.areEqual(this.noCmAccountError, rhyOnboardingViewState.noCmAccountError) && Intrinsics.areEqual(this.unifiedAccount, rhyOnboardingViewState.unifiedAccount) && Intrinsics.areEqual(this.transferChipAmount, rhyOnboardingViewState.transferChipAmount) && Intrinsics.areEqual(this.transferClicked, rhyOnboardingViewState.transferClicked) && Intrinsics.areEqual(this.transferSkipClicked, rhyOnboardingViewState.transferSkipClicked) && this.hasActiveDirectDeposits == rhyOnboardingViewState.hasActiveDirectDeposits && Intrinsics.areEqual(this.fundingFinishContinueClicked, rhyOnboardingViewState.fundingFinishContinueClicked) && Intrinsics.areEqual(this.directDepositContinueClicked, rhyOnboardingViewState.directDepositContinueClicked) && Intrinsics.areEqual(this.pushTokenizeEvent, rhyOnboardingViewState.pushTokenizeEvent) && Intrinsics.areEqual(this.verificationRequired, rhyOnboardingViewState.verificationRequired) && Intrinsics.areEqual(this.googleWalletError, rhyOnboardingViewState.googleWalletError);
    }

    public int hashCode() {
        UiEvent<CmSunsetExperiment4> uiEvent = this.experimentLoadComplete;
        int iHashCode = (((((((uiEvent == null ? 0 : uiEvent.hashCode()) * 31) + this.experimentTreatment.hashCode()) * 31) + this.cmSunsetCohort.hashCode()) * 31) + Boolean.hashCode(this.inCmSunsetExperiment)) * 31;
        UiEvent<Unit> uiEvent2 = this.reviewChangesContinueClicked;
        int iHashCode2 = (iHashCode + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.optOutClicked;
        int iHashCode3 = (iHashCode2 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Boolean> uiEvent4 = this.userRequestedShutdown;
        int iHashCode4 = (iHashCode3 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Unit> uiEvent5 = this.upgradeClicked;
        int iHashCode5 = (iHashCode4 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        UiEvent<Boolean> uiEvent6 = this.cardSelected;
        int iHashCode6 = (iHashCode5 + (uiEvent6 == null ? 0 : uiEvent6.hashCode())) * 31;
        UiEvent<Unit> uiEvent7 = this.addressConfirmed;
        int iHashCode7 = (iHashCode6 + (uiEvent7 == null ? 0 : uiEvent7.hashCode())) * 31;
        UiEvent<Unit> uiEvent8 = this.accountCreatedContinueClicked;
        int iHashCode8 = (iHashCode7 + (uiEvent8 == null ? 0 : uiEvent8.hashCode())) * 31;
        String str = this.shutdownDate;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.migrationBlockReason;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiEvent<Unit> uiEvent9 = this.noCmAccountError;
        int iHashCode11 = (iHashCode10 + (uiEvent9 == null ? 0 : uiEvent9.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode12 = (iHashCode11 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31;
        BigDecimal bigDecimal = this.transferChipAmount;
        int iHashCode13 = (iHashCode12 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        UiEvent<Unit> uiEvent10 = this.transferClicked;
        int iHashCode14 = (iHashCode13 + (uiEvent10 == null ? 0 : uiEvent10.hashCode())) * 31;
        UiEvent<Unit> uiEvent11 = this.transferSkipClicked;
        int iHashCode15 = (((iHashCode14 + (uiEvent11 == null ? 0 : uiEvent11.hashCode())) * 31) + Boolean.hashCode(this.hasActiveDirectDeposits)) * 31;
        UiEvent<Unit> uiEvent12 = this.fundingFinishContinueClicked;
        int iHashCode16 = (iHashCode15 + (uiEvent12 == null ? 0 : uiEvent12.hashCode())) * 31;
        UiEvent<PaymentCard> uiEvent13 = this.directDepositContinueClicked;
        int iHashCode17 = (iHashCode16 + (uiEvent13 == null ? 0 : uiEvent13.hashCode())) * 31;
        UiEvent<PushTokenizeRequest> uiEvent14 = this.pushTokenizeEvent;
        int iHashCode18 = (iHashCode17 + (uiEvent14 == null ? 0 : uiEvent14.hashCode())) * 31;
        UiEvent<VerificationRequiredException> uiEvent15 = this.verificationRequired;
        int iHashCode19 = (iHashCode18 + (uiEvent15 == null ? 0 : uiEvent15.hashCode())) * 31;
        UiEvent<Unit> uiEvent16 = this.googleWalletError;
        return iHashCode19 + (uiEvent16 != null ? uiEvent16.hashCode() : 0);
    }

    public String toString() {
        return "RhyOnboardingViewState(experimentLoadComplete=" + this.experimentLoadComplete + ", experimentTreatment=" + this.experimentTreatment + ", cmSunsetCohort=" + this.cmSunsetCohort + ", inCmSunsetExperiment=" + this.inCmSunsetExperiment + ", reviewChangesContinueClicked=" + this.reviewChangesContinueClicked + ", optOutClicked=" + this.optOutClicked + ", userRequestedShutdown=" + this.userRequestedShutdown + ", upgradeClicked=" + this.upgradeClicked + ", cardSelected=" + this.cardSelected + ", addressConfirmed=" + this.addressConfirmed + ", accountCreatedContinueClicked=" + this.accountCreatedContinueClicked + ", shutdownDate=" + this.shutdownDate + ", migrationBlockReason=" + this.migrationBlockReason + ", noCmAccountError=" + this.noCmAccountError + ", unifiedAccount=" + this.unifiedAccount + ", transferChipAmount=" + this.transferChipAmount + ", transferClicked=" + this.transferClicked + ", transferSkipClicked=" + this.transferSkipClicked + ", hasActiveDirectDeposits=" + this.hasActiveDirectDeposits + ", fundingFinishContinueClicked=" + this.fundingFinishContinueClicked + ", directDepositContinueClicked=" + this.directDepositContinueClicked + ", pushTokenizeEvent=" + this.pushTokenizeEvent + ", verificationRequired=" + this.verificationRequired + ", googleWalletError=" + this.googleWalletError + ")";
    }

    public RhyOnboardingViewState(UiEvent<CmSunsetExperiment4> uiEvent, CmSunsetExperiment4 experimentTreatment, CmSunsetExperiment2 cmSunsetCohort, boolean z, UiEvent<Unit> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Boolean> uiEvent4, UiEvent<Unit> uiEvent5, UiEvent<Boolean> uiEvent6, UiEvent<Unit> uiEvent7, UiEvent<Unit> uiEvent8, String str, String str2, UiEvent<Unit> uiEvent9, UnifiedAccountV2 unifiedAccountV2, BigDecimal bigDecimal, UiEvent<Unit> uiEvent10, UiEvent<Unit> uiEvent11, boolean z2, UiEvent<Unit> uiEvent12, UiEvent<PaymentCard> uiEvent13, UiEvent<PushTokenizeRequest> uiEvent14, UiEvent<VerificationRequiredException> uiEvent15, UiEvent<Unit> uiEvent16) {
        Intrinsics.checkNotNullParameter(experimentTreatment, "experimentTreatment");
        Intrinsics.checkNotNullParameter(cmSunsetCohort, "cmSunsetCohort");
        this.experimentLoadComplete = uiEvent;
        this.experimentTreatment = experimentTreatment;
        this.cmSunsetCohort = cmSunsetCohort;
        this.inCmSunsetExperiment = z;
        this.reviewChangesContinueClicked = uiEvent2;
        this.optOutClicked = uiEvent3;
        this.userRequestedShutdown = uiEvent4;
        this.upgradeClicked = uiEvent5;
        this.cardSelected = uiEvent6;
        this.addressConfirmed = uiEvent7;
        this.accountCreatedContinueClicked = uiEvent8;
        this.shutdownDate = str;
        this.migrationBlockReason = str2;
        this.noCmAccountError = uiEvent9;
        this.unifiedAccount = unifiedAccountV2;
        this.transferChipAmount = bigDecimal;
        this.transferClicked = uiEvent10;
        this.transferSkipClicked = uiEvent11;
        this.hasActiveDirectDeposits = z2;
        this.fundingFinishContinueClicked = uiEvent12;
        this.directDepositContinueClicked = uiEvent13;
        this.pushTokenizeEvent = uiEvent14;
        this.verificationRequired = uiEvent15;
        this.googleWalletError = uiEvent16;
    }

    public final UiEvent<CmSunsetExperiment4> getExperimentLoadComplete() {
        return this.experimentLoadComplete;
    }

    public /* synthetic */ RhyOnboardingViewState(UiEvent uiEvent, CmSunsetExperiment4 cmSunsetExperiment4, CmSunsetExperiment2 cmSunsetExperiment2, boolean z, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, UiEvent uiEvent7, UiEvent uiEvent8, String str, String str2, UiEvent uiEvent9, UnifiedAccountV2 unifiedAccountV2, BigDecimal bigDecimal, UiEvent uiEvent10, UiEvent uiEvent11, boolean z2, UiEvent uiEvent12, UiEvent uiEvent13, UiEvent uiEvent14, UiEvent uiEvent15, UiEvent uiEvent16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? CmSunsetExperiment4.CONTROL : cmSunsetExperiment4, (i & 4) != 0 ? CmSunsetExperiment2.CONTROL : cmSunsetExperiment2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : uiEvent3, (i & 64) != 0 ? null : uiEvent4, (i & 128) != 0 ? null : uiEvent5, (i & 256) != 0 ? null : uiEvent6, (i & 512) != 0 ? null : uiEvent7, (i & 1024) != 0 ? null : uiEvent8, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : str2, (i & 8192) != 0 ? null : uiEvent9, (i & 16384) != 0 ? null : unifiedAccountV2, (i & 32768) != 0 ? null : bigDecimal, (i & 65536) != 0 ? null : uiEvent10, (i & 131072) != 0 ? null : uiEvent11, (i & 262144) != 0 ? false : z2, (i & 524288) != 0 ? null : uiEvent12, (i & 1048576) != 0 ? null : uiEvent13, (i & 2097152) != 0 ? null : uiEvent14, (i & 4194304) != 0 ? null : uiEvent15, (i & 8388608) != 0 ? null : uiEvent16);
    }

    public final CmSunsetExperiment4 getExperimentTreatment() {
        return this.experimentTreatment;
    }

    public final CmSunsetExperiment2 getCmSunsetCohort() {
        return this.cmSunsetCohort;
    }

    public final boolean getInCmSunsetExperiment() {
        return this.inCmSunsetExperiment;
    }

    public final UiEvent<Unit> getReviewChangesContinueClicked() {
        return this.reviewChangesContinueClicked;
    }

    public final UiEvent<Unit> getOptOutClicked() {
        return this.optOutClicked;
    }

    public final UiEvent<Boolean> getUserRequestedShutdown() {
        return this.userRequestedShutdown;
    }

    public final UiEvent<Unit> getUpgradeClicked() {
        return this.upgradeClicked;
    }

    public final UiEvent<Boolean> getCardSelected() {
        return this.cardSelected;
    }

    public final UiEvent<Unit> getAddressConfirmed() {
        return this.addressConfirmed;
    }

    public final UiEvent<Unit> getAccountCreatedContinueClicked() {
        return this.accountCreatedContinueClicked;
    }

    public final String getShutdownDate() {
        return this.shutdownDate;
    }

    public final String getMigrationBlockReason() {
        return this.migrationBlockReason;
    }

    public final UiEvent<Unit> getNoCmAccountError() {
        return this.noCmAccountError;
    }

    public final UiEvent<Unit> getTransferClicked() {
        return this.transferClicked;
    }

    public final UiEvent<Unit> getTransferSkipClicked() {
        return this.transferSkipClicked;
    }

    public final boolean getHasActiveDirectDeposits() {
        return this.hasActiveDirectDeposits;
    }

    public final UiEvent<Unit> getFundingFinishContinueClicked() {
        return this.fundingFinishContinueClicked;
    }

    public final UiEvent<PushTokenizeRequest> getPushTokenizeEvent() {
        return this.pushTokenizeEvent;
    }

    public final UiEvent<VerificationRequiredException> getVerificationRequired() {
        return this.verificationRequired;
    }

    public final UiEvent<Unit> getGoogleWalletError() {
        return this.googleWalletError;
    }

    public final TransferConfiguration getTransferConfig() {
        UiEvent<Unit> uiEvent;
        TransferConfiguration.TransferAccountSelection transferAccountSelection;
        TransferConfiguration.Standard standard = null;
        if (this.transferChipAmount != null && ((uiEvent = this.transferClicked) == null || !uiEvent.getConsumed())) {
            UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
            if ((unifiedAccountV2 != null ? unifiedAccountV2.getWithdrawableCash() : null) != null) {
                UiEvent<Unit> uiEvent2 = this.transferClicked;
                if (uiEvent2 != null) {
                    uiEvent2.consume();
                }
                BigDecimal bigDecimal = this.transferChipAmount;
                if (this.unifiedAccount.getWithdrawableCash().getDecimalValue().compareTo(this.transferChipAmount) >= 0) {
                    transferAccountSelection = new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHS, 3, null);
                } else {
                    transferAccountSelection = new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null);
                }
                standard = new TransferConfiguration.Standard(bigDecimal, null, false, transferAccountSelection, new TransferConfiguration.TransferAccountSelection(null, true, ApiTransferAccount.TransferAccountType.RHY, 1, null), null, null, null, false, false, null, null, false, 8166, null);
            }
        }
        return standard;
    }

    public final UiEvent<Boolean> getContinueToAddToVirtualWallet() {
        UiEvent<PaymentCard> uiEvent = this.directDepositContinueClicked;
        PaymentCard paymentCardConsume = uiEvent != null ? uiEvent.consume() : null;
        if (paymentCardConsume == null) {
            return null;
        }
        if (!paymentCardConsume.getCanActivate()) {
            return new UiEvent<>(Boolean.TRUE);
        }
        return new UiEvent<>(Boolean.FALSE);
    }
}
