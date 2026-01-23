package com.robinhood.android.transfers;

import androidx.paging.PagedList;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.RecurringDepositsListKey;
import com.robinhood.android.transfers.contracts.RecurringMaxTransfer;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: TransfersHubViewState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\u0017\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fHÆ\u0003J\u0017\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÂ\u0003J\t\u0010G\u001a\u00020\bHÂ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0014HÂ\u0003J\t\u0010I\u001a\u00020\bHÂ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003JÁ\u0001\u0010L\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\bHÆ\u0001J\u0013\u0010M\u001a\u00020\b2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u000203HÖ\u0001J\t\u0010P\u001a\u00020QHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u001f\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001fR\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001fR\u0011\u0010&\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010'\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010(\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010)\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0014\u00101\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010;\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010=\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u001f¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubViewState;", "", "achRelationships", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/db/AchRelationship;", "activeDebitCardInstruments", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "hasAutomaticDeposits", "", "isCashManagementEnabled", "hasRhyAccount", "pendingHistoryItems", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "historyItems", "isUserInAutoDepositRecurringHookExperiment", "isInWithdrawableCashInfoExperiment", "isAcatsRegionGateSupported", "acatsBonusInfo", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "isInRetirementTransferExperiment", "transferHubMicrogramSource", "Lmicrogram/android/RemoteMicrogramApplication;", "isLoading", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZZZLandroidx/paging/PagedList;Landroidx/paging/PagedList;ZZZLcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;ZLmicrogram/android/RemoteMicrogramApplication;Z)V", "getAchRelationships", "()Lkotlinx/collections/immutable/ImmutableList;", "getActiveDebitCardInstruments", "getHasAutomaticDeposits", "()Z", "getHasRhyAccount", "getPendingHistoryItems", "()Landroidx/paging/PagedList;", "getHistoryItems", "getTransferHubMicrogramSource", "()Lmicrogram/android/RemoteMicrogramApplication;", "isAcatsInRowVisible", "isAccountInfoTextVisible", "isAccountCardVisible", "isRetirementTransferRowVisible", "automaticDepositRowAction", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getAutomaticDepositRowAction", "()Lcom/robinhood/utils/Either;", "isPendingHistoryItemsSectionVisible", "isHistoryItemsSectionVisible", "historySectionHeaderTitle", "", "getHistorySectionHeaderTitle", "()I", "isDebitCardUserStatusBannerVisible", "acatsRowPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "getAcatsRowPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "acatsRowSecondaryTextBonus", "getAcatsRowSecondaryTextBonus", "isAcatsBonusEnabledForUser", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransfersHubViewState {
    public static final int $stable = 8;
    private final ApiAcatsBonusPromoInfo acatsBonusInfo;
    private final ImmutableList<AchRelationship> achRelationships;
    private final ImmutableList<ApiPaymentInstrument> activeDebitCardInstruments;
    private final boolean hasAutomaticDeposits;
    private final boolean hasRhyAccount;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems;
    private final int historySectionHeaderTitle;
    private final boolean isAcatsInRowVisible;
    private final boolean isAcatsRegionGateSupported;
    private final boolean isAccountCardVisible;
    private final boolean isAccountInfoTextVisible;
    private final boolean isCashManagementEnabled;
    private final boolean isDebitCardUserStatusBannerVisible;
    private final boolean isHistoryItemsSectionVisible;
    private final boolean isInRetirementTransferExperiment;
    private final boolean isInWithdrawableCashInfoExperiment;
    private final boolean isLoading;
    private final boolean isPendingHistoryItemsSectionVisible;
    private final boolean isRetirementTransferRowVisible;
    private final boolean isUserInAutoDepositRecurringHookExperiment;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryItems;
    private final RemoteMicrogramApplication transferHubMicrogramSource;

    public TransfersHubViewState() {
        this(null, null, false, false, false, null, null, false, false, false, null, false, null, false, 16383, null);
    }

    /* renamed from: component10, reason: from getter */
    private final boolean getIsAcatsRegionGateSupported() {
        return this.isAcatsRegionGateSupported;
    }

    /* renamed from: component11, reason: from getter */
    private final ApiAcatsBonusPromoInfo getAcatsBonusInfo() {
        return this.acatsBonusInfo;
    }

    /* renamed from: component12, reason: from getter */
    private final boolean getIsInRetirementTransferExperiment() {
        return this.isInRetirementTransferExperiment;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getIsInWithdrawableCashInfoExperiment() {
        return this.isInWithdrawableCashInfoExperiment;
    }

    public final ImmutableList<AchRelationship> component1() {
        return this.achRelationships;
    }

    /* renamed from: component13, reason: from getter */
    public final RemoteMicrogramApplication getTransferHubMicrogramSource() {
        return this.transferHubMicrogramSource;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ImmutableList<ApiPaymentInstrument> component2() {
        return this.activeDebitCardInstruments;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasAutomaticDeposits() {
        return this.hasAutomaticDeposits;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCashManagementEnabled() {
        return this.isCashManagementEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasRhyAccount() {
        return this.hasRhyAccount;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component6() {
        return this.pendingHistoryItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component7() {
        return this.historyItems;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsUserInAutoDepositRecurringHookExperiment() {
        return this.isUserInAutoDepositRecurringHookExperiment;
    }

    public final TransfersHubViewState copy(ImmutableList<AchRelationship> achRelationships, ImmutableList<ApiPaymentInstrument> activeDebitCardInstruments, boolean hasAutomaticDeposits, boolean isCashManagementEnabled, boolean hasRhyAccount, PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryItems, PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems, boolean isUserInAutoDepositRecurringHookExperiment, boolean isInWithdrawableCashInfoExperiment, boolean isAcatsRegionGateSupported, ApiAcatsBonusPromoInfo acatsBonusInfo, boolean isInRetirementTransferExperiment, RemoteMicrogramApplication transferHubMicrogramSource, boolean isLoading) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        Intrinsics.checkNotNullParameter(activeDebitCardInstruments, "activeDebitCardInstruments");
        return new TransfersHubViewState(achRelationships, activeDebitCardInstruments, hasAutomaticDeposits, isCashManagementEnabled, hasRhyAccount, pendingHistoryItems, historyItems, isUserInAutoDepositRecurringHookExperiment, isInWithdrawableCashInfoExperiment, isAcatsRegionGateSupported, acatsBonusInfo, isInRetirementTransferExperiment, transferHubMicrogramSource, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersHubViewState)) {
            return false;
        }
        TransfersHubViewState transfersHubViewState = (TransfersHubViewState) other;
        return Intrinsics.areEqual(this.achRelationships, transfersHubViewState.achRelationships) && Intrinsics.areEqual(this.activeDebitCardInstruments, transfersHubViewState.activeDebitCardInstruments) && this.hasAutomaticDeposits == transfersHubViewState.hasAutomaticDeposits && this.isCashManagementEnabled == transfersHubViewState.isCashManagementEnabled && this.hasRhyAccount == transfersHubViewState.hasRhyAccount && Intrinsics.areEqual(this.pendingHistoryItems, transfersHubViewState.pendingHistoryItems) && Intrinsics.areEqual(this.historyItems, transfersHubViewState.historyItems) && this.isUserInAutoDepositRecurringHookExperiment == transfersHubViewState.isUserInAutoDepositRecurringHookExperiment && this.isInWithdrawableCashInfoExperiment == transfersHubViewState.isInWithdrawableCashInfoExperiment && this.isAcatsRegionGateSupported == transfersHubViewState.isAcatsRegionGateSupported && Intrinsics.areEqual(this.acatsBonusInfo, transfersHubViewState.acatsBonusInfo) && this.isInRetirementTransferExperiment == transfersHubViewState.isInRetirementTransferExperiment && Intrinsics.areEqual(this.transferHubMicrogramSource, transfersHubViewState.transferHubMicrogramSource) && this.isLoading == transfersHubViewState.isLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.achRelationships.hashCode() * 31) + this.activeDebitCardInstruments.hashCode()) * 31) + Boolean.hashCode(this.hasAutomaticDeposits)) * 31) + Boolean.hashCode(this.isCashManagementEnabled)) * 31) + Boolean.hashCode(this.hasRhyAccount)) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.pendingHistoryItems;
        int iHashCode2 = (iHashCode + (pagedList == null ? 0 : pagedList.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2 = this.historyItems;
        int iHashCode3 = (((((((iHashCode2 + (pagedList2 == null ? 0 : pagedList2.hashCode())) * 31) + Boolean.hashCode(this.isUserInAutoDepositRecurringHookExperiment)) * 31) + Boolean.hashCode(this.isInWithdrawableCashInfoExperiment)) * 31) + Boolean.hashCode(this.isAcatsRegionGateSupported)) * 31;
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.acatsBonusInfo;
        int iHashCode4 = (((iHashCode3 + (apiAcatsBonusPromoInfo == null ? 0 : apiAcatsBonusPromoInfo.hashCode())) * 31) + Boolean.hashCode(this.isInRetirementTransferExperiment)) * 31;
        RemoteMicrogramApplication remoteMicrogramApplication = this.transferHubMicrogramSource;
        return ((iHashCode4 + (remoteMicrogramApplication != null ? remoteMicrogramApplication.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "TransfersHubViewState(achRelationships=" + this.achRelationships + ", activeDebitCardInstruments=" + this.activeDebitCardInstruments + ", hasAutomaticDeposits=" + this.hasAutomaticDeposits + ", isCashManagementEnabled=" + this.isCashManagementEnabled + ", hasRhyAccount=" + this.hasRhyAccount + ", pendingHistoryItems=" + this.pendingHistoryItems + ", historyItems=" + this.historyItems + ", isUserInAutoDepositRecurringHookExperiment=" + this.isUserInAutoDepositRecurringHookExperiment + ", isInWithdrawableCashInfoExperiment=" + this.isInWithdrawableCashInfoExperiment + ", isAcatsRegionGateSupported=" + this.isAcatsRegionGateSupported + ", acatsBonusInfo=" + this.acatsBonusInfo + ", isInRetirementTransferExperiment=" + this.isInRetirementTransferExperiment + ", transferHubMicrogramSource=" + this.transferHubMicrogramSource + ", isLoading=" + this.isLoading + ")";
    }

    public TransfersHubViewState(ImmutableList<AchRelationship> achRelationships, ImmutableList<ApiPaymentInstrument> activeDebitCardInstruments, boolean z, boolean z2, boolean z3, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2, boolean z4, boolean z5, boolean z6, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo, boolean z7, RemoteMicrogramApplication remoteMicrogramApplication, boolean z8) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        Intrinsics.checkNotNullParameter(activeDebitCardInstruments, "activeDebitCardInstruments");
        this.achRelationships = achRelationships;
        this.activeDebitCardInstruments = activeDebitCardInstruments;
        this.hasAutomaticDeposits = z;
        this.isCashManagementEnabled = z2;
        this.hasRhyAccount = z3;
        this.pendingHistoryItems = pagedList;
        this.historyItems = pagedList2;
        this.isUserInAutoDepositRecurringHookExperiment = z4;
        this.isInWithdrawableCashInfoExperiment = z5;
        this.isAcatsRegionGateSupported = z6;
        this.acatsBonusInfo = apiAcatsBonusPromoInfo;
        this.isInRetirementTransferExperiment = z7;
        this.transferHubMicrogramSource = remoteMicrogramApplication;
        this.isLoading = z8;
        this.isAcatsInRowVisible = z6;
        this.isAccountInfoTextVisible = z2;
        this.isAccountCardVisible = z2;
        this.isRetirementTransferRowVisible = z7;
        this.isPendingHistoryItemsSectionVisible = pagedList != null ? !pagedList.isEmpty() : false;
        this.isHistoryItemsSectionVisible = true;
        this.historySectionHeaderTitle = C30556R.string.move_money_completed_transfers_section_label;
        this.isDebitCardUserStatusBannerVisible = true ^ activeDebitCardInstruments.isEmpty();
    }

    public /* synthetic */ TransfersHubViewState(ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, boolean z3, PagedList pagedList, PagedList pagedList2, boolean z4, boolean z5, boolean z6, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo, boolean z7, RemoteMicrogramApplication remoteMicrogramApplication, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList, (i & 2) != 0 ? extensions2.persistentListOf() : immutableList2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : pagedList, (i & 64) != 0 ? null : pagedList2, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? null : apiAcatsBonusPromoInfo, (i & 2048) == 0 ? z7 : false, (i & 4096) == 0 ? remoteMicrogramApplication : null, (i & 8192) != 0 ? true : z8);
    }

    public final ImmutableList<AchRelationship> getAchRelationships() {
        return this.achRelationships;
    }

    public final ImmutableList<ApiPaymentInstrument> getActiveDebitCardInstruments() {
        return this.activeDebitCardInstruments;
    }

    public final boolean getHasAutomaticDeposits() {
        return this.hasAutomaticDeposits;
    }

    public final boolean isCashManagementEnabled() {
        return this.isCashManagementEnabled;
    }

    public final boolean getHasRhyAccount() {
        return this.hasRhyAccount;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getPendingHistoryItems() {
        return this.pendingHistoryItems;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getHistoryItems() {
        return this.historyItems;
    }

    public final boolean isUserInAutoDepositRecurringHookExperiment() {
        return this.isUserInAutoDepositRecurringHookExperiment;
    }

    public final RemoteMicrogramApplication getTransferHubMicrogramSource() {
        return this.transferHubMicrogramSource;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* renamed from: isAcatsInRowVisible, reason: from getter */
    public final boolean getIsAcatsInRowVisible() {
        return this.isAcatsInRowVisible;
    }

    /* renamed from: isAccountInfoTextVisible, reason: from getter */
    public final boolean getIsAccountInfoTextVisible() {
        return this.isAccountInfoTextVisible;
    }

    /* renamed from: isAccountCardVisible, reason: from getter */
    public final boolean getIsAccountCardVisible() {
        return this.isAccountCardVisible;
    }

    /* renamed from: isRetirementTransferRowVisible, reason: from getter */
    public final boolean getIsRetirementTransferRowVisible() {
        return this.isRetirementTransferRowVisible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Either<FragmentKey, IntentKey> getAutomaticDepositRowAction() {
        int i = 3;
        ApiAutomaticDeposit.Frequency frequency = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (this.hasAutomaticDeposits || this.isUserInAutoDepositRecurringHookExperiment) {
            return Either2.asLeft(new RecurringDepositsListKey(null, null, 3, null));
        }
        return Either2.asRight(new RecurringMaxTransfer(frequency, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
    }

    /* renamed from: isPendingHistoryItemsSectionVisible, reason: from getter */
    public final boolean getIsPendingHistoryItemsSectionVisible() {
        return this.isPendingHistoryItemsSectionVisible;
    }

    /* renamed from: isHistoryItemsSectionVisible, reason: from getter */
    public final boolean getIsHistoryItemsSectionVisible() {
        return this.isHistoryItemsSectionVisible;
    }

    public final int getHistorySectionHeaderTitle() {
        return this.historySectionHeaderTitle;
    }

    /* renamed from: isDebitCardUserStatusBannerVisible, reason: from getter */
    public final boolean getIsDebitCardUserStatusBannerVisible() {
        return this.isDebitCardUserStatusBannerVisible;
    }

    public final StringResource getAcatsRowPrimaryText() {
        if (isAcatsBonusEnabledForUser()) {
            return StringResource.INSTANCE.invoke(C30556R.string.move_money_acats_in_title_bonus, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C30556R.string.move_money_acats_in_title, new Object[0]);
    }

    public final StringResource getAcatsRowSecondaryTextBonus() {
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo;
        String matchPercentString;
        if (!isAcatsBonusEnabledForUser() || (apiAcatsBonusPromoInfo = this.acatsBonusInfo) == null || (matchPercentString = apiAcatsBonusPromoInfo.getMatchPercentString()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C30556R.string.move_money_acats_in_description_bonus, matchPercentString);
    }

    private final boolean isAcatsBonusEnabledForUser() {
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.acatsBonusInfo;
        return apiAcatsBonusPromoInfo != null && apiAcatsBonusPromoInfo.getShow_entry_point_promo() && this.acatsBonusInfo.is_active() && this.acatsBonusInfo.getMatch_percent() != null;
    }
}
