package com.robinhood.android.lib.creditcard.p165ui.invite;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CreditApplicationInviteBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteState;", "", "shouldShowInviteBanner", "", "inSearchExperiment", "inAccountExperiment", "inInboxExperiment", "<init>", "(ZZZZ)V", "getShouldShowInviteBanner", "()Z", "getInSearchExperiment", "getInAccountExperiment", "getInInboxExperiment", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreditApplicationInviteState {
    public static final int $stable = 0;
    private final boolean inAccountExperiment;
    private final boolean inInboxExperiment;
    private final boolean inSearchExperiment;
    private final boolean shouldShowInviteBanner;

    public CreditApplicationInviteState() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ CreditApplicationInviteState copy$default(CreditApplicationInviteState creditApplicationInviteState, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = creditApplicationInviteState.shouldShowInviteBanner;
        }
        if ((i & 2) != 0) {
            z2 = creditApplicationInviteState.inSearchExperiment;
        }
        if ((i & 4) != 0) {
            z3 = creditApplicationInviteState.inAccountExperiment;
        }
        if ((i & 8) != 0) {
            z4 = creditApplicationInviteState.inInboxExperiment;
        }
        return creditApplicationInviteState.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldShowInviteBanner() {
        return this.shouldShowInviteBanner;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInSearchExperiment() {
        return this.inSearchExperiment;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInAccountExperiment() {
        return this.inAccountExperiment;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInInboxExperiment() {
        return this.inInboxExperiment;
    }

    public final CreditApplicationInviteState copy(boolean shouldShowInviteBanner, boolean inSearchExperiment, boolean inAccountExperiment, boolean inInboxExperiment) {
        return new CreditApplicationInviteState(shouldShowInviteBanner, inSearchExperiment, inAccountExperiment, inInboxExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditApplicationInviteState)) {
            return false;
        }
        CreditApplicationInviteState creditApplicationInviteState = (CreditApplicationInviteState) other;
        return this.shouldShowInviteBanner == creditApplicationInviteState.shouldShowInviteBanner && this.inSearchExperiment == creditApplicationInviteState.inSearchExperiment && this.inAccountExperiment == creditApplicationInviteState.inAccountExperiment && this.inInboxExperiment == creditApplicationInviteState.inInboxExperiment;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.shouldShowInviteBanner) * 31) + Boolean.hashCode(this.inSearchExperiment)) * 31) + Boolean.hashCode(this.inAccountExperiment)) * 31) + Boolean.hashCode(this.inInboxExperiment);
    }

    public String toString() {
        return "CreditApplicationInviteState(shouldShowInviteBanner=" + this.shouldShowInviteBanner + ", inSearchExperiment=" + this.inSearchExperiment + ", inAccountExperiment=" + this.inAccountExperiment + ", inInboxExperiment=" + this.inInboxExperiment + ")";
    }

    public CreditApplicationInviteState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.shouldShowInviteBanner = z;
        this.inSearchExperiment = z2;
        this.inAccountExperiment = z3;
        this.inInboxExperiment = z4;
    }

    public /* synthetic */ CreditApplicationInviteState(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    public final boolean getShouldShowInviteBanner() {
        return this.shouldShowInviteBanner;
    }

    public final boolean getInSearchExperiment() {
        return this.inSearchExperiment;
    }

    public final boolean getInAccountExperiment() {
        return this.inAccountExperiment;
    }

    public final boolean getInInboxExperiment() {
        return this.inInboxExperiment;
    }
}
