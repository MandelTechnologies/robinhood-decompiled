package com.robinhood.android.cash.rewards.p074ui.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsNotificationDetailsActivityViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsActivityViewState;", "", "hasBonus", "", "<init>", "(Ljava/lang/Boolean;)V", "getHasBonus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsActivityViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsNotificationDetailsActivityViewState {
    public static final int $stable = 0;
    private final Boolean hasBonus;

    /* JADX WARN: Multi-variable type inference failed */
    public RewardsNotificationDetailsActivityViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RewardsNotificationDetailsActivityViewState copy$default(RewardsNotificationDetailsActivityViewState rewardsNotificationDetailsActivityViewState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = rewardsNotificationDetailsActivityViewState.hasBonus;
        }
        return rewardsNotificationDetailsActivityViewState.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getHasBonus() {
        return this.hasBonus;
    }

    public final RewardsNotificationDetailsActivityViewState copy(Boolean hasBonus) {
        return new RewardsNotificationDetailsActivityViewState(hasBonus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RewardsNotificationDetailsActivityViewState) && Intrinsics.areEqual(this.hasBonus, ((RewardsNotificationDetailsActivityViewState) other).hasBonus);
    }

    public int hashCode() {
        Boolean bool = this.hasBonus;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "RewardsNotificationDetailsActivityViewState(hasBonus=" + this.hasBonus + ")";
    }

    public RewardsNotificationDetailsActivityViewState(Boolean bool) {
        this.hasBonus = bool;
    }

    public /* synthetic */ RewardsNotificationDetailsActivityViewState(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }

    public final Boolean getHasBonus() {
        return this.hasBonus;
    }
}
