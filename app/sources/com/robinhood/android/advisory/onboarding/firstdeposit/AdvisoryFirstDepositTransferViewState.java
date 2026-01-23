package com.robinhood.android.advisory.onboarding.firstdeposit;

import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import defpackage.TransferAccountListConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryFirstDepositTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\u000fHÆ\u0003J\t\u0010N\u001a\u00020\u0011HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0011HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013HÆ\u0003J\t\u0010T\u001a\u00020\u001bHÆ\u0003J\t\u0010U\u001a\u00020\u001dHÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\"HÆ\u0003Jû\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001J\u0013\u0010[\u001a\u00020\b2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020^HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b@\u00104R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006`"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferViewState;", "", "headerText", "", "amountStringFormatted", "amountInfoDisclaimer", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer;", "showContinueCta", "", "continueCtaEnabled", "shakeAmountText", "shakeMinAmountLabelText", "showNumpad", "showTransferAccountInfo", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "destinationTransferAccountName", "Lcom/robinhood/utils/resource/StringResource;", "accountRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AccountRowData;", "selectedTransferAccountId", "selectedTransferAccountNameWithValue", "lockSourceTransferAccount", "chips", "Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;", "minimumDeposit", "Lcom/robinhood/models/util/Money;", "accountListConfig", "LTransferAccountListConfig;", "source", "accountSelectorDropdownLabel", "footerDisclaimer", "summaryRequest", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer;ZZZZZZLcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/util/Money;LTransferAccountListConfig;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;)V", "getHeaderText", "()Ljava/lang/String;", "getAmountStringFormatted", "getAmountInfoDisclaimer", "()Lcom/robinhood/android/advisory/onboarding/firstdeposit/AmountInfoDisclaimer;", "getShowContinueCta", "()Z", "getContinueCtaEnabled", "getShakeAmountText", "getShakeMinAmountLabelText", "getShowNumpad", "getShowTransferAccountInfo", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getDestinationTransferAccountName", "()Lcom/robinhood/utils/resource/StringResource;", "getAccountRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedTransferAccountId", "getSelectedTransferAccountNameWithValue", "getLockSourceTransferAccount", "getChips", "getMinimumDeposit", "()Lcom/robinhood/models/util/Money;", "getAccountListConfig", "()LTransferAccountListConfig;", "getSource", "getAccountSelectorDropdownLabel", "getFooterDisclaimer", "getSummaryRequest", "()Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryFirstDepositTransferViewState {
    public static final int $stable = 8;
    private final TransferAccountListConfig accountListConfig;
    private final ImmutableList<AccountRowData> accountRows;
    private final StringResource accountSelectorDropdownLabel;
    private final AdvisoryFirstDepositTransferViewState2 amountInfoDisclaimer;
    private final String amountStringFormatted;
    private final BrokerageAccountType brokerageAccountType;
    private final ImmutableList<KeypadChip> chips;
    private final boolean continueCtaEnabled;
    private final StringResource destinationTransferAccountName;
    private final String footerDisclaimer;
    private final String headerText;
    private final boolean lockSourceTransferAccount;
    private final Money minimumDeposit;
    private final String selectedTransferAccountId;
    private final StringResource selectedTransferAccountNameWithValue;
    private final boolean shakeAmountText;
    private final boolean shakeMinAmountLabelText;
    private final boolean showContinueCta;
    private final boolean showNumpad;
    private final boolean showTransferAccountInfo;
    private final String source;
    private final ApiTransferSummaryRequest summaryRequest;

    public static /* synthetic */ AdvisoryFirstDepositTransferViewState copy$default(AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState, String str, String str2, AdvisoryFirstDepositTransferViewState2 advisoryFirstDepositTransferViewState2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, BrokerageAccountType brokerageAccountType, StringResource stringResource, ImmutableList immutableList, String str3, StringResource stringResource2, boolean z7, ImmutableList immutableList2, Money money, TransferAccountListConfig transferAccountListConfig, String str4, StringResource stringResource3, String str5, ApiTransferSummaryRequest apiTransferSummaryRequest, int i, Object obj) {
        ApiTransferSummaryRequest apiTransferSummaryRequest2;
        String str6;
        String str7 = (i & 1) != 0 ? advisoryFirstDepositTransferViewState.headerText : str;
        String str8 = (i & 2) != 0 ? advisoryFirstDepositTransferViewState.amountStringFormatted : str2;
        AdvisoryFirstDepositTransferViewState2 advisoryFirstDepositTransferViewState22 = (i & 4) != 0 ? advisoryFirstDepositTransferViewState.amountInfoDisclaimer : advisoryFirstDepositTransferViewState2;
        boolean z8 = (i & 8) != 0 ? advisoryFirstDepositTransferViewState.showContinueCta : z;
        boolean z9 = (i & 16) != 0 ? advisoryFirstDepositTransferViewState.continueCtaEnabled : z2;
        boolean z10 = (i & 32) != 0 ? advisoryFirstDepositTransferViewState.shakeAmountText : z3;
        boolean z11 = (i & 64) != 0 ? advisoryFirstDepositTransferViewState.shakeMinAmountLabelText : z4;
        boolean z12 = (i & 128) != 0 ? advisoryFirstDepositTransferViewState.showNumpad : z5;
        boolean z13 = (i & 256) != 0 ? advisoryFirstDepositTransferViewState.showTransferAccountInfo : z6;
        BrokerageAccountType brokerageAccountType2 = (i & 512) != 0 ? advisoryFirstDepositTransferViewState.brokerageAccountType : brokerageAccountType;
        StringResource stringResource4 = (i & 1024) != 0 ? advisoryFirstDepositTransferViewState.destinationTransferAccountName : stringResource;
        ImmutableList immutableList3 = (i & 2048) != 0 ? advisoryFirstDepositTransferViewState.accountRows : immutableList;
        String str9 = (i & 4096) != 0 ? advisoryFirstDepositTransferViewState.selectedTransferAccountId : str3;
        StringResource stringResource5 = (i & 8192) != 0 ? advisoryFirstDepositTransferViewState.selectedTransferAccountNameWithValue : stringResource2;
        String str10 = str7;
        boolean z14 = (i & 16384) != 0 ? advisoryFirstDepositTransferViewState.lockSourceTransferAccount : z7;
        ImmutableList immutableList4 = (i & 32768) != 0 ? advisoryFirstDepositTransferViewState.chips : immutableList2;
        Money money2 = (i & 65536) != 0 ? advisoryFirstDepositTransferViewState.minimumDeposit : money;
        TransferAccountListConfig transferAccountListConfig2 = (i & 131072) != 0 ? advisoryFirstDepositTransferViewState.accountListConfig : transferAccountListConfig;
        String str11 = (i & 262144) != 0 ? advisoryFirstDepositTransferViewState.source : str4;
        StringResource stringResource6 = (i & 524288) != 0 ? advisoryFirstDepositTransferViewState.accountSelectorDropdownLabel : stringResource3;
        String str12 = (i & 1048576) != 0 ? advisoryFirstDepositTransferViewState.footerDisclaimer : str5;
        if ((i & 2097152) != 0) {
            str6 = str12;
            apiTransferSummaryRequest2 = advisoryFirstDepositTransferViewState.summaryRequest;
        } else {
            apiTransferSummaryRequest2 = apiTransferSummaryRequest;
            str6 = str12;
        }
        return advisoryFirstDepositTransferViewState.copy(str10, str8, advisoryFirstDepositTransferViewState22, z8, z9, z10, z11, z12, z13, brokerageAccountType2, stringResource4, immutableList3, str9, stringResource5, z14, immutableList4, money2, transferAccountListConfig2, str11, stringResource6, str6, apiTransferSummaryRequest2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component10, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component11, reason: from getter */
    public final StringResource getDestinationTransferAccountName() {
        return this.destinationTransferAccountName;
    }

    public final ImmutableList<AccountRowData> component12() {
        return this.accountRows;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSelectedTransferAccountId() {
        return this.selectedTransferAccountId;
    }

    /* renamed from: component14, reason: from getter */
    public final StringResource getSelectedTransferAccountNameWithValue() {
        return this.selectedTransferAccountNameWithValue;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getLockSourceTransferAccount() {
        return this.lockSourceTransferAccount;
    }

    public final ImmutableList<KeypadChip> component16() {
        return this.chips;
    }

    /* renamed from: component17, reason: from getter */
    public final Money getMinimumDeposit() {
        return this.minimumDeposit;
    }

    /* renamed from: component18, reason: from getter */
    public final TransferAccountListConfig getAccountListConfig() {
        return this.accountListConfig;
    }

    /* renamed from: component19, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmountStringFormatted() {
        return this.amountStringFormatted;
    }

    /* renamed from: component20, reason: from getter */
    public final StringResource getAccountSelectorDropdownLabel() {
        return this.accountSelectorDropdownLabel;
    }

    /* renamed from: component21, reason: from getter */
    public final String getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    /* renamed from: component22, reason: from getter */
    public final ApiTransferSummaryRequest getSummaryRequest() {
        return this.summaryRequest;
    }

    /* renamed from: component3, reason: from getter */
    public final AdvisoryFirstDepositTransferViewState2 getAmountInfoDisclaimer() {
        return this.amountInfoDisclaimer;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowContinueCta() {
        return this.showContinueCta;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getContinueCtaEnabled() {
        return this.continueCtaEnabled;
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
    public final boolean getShowNumpad() {
        return this.showNumpad;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowTransferAccountInfo() {
        return this.showTransferAccountInfo;
    }

    public final AdvisoryFirstDepositTransferViewState copy(String headerText, String amountStringFormatted, AdvisoryFirstDepositTransferViewState2 amountInfoDisclaimer, boolean showContinueCta, boolean continueCtaEnabled, boolean shakeAmountText, boolean shakeMinAmountLabelText, boolean showNumpad, boolean showTransferAccountInfo, BrokerageAccountType brokerageAccountType, StringResource destinationTransferAccountName, ImmutableList<AccountRowData> accountRows, String selectedTransferAccountId, StringResource selectedTransferAccountNameWithValue, boolean lockSourceTransferAccount, ImmutableList<KeypadChip> chips, Money minimumDeposit, TransferAccountListConfig accountListConfig, String source, StringResource accountSelectorDropdownLabel, String footerDisclaimer, ApiTransferSummaryRequest summaryRequest) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(amountStringFormatted, "amountStringFormatted");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(destinationTransferAccountName, "destinationTransferAccountName");
        Intrinsics.checkNotNullParameter(accountRows, "accountRows");
        Intrinsics.checkNotNullParameter(selectedTransferAccountNameWithValue, "selectedTransferAccountNameWithValue");
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        Intrinsics.checkNotNullParameter(accountListConfig, "accountListConfig");
        Intrinsics.checkNotNullParameter(source, "source");
        return new AdvisoryFirstDepositTransferViewState(headerText, amountStringFormatted, amountInfoDisclaimer, showContinueCta, continueCtaEnabled, shakeAmountText, shakeMinAmountLabelText, showNumpad, showTransferAccountInfo, brokerageAccountType, destinationTransferAccountName, accountRows, selectedTransferAccountId, selectedTransferAccountNameWithValue, lockSourceTransferAccount, chips, minimumDeposit, accountListConfig, source, accountSelectorDropdownLabel, footerDisclaimer, summaryRequest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryFirstDepositTransferViewState)) {
            return false;
        }
        AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState = (AdvisoryFirstDepositTransferViewState) other;
        return Intrinsics.areEqual(this.headerText, advisoryFirstDepositTransferViewState.headerText) && Intrinsics.areEqual(this.amountStringFormatted, advisoryFirstDepositTransferViewState.amountStringFormatted) && Intrinsics.areEqual(this.amountInfoDisclaimer, advisoryFirstDepositTransferViewState.amountInfoDisclaimer) && this.showContinueCta == advisoryFirstDepositTransferViewState.showContinueCta && this.continueCtaEnabled == advisoryFirstDepositTransferViewState.continueCtaEnabled && this.shakeAmountText == advisoryFirstDepositTransferViewState.shakeAmountText && this.shakeMinAmountLabelText == advisoryFirstDepositTransferViewState.shakeMinAmountLabelText && this.showNumpad == advisoryFirstDepositTransferViewState.showNumpad && this.showTransferAccountInfo == advisoryFirstDepositTransferViewState.showTransferAccountInfo && this.brokerageAccountType == advisoryFirstDepositTransferViewState.brokerageAccountType && Intrinsics.areEqual(this.destinationTransferAccountName, advisoryFirstDepositTransferViewState.destinationTransferAccountName) && Intrinsics.areEqual(this.accountRows, advisoryFirstDepositTransferViewState.accountRows) && Intrinsics.areEqual(this.selectedTransferAccountId, advisoryFirstDepositTransferViewState.selectedTransferAccountId) && Intrinsics.areEqual(this.selectedTransferAccountNameWithValue, advisoryFirstDepositTransferViewState.selectedTransferAccountNameWithValue) && this.lockSourceTransferAccount == advisoryFirstDepositTransferViewState.lockSourceTransferAccount && Intrinsics.areEqual(this.chips, advisoryFirstDepositTransferViewState.chips) && Intrinsics.areEqual(this.minimumDeposit, advisoryFirstDepositTransferViewState.minimumDeposit) && Intrinsics.areEqual(this.accountListConfig, advisoryFirstDepositTransferViewState.accountListConfig) && Intrinsics.areEqual(this.source, advisoryFirstDepositTransferViewState.source) && Intrinsics.areEqual(this.accountSelectorDropdownLabel, advisoryFirstDepositTransferViewState.accountSelectorDropdownLabel) && Intrinsics.areEqual(this.footerDisclaimer, advisoryFirstDepositTransferViewState.footerDisclaimer) && Intrinsics.areEqual(this.summaryRequest, advisoryFirstDepositTransferViewState.summaryRequest);
    }

    public int hashCode() {
        int iHashCode = ((this.headerText.hashCode() * 31) + this.amountStringFormatted.hashCode()) * 31;
        AdvisoryFirstDepositTransferViewState2 advisoryFirstDepositTransferViewState2 = this.amountInfoDisclaimer;
        int iHashCode2 = (((((((((((((((((((iHashCode + (advisoryFirstDepositTransferViewState2 == null ? 0 : advisoryFirstDepositTransferViewState2.hashCode())) * 31) + Boolean.hashCode(this.showContinueCta)) * 31) + Boolean.hashCode(this.continueCtaEnabled)) * 31) + Boolean.hashCode(this.shakeAmountText)) * 31) + Boolean.hashCode(this.shakeMinAmountLabelText)) * 31) + Boolean.hashCode(this.showNumpad)) * 31) + Boolean.hashCode(this.showTransferAccountInfo)) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.destinationTransferAccountName.hashCode()) * 31) + this.accountRows.hashCode()) * 31;
        String str = this.selectedTransferAccountId;
        int iHashCode3 = (((((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.selectedTransferAccountNameWithValue.hashCode()) * 31) + Boolean.hashCode(this.lockSourceTransferAccount)) * 31) + this.chips.hashCode()) * 31) + this.minimumDeposit.hashCode()) * 31) + this.accountListConfig.hashCode()) * 31) + this.source.hashCode()) * 31;
        StringResource stringResource = this.accountSelectorDropdownLabel;
        int iHashCode4 = (iHashCode3 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        String str2 = this.footerDisclaimer;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ApiTransferSummaryRequest apiTransferSummaryRequest = this.summaryRequest;
        return iHashCode5 + (apiTransferSummaryRequest != null ? apiTransferSummaryRequest.hashCode() : 0);
    }

    public String toString() {
        return "AdvisoryFirstDepositTransferViewState(headerText=" + this.headerText + ", amountStringFormatted=" + this.amountStringFormatted + ", amountInfoDisclaimer=" + this.amountInfoDisclaimer + ", showContinueCta=" + this.showContinueCta + ", continueCtaEnabled=" + this.continueCtaEnabled + ", shakeAmountText=" + this.shakeAmountText + ", shakeMinAmountLabelText=" + this.shakeMinAmountLabelText + ", showNumpad=" + this.showNumpad + ", showTransferAccountInfo=" + this.showTransferAccountInfo + ", brokerageAccountType=" + this.brokerageAccountType + ", destinationTransferAccountName=" + this.destinationTransferAccountName + ", accountRows=" + this.accountRows + ", selectedTransferAccountId=" + this.selectedTransferAccountId + ", selectedTransferAccountNameWithValue=" + this.selectedTransferAccountNameWithValue + ", lockSourceTransferAccount=" + this.lockSourceTransferAccount + ", chips=" + this.chips + ", minimumDeposit=" + this.minimumDeposit + ", accountListConfig=" + this.accountListConfig + ", source=" + this.source + ", accountSelectorDropdownLabel=" + this.accountSelectorDropdownLabel + ", footerDisclaimer=" + this.footerDisclaimer + ", summaryRequest=" + this.summaryRequest + ")";
    }

    public AdvisoryFirstDepositTransferViewState(String headerText, String amountStringFormatted, AdvisoryFirstDepositTransferViewState2 advisoryFirstDepositTransferViewState2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, BrokerageAccountType brokerageAccountType, StringResource destinationTransferAccountName, ImmutableList<AccountRowData> accountRows, String str, StringResource selectedTransferAccountNameWithValue, boolean z7, ImmutableList<KeypadChip> chips, Money minimumDeposit, TransferAccountListConfig accountListConfig, String source, StringResource stringResource, String str2, ApiTransferSummaryRequest apiTransferSummaryRequest) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(amountStringFormatted, "amountStringFormatted");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(destinationTransferAccountName, "destinationTransferAccountName");
        Intrinsics.checkNotNullParameter(accountRows, "accountRows");
        Intrinsics.checkNotNullParameter(selectedTransferAccountNameWithValue, "selectedTransferAccountNameWithValue");
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        Intrinsics.checkNotNullParameter(accountListConfig, "accountListConfig");
        Intrinsics.checkNotNullParameter(source, "source");
        this.headerText = headerText;
        this.amountStringFormatted = amountStringFormatted;
        this.amountInfoDisclaimer = advisoryFirstDepositTransferViewState2;
        this.showContinueCta = z;
        this.continueCtaEnabled = z2;
        this.shakeAmountText = z3;
        this.shakeMinAmountLabelText = z4;
        this.showNumpad = z5;
        this.showTransferAccountInfo = z6;
        this.brokerageAccountType = brokerageAccountType;
        this.destinationTransferAccountName = destinationTransferAccountName;
        this.accountRows = accountRows;
        this.selectedTransferAccountId = str;
        this.selectedTransferAccountNameWithValue = selectedTransferAccountNameWithValue;
        this.lockSourceTransferAccount = z7;
        this.chips = chips;
        this.minimumDeposit = minimumDeposit;
        this.accountListConfig = accountListConfig;
        this.source = source;
        this.accountSelectorDropdownLabel = stringResource;
        this.footerDisclaimer = str2;
        this.summaryRequest = apiTransferSummaryRequest;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final String getAmountStringFormatted() {
        return this.amountStringFormatted;
    }

    public final AdvisoryFirstDepositTransferViewState2 getAmountInfoDisclaimer() {
        return this.amountInfoDisclaimer;
    }

    public final boolean getShowContinueCta() {
        return this.showContinueCta;
    }

    public final boolean getContinueCtaEnabled() {
        return this.continueCtaEnabled;
    }

    public final boolean getShakeAmountText() {
        return this.shakeAmountText;
    }

    public final boolean getShakeMinAmountLabelText() {
        return this.shakeMinAmountLabelText;
    }

    public final boolean getShowNumpad() {
        return this.showNumpad;
    }

    public final boolean getShowTransferAccountInfo() {
        return this.showTransferAccountInfo;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final StringResource getDestinationTransferAccountName() {
        return this.destinationTransferAccountName;
    }

    public final ImmutableList<AccountRowData> getAccountRows() {
        return this.accountRows;
    }

    public final String getSelectedTransferAccountId() {
        return this.selectedTransferAccountId;
    }

    public final StringResource getSelectedTransferAccountNameWithValue() {
        return this.selectedTransferAccountNameWithValue;
    }

    public final boolean getLockSourceTransferAccount() {
        return this.lockSourceTransferAccount;
    }

    public final ImmutableList<KeypadChip> getChips() {
        return this.chips;
    }

    public final Money getMinimumDeposit() {
        return this.minimumDeposit;
    }

    public final TransferAccountListConfig getAccountListConfig() {
        return this.accountListConfig;
    }

    public final String getSource() {
        return this.source;
    }

    public final StringResource getAccountSelectorDropdownLabel() {
        return this.accountSelectorDropdownLabel;
    }

    public final String getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    public final ApiTransferSummaryRequest getSummaryRequest() {
        return this.summaryRequest;
    }
}
