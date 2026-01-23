package com.robinhood.shared.crypto.staking.staking.stakinghub;

import com.robinhood.models.crypto.p315ui.staking.CryptoStakingHubModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingHubDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState;", "", "<init>", "()V", "Loading", "Error", "Content", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState$Content;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState$Error;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState$Loading;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoStakingHubDataState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoStakingHubDataState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoStakingHubDataState() {
    }

    /* compiled from: CryptoStakingHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState$Loading;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoStakingHubDataState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -17159027;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: CryptoStakingHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState$Error;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends CryptoStakingHubDataState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1182449049;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }

    /* compiled from: CryptoStakingHubDataState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState$Content;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState;", "stakingHubModel", "Lcom/robinhood/models/crypto/ui/staking/CryptoStakingHubModel;", "<init>", "(Lcom/robinhood/models/crypto/ui/staking/CryptoStakingHubModel;)V", "headerSection", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getHeaderSection", "()Lkotlinx/collections/immutable/ImmutableList;", "upsellSection", "getUpsellSection", "stakeableSection", "getStakeableSection", "stakedSection", "getStakedSection", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content extends CryptoStakingHubDataState {
        public static final int $stable = 8;
        private final CryptoStakingHubModel stakingHubModel;

        /* renamed from: component1, reason: from getter */
        private final CryptoStakingHubModel getStakingHubModel() {
            return this.stakingHubModel;
        }

        public static /* synthetic */ Content copy$default(Content content, CryptoStakingHubModel cryptoStakingHubModel, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoStakingHubModel = content.stakingHubModel;
            }
            return content.copy(cryptoStakingHubModel);
        }

        public final Content copy(CryptoStakingHubModel stakingHubModel) {
            Intrinsics.checkNotNullParameter(stakingHubModel, "stakingHubModel");
            return new Content(stakingHubModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Content) && Intrinsics.areEqual(this.stakingHubModel, ((Content) other).stakingHubModel);
        }

        public int hashCode() {
            return this.stakingHubModel.hashCode();
        }

        public String toString() {
            return "Content(stakingHubModel=" + this.stakingHubModel + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(CryptoStakingHubModel stakingHubModel) {
            super(null);
            Intrinsics.checkNotNullParameter(stakingHubModel, "stakingHubModel");
            this.stakingHubModel = stakingHubModel;
        }

        public final ImmutableList<UIComponent<GenericAction>> getHeaderSection() {
            return this.stakingHubModel.getHeaderSection();
        }

        public final ImmutableList<UIComponent<GenericAction>> getUpsellSection() {
            return this.stakingHubModel.getUpsellSection();
        }

        public final ImmutableList<UIComponent<GenericAction>> getStakeableSection() {
            return this.stakingHubModel.getStakeableSection();
        }

        public final ImmutableList<UIComponent<GenericAction>> getStakedSection() {
            return this.stakingHubModel.getStakedSection();
        }
    }
}
