package com.robinhood.android.trade.options.profitloss;

import android.text.SpannedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/CurrentProfitLoss;", "", "profitLossString", "Landroid/text/SpannedString;", "scrubbedByUser", "", "profitLossDirection", "Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;", "<init>", "(Landroid/text/SpannedString;ZLcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;)V", "getProfitLossString", "()Landroid/text/SpannedString;", "getScrubbedByUser", "()Z", "getProfitLossDirection", "()Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CurrentProfitLoss {
    public static final int $stable = 8;
    private final ProfitLossDirection profitLossDirection;
    private final SpannedString profitLossString;
    private final boolean scrubbedByUser;

    public static /* synthetic */ CurrentProfitLoss copy$default(CurrentProfitLoss currentProfitLoss, SpannedString spannedString, boolean z, ProfitLossDirection profitLossDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            spannedString = currentProfitLoss.profitLossString;
        }
        if ((i & 2) != 0) {
            z = currentProfitLoss.scrubbedByUser;
        }
        if ((i & 4) != 0) {
            profitLossDirection = currentProfitLoss.profitLossDirection;
        }
        return currentProfitLoss.copy(spannedString, z, profitLossDirection);
    }

    /* renamed from: component1, reason: from getter */
    public final SpannedString getProfitLossString() {
        return this.profitLossString;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getScrubbedByUser() {
        return this.scrubbedByUser;
    }

    /* renamed from: component3, reason: from getter */
    public final ProfitLossDirection getProfitLossDirection() {
        return this.profitLossDirection;
    }

    public final CurrentProfitLoss copy(SpannedString profitLossString, boolean scrubbedByUser, ProfitLossDirection profitLossDirection) {
        Intrinsics.checkNotNullParameter(profitLossString, "profitLossString");
        Intrinsics.checkNotNullParameter(profitLossDirection, "profitLossDirection");
        return new CurrentProfitLoss(profitLossString, scrubbedByUser, profitLossDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentProfitLoss)) {
            return false;
        }
        CurrentProfitLoss currentProfitLoss = (CurrentProfitLoss) other;
        return Intrinsics.areEqual(this.profitLossString, currentProfitLoss.profitLossString) && this.scrubbedByUser == currentProfitLoss.scrubbedByUser && this.profitLossDirection == currentProfitLoss.profitLossDirection;
    }

    public int hashCode() {
        return (((this.profitLossString.hashCode() * 31) + Boolean.hashCode(this.scrubbedByUser)) * 31) + this.profitLossDirection.hashCode();
    }

    public String toString() {
        SpannedString spannedString = this.profitLossString;
        return "CurrentProfitLoss(profitLossString=" + ((Object) spannedString) + ", scrubbedByUser=" + this.scrubbedByUser + ", profitLossDirection=" + this.profitLossDirection + ")";
    }

    public CurrentProfitLoss(SpannedString profitLossString, boolean z, ProfitLossDirection profitLossDirection) {
        Intrinsics.checkNotNullParameter(profitLossString, "profitLossString");
        Intrinsics.checkNotNullParameter(profitLossDirection, "profitLossDirection");
        this.profitLossString = profitLossString;
        this.scrubbedByUser = z;
        this.profitLossDirection = profitLossDirection;
    }

    public final SpannedString getProfitLossString() {
        return this.profitLossString;
    }

    public final boolean getScrubbedByUser() {
        return this.scrubbedByUser;
    }

    public final ProfitLossDirection getProfitLossDirection() {
        return this.profitLossDirection;
    }
}
