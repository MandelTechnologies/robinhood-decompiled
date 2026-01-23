package com.robinhood.android.referral.rewardoffers.offersList;

import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetails;
import com.robinhood.utils.Either;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardOffersViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersViewState;", "", "rewardOffersData", "Lcom/robinhood/utils/Either;", "", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;", "initialSource", "", "<init>", "(Lcom/robinhood/utils/Either;Ljava/lang/String;)V", "getRewardOffersData", "()Lcom/robinhood/utils/Either;", "getInitialSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RewardOffersViewState {
    public static final int $stable = 8;
    private final String initialSource;
    private final Either<List<RewardOfferViewType>, RewardOfferDetails> rewardOffersData;

    /* JADX WARN: Multi-variable type inference failed */
    public RewardOffersViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardOffersViewState copy$default(RewardOffersViewState rewardOffersViewState, Either either, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            either = rewardOffersViewState.rewardOffersData;
        }
        if ((i & 2) != 0) {
            str = rewardOffersViewState.initialSource;
        }
        return rewardOffersViewState.copy(either, str);
    }

    public final Either<List<RewardOfferViewType>, RewardOfferDetails> component1() {
        return this.rewardOffersData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitialSource() {
        return this.initialSource;
    }

    public final RewardOffersViewState copy(Either<? extends List<? extends RewardOfferViewType>, RewardOfferDetails> rewardOffersData, String initialSource) {
        return new RewardOffersViewState(rewardOffersData, initialSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardOffersViewState)) {
            return false;
        }
        RewardOffersViewState rewardOffersViewState = (RewardOffersViewState) other;
        return Intrinsics.areEqual(this.rewardOffersData, rewardOffersViewState.rewardOffersData) && Intrinsics.areEqual(this.initialSource, rewardOffersViewState.initialSource);
    }

    public int hashCode() {
        Either<List<RewardOfferViewType>, RewardOfferDetails> either = this.rewardOffersData;
        int iHashCode = (either == null ? 0 : either.hashCode()) * 31;
        String str = this.initialSource;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RewardOffersViewState(rewardOffersData=" + this.rewardOffersData + ", initialSource=" + this.initialSource + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RewardOffersViewState(Either<? extends List<? extends RewardOfferViewType>, RewardOfferDetails> either, String str) {
        this.rewardOffersData = either;
        this.initialSource = str;
    }

    public /* synthetic */ RewardOffersViewState(Either either, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : either, (i & 2) != 0 ? null : str);
    }

    public final Either<List<RewardOfferViewType>, RewardOfferDetails> getRewardOffersData() {
        return this.rewardOffersData;
    }

    public final String getInitialSource() {
        return this.initialSource;
    }
}
