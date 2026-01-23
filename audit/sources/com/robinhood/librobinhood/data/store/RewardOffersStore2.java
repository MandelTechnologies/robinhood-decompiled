package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.rewardoffer.ApiRewardOffer;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardOffersStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "", "<init>", "()V", "RewardOffers", "ReferralOfferDetails", "RewardOfferDetails", "NoAccess", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$NoAccess;", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$ReferralOfferDetails;", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$RewardOfferDetails;", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$RewardOffers;", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.RewardOffersResponse, reason: use source file name */
/* loaded from: classes13.dex */
public abstract class RewardOffersStore2 {
    public /* synthetic */ RewardOffersStore2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RewardOffersStore2() {
    }

    /* compiled from: RewardOffersStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$RewardOffers;", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "rewardOffers", "", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOffer;", "initialSource", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getRewardOffers", "()Ljava/util/List;", "getInitialSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.RewardOffersResponse$RewardOffers, reason: from toString */
    public static final /* data */ class RewardOffers extends RewardOffersStore2 {
        private final String initialSource;
        private final List<ApiRewardOffer> rewardOffers;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RewardOffers copy$default(RewardOffers rewardOffers, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = rewardOffers.rewardOffers;
            }
            if ((i & 2) != 0) {
                str = rewardOffers.initialSource;
            }
            return rewardOffers.copy(list, str);
        }

        public final List<ApiRewardOffer> component1() {
            return this.rewardOffers;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialSource() {
            return this.initialSource;
        }

        public final RewardOffers copy(List<ApiRewardOffer> rewardOffers, String initialSource) {
            Intrinsics.checkNotNullParameter(rewardOffers, "rewardOffers");
            return new RewardOffers(rewardOffers, initialSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RewardOffers)) {
                return false;
            }
            RewardOffers rewardOffers = (RewardOffers) other;
            return Intrinsics.areEqual(this.rewardOffers, rewardOffers.rewardOffers) && Intrinsics.areEqual(this.initialSource, rewardOffers.initialSource);
        }

        public int hashCode() {
            int iHashCode = this.rewardOffers.hashCode() * 31;
            String str = this.initialSource;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RewardOffers(rewardOffers=" + this.rewardOffers + ", initialSource=" + this.initialSource + ")";
        }

        public final String getInitialSource() {
            return this.initialSource;
        }

        public final List<ApiRewardOffer> getRewardOffers() {
            return this.rewardOffers;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RewardOffers(List<ApiRewardOffer> rewardOffers, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(rewardOffers, "rewardOffers");
            this.rewardOffers = rewardOffers;
            this.initialSource = str;
        }
    }

    /* compiled from: RewardOffersStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$ReferralOfferDetails;", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "offerId", "Ljava/util/UUID;", "initialSource", "", "source", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getOfferId", "()Ljava/util/UUID;", "getInitialSource", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.RewardOffersResponse$ReferralOfferDetails, reason: from toString */
    public static final /* data */ class ReferralOfferDetails extends RewardOffersStore2 {
        private final String initialSource;
        private final UUID offerId;
        private final String source;

        public static /* synthetic */ ReferralOfferDetails copy$default(ReferralOfferDetails referralOfferDetails, UUID uuid, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = referralOfferDetails.offerId;
            }
            if ((i & 2) != 0) {
                str = referralOfferDetails.initialSource;
            }
            if ((i & 4) != 0) {
                str2 = referralOfferDetails.source;
            }
            return referralOfferDetails.copy(uuid, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOfferId() {
            return this.offerId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialSource() {
            return this.initialSource;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final ReferralOfferDetails copy(UUID offerId, String initialSource, String source) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            Intrinsics.checkNotNullParameter(source, "source");
            return new ReferralOfferDetails(offerId, initialSource, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReferralOfferDetails)) {
                return false;
            }
            ReferralOfferDetails referralOfferDetails = (ReferralOfferDetails) other;
            return Intrinsics.areEqual(this.offerId, referralOfferDetails.offerId) && Intrinsics.areEqual(this.initialSource, referralOfferDetails.initialSource) && Intrinsics.areEqual(this.source, referralOfferDetails.source);
        }

        public int hashCode() {
            int iHashCode = this.offerId.hashCode() * 31;
            String str = this.initialSource;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "ReferralOfferDetails(offerId=" + this.offerId + ", initialSource=" + this.initialSource + ", source=" + this.source + ")";
        }

        public final String getInitialSource() {
            return this.initialSource;
        }

        public final UUID getOfferId() {
            return this.offerId;
        }

        public final String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReferralOfferDetails(UUID offerId, String str, String source) {
            super(null);
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            Intrinsics.checkNotNullParameter(source, "source");
            this.offerId = offerId;
            this.initialSource = str;
            this.source = source;
        }
    }

    /* compiled from: RewardOffersStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$RewardOfferDetails;", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "rewardOfferDetails", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;", "initialSource", "", "<init>", "(Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;Ljava/lang/String;)V", "getRewardOfferDetails", "()Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;", "getInitialSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.RewardOffersResponse$RewardOfferDetails, reason: from toString */
    public static final /* data */ class RewardOfferDetails extends RewardOffersStore2 {
        private final String initialSource;
        private final ApiRewardOfferDetails rewardOfferDetails;

        public static /* synthetic */ RewardOfferDetails copy$default(RewardOfferDetails rewardOfferDetails, ApiRewardOfferDetails apiRewardOfferDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRewardOfferDetails = rewardOfferDetails.rewardOfferDetails;
            }
            if ((i & 2) != 0) {
                str = rewardOfferDetails.initialSource;
            }
            return rewardOfferDetails.copy(apiRewardOfferDetails, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRewardOfferDetails getRewardOfferDetails() {
            return this.rewardOfferDetails;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialSource() {
            return this.initialSource;
        }

        public final RewardOfferDetails copy(ApiRewardOfferDetails rewardOfferDetails, String initialSource) {
            Intrinsics.checkNotNullParameter(rewardOfferDetails, "rewardOfferDetails");
            return new RewardOfferDetails(rewardOfferDetails, initialSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RewardOfferDetails)) {
                return false;
            }
            RewardOfferDetails rewardOfferDetails = (RewardOfferDetails) other;
            return Intrinsics.areEqual(this.rewardOfferDetails, rewardOfferDetails.rewardOfferDetails) && Intrinsics.areEqual(this.initialSource, rewardOfferDetails.initialSource);
        }

        public int hashCode() {
            int iHashCode = this.rewardOfferDetails.hashCode() * 31;
            String str = this.initialSource;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RewardOfferDetails(rewardOfferDetails=" + this.rewardOfferDetails + ", initialSource=" + this.initialSource + ")";
        }

        public final String getInitialSource() {
            return this.initialSource;
        }

        public final ApiRewardOfferDetails getRewardOfferDetails() {
            return this.rewardOfferDetails;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RewardOfferDetails(ApiRewardOfferDetails rewardOfferDetails, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(rewardOfferDetails, "rewardOfferDetails");
            this.rewardOfferDetails = rewardOfferDetails;
            this.initialSource = str;
        }
    }

    /* compiled from: RewardOffersStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$NoAccess;", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.RewardOffersResponse$NoAccess */
    public static final /* data */ class NoAccess extends RewardOffersStore2 {
        public static final NoAccess INSTANCE = new NoAccess();

        public boolean equals(Object other) {
            return this == other || (other instanceof NoAccess);
        }

        public int hashCode() {
            return -2006323245;
        }

        public String toString() {
            return "NoAccess";
        }

        private NoAccess() {
            super(null);
        }
    }
}
