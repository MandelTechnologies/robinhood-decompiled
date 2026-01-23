package com.robinhood.android.referral.rewardoffers.referralOffer.loading;

import com.robinhood.models.p355ui.referraloffer.ReferralOfferDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ReferralOfferLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingResult;", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/ui/referraloffer/ReferralOfferDetails;", "isMultiSelectContactsMember", "", "initialSource", "", "source", "<init>", "(Lcom/robinhood/models/ui/referraloffer/ReferralOfferDetails;ZLjava/lang/String;Ljava/lang/String;)V", "getDetails", "()Lcom/robinhood/models/ui/referraloffer/ReferralOfferDetails;", "()Z", "getInitialSource", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReferralOfferLoadingResult {
    public static final int $stable = 8;
    private final ReferralOfferDetails details;
    private final String initialSource;
    private final boolean isMultiSelectContactsMember;
    private final String source;

    public static /* synthetic */ ReferralOfferLoadingResult copy$default(ReferralOfferLoadingResult referralOfferLoadingResult, ReferralOfferDetails referralOfferDetails, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            referralOfferDetails = referralOfferLoadingResult.details;
        }
        if ((i & 2) != 0) {
            z = referralOfferLoadingResult.isMultiSelectContactsMember;
        }
        if ((i & 4) != 0) {
            str = referralOfferLoadingResult.initialSource;
        }
        if ((i & 8) != 0) {
            str2 = referralOfferLoadingResult.source;
        }
        return referralOfferLoadingResult.copy(referralOfferDetails, z, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ReferralOfferDetails getDetails() {
        return this.details;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsMultiSelectContactsMember() {
        return this.isMultiSelectContactsMember;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInitialSource() {
        return this.initialSource;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final ReferralOfferLoadingResult copy(ReferralOfferDetails details, boolean isMultiSelectContactsMember, String initialSource, String source) {
        Intrinsics.checkNotNullParameter(details, "details");
        return new ReferralOfferLoadingResult(details, isMultiSelectContactsMember, initialSource, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralOfferLoadingResult)) {
            return false;
        }
        ReferralOfferLoadingResult referralOfferLoadingResult = (ReferralOfferLoadingResult) other;
        return Intrinsics.areEqual(this.details, referralOfferLoadingResult.details) && this.isMultiSelectContactsMember == referralOfferLoadingResult.isMultiSelectContactsMember && Intrinsics.areEqual(this.initialSource, referralOfferLoadingResult.initialSource) && Intrinsics.areEqual(this.source, referralOfferLoadingResult.source);
    }

    public int hashCode() {
        int iHashCode = ((this.details.hashCode() * 31) + Boolean.hashCode(this.isMultiSelectContactsMember)) * 31;
        String str = this.initialSource;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ReferralOfferLoadingResult(details=" + this.details + ", isMultiSelectContactsMember=" + this.isMultiSelectContactsMember + ", initialSource=" + this.initialSource + ", source=" + this.source + ")";
    }

    public ReferralOfferLoadingResult(ReferralOfferDetails details, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.details = details;
        this.isMultiSelectContactsMember = z;
        this.initialSource = str;
        this.source = str2;
    }

    public final ReferralOfferDetails getDetails() {
        return this.details;
    }

    public final boolean isMultiSelectContactsMember() {
        return this.isMultiSelectContactsMember;
    }

    public final String getInitialSource() {
        return this.initialSource;
    }

    public final String getSource() {
        return this.source;
    }
}
