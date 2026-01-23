package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsWelcomeFragmentDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\\\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\r\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataState;", "", "spendingAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "minervaSpendingAccount", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "isTimedOut", "", "mainContent", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing;", "subContent", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "isInP2pUpsellExperiment", "<init>", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/lang/Boolean;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing;Ljava/util/List;Ljava/lang/Boolean;)V", "getSpendingAccount", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "getMinervaSpendingAccount", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMainContent", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing;", "getSubContent", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/lang/Boolean;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing;Ljava/util/List;Ljava/lang/Boolean;)Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MerchantRewardsWelcomeFragmentDataState {
    public static final int $stable = 8;
    private final Boolean isInP2pUpsellExperiment;
    private final Boolean isTimedOut;
    private final ProductMarketing mainContent;
    private final MinervaAccount minervaSpendingAccount;
    private final RhyAccount spendingAccount;
    private final List<ProductMarketing.Feature> subContent;

    public MerchantRewardsWelcomeFragmentDataState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ MerchantRewardsWelcomeFragmentDataState copy$default(MerchantRewardsWelcomeFragmentDataState merchantRewardsWelcomeFragmentDataState, RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, ProductMarketing productMarketing, List list, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            rhyAccount = merchantRewardsWelcomeFragmentDataState.spendingAccount;
        }
        if ((i & 2) != 0) {
            minervaAccount = merchantRewardsWelcomeFragmentDataState.minervaSpendingAccount;
        }
        if ((i & 4) != 0) {
            bool = merchantRewardsWelcomeFragmentDataState.isTimedOut;
        }
        if ((i & 8) != 0) {
            productMarketing = merchantRewardsWelcomeFragmentDataState.mainContent;
        }
        if ((i & 16) != 0) {
            list = merchantRewardsWelcomeFragmentDataState.subContent;
        }
        if ((i & 32) != 0) {
            bool2 = merchantRewardsWelcomeFragmentDataState.isInP2pUpsellExperiment;
        }
        List list2 = list;
        Boolean bool3 = bool2;
        return merchantRewardsWelcomeFragmentDataState.copy(rhyAccount, minervaAccount, bool, productMarketing, list2, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final RhyAccount getSpendingAccount() {
        return this.spendingAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final MinervaAccount getMinervaSpendingAccount() {
        return this.minervaSpendingAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsTimedOut() {
        return this.isTimedOut;
    }

    /* renamed from: component4, reason: from getter */
    public final ProductMarketing getMainContent() {
        return this.mainContent;
    }

    public final List<ProductMarketing.Feature> component5() {
        return this.subContent;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsInP2pUpsellExperiment() {
        return this.isInP2pUpsellExperiment;
    }

    public final MerchantRewardsWelcomeFragmentDataState copy(RhyAccount spendingAccount, MinervaAccount minervaSpendingAccount, Boolean isTimedOut, ProductMarketing mainContent, List<ProductMarketing.Feature> subContent, Boolean isInP2pUpsellExperiment) {
        return new MerchantRewardsWelcomeFragmentDataState(spendingAccount, minervaSpendingAccount, isTimedOut, mainContent, subContent, isInP2pUpsellExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantRewardsWelcomeFragmentDataState)) {
            return false;
        }
        MerchantRewardsWelcomeFragmentDataState merchantRewardsWelcomeFragmentDataState = (MerchantRewardsWelcomeFragmentDataState) other;
        return Intrinsics.areEqual(this.spendingAccount, merchantRewardsWelcomeFragmentDataState.spendingAccount) && Intrinsics.areEqual(this.minervaSpendingAccount, merchantRewardsWelcomeFragmentDataState.minervaSpendingAccount) && Intrinsics.areEqual(this.isTimedOut, merchantRewardsWelcomeFragmentDataState.isTimedOut) && Intrinsics.areEqual(this.mainContent, merchantRewardsWelcomeFragmentDataState.mainContent) && Intrinsics.areEqual(this.subContent, merchantRewardsWelcomeFragmentDataState.subContent) && Intrinsics.areEqual(this.isInP2pUpsellExperiment, merchantRewardsWelcomeFragmentDataState.isInP2pUpsellExperiment);
    }

    public int hashCode() {
        RhyAccount rhyAccount = this.spendingAccount;
        int iHashCode = (rhyAccount == null ? 0 : rhyAccount.hashCode()) * 31;
        MinervaAccount minervaAccount = this.minervaSpendingAccount;
        int iHashCode2 = (iHashCode + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31;
        Boolean bool = this.isTimedOut;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ProductMarketing productMarketing = this.mainContent;
        int iHashCode4 = (iHashCode3 + (productMarketing == null ? 0 : productMarketing.hashCode())) * 31;
        List<ProductMarketing.Feature> list = this.subContent;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.isInP2pUpsellExperiment;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "MerchantRewardsWelcomeFragmentDataState(spendingAccount=" + this.spendingAccount + ", minervaSpendingAccount=" + this.minervaSpendingAccount + ", isTimedOut=" + this.isTimedOut + ", mainContent=" + this.mainContent + ", subContent=" + this.subContent + ", isInP2pUpsellExperiment=" + this.isInP2pUpsellExperiment + ")";
    }

    public MerchantRewardsWelcomeFragmentDataState(RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, ProductMarketing productMarketing, List<ProductMarketing.Feature> list, Boolean bool2) {
        this.spendingAccount = rhyAccount;
        this.minervaSpendingAccount = minervaAccount;
        this.isTimedOut = bool;
        this.mainContent = productMarketing;
        this.subContent = list;
        this.isInP2pUpsellExperiment = bool2;
    }

    public /* synthetic */ MerchantRewardsWelcomeFragmentDataState(RhyAccount rhyAccount, MinervaAccount minervaAccount, Boolean bool, ProductMarketing productMarketing, List list, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rhyAccount, (i & 2) != 0 ? null : minervaAccount, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : productMarketing, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : bool2);
    }

    public final RhyAccount getSpendingAccount() {
        return this.spendingAccount;
    }

    public final MinervaAccount getMinervaSpendingAccount() {
        return this.minervaSpendingAccount;
    }

    public final Boolean isTimedOut() {
        return this.isTimedOut;
    }

    public final ProductMarketing getMainContent() {
        return this.mainContent;
    }

    public final List<ProductMarketing.Feature> getSubContent() {
        return this.subContent;
    }

    public final Boolean isInP2pUpsellExperiment() {
        return this.isInP2pUpsellExperiment;
    }
}
