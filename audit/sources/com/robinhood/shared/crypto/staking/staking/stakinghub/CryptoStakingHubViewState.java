package com.robinhood.shared.crypto.staking.staking.stakinghub;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState;", "", "<init>", "()V", "Loading", "Error", "Content", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState$Content;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState$Error;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState$Loading;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoStakingHubViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoStakingHubViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoStakingHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState$Loading;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoStakingHubViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -592522894;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private CryptoStakingHubViewState() {
    }

    /* compiled from: CryptoStakingHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState$Error;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends CryptoStakingHubViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1450006462;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }

    /* compiled from: CryptoStakingHubViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003Ja\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState$Content;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState;", "headerSection", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "upsellSection", "stakeableSection", "stakedSection", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getHeaderSection", "()Lkotlinx/collections/immutable/ImmutableList;", "getUpsellSection", "getStakeableSection", "getStakedSection", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content extends CryptoStakingHubViewState {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> headerSection;
        private final ImmutableList<UIComponent<GenericAction>> stakeableSection;
        private final ImmutableList<UIComponent<GenericAction>> stakedSection;
        private final ImmutableList<UIComponent<GenericAction>> upsellSection;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = content.headerSection;
            }
            if ((i & 2) != 0) {
                immutableList2 = content.upsellSection;
            }
            if ((i & 4) != 0) {
                immutableList3 = content.stakeableSection;
            }
            if ((i & 8) != 0) {
                immutableList4 = content.stakedSection;
            }
            return content.copy(immutableList, immutableList2, immutableList3, immutableList4);
        }

        public final ImmutableList<UIComponent<GenericAction>> component1() {
            return this.headerSection;
        }

        public final ImmutableList<UIComponent<GenericAction>> component2() {
            return this.upsellSection;
        }

        public final ImmutableList<UIComponent<GenericAction>> component3() {
            return this.stakeableSection;
        }

        public final ImmutableList<UIComponent<GenericAction>> component4() {
            return this.stakedSection;
        }

        public final Content copy(ImmutableList<? extends UIComponent<? extends GenericAction>> headerSection, ImmutableList<? extends UIComponent<? extends GenericAction>> upsellSection, ImmutableList<? extends UIComponent<? extends GenericAction>> stakeableSection, ImmutableList<? extends UIComponent<? extends GenericAction>> stakedSection) {
            Intrinsics.checkNotNullParameter(headerSection, "headerSection");
            Intrinsics.checkNotNullParameter(upsellSection, "upsellSection");
            Intrinsics.checkNotNullParameter(stakeableSection, "stakeableSection");
            Intrinsics.checkNotNullParameter(stakedSection, "stakedSection");
            return new Content(headerSection, upsellSection, stakeableSection, stakedSection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.headerSection, content.headerSection) && Intrinsics.areEqual(this.upsellSection, content.upsellSection) && Intrinsics.areEqual(this.stakeableSection, content.stakeableSection) && Intrinsics.areEqual(this.stakedSection, content.stakedSection);
        }

        public int hashCode() {
            return (((((this.headerSection.hashCode() * 31) + this.upsellSection.hashCode()) * 31) + this.stakeableSection.hashCode()) * 31) + this.stakedSection.hashCode();
        }

        public String toString() {
            return "Content(headerSection=" + this.headerSection + ", upsellSection=" + this.upsellSection + ", stakeableSection=" + this.stakeableSection + ", stakedSection=" + this.stakedSection + ")";
        }

        public final ImmutableList<UIComponent<GenericAction>> getHeaderSection() {
            return this.headerSection;
        }

        public final ImmutableList<UIComponent<GenericAction>> getUpsellSection() {
            return this.upsellSection;
        }

        public final ImmutableList<UIComponent<GenericAction>> getStakeableSection() {
            return this.stakeableSection;
        }

        public final ImmutableList<UIComponent<GenericAction>> getStakedSection() {
            return this.stakedSection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(ImmutableList<? extends UIComponent<? extends GenericAction>> headerSection, ImmutableList<? extends UIComponent<? extends GenericAction>> upsellSection, ImmutableList<? extends UIComponent<? extends GenericAction>> stakeableSection, ImmutableList<? extends UIComponent<? extends GenericAction>> stakedSection) {
            super(null);
            Intrinsics.checkNotNullParameter(headerSection, "headerSection");
            Intrinsics.checkNotNullParameter(upsellSection, "upsellSection");
            Intrinsics.checkNotNullParameter(stakeableSection, "stakeableSection");
            Intrinsics.checkNotNullParameter(stakedSection, "stakedSection");
            this.headerSection = headerSection;
            this.upsellSection = upsellSection;
            this.stakeableSection = stakeableSection;
            this.stakedSection = stakedSection;
        }
    }
}
