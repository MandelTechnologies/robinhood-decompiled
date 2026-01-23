package com.robinhood.android.gold.upgrade.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeDynamicContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;", "Landroid/os/Parcelable;", "plan", "Lcom/robinhood/models/subscription/api/MarginUpgradePlan;", "goldUpgradeFlow", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow;", "<init>", "(Lcom/robinhood/models/subscription/api/MarginUpgradePlan;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow;)V", "getPlan", "()Lcom/robinhood/models/subscription/api/MarginUpgradePlan;", "getGoldUpgradeFlow", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LegacyGoldUpgradeDynamicContext implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LegacyGoldUpgradeDynamicContext> CREATOR = new Creator();
    private final ApiGoldUpgradeFlow goldUpgradeFlow;
    private final MarginUpgradePlans2 plan;

    /* compiled from: LegacyGoldUpgradeDynamicContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LegacyGoldUpgradeDynamicContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyGoldUpgradeDynamicContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegacyGoldUpgradeDynamicContext((MarginUpgradePlans2) parcel.readParcelable(LegacyGoldUpgradeDynamicContext.class.getClassLoader()), (ApiGoldUpgradeFlow) parcel.readParcelable(LegacyGoldUpgradeDynamicContext.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyGoldUpgradeDynamicContext[] newArray(int i) {
            return new LegacyGoldUpgradeDynamicContext[i];
        }
    }

    public static /* synthetic */ LegacyGoldUpgradeDynamicContext copy$default(LegacyGoldUpgradeDynamicContext legacyGoldUpgradeDynamicContext, MarginUpgradePlans2 marginUpgradePlans2, ApiGoldUpgradeFlow apiGoldUpgradeFlow, int i, Object obj) {
        if ((i & 1) != 0) {
            marginUpgradePlans2 = legacyGoldUpgradeDynamicContext.plan;
        }
        if ((i & 2) != 0) {
            apiGoldUpgradeFlow = legacyGoldUpgradeDynamicContext.goldUpgradeFlow;
        }
        return legacyGoldUpgradeDynamicContext.copy(marginUpgradePlans2, apiGoldUpgradeFlow);
    }

    /* renamed from: component1, reason: from getter */
    public final MarginUpgradePlans2 getPlan() {
        return this.plan;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiGoldUpgradeFlow getGoldUpgradeFlow() {
        return this.goldUpgradeFlow;
    }

    public final LegacyGoldUpgradeDynamicContext copy(MarginUpgradePlans2 plan, ApiGoldUpgradeFlow goldUpgradeFlow) {
        Intrinsics.checkNotNullParameter(goldUpgradeFlow, "goldUpgradeFlow");
        return new LegacyGoldUpgradeDynamicContext(plan, goldUpgradeFlow);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyGoldUpgradeDynamicContext)) {
            return false;
        }
        LegacyGoldUpgradeDynamicContext legacyGoldUpgradeDynamicContext = (LegacyGoldUpgradeDynamicContext) other;
        return Intrinsics.areEqual(this.plan, legacyGoldUpgradeDynamicContext.plan) && Intrinsics.areEqual(this.goldUpgradeFlow, legacyGoldUpgradeDynamicContext.goldUpgradeFlow);
    }

    public int hashCode() {
        MarginUpgradePlans2 marginUpgradePlans2 = this.plan;
        return ((marginUpgradePlans2 == null ? 0 : marginUpgradePlans2.hashCode()) * 31) + this.goldUpgradeFlow.hashCode();
    }

    public String toString() {
        return "LegacyGoldUpgradeDynamicContext(plan=" + this.plan + ", goldUpgradeFlow=" + this.goldUpgradeFlow + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.plan, flags);
        dest.writeParcelable(this.goldUpgradeFlow, flags);
    }

    public LegacyGoldUpgradeDynamicContext(MarginUpgradePlans2 marginUpgradePlans2, ApiGoldUpgradeFlow goldUpgradeFlow) {
        Intrinsics.checkNotNullParameter(goldUpgradeFlow, "goldUpgradeFlow");
        this.plan = marginUpgradePlans2;
        this.goldUpgradeFlow = goldUpgradeFlow;
    }

    public final MarginUpgradePlans2 getPlan() {
        return this.plan;
    }

    public final ApiGoldUpgradeFlow getGoldUpgradeFlow() {
        return this.goldUpgradeFlow;
    }
}
