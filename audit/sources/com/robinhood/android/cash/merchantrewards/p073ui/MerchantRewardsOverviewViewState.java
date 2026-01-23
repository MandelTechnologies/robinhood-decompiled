package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer2;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsOverviewViewState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010$J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bHÂ\u0003J\u0086\u0001\u00107\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0010\u0010$R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0011\u0010(\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010\u0017¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;", "", "merchantOffers", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "rhyReferralEligibility", "Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "stateWrapper", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsStateWrapper;", "merchantOffer", "radTransferComplete", "Lcom/robinhood/udf/UiEvent;", "spendingAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "minervaSpendingAccount", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "isInP2pUpsellExperiment", "", "shouldShowMerchantOffer", "", "<init>", "(Ljava/util/List;Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsStateWrapper;Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;)V", "getMerchantOffers", "()Ljava/util/List;", "getRhyReferralEligibility", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "getStateWrapper", "()Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsStateWrapper;", "getMerchantOffer", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "getRadTransferComplete", "()Lcom/robinhood/udf/UiEvent;", "getSpendingAccount", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "getMinervaSpendingAccount", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "showMerchantOfferEvent", "getShowMerchantOfferEvent", "shouldShowRhyUpsell", "getShouldShowRhyUpsell", "()Z", "cashCardOffers", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "getCashCardOffers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsStateWrapper;Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/lang/Boolean;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MerchantRewardsOverviewViewState {
    public static final int $stable = 8;
    private final Boolean isInP2pUpsellExperiment;
    private final MerchantOfferV2 merchantOffer;
    private final List<MerchantOfferV2> merchantOffers;
    private final MinervaAccount minervaSpendingAccount;
    private final UiEvent<MerchantOfferV2> radTransferComplete;
    private final RhyReferralEligibility rhyReferralEligibility;
    private final UiEvent<Unit> shouldShowMerchantOffer;
    private final boolean shouldShowRhyUpsell;
    private final RhyAccount spendingAccount;
    private final MerchantRewardsStateWrapper stateWrapper;

    public MerchantRewardsOverviewViewState() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    private final UiEvent<Unit> component9() {
        return this.shouldShowMerchantOffer;
    }

    public static /* synthetic */ MerchantRewardsOverviewViewState copy$default(MerchantRewardsOverviewViewState merchantRewardsOverviewViewState, List list, RhyReferralEligibility rhyReferralEligibility, MerchantRewardsStateWrapper merchantRewardsStateWrapper, MerchantOfferV2 merchantOfferV2, UiEvent uiEvent, RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = merchantRewardsOverviewViewState.merchantOffers;
        }
        if ((i & 2) != 0) {
            rhyReferralEligibility = merchantRewardsOverviewViewState.rhyReferralEligibility;
        }
        if ((i & 4) != 0) {
            merchantRewardsStateWrapper = merchantRewardsOverviewViewState.stateWrapper;
        }
        if ((i & 8) != 0) {
            merchantOfferV2 = merchantRewardsOverviewViewState.merchantOffer;
        }
        if ((i & 16) != 0) {
            uiEvent = merchantRewardsOverviewViewState.radTransferComplete;
        }
        if ((i & 32) != 0) {
            rhyAccount = merchantRewardsOverviewViewState.spendingAccount;
        }
        if ((i & 64) != 0) {
            minervaAccount = merchantRewardsOverviewViewState.minervaSpendingAccount;
        }
        if ((i & 128) != 0) {
            bool = merchantRewardsOverviewViewState.isInP2pUpsellExperiment;
        }
        if ((i & 256) != 0) {
            uiEvent2 = merchantRewardsOverviewViewState.shouldShowMerchantOffer;
        }
        Boolean bool2 = bool;
        UiEvent uiEvent3 = uiEvent2;
        RhyAccount rhyAccount2 = rhyAccount;
        MinervaAccount minervaAccount2 = minervaAccount;
        UiEvent uiEvent4 = uiEvent;
        MerchantRewardsStateWrapper merchantRewardsStateWrapper2 = merchantRewardsStateWrapper;
        return merchantRewardsOverviewViewState.copy(list, rhyReferralEligibility, merchantRewardsStateWrapper2, merchantOfferV2, uiEvent4, rhyAccount2, minervaAccount2, bool2, uiEvent3);
    }

    public final List<MerchantOfferV2> component1() {
        return this.merchantOffers;
    }

    /* renamed from: component2, reason: from getter */
    public final RhyReferralEligibility getRhyReferralEligibility() {
        return this.rhyReferralEligibility;
    }

    /* renamed from: component3, reason: from getter */
    public final MerchantRewardsStateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    /* renamed from: component4, reason: from getter */
    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    public final UiEvent<MerchantOfferV2> component5() {
        return this.radTransferComplete;
    }

    /* renamed from: component6, reason: from getter */
    public final RhyAccount getSpendingAccount() {
        return this.spendingAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final MinervaAccount getMinervaSpendingAccount() {
        return this.minervaSpendingAccount;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsInP2pUpsellExperiment() {
        return this.isInP2pUpsellExperiment;
    }

    public final MerchantRewardsOverviewViewState copy(List<MerchantOfferV2> merchantOffers, RhyReferralEligibility rhyReferralEligibility, MerchantRewardsStateWrapper stateWrapper, MerchantOfferV2 merchantOffer, UiEvent<MerchantOfferV2> radTransferComplete, RhyAccount spendingAccount, MinervaAccount minervaSpendingAccount, Boolean isInP2pUpsellExperiment, UiEvent<Unit> shouldShowMerchantOffer) {
        Intrinsics.checkNotNullParameter(merchantOffers, "merchantOffers");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        Intrinsics.checkNotNullParameter(shouldShowMerchantOffer, "shouldShowMerchantOffer");
        return new MerchantRewardsOverviewViewState(merchantOffers, rhyReferralEligibility, stateWrapper, merchantOffer, radTransferComplete, spendingAccount, minervaSpendingAccount, isInP2pUpsellExperiment, shouldShowMerchantOffer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantRewardsOverviewViewState)) {
            return false;
        }
        MerchantRewardsOverviewViewState merchantRewardsOverviewViewState = (MerchantRewardsOverviewViewState) other;
        return Intrinsics.areEqual(this.merchantOffers, merchantRewardsOverviewViewState.merchantOffers) && Intrinsics.areEqual(this.rhyReferralEligibility, merchantRewardsOverviewViewState.rhyReferralEligibility) && Intrinsics.areEqual(this.stateWrapper, merchantRewardsOverviewViewState.stateWrapper) && Intrinsics.areEqual(this.merchantOffer, merchantRewardsOverviewViewState.merchantOffer) && Intrinsics.areEqual(this.radTransferComplete, merchantRewardsOverviewViewState.radTransferComplete) && Intrinsics.areEqual(this.spendingAccount, merchantRewardsOverviewViewState.spendingAccount) && Intrinsics.areEqual(this.minervaSpendingAccount, merchantRewardsOverviewViewState.minervaSpendingAccount) && Intrinsics.areEqual(this.isInP2pUpsellExperiment, merchantRewardsOverviewViewState.isInP2pUpsellExperiment) && Intrinsics.areEqual(this.shouldShowMerchantOffer, merchantRewardsOverviewViewState.shouldShowMerchantOffer);
    }

    public int hashCode() {
        int iHashCode = this.merchantOffers.hashCode() * 31;
        RhyReferralEligibility rhyReferralEligibility = this.rhyReferralEligibility;
        int iHashCode2 = (((iHashCode + (rhyReferralEligibility == null ? 0 : rhyReferralEligibility.hashCode())) * 31) + this.stateWrapper.hashCode()) * 31;
        MerchantOfferV2 merchantOfferV2 = this.merchantOffer;
        int iHashCode3 = (iHashCode2 + (merchantOfferV2 == null ? 0 : merchantOfferV2.hashCode())) * 31;
        UiEvent<MerchantOfferV2> uiEvent = this.radTransferComplete;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        RhyAccount rhyAccount = this.spendingAccount;
        int iHashCode5 = (iHashCode4 + (rhyAccount == null ? 0 : rhyAccount.hashCode())) * 31;
        MinervaAccount minervaAccount = this.minervaSpendingAccount;
        int iHashCode6 = (iHashCode5 + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31;
        Boolean bool = this.isInP2pUpsellExperiment;
        return ((iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 31) + this.shouldShowMerchantOffer.hashCode();
    }

    public String toString() {
        return "MerchantRewardsOverviewViewState(merchantOffers=" + this.merchantOffers + ", rhyReferralEligibility=" + this.rhyReferralEligibility + ", stateWrapper=" + this.stateWrapper + ", merchantOffer=" + this.merchantOffer + ", radTransferComplete=" + this.radTransferComplete + ", spendingAccount=" + this.spendingAccount + ", minervaSpendingAccount=" + this.minervaSpendingAccount + ", isInP2pUpsellExperiment=" + this.isInP2pUpsellExperiment + ", shouldShowMerchantOffer=" + this.shouldShowMerchantOffer + ")";
    }

    public MerchantRewardsOverviewViewState(List<MerchantOfferV2> merchantOffers, RhyReferralEligibility rhyReferralEligibility, MerchantRewardsStateWrapper stateWrapper, MerchantOfferV2 merchantOfferV2, UiEvent<MerchantOfferV2> uiEvent, RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, UiEvent<Unit> shouldShowMerchantOffer) {
        Intrinsics.checkNotNullParameter(merchantOffers, "merchantOffers");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        Intrinsics.checkNotNullParameter(shouldShowMerchantOffer, "shouldShowMerchantOffer");
        this.merchantOffers = merchantOffers;
        this.rhyReferralEligibility = rhyReferralEligibility;
        this.stateWrapper = stateWrapper;
        this.merchantOffer = merchantOfferV2;
        this.radTransferComplete = uiEvent;
        this.spendingAccount = rhyAccount;
        this.minervaSpendingAccount = minervaAccount;
        this.isInP2pUpsellExperiment = bool;
        this.shouldShowMerchantOffer = shouldShowMerchantOffer;
        this.shouldShowRhyUpsell = minervaAccount == null && rhyAccount != null && Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public /* synthetic */ MerchantRewardsOverviewViewState(List list, RhyReferralEligibility rhyReferralEligibility, MerchantRewardsStateWrapper merchantRewardsStateWrapper, MerchantOfferV2 merchantOfferV2, UiEvent uiEvent, RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : rhyReferralEligibility, (i & 4) != 0 ? new MerchantRewardsStateWrapper(null, 1, null) : merchantRewardsStateWrapper, (i & 8) != 0 ? null : merchantOfferV2, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? null : rhyAccount, (i & 64) != 0 ? null : minervaAccount, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? new UiEvent(Unit.INSTANCE) : uiEvent2);
    }

    public final List<MerchantOfferV2> getMerchantOffers() {
        return this.merchantOffers;
    }

    public final RhyReferralEligibility getRhyReferralEligibility() {
        return this.rhyReferralEligibility;
    }

    public final MerchantRewardsStateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    public final UiEvent<MerchantOfferV2> getRadTransferComplete() {
        return this.radTransferComplete;
    }

    public final RhyAccount getSpendingAccount() {
        return this.spendingAccount;
    }

    public final MinervaAccount getMinervaSpendingAccount() {
        return this.minervaSpendingAccount;
    }

    public final Boolean isInP2pUpsellExperiment() {
        return this.isInP2pUpsellExperiment;
    }

    public final UiEvent<MerchantOfferV2> getShowMerchantOfferEvent() {
        if (this.merchantOffer == null || this.shouldShowMerchantOffer.consume() == null) {
            return null;
        }
        return new UiEvent<>(this.merchantOffer);
    }

    public final boolean getShouldShowRhyUpsell() {
        return this.shouldShowRhyUpsell;
    }

    public final List<CashCardOffer> getCashCardOffers() {
        List<MerchantOfferV2> list = this.merchantOffers;
        RhyReferralEligibility rhyReferralEligibility = this.rhyReferralEligibility;
        return CashCardOffer2.combineOffersFullScreen(list, rhyReferralEligibility != null ? rhyReferralEligibility.getRhyReferralVariant() : null);
    }
}
