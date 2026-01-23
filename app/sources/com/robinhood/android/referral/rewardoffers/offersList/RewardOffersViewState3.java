package com.robinhood.android.referral.rewardoffers.offersList;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardOffersViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent;", "", "<init>", "()V", "ShowReferralOffer", "LoadingError", "FinishFlow", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent$FinishFlow;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent$LoadingError;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent$ShowReferralOffer;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersEvent, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class RewardOffersViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ RewardOffersViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RewardOffersViewState3() {
    }

    /* compiled from: RewardOffersViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent$ShowReferralOffer;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent;", "offerId", "Ljava/util/UUID;", "initialSource", "", "source", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getOfferId", "()Ljava/util/UUID;", "getInitialSource", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersEvent$ShowReferralOffer, reason: from toString */
    public static final /* data */ class ShowReferralOffer extends RewardOffersViewState3 {
        public static final int $stable = 8;
        private final String initialSource;
        private final UUID offerId;
        private final String source;

        public static /* synthetic */ ShowReferralOffer copy$default(ShowReferralOffer showReferralOffer, UUID uuid, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = showReferralOffer.offerId;
            }
            if ((i & 2) != 0) {
                str = showReferralOffer.initialSource;
            }
            if ((i & 4) != 0) {
                str2 = showReferralOffer.source;
            }
            return showReferralOffer.copy(uuid, str, str2);
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

        public final ShowReferralOffer copy(UUID offerId, String initialSource, String source) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            return new ShowReferralOffer(offerId, initialSource, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowReferralOffer)) {
                return false;
            }
            ShowReferralOffer showReferralOffer = (ShowReferralOffer) other;
            return Intrinsics.areEqual(this.offerId, showReferralOffer.offerId) && Intrinsics.areEqual(this.initialSource, showReferralOffer.initialSource) && Intrinsics.areEqual(this.source, showReferralOffer.source);
        }

        public int hashCode() {
            int iHashCode = this.offerId.hashCode() * 31;
            String str = this.initialSource;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ShowReferralOffer(offerId=" + this.offerId + ", initialSource=" + this.initialSource + ", source=" + this.source + ")";
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
        public ShowReferralOffer(UUID offerId, String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            this.offerId = offerId;
            this.initialSource = str;
            this.source = str2;
        }
    }

    /* compiled from: RewardOffersViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent$LoadingError;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersEvent$LoadingError, reason: from toString */
    public static final /* data */ class LoadingError extends RewardOffersViewState3 {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ LoadingError copy$default(LoadingError loadingError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = loadingError.error;
            }
            return loadingError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final LoadingError copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new LoadingError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingError) && Intrinsics.areEqual(this.error, ((LoadingError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "LoadingError(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingError(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: RewardOffersViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent$FinishFlow;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersEvent$FinishFlow */
    public static final /* data */ class FinishFlow extends RewardOffersViewState3 {
        public static final int $stable = 0;
        public static final FinishFlow INSTANCE = new FinishFlow();

        public boolean equals(Object other) {
            return this == other || (other instanceof FinishFlow);
        }

        public int hashCode() {
            return 2023546921;
        }

        public String toString() {
            return "FinishFlow";
        }

        private FinishFlow() {
            super(null);
        }
    }
}
