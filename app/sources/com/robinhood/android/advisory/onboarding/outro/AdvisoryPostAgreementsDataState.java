package com.robinhood.android.advisory.onboarding.outro;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.advisory.contracts.AdvisoryPostCreationFundingMethodsKey;
import com.robinhood.android.advisory.dashboard.ManagedDashboardKey;
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsViewState;
import com.robinhood.android.advisory.onboarding.outro.FirstDepositNumberVisual;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransfer;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.bonfire.onboardingswipetosubmit.UiGetAdvisorySwipeToSubmitDetails;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryPostAgreementsDataState.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002[\\B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010J\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\rHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010Q\u001a\u00020\nHÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\t\u0010T\u001a\u00020\nHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J§\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010W\u001a\u00020\n2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020\rHÖ\u0001J\t\u0010Z\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0016\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\"R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0014\u0010/\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\"R\u0014\u00101\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\"R\u0014\u00107\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\"R\u0014\u00109\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010=\u001a\u0004\u0018\u00010:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u0004\u0018\u00010:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010<R\u0016\u0010E\u001a\u0004\u0018\u00010:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010<R\u0014\u0010G\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\"¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "accountNumber", "", "fundingMethodEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "enoughTimeHasPassedToMoveToDepositSubmission", "", "enoughTimeHasPassedToShowRefreshState", "retryCount", "", "fundingConfig", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "swipeToSubmitDetails", "Lcom/robinhood/models/ui/bonfire/onboardingswipetosubmit/UiGetAdvisorySwipeToSubmitDetails;", "submittingDeposit", "depositSubmittedSuccessfully", "isInLoadingAnimationExperiment", "isInAdvisoryInstantExperiment", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Context;ZZILcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/ui/bonfire/onboardingswipetosubmit/UiGetAdvisorySwipeToSubmitDetails;ZZZZLjava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getAccountNumber", "()Ljava/lang/String;", "getFundingMethodEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getEnoughTimeHasPassedToMoveToDepositSubmission", "()Z", "getEnoughTimeHasPassedToShowRefreshState", "getRetryCount", "()I", "getFundingConfig", "()Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", "getSinkAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSwipeToSubmitDetails", "()Lcom/robinhood/models/ui/bonfire/onboardingswipetosubmit/UiGetAdvisorySwipeToSubmitDetails;", "getSubmittingDeposit", "getDepositSubmittedSuccessfully", "getLoggingSource", "showErrorState", "getShowErrorState", "loadingState", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState$LoadingState;", "getLoadingState", "()Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState$LoadingState;", "showCloseIcon", "getShowCloseIcon", "showRefreshButton", "getShowRefreshButton", "loadingTitle", "Lcom/robinhood/utils/resource/StringResource;", "getLoadingTitle", "()Lcom/robinhood/utils/resource/StringResource;", "loadingSubtitle", "getLoadingSubtitle", "loadingHeaderIcon", "Lcom/robinhood/android/advisory/onboarding/outro/HeaderIcon;", "getLoadingHeaderIcon", "()Lcom/robinhood/android/advisory/onboarding/outro/HeaderIcon;", "swipeToSubmitFooterTitle", "getSwipeToSubmitFooterTitle", "swipeToSubmitFooterDescription", "getSwipeToSubmitFooterDescription", "isIraToIraCashTransfer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "LoadingState", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryPostAgreementsDataState {
    private static final int MIN_RETRIES_TO_ERROR = 1;
    private final String accountNumber;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean depositSubmittedSuccessfully;
    private final boolean enoughTimeHasPassedToMoveToDepositSubmission;
    private final boolean enoughTimeHasPassedToShowRefreshState;
    private final AdvisoryFirstDepositConfig fundingConfig;
    private final Context fundingMethodEventContext;
    private final boolean isInAdvisoryInstantExperiment;
    private final boolean isInLoadingAnimationExperiment;
    private final String loggingSource;
    private final int retryCount;
    private final TransferAccount sinkAccount;
    private final boolean submittingDeposit;
    private final UiGetAdvisorySwipeToSubmitDetails swipeToSubmitDetails;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvisoryPostAgreementsDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[LoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadingState.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSubmittingDeposit() {
        return this.submittingDeposit;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getDepositSubmittedSuccessfully() {
        return this.depositSubmittedSuccessfully;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsInLoadingAnimationExperiment() {
        return this.isInLoadingAnimationExperiment;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsInAdvisoryInstantExperiment() {
        return this.isInAdvisoryInstantExperiment;
    }

    /* renamed from: component14, reason: from getter */
    public final String getLoggingSource() {
        return this.loggingSource;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final Context getFundingMethodEventContext() {
        return this.fundingMethodEventContext;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnoughTimeHasPassedToMoveToDepositSubmission() {
        return this.enoughTimeHasPassedToMoveToDepositSubmission;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnoughTimeHasPassedToShowRefreshState() {
        return this.enoughTimeHasPassedToShowRefreshState;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component7, reason: from getter */
    public final AdvisoryFirstDepositConfig getFundingConfig() {
        return this.fundingConfig;
    }

    /* renamed from: component8, reason: from getter */
    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component9, reason: from getter */
    public final UiGetAdvisorySwipeToSubmitDetails getSwipeToSubmitDetails() {
        return this.swipeToSubmitDetails;
    }

    public final AdvisoryPostAgreementsDataState copy(BrokerageAccountType brokerageAccountType, String accountNumber, Context fundingMethodEventContext, boolean enoughTimeHasPassedToMoveToDepositSubmission, boolean enoughTimeHasPassedToShowRefreshState, int retryCount, AdvisoryFirstDepositConfig fundingConfig, TransferAccount sinkAccount, UiGetAdvisorySwipeToSubmitDetails swipeToSubmitDetails, boolean submittingDeposit, boolean depositSubmittedSuccessfully, boolean isInLoadingAnimationExperiment, boolean isInAdvisoryInstantExperiment, String loggingSource) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        return new AdvisoryPostAgreementsDataState(brokerageAccountType, accountNumber, fundingMethodEventContext, enoughTimeHasPassedToMoveToDepositSubmission, enoughTimeHasPassedToShowRefreshState, retryCount, fundingConfig, sinkAccount, swipeToSubmitDetails, submittingDeposit, depositSubmittedSuccessfully, isInLoadingAnimationExperiment, isInAdvisoryInstantExperiment, loggingSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryPostAgreementsDataState)) {
            return false;
        }
        AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) other;
        return this.brokerageAccountType == advisoryPostAgreementsDataState.brokerageAccountType && Intrinsics.areEqual(this.accountNumber, advisoryPostAgreementsDataState.accountNumber) && Intrinsics.areEqual(this.fundingMethodEventContext, advisoryPostAgreementsDataState.fundingMethodEventContext) && this.enoughTimeHasPassedToMoveToDepositSubmission == advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission && this.enoughTimeHasPassedToShowRefreshState == advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState && this.retryCount == advisoryPostAgreementsDataState.retryCount && Intrinsics.areEqual(this.fundingConfig, advisoryPostAgreementsDataState.fundingConfig) && Intrinsics.areEqual(this.sinkAccount, advisoryPostAgreementsDataState.sinkAccount) && Intrinsics.areEqual(this.swipeToSubmitDetails, advisoryPostAgreementsDataState.swipeToSubmitDetails) && this.submittingDeposit == advisoryPostAgreementsDataState.submittingDeposit && this.depositSubmittedSuccessfully == advisoryPostAgreementsDataState.depositSubmittedSuccessfully && this.isInLoadingAnimationExperiment == advisoryPostAgreementsDataState.isInLoadingAnimationExperiment && this.isInAdvisoryInstantExperiment == advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment && Intrinsics.areEqual(this.loggingSource, advisoryPostAgreementsDataState.loggingSource);
    }

    public int hashCode() {
        int iHashCode = this.brokerageAccountType.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Context context = this.fundingMethodEventContext;
        int iHashCode3 = (((((((iHashCode2 + (context == null ? 0 : context.hashCode())) * 31) + Boolean.hashCode(this.enoughTimeHasPassedToMoveToDepositSubmission)) * 31) + Boolean.hashCode(this.enoughTimeHasPassedToShowRefreshState)) * 31) + Integer.hashCode(this.retryCount)) * 31;
        AdvisoryFirstDepositConfig advisoryFirstDepositConfig = this.fundingConfig;
        int iHashCode4 = (iHashCode3 + (advisoryFirstDepositConfig == null ? 0 : advisoryFirstDepositConfig.hashCode())) * 31;
        TransferAccount transferAccount = this.sinkAccount;
        int iHashCode5 = (iHashCode4 + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        UiGetAdvisorySwipeToSubmitDetails uiGetAdvisorySwipeToSubmitDetails = this.swipeToSubmitDetails;
        int iHashCode6 = (((((((((iHashCode5 + (uiGetAdvisorySwipeToSubmitDetails == null ? 0 : uiGetAdvisorySwipeToSubmitDetails.hashCode())) * 31) + Boolean.hashCode(this.submittingDeposit)) * 31) + Boolean.hashCode(this.depositSubmittedSuccessfully)) * 31) + Boolean.hashCode(this.isInLoadingAnimationExperiment)) * 31) + Boolean.hashCode(this.isInAdvisoryInstantExperiment)) * 31;
        String str2 = this.loggingSource;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AdvisoryPostAgreementsDataState(brokerageAccountType=" + this.brokerageAccountType + ", accountNumber=" + this.accountNumber + ", fundingMethodEventContext=" + this.fundingMethodEventContext + ", enoughTimeHasPassedToMoveToDepositSubmission=" + this.enoughTimeHasPassedToMoveToDepositSubmission + ", enoughTimeHasPassedToShowRefreshState=" + this.enoughTimeHasPassedToShowRefreshState + ", retryCount=" + this.retryCount + ", fundingConfig=" + this.fundingConfig + ", sinkAccount=" + this.sinkAccount + ", swipeToSubmitDetails=" + this.swipeToSubmitDetails + ", submittingDeposit=" + this.submittingDeposit + ", depositSubmittedSuccessfully=" + this.depositSubmittedSuccessfully + ", isInLoadingAnimationExperiment=" + this.isInLoadingAnimationExperiment + ", isInAdvisoryInstantExperiment=" + this.isInAdvisoryInstantExperiment + ", loggingSource=" + this.loggingSource + ")";
    }

    public AdvisoryPostAgreementsDataState(BrokerageAccountType brokerageAccountType, String str, Context context, boolean z, boolean z2, int i, AdvisoryFirstDepositConfig advisoryFirstDepositConfig, TransferAccount transferAccount, UiGetAdvisorySwipeToSubmitDetails uiGetAdvisorySwipeToSubmitDetails, boolean z3, boolean z4, boolean z5, boolean z6, String str2) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.brokerageAccountType = brokerageAccountType;
        this.accountNumber = str;
        this.fundingMethodEventContext = context;
        this.enoughTimeHasPassedToMoveToDepositSubmission = z;
        this.enoughTimeHasPassedToShowRefreshState = z2;
        this.retryCount = i;
        this.fundingConfig = advisoryFirstDepositConfig;
        this.sinkAccount = transferAccount;
        this.swipeToSubmitDetails = uiGetAdvisorySwipeToSubmitDetails;
        this.submittingDeposit = z3;
        this.depositSubmittedSuccessfully = z4;
        this.isInLoadingAnimationExperiment = z5;
        this.isInAdvisoryInstantExperiment = z6;
        this.loggingSource = str2;
    }

    public /* synthetic */ AdvisoryPostAgreementsDataState(BrokerageAccountType brokerageAccountType, String str, Context context, boolean z, boolean z2, int i, AdvisoryFirstDepositConfig advisoryFirstDepositConfig, TransferAccount transferAccount, UiGetAdvisorySwipeToSubmitDetails uiGetAdvisorySwipeToSubmitDetails, boolean z3, boolean z4, boolean z5, boolean z6, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(brokerageAccountType, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : context, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : advisoryFirstDepositConfig, (i2 & 128) != 0 ? null : transferAccount, (i2 & 256) != 0 ? null : uiGetAdvisorySwipeToSubmitDetails, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? false : z4, (i2 & 2048) != 0 ? false : z5, (i2 & 4096) == 0 ? z6 : false, (i2 & 8192) != 0 ? null : str2);
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Context getFundingMethodEventContext() {
        return this.fundingMethodEventContext;
    }

    public final boolean getEnoughTimeHasPassedToMoveToDepositSubmission() {
        return this.enoughTimeHasPassedToMoveToDepositSubmission;
    }

    public final boolean getEnoughTimeHasPassedToShowRefreshState() {
        return this.enoughTimeHasPassedToShowRefreshState;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final AdvisoryFirstDepositConfig getFundingConfig() {
        return this.fundingConfig;
    }

    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final UiGetAdvisorySwipeToSubmitDetails getSwipeToSubmitDetails() {
        return this.swipeToSubmitDetails;
    }

    public final boolean getSubmittingDeposit() {
        return this.submittingDeposit;
    }

    public final boolean getDepositSubmittedSuccessfully() {
        return this.depositSubmittedSuccessfully;
    }

    public final boolean isInLoadingAnimationExperiment() {
        return this.isInLoadingAnimationExperiment;
    }

    public final boolean isInAdvisoryInstantExperiment() {
        return this.isInAdvisoryInstantExperiment;
    }

    public final String getLoggingSource() {
        return this.loggingSource;
    }

    private final boolean getShowErrorState() {
        return this.retryCount >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingState getLoadingState() {
        return !this.enoughTimeHasPassedToShowRefreshState ? LoadingState.LOADING : getShowErrorState() ? LoadingState.ERROR : LoadingState.REFRESH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShowCloseIcon() {
        return CollectionsKt.listOf((Object[]) new LoadingState[]{LoadingState.REFRESH, LoadingState.ERROR}).contains(getLoadingState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShowRefreshButton() {
        return CollectionsKt.listOf((Object[]) new LoadingState[]{LoadingState.REFRESH, LoadingState.ERROR}).contains(getLoadingState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringResource getLoadingTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[getLoadingState().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C8825R.string.account_loading_under_animation_text, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C8825R.string.account_loading_something_went_wrong_title, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C8825R.string.account_loading_refresh_title, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringResource getLoadingSubtitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[getLoadingState().ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C8825R.string.account_loading_refresh_subtitle, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AdvisoryFirstDepositConfig advisoryFirstDepositConfig = this.fundingConfig;
        if ((advisoryFirstDepositConfig instanceof AdvisoryFirstDepositConfig.Transfer ? (AdvisoryFirstDepositConfig.Transfer) advisoryFirstDepositConfig : null) != null) {
            return StringResource.INSTANCE.invoke(C8825R.string.account_loading_refresh_subtitle_cash_transfers, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C8825R.string.account_loading_refresh_subtitle_asset_transfers, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderIcon getLoadingHeaderIcon() {
        if (!this.isInLoadingAnimationExperiment) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getLoadingState().ordinal()];
        if (i == 1) {
            return new HeaderIcon(ServerToBentoAssetMapper2.ROBINHOOD_24, true);
        }
        if (i == 2) {
            return new HeaderIcon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, false);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new HeaderIcon(ServerToBentoAssetMapper2.CLOCK_24, false);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvisoryPostAgreementsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState$LoadingState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "REFRESH", "ERROR", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class LoadingState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState LOADING = new LoadingState("LOADING", 0);
        public static final LoadingState REFRESH = new LoadingState("REFRESH", 1);
        public static final LoadingState ERROR = new LoadingState("ERROR", 2);

        private static final /* synthetic */ LoadingState[] $values() {
            return new LoadingState[]{LOADING, REFRESH, ERROR};
        }

        public static EnumEntries<LoadingState> getEntries() {
            return $ENTRIES;
        }

        private LoadingState(String str, int i) {
        }

        static {
            LoadingState[] loadingStateArr$values = $values();
            $VALUES = loadingStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(loadingStateArr$values);
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringResource getSwipeToSubmitFooterTitle() {
        String footerTitle;
        UiGetAdvisorySwipeToSubmitDetails uiGetAdvisorySwipeToSubmitDetails = this.swipeToSubmitDetails;
        if (uiGetAdvisorySwipeToSubmitDetails == null || (footerTitle = uiGetAdvisorySwipeToSubmitDetails.getFooterTitle()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(footerTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringResource getSwipeToSubmitFooterDescription() {
        String footerSubtitleMarkdown;
        UiGetAdvisorySwipeToSubmitDetails uiGetAdvisorySwipeToSubmitDetails = this.swipeToSubmitDetails;
        if (uiGetAdvisorySwipeToSubmitDetails == null || (footerSubtitleMarkdown = uiGetAdvisorySwipeToSubmitDetails.getFooterSubtitleMarkdown()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(footerSubtitleMarkdown);
    }

    private final boolean isIraToIraCashTransfer() {
        AdvisoryFirstDepositConfig advisoryFirstDepositConfig = this.fundingConfig;
        AdvisoryFirstDepositConfig.Transfer transfer = advisoryFirstDepositConfig instanceof AdvisoryFirstDepositConfig.Transfer ? (AdvisoryFirstDepositConfig.Transfer) advisoryFirstDepositConfig : null;
        if (transfer == null) {
            return false;
        }
        return (this.brokerageAccountType == BrokerageAccountType.IRA_ROTH && transfer.getSourceAccount().getType() == ApiTransferAccount.TransferAccountType.IRA_ROTH) || (this.brokerageAccountType == BrokerageAccountType.IRA_TRADITIONAL && transfer.getSourceAccount().getType() == ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL);
    }

    /* compiled from: AdvisoryPostAgreementsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;", "<init>", "()V", "MIN_RETRIES_TO_ERROR", "", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<AdvisoryPostAgreementsDataState, AdvisoryPostAgreementsViewState> {

        /* compiled from: AdvisoryPostAgreementsDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadingState.values().length];
                try {
                    iArr[LoadingState.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadingState.REFRESH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LoadingState.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AdvisoryPostAgreementsViewState reduce(AdvisoryPostAgreementsDataState dataState) {
            String str;
            FirstDepositNumberVisual retirement;
            IntentKey internalAssetTransfer;
            HostIntentKey.ShowFragmentInStandaloneRdsActivity showFragmentInStandaloneRdsActivity;
            int i;
            StringResource stringResourceInvoke;
            int i2;
            String str2;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            AdvisoryFirstDepositConfig fundingConfig = dataState.getFundingConfig();
            AdvisoryFirstDepositConfig.Transfer transfer = fundingConfig instanceof AdvisoryFirstDepositConfig.Transfer ? (AdvisoryFirstDepositConfig.Transfer) fundingConfig : null;
            Context fundingMethodEventContext = dataState.getFundingMethodEventContext();
            Context context = fundingMethodEventContext == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : fundingMethodEventContext;
            String loggingSource = dataState.getLoggingSource();
            str = "";
            Context contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, loggingSource == null ? "" : loggingSource, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
            boolean z = dataState.getFundingConfig() instanceof AdvisoryFirstDepositConfig.IraMigration;
            if (dataState.getAccountNumber() != null && (dataState.getDepositSubmittedSuccessfully() || z)) {
                IntentKey intentKeyBuildManagedDashboardKey = ManagedDashboardKey.buildManagedDashboardKey(dataState.getAccountNumber(), dataState.getBrokerageAccountType());
                if (z) {
                    String loggingSource2 = dataState.getLoggingSource();
                    if (loggingSource2 == null) {
                        loggingSource2 = "";
                    }
                    internalAssetTransfer = new InternalAssetTransfer(loggingSource2, true, dataState.getBrokerageAccountType(), new InternalAssetTransfer.PreselectedAccounts(((AdvisoryFirstDepositConfig.IraMigration) dataState.getFundingConfig()).getSelfDirectedAccountNumber(), dataState.getAccountNumber()));
                } else {
                    internalAssetTransfer = intentKeyBuildManagedDashboardKey;
                }
                if (z) {
                    String accountNumber = dataState.getAccountNumber();
                    BrokerageAccountType brokerageAccountType = dataState.getBrokerageAccountType();
                    String loggingSource3 = dataState.getLoggingSource();
                    showFragmentInStandaloneRdsActivity = new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new AdvisoryPostCreationFundingMethodsKey(accountNumber, brokerageAccountType, loggingSource3 != null ? loggingSource3 : ""), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                } else {
                    showFragmentInStandaloneRdsActivity = null;
                }
                StringResource.Companion companion = StringResource.INSTANCE;
                if (z) {
                    i = C8825R.string.advisory_ira_migration_celebration_title;
                } else {
                    i = C8825R.string.advisory_first_deposit_submission_confirmation_title;
                }
                StringResource stringResourceInvoke2 = companion.invoke(i, new Object[0]);
                if (z) {
                    stringResourceInvoke = companion.invoke(C8825R.string.advisory_ira_migration_celebration_subtitle, AccountDisplayNames.getDisplayName$default(dataState.getBrokerageAccountType(), ManagementType.SELF_DIRECTED, null, 4, null).getShort().getInSentence());
                } else {
                    stringResourceInvoke = companion.invoke(C8825R.string.advisory_first_deposit_submission_confirmation_subtitle, new Object[0]);
                }
                StringResource stringResource = stringResourceInvoke;
                if (z) {
                    i2 = C11048R.string.general_label_continue;
                } else {
                    i2 = C8825R.string.advisory_first_deposit_submission_confirmation_cta;
                }
                StringResource stringResourceInvoke3 = companion.invoke(i2, new Object[0]);
                if (z) {
                    str2 = "continue_to_iat";
                } else {
                    str2 = "view_account";
                }
                return new AdvisoryPostAgreementsViewState.Celebration(intentKeyBuildManagedDashboardKey, internalAssetTransfer, stringResourceInvoke2, stringResource, stringResourceInvoke3, str2, showFragmentInStandaloneRdsActivity, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_ONBOARDING_FIRST_DEPOSIT_CELEBRATION, null, null, null, 14, null), null, contextCopy$default, null, null, 53, null));
            }
            if (!dataState.getEnoughTimeHasPassedToMoveToDepositSubmission() || dataState.getSinkAccount() == null || dataState.getAccountNumber() == null || transfer == null) {
                StringResource loadingTitle = dataState.getLoadingTitle();
                StringResource loadingSubtitle = dataState.getLoadingSubtitle();
                HeaderIcon loadingHeaderIcon = dataState.getLoadingHeaderIcon();
                boolean showCloseIcon = dataState.getShowCloseIcon();
                boolean showRefreshButton = dataState.getShowRefreshButton();
                int i3 = WhenMappings.$EnumSwitchMapping$0[dataState.getLoadingState().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        str = "first_timeout";
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "second_timeout";
                    }
                }
                return new AdvisoryPostAgreementsViewState.LoadingAccount(new AccountLoadingScreenState(loadingTitle, loadingSubtitle, loadingHeaderIcon, showCloseIcon, showRefreshButton, str), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_ONBOARDING_FETCH_ACCOUNT, null, null, null, 14, null), null, contextCopy$default, null, null, 53, null));
            }
            String accountNumber2 = dataState.getAccountNumber();
            BrokerageAccountType brokerageAccountType2 = dataState.getBrokerageAccountType();
            TransferAccount sinkAccount = dataState.getSinkAccount();
            StringResource swipeToSubmitFooterTitle = dataState.getSwipeToSubmitFooterTitle();
            StringResource swipeToSubmitFooterDescription = dataState.getSwipeToSubmitFooterDescription();
            if (transfer instanceof AdvisoryFirstDepositConfig.Transfer.Retirement) {
                retirement = new FirstDepositNumberVisual.Retirement(((AdvisoryFirstDepositConfig.Transfer.Retirement) transfer).getContributionRingPercentage());
            } else {
                if (!(transfer instanceof AdvisoryFirstDepositConfig.Transfer.Deposit)) {
                    throw new NoWhenBranchMatchedException();
                }
                retirement = FirstDepositNumberVisual.Deposit.INSTANCE;
            }
            return new AdvisoryPostAgreementsViewState.FirstDepositSubmission(accountNumber2, brokerageAccountType2, sinkAccount, transfer, swipeToSubmitFooterTitle, swipeToSubmitFooterDescription, retirement, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_ONBOARDING_SUBMIT_DEPOSIT, null, null, null, 14, null), null, contextCopy$default, null, null, 53, null));
        }
    }
}
