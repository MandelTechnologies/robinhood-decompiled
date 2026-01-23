package com.robinhood.android.advisory.portfolio.update.donut;

import advisory.update_investor_profile.proto.p009v1.Direction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: UpdateInvestorProfileDonutData.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData;", "", "defaultPrimaryText", "", "defaultSecondaryText", "slices", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData$Slice;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getDefaultPrimaryText", "()Ljava/lang/String;", "getDefaultSecondaryText", "getSlices", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Slice", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateInvestorProfileDonutData {
    public static final int $stable = 0;
    private final String defaultPrimaryText;
    private final String defaultSecondaryText;
    private final ImmutableList<Slice> slices;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateInvestorProfileDonutData copy$default(UpdateInvestorProfileDonutData updateInvestorProfileDonutData, String str, String str2, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateInvestorProfileDonutData.defaultPrimaryText;
        }
        if ((i & 2) != 0) {
            str2 = updateInvestorProfileDonutData.defaultSecondaryText;
        }
        if ((i & 4) != 0) {
            immutableList = updateInvestorProfileDonutData.slices;
        }
        return updateInvestorProfileDonutData.copy(str, str2, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefaultPrimaryText() {
        return this.defaultPrimaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDefaultSecondaryText() {
        return this.defaultSecondaryText;
    }

    public final ImmutableList<Slice> component3() {
        return this.slices;
    }

    public final UpdateInvestorProfileDonutData copy(String defaultPrimaryText, String defaultSecondaryText, ImmutableList<Slice> slices) {
        Intrinsics.checkNotNullParameter(defaultPrimaryText, "defaultPrimaryText");
        Intrinsics.checkNotNullParameter(defaultSecondaryText, "defaultSecondaryText");
        Intrinsics.checkNotNullParameter(slices, "slices");
        return new UpdateInvestorProfileDonutData(defaultPrimaryText, defaultSecondaryText, slices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateInvestorProfileDonutData)) {
            return false;
        }
        UpdateInvestorProfileDonutData updateInvestorProfileDonutData = (UpdateInvestorProfileDonutData) other;
        return Intrinsics.areEqual(this.defaultPrimaryText, updateInvestorProfileDonutData.defaultPrimaryText) && Intrinsics.areEqual(this.defaultSecondaryText, updateInvestorProfileDonutData.defaultSecondaryText) && Intrinsics.areEqual(this.slices, updateInvestorProfileDonutData.slices);
    }

    public int hashCode() {
        return (((this.defaultPrimaryText.hashCode() * 31) + this.defaultSecondaryText.hashCode()) * 31) + this.slices.hashCode();
    }

    public String toString() {
        return "UpdateInvestorProfileDonutData(defaultPrimaryText=" + this.defaultPrimaryText + ", defaultSecondaryText=" + this.defaultSecondaryText + ", slices=" + this.slices + ")";
    }

    public UpdateInvestorProfileDonutData(String defaultPrimaryText, String defaultSecondaryText, ImmutableList<Slice> slices) {
        Intrinsics.checkNotNullParameter(defaultPrimaryText, "defaultPrimaryText");
        Intrinsics.checkNotNullParameter(defaultSecondaryText, "defaultSecondaryText");
        Intrinsics.checkNotNullParameter(slices, "slices");
        this.defaultPrimaryText = defaultPrimaryText;
        this.defaultSecondaryText = defaultSecondaryText;
        this.slices = slices;
    }

    public final String getDefaultPrimaryText() {
        return this.defaultPrimaryText;
    }

    public final String getDefaultSecondaryText() {
        return this.defaultSecondaryText;
    }

    public final ImmutableList<Slice> getSlices() {
        return this.slices;
    }

    /* compiled from: UpdateInvestorProfileDonutData.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/donut/UpdateInvestorProfileDonutData$Slice;", "", "primaryText", "", "secondaryText", "allocationPercentage", "", "direction", "Ladvisory/update_investor_profile/proto/v1/Direction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLadvisory/update_investor_profile/proto/v1/Direction;)V", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "getAllocationPercentage", "()F", "getDirection", "()Ladvisory/update_investor_profile/proto/v1/Direction;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Slice {
        public static final int $stable = 0;
        private final float allocationPercentage;
        private final Direction direction;
        private final String primaryText;
        private final String secondaryText;

        public static /* synthetic */ Slice copy$default(Slice slice, String str, String str2, float f, Direction direction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = slice.primaryText;
            }
            if ((i & 2) != 0) {
                str2 = slice.secondaryText;
            }
            if ((i & 4) != 0) {
                f = slice.allocationPercentage;
            }
            if ((i & 8) != 0) {
                direction = slice.direction;
            }
            return slice.copy(str, str2, f, direction);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component3, reason: from getter */
        public final float getAllocationPercentage() {
            return this.allocationPercentage;
        }

        /* renamed from: component4, reason: from getter */
        public final Direction getDirection() {
            return this.direction;
        }

        public final Slice copy(String primaryText, String secondaryText, float allocationPercentage, Direction direction) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new Slice(primaryText, secondaryText, allocationPercentage, direction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Slice)) {
                return false;
            }
            Slice slice = (Slice) other;
            return Intrinsics.areEqual(this.primaryText, slice.primaryText) && Intrinsics.areEqual(this.secondaryText, slice.secondaryText) && Float.compare(this.allocationPercentage, slice.allocationPercentage) == 0 && this.direction == slice.direction;
        }

        public int hashCode() {
            return (((((this.primaryText.hashCode() * 31) + this.secondaryText.hashCode()) * 31) + Float.hashCode(this.allocationPercentage)) * 31) + this.direction.hashCode();
        }

        public String toString() {
            return "Slice(primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", allocationPercentage=" + this.allocationPercentage + ", direction=" + this.direction + ")";
        }

        public Slice(String primaryText, String secondaryText, float f, Direction direction) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.allocationPercentage = f;
            this.direction = direction;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final float getAllocationPercentage() {
            return this.allocationPercentage;
        }

        public final Direction getDirection() {
            return this.direction;
        }
    }
}
