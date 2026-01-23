package com.robinhood.android.settings.p254ui.recurring.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/CtaState;", "", "type", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType;", "isActive", "", "isToggleable", "endInvestmentState", "Lcom/robinhood/android/settings/ui/recurring/detail/EndInvestmentState;", "<init>", "(Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType;ZZLcom/robinhood/android/settings/ui/recurring/detail/EndInvestmentState;)V", "getType", "()Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsType;", "()Z", "getEndInvestmentState", "()Lcom/robinhood/android/settings/ui/recurring/detail/EndInvestmentState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CtaState {
    public static final int $stable = 8;
    private final EndInvestmentState endInvestmentState;
    private final boolean isActive;
    private final boolean isToggleable;
    private final InvestmentScheduleSettingsType type;

    public static /* synthetic */ CtaState copy$default(CtaState ctaState, InvestmentScheduleSettingsType investmentScheduleSettingsType, boolean z, boolean z2, EndInvestmentState endInvestmentState, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentScheduleSettingsType = ctaState.type;
        }
        if ((i & 2) != 0) {
            z = ctaState.isActive;
        }
        if ((i & 4) != 0) {
            z2 = ctaState.isToggleable;
        }
        if ((i & 8) != 0) {
            endInvestmentState = ctaState.endInvestmentState;
        }
        return ctaState.copy(investmentScheduleSettingsType, z, z2, endInvestmentState);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentScheduleSettingsType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsToggleable() {
        return this.isToggleable;
    }

    /* renamed from: component4, reason: from getter */
    public final EndInvestmentState getEndInvestmentState() {
        return this.endInvestmentState;
    }

    public final CtaState copy(InvestmentScheduleSettingsType type2, boolean isActive, boolean isToggleable, EndInvestmentState endInvestmentState) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new CtaState(type2, isActive, isToggleable, endInvestmentState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CtaState)) {
            return false;
        }
        CtaState ctaState = (CtaState) other;
        return Intrinsics.areEqual(this.type, ctaState.type) && this.isActive == ctaState.isActive && this.isToggleable == ctaState.isToggleable && Intrinsics.areEqual(this.endInvestmentState, ctaState.endInvestmentState);
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.isToggleable)) * 31;
        EndInvestmentState endInvestmentState = this.endInvestmentState;
        return iHashCode + (endInvestmentState == null ? 0 : endInvestmentState.hashCode());
    }

    public String toString() {
        return "CtaState(type=" + this.type + ", isActive=" + this.isActive + ", isToggleable=" + this.isToggleable + ", endInvestmentState=" + this.endInvestmentState + ")";
    }

    public CtaState(InvestmentScheduleSettingsType type2, boolean z, boolean z2, EndInvestmentState endInvestmentState) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.isActive = z;
        this.isToggleable = z2;
        this.endInvestmentState = endInvestmentState;
    }

    public final InvestmentScheduleSettingsType getType() {
        return this.type;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isToggleable() {
        return this.isToggleable;
    }

    public final EndInvestmentState getEndInvestmentState() {
        return this.endInvestmentState;
    }
}
