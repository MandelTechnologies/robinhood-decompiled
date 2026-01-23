package com.robinhood.android.isa.contributions;

import com.robinhood.android.common.history.p082ui.section.HistorySectionState;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContribution;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions2;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaTabBannerConfig;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: IsaContributionHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jo\u0010,\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionHubViewState;", "", "contributions", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContribution;", "contributionState", "Lcom/robinhood/android/isa/models/isa/db/entity/ContributionState;", "selectedContribution", "selectedContributed", "", "selectedRemaining", "Lcom/robinhood/utils/resource/StringResource;", "historyState", "Lcom/robinhood/android/common/history/ui/section/HistorySectionState;", "historyFooterNavKey", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "upsellConfig", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaTabBannerConfig;", "<init>", "(Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/isa/models/isa/db/entity/ContributionState;Lcom/robinhood/android/isa/models/isa/db/entity/IsaContribution;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/common/history/ui/section/HistorySectionState;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;Lcom/robinhood/android/isa/models/isa/db/entity/IsaTabBannerConfig;)V", "getContributions", "()Lkotlinx/collections/immutable/PersistentList;", "getContributionState", "()Lcom/robinhood/android/isa/models/isa/db/entity/ContributionState;", "getSelectedContribution", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaContribution;", "getSelectedContributed", "()Ljava/lang/String;", "getSelectedRemaining", "()Lcom/robinhood/utils/resource/StringResource;", "getHistoryState", "()Lcom/robinhood/android/common/history/ui/section/HistorySectionState;", "getHistoryFooterNavKey", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "getUpsellConfig", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaTabBannerConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaContributionHubViewState {
    public static final int $stable = 8;
    private final IsaContributions2 contributionState;
    private final ImmutableList3<IsaContribution> contributions;
    private final AccountsHistoryContract.Key historyFooterNavKey;
    private final HistorySectionState historyState;
    private final String selectedContributed;
    private final IsaContribution selectedContribution;
    private final StringResource selectedRemaining;
    private final IsaTabBannerConfig upsellConfig;

    public static /* synthetic */ IsaContributionHubViewState copy$default(IsaContributionHubViewState isaContributionHubViewState, ImmutableList3 immutableList3, IsaContributions2 isaContributions2, IsaContribution isaContribution, String str, StringResource stringResource, HistorySectionState historySectionState, AccountsHistoryContract.Key key, IsaTabBannerConfig isaTabBannerConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList3 = isaContributionHubViewState.contributions;
        }
        if ((i & 2) != 0) {
            isaContributions2 = isaContributionHubViewState.contributionState;
        }
        if ((i & 4) != 0) {
            isaContribution = isaContributionHubViewState.selectedContribution;
        }
        if ((i & 8) != 0) {
            str = isaContributionHubViewState.selectedContributed;
        }
        if ((i & 16) != 0) {
            stringResource = isaContributionHubViewState.selectedRemaining;
        }
        if ((i & 32) != 0) {
            historySectionState = isaContributionHubViewState.historyState;
        }
        if ((i & 64) != 0) {
            key = isaContributionHubViewState.historyFooterNavKey;
        }
        if ((i & 128) != 0) {
            isaTabBannerConfig = isaContributionHubViewState.upsellConfig;
        }
        AccountsHistoryContract.Key key2 = key;
        IsaTabBannerConfig isaTabBannerConfig2 = isaTabBannerConfig;
        StringResource stringResource2 = stringResource;
        HistorySectionState historySectionState2 = historySectionState;
        return isaContributionHubViewState.copy(immutableList3, isaContributions2, isaContribution, str, stringResource2, historySectionState2, key2, isaTabBannerConfig2);
    }

    public final ImmutableList3<IsaContribution> component1() {
        return this.contributions;
    }

    /* renamed from: component2, reason: from getter */
    public final IsaContributions2 getContributionState() {
        return this.contributionState;
    }

    /* renamed from: component3, reason: from getter */
    public final IsaContribution getSelectedContribution() {
        return this.selectedContribution;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectedContributed() {
        return this.selectedContributed;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSelectedRemaining() {
        return this.selectedRemaining;
    }

    /* renamed from: component6, reason: from getter */
    public final HistorySectionState getHistoryState() {
        return this.historyState;
    }

    /* renamed from: component7, reason: from getter */
    public final AccountsHistoryContract.Key getHistoryFooterNavKey() {
        return this.historyFooterNavKey;
    }

    /* renamed from: component8, reason: from getter */
    public final IsaTabBannerConfig getUpsellConfig() {
        return this.upsellConfig;
    }

    public final IsaContributionHubViewState copy(ImmutableList3<IsaContribution> contributions, IsaContributions2 contributionState, IsaContribution selectedContribution, String selectedContributed, StringResource selectedRemaining, HistorySectionState historyState, AccountsHistoryContract.Key historyFooterNavKey, IsaTabBannerConfig upsellConfig) {
        return new IsaContributionHubViewState(contributions, contributionState, selectedContribution, selectedContributed, selectedRemaining, historyState, historyFooterNavKey, upsellConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaContributionHubViewState)) {
            return false;
        }
        IsaContributionHubViewState isaContributionHubViewState = (IsaContributionHubViewState) other;
        return Intrinsics.areEqual(this.contributions, isaContributionHubViewState.contributions) && this.contributionState == isaContributionHubViewState.contributionState && Intrinsics.areEqual(this.selectedContribution, isaContributionHubViewState.selectedContribution) && Intrinsics.areEqual(this.selectedContributed, isaContributionHubViewState.selectedContributed) && Intrinsics.areEqual(this.selectedRemaining, isaContributionHubViewState.selectedRemaining) && Intrinsics.areEqual(this.historyState, isaContributionHubViewState.historyState) && Intrinsics.areEqual(this.historyFooterNavKey, isaContributionHubViewState.historyFooterNavKey) && Intrinsics.areEqual(this.upsellConfig, isaContributionHubViewState.upsellConfig);
    }

    public int hashCode() {
        ImmutableList3<IsaContribution> immutableList3 = this.contributions;
        int iHashCode = (immutableList3 == null ? 0 : immutableList3.hashCode()) * 31;
        IsaContributions2 isaContributions2 = this.contributionState;
        int iHashCode2 = (iHashCode + (isaContributions2 == null ? 0 : isaContributions2.hashCode())) * 31;
        IsaContribution isaContribution = this.selectedContribution;
        int iHashCode3 = (iHashCode2 + (isaContribution == null ? 0 : isaContribution.hashCode())) * 31;
        String str = this.selectedContributed;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource = this.selectedRemaining;
        int iHashCode5 = (iHashCode4 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        HistorySectionState historySectionState = this.historyState;
        int iHashCode6 = (iHashCode5 + (historySectionState == null ? 0 : historySectionState.hashCode())) * 31;
        AccountsHistoryContract.Key key = this.historyFooterNavKey;
        int iHashCode7 = (iHashCode6 + (key == null ? 0 : key.hashCode())) * 31;
        IsaTabBannerConfig isaTabBannerConfig = this.upsellConfig;
        return iHashCode7 + (isaTabBannerConfig != null ? isaTabBannerConfig.hashCode() : 0);
    }

    public String toString() {
        return "IsaContributionHubViewState(contributions=" + this.contributions + ", contributionState=" + this.contributionState + ", selectedContribution=" + this.selectedContribution + ", selectedContributed=" + this.selectedContributed + ", selectedRemaining=" + this.selectedRemaining + ", historyState=" + this.historyState + ", historyFooterNavKey=" + this.historyFooterNavKey + ", upsellConfig=" + this.upsellConfig + ")";
    }

    public IsaContributionHubViewState(ImmutableList3<IsaContribution> immutableList3, IsaContributions2 isaContributions2, IsaContribution isaContribution, String str, StringResource stringResource, HistorySectionState historySectionState, AccountsHistoryContract.Key key, IsaTabBannerConfig isaTabBannerConfig) {
        this.contributions = immutableList3;
        this.contributionState = isaContributions2;
        this.selectedContribution = isaContribution;
        this.selectedContributed = str;
        this.selectedRemaining = stringResource;
        this.historyState = historySectionState;
        this.historyFooterNavKey = key;
        this.upsellConfig = isaTabBannerConfig;
    }

    public final ImmutableList3<IsaContribution> getContributions() {
        return this.contributions;
    }

    public final IsaContributions2 getContributionState() {
        return this.contributionState;
    }

    public final IsaContribution getSelectedContribution() {
        return this.selectedContribution;
    }

    public final String getSelectedContributed() {
        return this.selectedContributed;
    }

    public final StringResource getSelectedRemaining() {
        return this.selectedRemaining;
    }

    public final HistorySectionState getHistoryState() {
        return this.historyState;
    }

    public final AccountsHistoryContract.Key getHistoryFooterNavKey() {
        return this.historyFooterNavKey;
    }

    public final IsaTabBannerConfig getUpsellConfig() {
        return this.upsellConfig;
    }
}
