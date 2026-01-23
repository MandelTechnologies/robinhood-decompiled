package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.models.p320db.mcduckling.MerchantOfferTerms;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsOfferTermsViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsViewState;", "", "merchantOfferTerms", "Lcom/robinhood/models/db/mcduckling/MerchantOfferTerms;", "<init>", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferTerms;)V", "getMerchantOfferTerms", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferTerms;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MerchantRewardsOfferTermsViewState {
    public static final int $stable = 8;
    private final MerchantOfferTerms merchantOfferTerms;

    /* JADX WARN: Multi-variable type inference failed */
    public MerchantRewardsOfferTermsViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MerchantRewardsOfferTermsViewState copy$default(MerchantRewardsOfferTermsViewState merchantRewardsOfferTermsViewState, MerchantOfferTerms merchantOfferTerms, int i, Object obj) {
        if ((i & 1) != 0) {
            merchantOfferTerms = merchantRewardsOfferTermsViewState.merchantOfferTerms;
        }
        return merchantRewardsOfferTermsViewState.copy(merchantOfferTerms);
    }

    /* renamed from: component1, reason: from getter */
    public final MerchantOfferTerms getMerchantOfferTerms() {
        return this.merchantOfferTerms;
    }

    public final MerchantRewardsOfferTermsViewState copy(MerchantOfferTerms merchantOfferTerms) {
        return new MerchantRewardsOfferTermsViewState(merchantOfferTerms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MerchantRewardsOfferTermsViewState) && Intrinsics.areEqual(this.merchantOfferTerms, ((MerchantRewardsOfferTermsViewState) other).merchantOfferTerms);
    }

    public int hashCode() {
        MerchantOfferTerms merchantOfferTerms = this.merchantOfferTerms;
        if (merchantOfferTerms == null) {
            return 0;
        }
        return merchantOfferTerms.hashCode();
    }

    public String toString() {
        return "MerchantRewardsOfferTermsViewState(merchantOfferTerms=" + this.merchantOfferTerms + ")";
    }

    public MerchantRewardsOfferTermsViewState(MerchantOfferTerms merchantOfferTerms) {
        this.merchantOfferTerms = merchantOfferTerms;
    }

    public /* synthetic */ MerchantRewardsOfferTermsViewState(MerchantOfferTerms merchantOfferTerms, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : merchantOfferTerms);
    }

    public final MerchantOfferTerms getMerchantOfferTerms() {
        return this.merchantOfferTerms;
    }
}
