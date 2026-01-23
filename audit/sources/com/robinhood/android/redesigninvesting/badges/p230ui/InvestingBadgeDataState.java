package com.robinhood.android.redesigninvesting.badges.p230ui;

import com.robinhood.android.redesigninvesting.models.badges.InvestingBadge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingBadgeDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeDataState;", "", "badge", "Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;", "<init>", "(Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;)V", "getBadge", "()Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-badges-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvestingBadgeDataState {
    public static final int $stable = 8;
    private final InvestingBadge badge;

    /* JADX WARN: Multi-variable type inference failed */
    public InvestingBadgeDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InvestingBadgeDataState copy$default(InvestingBadgeDataState investingBadgeDataState, InvestingBadge investingBadge, int i, Object obj) {
        if ((i & 1) != 0) {
            investingBadge = investingBadgeDataState.badge;
        }
        return investingBadgeDataState.copy(investingBadge);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestingBadge getBadge() {
        return this.badge;
    }

    public final InvestingBadgeDataState copy(InvestingBadge badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        return new InvestingBadgeDataState(badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InvestingBadgeDataState) && Intrinsics.areEqual(this.badge, ((InvestingBadgeDataState) other).badge);
    }

    public int hashCode() {
        return this.badge.hashCode();
    }

    public String toString() {
        return "InvestingBadgeDataState(badge=" + this.badge + ")";
    }

    public InvestingBadgeDataState(InvestingBadge badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.badge = badge;
    }

    public /* synthetic */ InvestingBadgeDataState(InvestingBadge investingBadge, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestingBadge.None.INSTANCE : investingBadge);
    }

    public final InvestingBadge getBadge() {
        return this.badge;
    }
}
