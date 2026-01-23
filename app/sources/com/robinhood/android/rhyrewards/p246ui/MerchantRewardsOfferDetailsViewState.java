package com.robinhood.android.rhyrewards.p246ui;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsOfferDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003JR\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\n\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;", "", "merchantOffer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "showViewAllOffersButton", "", "spendingAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "minervaSpendingAccount", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "isInP2pUpsellExperiment", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;", "<init>", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;ZLcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;)V", "getMerchantOffer", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "getShowViewAllOffersButton", "()Z", "getSpendingAccount", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "getMinervaSpendingAccount", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBanner", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;", "offerDetailType", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState$OfferDetailType;", "getOfferDetailType", "()Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState$OfferDetailType;", "shouldShowRhyUpsell", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;ZLcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;)Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;", "equals", "other", "hashCode", "", "toString", "", "OfferDetailType", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MerchantRewardsOfferDetailsViewState {
    public static final int $stable = 8;
    private final MerchantOfferBanner banner;
    private final Boolean isInP2pUpsellExperiment;
    private final MerchantOfferV2 merchantOffer;
    private final MinervaAccount minervaSpendingAccount;
    private final boolean shouldShowRhyUpsell;
    private final boolean showViewAllOffersButton;
    private final RhyAccount spendingAccount;

    public static /* synthetic */ MerchantRewardsOfferDetailsViewState copy$default(MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState, MerchantOfferV2 merchantOfferV2, boolean z, RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, MerchantOfferBanner merchantOfferBanner, int i, Object obj) {
        if ((i & 1) != 0) {
            merchantOfferV2 = merchantRewardsOfferDetailsViewState.merchantOffer;
        }
        if ((i & 2) != 0) {
            z = merchantRewardsOfferDetailsViewState.showViewAllOffersButton;
        }
        if ((i & 4) != 0) {
            rhyAccount = merchantRewardsOfferDetailsViewState.spendingAccount;
        }
        if ((i & 8) != 0) {
            minervaAccount = merchantRewardsOfferDetailsViewState.minervaSpendingAccount;
        }
        if ((i & 16) != 0) {
            bool = merchantRewardsOfferDetailsViewState.isInP2pUpsellExperiment;
        }
        if ((i & 32) != 0) {
            merchantOfferBanner = merchantRewardsOfferDetailsViewState.banner;
        }
        Boolean bool2 = bool;
        MerchantOfferBanner merchantOfferBanner2 = merchantOfferBanner;
        return merchantRewardsOfferDetailsViewState.copy(merchantOfferV2, z, rhyAccount, minervaAccount, bool2, merchantOfferBanner2);
    }

    /* renamed from: component1, reason: from getter */
    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowViewAllOffersButton() {
        return this.showViewAllOffersButton;
    }

    /* renamed from: component3, reason: from getter */
    public final RhyAccount getSpendingAccount() {
        return this.spendingAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final MinervaAccount getMinervaSpendingAccount() {
        return this.minervaSpendingAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsInP2pUpsellExperiment() {
        return this.isInP2pUpsellExperiment;
    }

    /* renamed from: component6, reason: from getter */
    public final MerchantOfferBanner getBanner() {
        return this.banner;
    }

    public final MerchantRewardsOfferDetailsViewState copy(MerchantOfferV2 merchantOffer, boolean showViewAllOffersButton, RhyAccount spendingAccount, MinervaAccount minervaSpendingAccount, Boolean isInP2pUpsellExperiment, MerchantOfferBanner banner) {
        Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
        return new MerchantRewardsOfferDetailsViewState(merchantOffer, showViewAllOffersButton, spendingAccount, minervaSpendingAccount, isInP2pUpsellExperiment, banner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantRewardsOfferDetailsViewState)) {
            return false;
        }
        MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState = (MerchantRewardsOfferDetailsViewState) other;
        return Intrinsics.areEqual(this.merchantOffer, merchantRewardsOfferDetailsViewState.merchantOffer) && this.showViewAllOffersButton == merchantRewardsOfferDetailsViewState.showViewAllOffersButton && Intrinsics.areEqual(this.spendingAccount, merchantRewardsOfferDetailsViewState.spendingAccount) && Intrinsics.areEqual(this.minervaSpendingAccount, merchantRewardsOfferDetailsViewState.minervaSpendingAccount) && Intrinsics.areEqual(this.isInP2pUpsellExperiment, merchantRewardsOfferDetailsViewState.isInP2pUpsellExperiment) && Intrinsics.areEqual(this.banner, merchantRewardsOfferDetailsViewState.banner);
    }

    public int hashCode() {
        int iHashCode = ((this.merchantOffer.hashCode() * 31) + Boolean.hashCode(this.showViewAllOffersButton)) * 31;
        RhyAccount rhyAccount = this.spendingAccount;
        int iHashCode2 = (iHashCode + (rhyAccount == null ? 0 : rhyAccount.hashCode())) * 31;
        MinervaAccount minervaAccount = this.minervaSpendingAccount;
        int iHashCode3 = (iHashCode2 + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31;
        Boolean bool = this.isInP2pUpsellExperiment;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        MerchantOfferBanner merchantOfferBanner = this.banner;
        return iHashCode4 + (merchantOfferBanner != null ? merchantOfferBanner.hashCode() : 0);
    }

    public String toString() {
        return "MerchantRewardsOfferDetailsViewState(merchantOffer=" + this.merchantOffer + ", showViewAllOffersButton=" + this.showViewAllOffersButton + ", spendingAccount=" + this.spendingAccount + ", minervaSpendingAccount=" + this.minervaSpendingAccount + ", isInP2pUpsellExperiment=" + this.isInP2pUpsellExperiment + ", banner=" + this.banner + ")";
    }

    public MerchantRewardsOfferDetailsViewState(MerchantOfferV2 merchantOffer, boolean z, RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, MerchantOfferBanner merchantOfferBanner) {
        Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
        this.merchantOffer = merchantOffer;
        this.showViewAllOffersButton = z;
        this.spendingAccount = rhyAccount;
        this.minervaSpendingAccount = minervaAccount;
        this.isInP2pUpsellExperiment = bool;
        this.banner = merchantOfferBanner;
        this.shouldShowRhyUpsell = minervaAccount == null && rhyAccount != null && Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public /* synthetic */ MerchantRewardsOfferDetailsViewState(MerchantOfferV2 merchantOfferV2, boolean z, RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, MerchantOfferBanner merchantOfferBanner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(merchantOfferV2, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : rhyAccount, (i & 8) != 0 ? null : minervaAccount, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : merchantOfferBanner);
    }

    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    public final boolean getShowViewAllOffersButton() {
        return this.showViewAllOffersButton;
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

    public final MerchantOfferBanner getBanner() {
        return this.banner;
    }

    public final OfferDetailType getOfferDetailType() {
        if (MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.INSTANCE.isRadFlatPercentOffer(String.valueOf(this.merchantOffer.getGlobalOfferId()))) {
            return OfferDetailType.SPECIAL_SPEND_OFFER;
        }
        return this.shouldShowRhyUpsell ? OfferDetailType.P2P_ONLY : OfferDetailType.DEFAULT;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MerchantRewardsOfferDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState$OfferDetailType;", "", "<init>", "(Ljava/lang/String;I)V", "SPECIAL_SPEND_OFFER", "P2P_ONLY", "DEFAULT", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OfferDetailType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OfferDetailType[] $VALUES;
        public static final OfferDetailType SPECIAL_SPEND_OFFER = new OfferDetailType("SPECIAL_SPEND_OFFER", 0);
        public static final OfferDetailType P2P_ONLY = new OfferDetailType("P2P_ONLY", 1);
        public static final OfferDetailType DEFAULT = new OfferDetailType("DEFAULT", 2);

        private static final /* synthetic */ OfferDetailType[] $values() {
            return new OfferDetailType[]{SPECIAL_SPEND_OFFER, P2P_ONLY, DEFAULT};
        }

        public static EnumEntries<OfferDetailType> getEntries() {
            return $ENTRIES;
        }

        private OfferDetailType(String str, int i) {
        }

        static {
            OfferDetailType[] offerDetailTypeArr$values = $values();
            $VALUES = offerDetailTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(offerDetailTypeArr$values);
        }

        public static OfferDetailType valueOf(String str) {
            return (OfferDetailType) Enum.valueOf(OfferDetailType.class, str);
        }

        public static OfferDetailType[] values() {
            return (OfferDetailType[]) $VALUES.clone();
        }
    }
}
