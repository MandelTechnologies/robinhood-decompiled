package com.robinhood.android.cash.transaction.p079ui.reward;

import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.models.p320db.mcduckling.MerchantCardReward;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardTransactionRewardsBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState;", "", "<init>", "()V", "Loaded", "Loading", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState$Loaded;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState$Loading;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class CardTransactionRewardsBottomSheetViewState {
    public static final int $stable = 0;

    public /* synthetic */ CardTransactionRewardsBottomSheetViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardTransactionRewardsBottomSheetViewState() {
    }

    /* compiled from: CardTransactionRewardsBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState$Loaded;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState;", "rewards", "", "Lcom/robinhood/models/db/MerchantReward;", "<init>", "(Ljava/util/List;)V", "getRewards", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CardTransactionRewardsBottomSheetViewState {
        public static final int $stable = 8;
        private final List<MerchantReward> rewards;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.rewards;
            }
            return loaded.copy(list);
        }

        public final List<MerchantReward> component1() {
            return this.rewards;
        }

        public final Loaded copy(List<MerchantReward> rewards) {
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            return new Loaded(rewards);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.rewards, ((Loaded) other).rewards);
        }

        public int hashCode() {
            return this.rewards.hashCode();
        }

        public String toString() {
            return "Loaded(rewards=" + this.rewards + ")";
        }

        public final List<MerchantReward> getRewards() {
            return this.rewards;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(List<MerchantReward> rewards) {
            super(null);
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            this.rewards = rewards;
        }
    }

    /* compiled from: CardTransactionRewardsBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState$Loading;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState;", "rewards", "", "Lcom/robinhood/models/db/mcduckling/MerchantCardReward;", "<init>", "(Ljava/util/List;)V", "getRewards", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CardTransactionRewardsBottomSheetViewState {
        public static final int $stable = 8;
        private final List<MerchantCardReward> rewards;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loading copy$default(Loading loading, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loading.rewards;
            }
            return loading.copy(list);
        }

        public final List<MerchantCardReward> component1() {
            return this.rewards;
        }

        public final Loading copy(List<MerchantCardReward> rewards) {
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            return new Loading(rewards);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.rewards, ((Loading) other).rewards);
        }

        public int hashCode() {
            return this.rewards.hashCode();
        }

        public String toString() {
            return "Loading(rewards=" + this.rewards + ")";
        }

        public final List<MerchantCardReward> getRewards() {
            return this.rewards;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(List<MerchantCardReward> rewards) {
            super(null);
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            this.rewards = rewards;
        }
    }
}
