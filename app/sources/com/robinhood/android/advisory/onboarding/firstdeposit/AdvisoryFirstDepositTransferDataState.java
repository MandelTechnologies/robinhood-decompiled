package com.robinhood.android.advisory.onboarding.firstdeposit;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferViewState2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel2;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.formats.crypto.MoneyInputFormatting;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import defpackage.TransferAccountListConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryFirstDepositTransferDataState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002]^B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\fHÆ\u0003J\t\u0010P\u001a\u00020\fHÆ\u0003J\t\u0010Q\u001a\u00020\u000fHÆ\u0003J\t\u0010R\u001a\u00020\u0011HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0097\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010X\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020[HÖ\u0001J\t\u0010\\\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0016\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\"R\u0014\u00107\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\"R\u0011\u00109\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b:\u0010\"R\u0013\u0010;\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010D\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00104R\u0014\u0010F\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010H\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010%¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;", "", "minimumDeposit", "Lcom/robinhood/models/util/Money;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;", "preselectedAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "source", "", "amountString", "shakeAmountText", "", "shakeMinAmountLabelText", "mode", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState$Mode;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "transferAccounts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "selectedTransferAccountId", "inFundingV3Experiment", "summaryResponse", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState$Mode;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZLcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;)V", "getMinimumDeposit", "()Lcom/robinhood/models/util/Money;", "getViewModel", "()Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;", "getPreselectedAccountInfo", "()Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "getSource", "()Ljava/lang/String;", "getAmountString", "getShakeAmountText", "()Z", "getShakeMinAmountLabelText", "getMode", "()Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState$Mode;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getTransferAccounts", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedTransferAccountId", "getInFundingV3Experiment", "getSummaryResponse", "()Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "confirmedAmountString", "getConfirmedAmountString", "editModeAmountString", "getEditModeAmountString", "amountStringFormatted", "getAmountStringFormatted", "sourceTransferAccount", "getSourceTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "destinationTransferAccountName", "Lcom/robinhood/utils/resource/StringResource;", "getDestinationTransferAccountName", "()Lcom/robinhood/utils/resource/StringResource;", "selectedTransferAccountName", "getSelectedTransferAccountName", "minimumAmountToGetStocks", "getMinimumAmountToGetStocks", "amountInfoLabel", "getAmountInfoLabel", "lockSourceTransferAccount", "getLockSourceTransferAccount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "Mode", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryFirstDepositTransferDataState {
    private static final int TRANSFER_ACCOUNT_DISPLAY_NAME_MAX_LENGTH = 28;
    private final String amountString;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean inFundingV3Experiment;
    private final Money minimumDeposit;
    private final Mode mode;
    private final TransferAccountInfo preselectedAccountInfo;
    private final String selectedTransferAccountId;
    private final boolean shakeAmountText;
    private final boolean shakeMinAmountLabelText;
    private final String source;
    private final ApiTransferSummaryResponse summaryResponse;
    private final ImmutableList<TransferAccount> transferAccounts;
    private final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<ApiTransferAccount.TransferAccountType> ALLOWED_TRANSFER_TYPES = CollectionsKt.listOf((Object[]) new ApiTransferAccount.TransferAccountType[]{ApiTransferAccount.TransferAccountType.ACH, ApiTransferAccount.TransferAccountType.RHS, ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS, ApiTransferAccount.TransferAccountType.RHY, ApiTransferAccount.TransferAccountType.DEBIT_CARD});

    /* compiled from: AdvisoryFirstDepositTransferDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ AdvisoryFirstDepositTransferDataState copy$default(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Money money, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel moneyTransferViewModel, TransferAccountInfo transferAccountInfo, String str, String str2, boolean z, boolean z2, Mode mode, BrokerageAccountType brokerageAccountType, ImmutableList immutableList, String str3, boolean z3, ApiTransferSummaryResponse apiTransferSummaryResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            money = advisoryFirstDepositTransferDataState.minimumDeposit;
        }
        return advisoryFirstDepositTransferDataState.copy(money, (i & 2) != 0 ? advisoryFirstDepositTransferDataState.viewModel : moneyTransferViewModel, (i & 4) != 0 ? advisoryFirstDepositTransferDataState.preselectedAccountInfo : transferAccountInfo, (i & 8) != 0 ? advisoryFirstDepositTransferDataState.source : str, (i & 16) != 0 ? advisoryFirstDepositTransferDataState.amountString : str2, (i & 32) != 0 ? advisoryFirstDepositTransferDataState.shakeAmountText : z, (i & 64) != 0 ? advisoryFirstDepositTransferDataState.shakeMinAmountLabelText : z2, (i & 128) != 0 ? advisoryFirstDepositTransferDataState.mode : mode, (i & 256) != 0 ? advisoryFirstDepositTransferDataState.brokerageAccountType : brokerageAccountType, (i & 512) != 0 ? advisoryFirstDepositTransferDataState.transferAccounts : immutableList, (i & 1024) != 0 ? advisoryFirstDepositTransferDataState.selectedTransferAccountId : str3, (i & 2048) != 0 ? advisoryFirstDepositTransferDataState.inFundingV3Experiment : z3, (i & 4096) != 0 ? advisoryFirstDepositTransferDataState.summaryResponse : apiTransferSummaryResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMinimumDeposit() {
        return this.minimumDeposit;
    }

    public final ImmutableList<TransferAccount> component10() {
        return this.transferAccounts;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSelectedTransferAccountId() {
        return this.selectedTransferAccountId;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getInFundingV3Experiment() {
        return this.inFundingV3Experiment;
    }

    /* renamed from: component13, reason: from getter */
    public final ApiTransferSummaryResponse getSummaryResponse() {
        return this.summaryResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAccountInfo getPreselectedAccountInfo() {
        return this.preselectedAccountInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAmountString() {
        return this.amountString;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShakeAmountText() {
        return this.shakeAmountText;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShakeMinAmountLabelText() {
        return this.shakeMinAmountLabelText;
    }

    /* renamed from: component8, reason: from getter */
    public final Mode getMode() {
        return this.mode;
    }

    /* renamed from: component9, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final AdvisoryFirstDepositTransferDataState copy(Money minimumDeposit, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel, TransferAccountInfo preselectedAccountInfo, String source, String amountString, boolean shakeAmountText, boolean shakeMinAmountLabelText, Mode mode, BrokerageAccountType brokerageAccountType, ImmutableList<TransferAccount> transferAccounts, String selectedTransferAccountId, boolean inFundingV3Experiment, ApiTransferSummaryResponse summaryResponse) {
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        return new AdvisoryFirstDepositTransferDataState(minimumDeposit, viewModel, preselectedAccountInfo, source, amountString, shakeAmountText, shakeMinAmountLabelText, mode, brokerageAccountType, transferAccounts, selectedTransferAccountId, inFundingV3Experiment, summaryResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryFirstDepositTransferDataState)) {
            return false;
        }
        AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState = (AdvisoryFirstDepositTransferDataState) other;
        return Intrinsics.areEqual(this.minimumDeposit, advisoryFirstDepositTransferDataState.minimumDeposit) && Intrinsics.areEqual(this.viewModel, advisoryFirstDepositTransferDataState.viewModel) && Intrinsics.areEqual(this.preselectedAccountInfo, advisoryFirstDepositTransferDataState.preselectedAccountInfo) && Intrinsics.areEqual(this.source, advisoryFirstDepositTransferDataState.source) && Intrinsics.areEqual(this.amountString, advisoryFirstDepositTransferDataState.amountString) && this.shakeAmountText == advisoryFirstDepositTransferDataState.shakeAmountText && this.shakeMinAmountLabelText == advisoryFirstDepositTransferDataState.shakeMinAmountLabelText && this.mode == advisoryFirstDepositTransferDataState.mode && this.brokerageAccountType == advisoryFirstDepositTransferDataState.brokerageAccountType && Intrinsics.areEqual(this.transferAccounts, advisoryFirstDepositTransferDataState.transferAccounts) && Intrinsics.areEqual(this.selectedTransferAccountId, advisoryFirstDepositTransferDataState.selectedTransferAccountId) && this.inFundingV3Experiment == advisoryFirstDepositTransferDataState.inFundingV3Experiment && Intrinsics.areEqual(this.summaryResponse, advisoryFirstDepositTransferDataState.summaryResponse);
    }

    public int hashCode() {
        int iHashCode = ((this.minimumDeposit.hashCode() * 31) + this.viewModel.hashCode()) * 31;
        TransferAccountInfo transferAccountInfo = this.preselectedAccountInfo;
        int iHashCode2 = (((((((((((((((iHashCode + (transferAccountInfo == null ? 0 : transferAccountInfo.hashCode())) * 31) + this.source.hashCode()) * 31) + this.amountString.hashCode()) * 31) + Boolean.hashCode(this.shakeAmountText)) * 31) + Boolean.hashCode(this.shakeMinAmountLabelText)) * 31) + this.mode.hashCode()) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.transferAccounts.hashCode()) * 31;
        String str = this.selectedTransferAccountId;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.inFundingV3Experiment)) * 31;
        ApiTransferSummaryResponse apiTransferSummaryResponse = this.summaryResponse;
        return iHashCode3 + (apiTransferSummaryResponse != null ? apiTransferSummaryResponse.hashCode() : 0);
    }

    public String toString() {
        return "AdvisoryFirstDepositTransferDataState(minimumDeposit=" + this.minimumDeposit + ", viewModel=" + this.viewModel + ", preselectedAccountInfo=" + this.preselectedAccountInfo + ", source=" + this.source + ", amountString=" + this.amountString + ", shakeAmountText=" + this.shakeAmountText + ", shakeMinAmountLabelText=" + this.shakeMinAmountLabelText + ", mode=" + this.mode + ", brokerageAccountType=" + this.brokerageAccountType + ", transferAccounts=" + this.transferAccounts + ", selectedTransferAccountId=" + this.selectedTransferAccountId + ", inFundingV3Experiment=" + this.inFundingV3Experiment + ", summaryResponse=" + this.summaryResponse + ")";
    }

    public AdvisoryFirstDepositTransferDataState(Money minimumDeposit, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel, TransferAccountInfo transferAccountInfo, String source, String amountString, boolean z, boolean z2, Mode mode, BrokerageAccountType brokerageAccountType, ImmutableList<TransferAccount> transferAccounts, String str, boolean z3, ApiTransferSummaryResponse apiTransferSummaryResponse) {
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        this.minimumDeposit = minimumDeposit;
        this.viewModel = viewModel;
        this.preselectedAccountInfo = transferAccountInfo;
        this.source = source;
        this.amountString = amountString;
        this.shakeAmountText = z;
        this.shakeMinAmountLabelText = z2;
        this.mode = mode;
        this.brokerageAccountType = brokerageAccountType;
        this.transferAccounts = transferAccounts;
        this.selectedTransferAccountId = str;
        this.inFundingV3Experiment = z3;
        this.summaryResponse = apiTransferSummaryResponse;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AdvisoryFirstDepositTransferDataState(com.robinhood.models.util.Money r18, com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel r19, com.robinhood.models.advisory.api.contribution.TransferAccountInfo r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDataState.Mode r25, com.robinhood.models.api.BrokerageAccountType r26, kotlinx.collections.immutable.ImmutableList r27, java.lang.String r28, boolean r29, com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r7 = r2
            goto Lc
        La:
            r7 = r21
        Lc:
            r1 = r0 & 16
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r22
        L14:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L1b
            r9 = r2
            goto L1d
        L1b:
            r9 = r23
        L1d:
            r1 = r0 & 64
            if (r1 == 0) goto L23
            r10 = r2
            goto L25
        L23:
            r10 = r24
        L25:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L2d
            com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDataState$Mode r1 = com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDataState.Mode.EDIT
            r11 = r1
            goto L2f
        L2d:
            r11 = r25
        L2f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L39
            kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.extensions2.persistentListOf()
            r13 = r1
            goto L3b
        L39:
            r13 = r27
        L3b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r1 == 0) goto L4a
            if (r20 == 0) goto L47
            java.lang.String r1 = r20.getTransfer_account_id()
            goto L48
        L47:
            r1 = r3
        L48:
            r14 = r1
            goto L4c
        L4a:
            r14 = r28
        L4c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L52
            r15 = r2
            goto L54
        L52:
            r15 = r29
        L54:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L65
            r16 = r3
            r4 = r18
            r5 = r19
            r6 = r20
            r12 = r26
            r3 = r17
            goto L71
        L65:
            r16 = r30
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r12 = r26
        L71:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDataState.<init>(com.robinhood.models.util.Money, com.robinhood.models.advisory.api.contribution.ContributionViewModel$MoneyTransferViewModel, com.robinhood.models.advisory.api.contribution.TransferAccountInfo, java.lang.String, java.lang.String, boolean, boolean, com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDataState$Mode, com.robinhood.models.api.BrokerageAccountType, kotlinx.collections.immutable.ImmutableList, java.lang.String, boolean, com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Money getMinimumDeposit() {
        return this.minimumDeposit;
    }

    public final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel getViewModel() {
        return this.viewModel;
    }

    public final TransferAccountInfo getPreselectedAccountInfo() {
        return this.preselectedAccountInfo;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getAmountString() {
        return this.amountString;
    }

    public final boolean getShakeAmountText() {
        return this.shakeAmountText;
    }

    public final boolean getShakeMinAmountLabelText() {
        return this.shakeMinAmountLabelText;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ImmutableList<TransferAccount> getTransferAccounts() {
        return this.transferAccounts;
    }

    public final String getSelectedTransferAccountId() {
        return this.selectedTransferAccountId;
    }

    public final boolean getInFundingV3Experiment() {
        return this.inFundingV3Experiment;
    }

    public final ApiTransferSummaryResponse getSummaryResponse() {
        return this.summaryResponse;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvisoryFirstDepositTransferDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "EDIT", "REVIEW", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Mode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode EDIT = new Mode("EDIT", 0);
        public static final Mode REVIEW = new Mode("REVIEW", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{EDIT, REVIEW};
        }

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public final BigDecimal getAmount() {
        if (this.amountString.length() == 0) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
        return new BigDecimal(this.amountString);
    }

    private final String getConfirmedAmountString() {
        if (this.amountString.length() == 0) {
            return MoneyInputFormatting.toReadableMoneyString(this.amountString, 2, true);
        }
        return Formats.getPriceFormat().format(getAmount());
    }

    private final String getEditModeAmountString() {
        return MoneyInputFormatting.toReadableMoneyString(this.amountString, 2, true);
    }

    public final String getAmountStringFormatted() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i == 1) {
            return getEditModeAmountString();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getConfirmedAmountString();
    }

    public final TransferAccount getSourceTransferAccount() {
        TransferAccount next;
        Iterator<TransferAccount> it = this.transferAccounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getAccountId(), this.selectedTransferAccountId)) {
                break;
            }
        }
        TransferAccount transferAccount = next;
        return transferAccount == null ? (TransferAccount) CollectionsKt.firstOrNull((List) this.transferAccounts) : transferAccount;
    }

    public final StringResource getDestinationTransferAccountName() {
        return AccountDisplayNames.getDisplayName$default(this.brokerageAccountType, ManagementType.MANAGED, null, 4, null).getWithAccount().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringResource getSelectedTransferAccountName() {
        StringResource stringResourceInvoke;
        TransferAccount sourceTransferAccount = getSourceTransferAccount();
        String displayTitle = sourceTransferAccount != null ? sourceTransferAccount.getDisplayTitle() : null;
        return (displayTitle == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(StringsKt.truncateWithEllipses(displayTitle, 28))) == null) ? StringResource.INSTANCE.invoke(C8825R.string.f3908x24498f53, new Object[0]) : stringResourceInvoke;
    }

    private final BigDecimal getMinimumAmountToGetStocks() {
        return this.viewModel.getMinimum_amount_to_get_stocks().getAmount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringResource getAmountInfoLabel() {
        if (getAmount().compareTo(this.minimumDeposit.getDecimalValue()) < 0) {
            return StringResource.INSTANCE.invoke(C8825R.string.f3910xe1065658, MoneyInputFormatting.toReadableMoneyString$default(this.minimumDeposit.toString(), null, true, 1, null));
        }
        if (RangesKt.rangeUntil(this.minimumDeposit.getDecimalValue(), getMinimumAmountToGetStocks()).contains(getAmount())) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C8825R.string.f3911x2187f9c1;
            String string2 = getMinimumAmountToGetStocks().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return companion.invoke(i, MoneyInputFormatting.toReadableMoneyString$default(string2, null, true, 1, null));
        }
        return StringResource.INSTANCE.invoke(C8825R.string.f3909x4879f00d, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getLockSourceTransferAccount() {
        TransferAccountInfo transferAccountInfo = this.preselectedAccountInfo;
        return (transferAccountInfo == null || !transferAccountInfo.getLock_selection() || this.inFundingV3Experiment) ? false : true;
    }

    /* compiled from: AdvisoryFirstDepositTransferDataState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferViewState;", "<init>", "()V", "TRANSFER_ACCOUNT_DISPLAY_NAME_MAX_LENGTH", "", "ALLOWED_TRANSFER_TYPES", "", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<AdvisoryFirstDepositTransferDataState, AdvisoryFirstDepositTransferViewState> {

        /* compiled from: AdvisoryFirstDepositTransferDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.EDIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.REVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
        @Override // com.robinhood.android.udf.StateProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AdvisoryFirstDepositTransferViewState reduce(AdvisoryFirstDepositTransferDataState dataState) {
            Object next;
            StringResource stringResourceInvoke;
            AdvisoryFirstDepositTransferViewState2 label;
            boolean z;
            DisplayName brokerageAccountDisplayName;
            DisplayName.Variants variants;
            StringResource inSentence;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            ImmutableList<TransferAccount> transferAccounts = dataState.getTransferAccounts();
            ArrayList arrayList = new ArrayList();
            for (TransferAccount transferAccount : transferAccounts) {
                if (transferAccount.getStatus() == ApiTransferAccount.TransferAccountStatus.APPROVED) {
                    arrayList.add(transferAccount);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String accountId = ((TransferAccount) next).getAccountId();
                TransferAccountInfo preselectedAccountInfo = dataState.getPreselectedAccountInfo();
                if (Intrinsics.areEqual(accountId, preselectedAccountInfo != null ? preselectedAccountInfo.getTransfer_account_id() : null)) {
                    break;
                }
            }
            TransferAccount transferAccount2 = (TransferAccount) next;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                TransferAccount transferAccount3 = (TransferAccount) obj;
                if (transferAccount2 == null || !dataState.getInFundingV3Experiment()) {
                    if (!transferAccount3.isManaged() && AdvisoryFirstDepositTransferDataState.ALLOWED_TRANSFER_TYPES.contains(transferAccount3.getType())) {
                        arrayList2.add(obj);
                    }
                } else if (transferAccount2.isExternal() == transferAccount3.isExternal()) {
                    arrayList2.add(obj);
                }
            }
            ImmutableList immutableList = extensions2.toImmutableList(arrayList2);
            BigDecimal decimalValue = dataState.getMinimumDeposit().getDecimalValue();
            TransferAccountListConfig internalOnly = (transferAccount2 == null || transferAccount2.isExternal() || !dataState.getInFundingV3Experiment()) ? TransferAccountListConfig.Default.INSTANCE : new TransferAccountListConfig.InternalOnly(dataState.getBrokerageAccountType());
            TransferAccount sourceTransferAccount = dataState.getSourceTransferAccount();
            if (sourceTransferAccount == null) {
                stringResourceInvoke = null;
            } else {
                if (sourceTransferAccount.isExternal() || !(internalOnly instanceof TransferAccountListConfig.InternalOnly) || dataState.getMode() != Mode.EDIT) {
                    sourceTransferAccount = null;
                }
                if (sourceTransferAccount != null && (brokerageAccountDisplayName = AccountDisplayNames.getBrokerageAccountDisplayName(sourceTransferAccount)) != null && (variants = brokerageAccountDisplayName.getShort()) != null && (inSentence = variants.getInSentence()) != null) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C8825R.string.advisory_first_deposit_account_dropdown_label, inSentence);
                }
            }
            ApiTransferSummaryResponse summaryResponse = dataState.getSummaryResponse();
            List<UIComponent<GenericAction>> content = summaryResponse != null ? summaryResponse.getContent() : null;
            String header_title = dataState.getViewModel().getHeader_title();
            String amountStringFormatted = dataState.getAmountStringFormatted();
            int i = WhenMappings.$EnumSwitchMapping$0[dataState.getMode().ordinal()];
            if (i == 1) {
                label = (!dataState.getInFundingV3Experiment() || content == null) ? new AdvisoryFirstDepositTransferViewState2.Label(dataState.getAmountInfoLabel()) : new AdvisoryFirstDepositTransferViewState2.Sdui(extensions2.toImmutableList(content));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                label = null;
            }
            boolean zIsPositive = BigDecimals7.isPositive(dataState.getAmount());
            boolean z2 = false;
            if (dataState.getAmount().compareTo(decimalValue) >= 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            boolean shakeAmountText = dataState.getShakeAmountText();
            boolean shakeMinAmountLabelText = dataState.getShakeMinAmountLabelText();
            boolean z3 = dataState.getMode() == Mode.EDIT ? true : z;
            boolean z4 = dataState.getMode() == Mode.REVIEW ? true : z;
            BrokerageAccountType brokerageAccountType = dataState.getBrokerageAccountType();
            StringResource destinationTransferAccountName = dataState.getDestinationTransferAccountName();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            for (Iterator it2 = immutableList.iterator(); it2.hasNext(); it2 = it2) {
                arrayList3.add(AccountRowData.INSTANCE.from((TransferAccount) it2.next(), internalOnly, dataState.getInFundingV3Experiment()));
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDataState$Companion$reduce$lambda$9$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Boolean.valueOf(((AccountRowData) t2).getEnabled()), Boolean.valueOf(((AccountRowData) t).getEnabled()));
                }
            }));
            StringResource selectedTransferAccountName = dataState.getSelectedTransferAccountName();
            String selectedTransferAccountId = dataState.getSelectedTransferAccountId();
            boolean lockSourceTransferAccount = dataState.getLockSourceTransferAccount();
            ImmutableList immutableList2 = extensions2.toImmutableList(dataState.getViewModel().getChips());
            Money minimumDeposit = dataState.getMinimumDeposit();
            String source = dataState.getSource();
            TransferAccount sourceTransferAccount2 = dataState.getSourceTransferAccount();
            String ira_to_ira_footer = (sourceTransferAccount2 != null && sourceTransferAccount2.isIra() && dataState.getBrokerageAccountType().isRetirement() && dataState.getMode() == Mode.REVIEW) ? dataState.getViewModel().getIra_to_ira_footer() : null;
            TransferAccount sourceTransferAccount3 = dataState.getSourceTransferAccount();
            return new AdvisoryFirstDepositTransferViewState(header_title, amountStringFormatted, label, zIsPositive, z2, shakeAmountText, shakeMinAmountLabelText, z3, z4, brokerageAccountType, destinationTransferAccountName, persistentList, selectedTransferAccountId, selectedTransferAccountName, lockSourceTransferAccount, immutableList2, minimumDeposit, internalOnly, source, stringResourceInvoke, ira_to_ira_footer, dataState.getInFundingV3Experiment() ? new ApiTransferSummaryRequest(sourceTransferAccount3 != null ? new ApiTransferSummaryRequest.Account(sourceTransferAccount3.getAccountId(), sourceTransferAccount3.getType(), null, 4, null) : null, null, Integer.valueOf(MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED.getValue()), ApiCreateTransferRequest2.ONCE, null, dataState.getAmount(), null, 80, null) : null);
        }
    }
}
