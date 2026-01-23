package com.robinhood.android.referral.rewardoffers.offersList;

import com.robinhood.librobinhood.data.store.RewardOffersStore2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardOffersViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDataState;", "", "value", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;)V", "getValue", "()Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RewardOffersDataState {
    public static final int $stable = 8;
    private final RewardOffersStore2 value;

    /* JADX WARN: Multi-variable type inference failed */
    public RewardOffersDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RewardOffersDataState copy$default(RewardOffersDataState rewardOffersDataState, RewardOffersStore2 rewardOffersStore2, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardOffersStore2 = rewardOffersDataState.value;
        }
        return rewardOffersDataState.copy(rewardOffersStore2);
    }

    /* renamed from: component1, reason: from getter */
    public final RewardOffersStore2 getValue() {
        return this.value;
    }

    public final RewardOffersDataState copy(RewardOffersStore2 value) {
        return new RewardOffersDataState(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RewardOffersDataState) && Intrinsics.areEqual(this.value, ((RewardOffersDataState) other).value);
    }

    public int hashCode() {
        RewardOffersStore2 rewardOffersStore2 = this.value;
        if (rewardOffersStore2 == null) {
            return 0;
        }
        return rewardOffersStore2.hashCode();
    }

    public String toString() {
        return "RewardOffersDataState(value=" + this.value + ")";
    }

    public RewardOffersDataState(RewardOffersStore2 rewardOffersStore2) {
        this.value = rewardOffersStore2;
    }

    public /* synthetic */ RewardOffersDataState(RewardOffersStore2 rewardOffersStore2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rewardOffersStore2);
    }

    public final RewardOffersStore2 getValue() {
        return this.value;
    }
}
