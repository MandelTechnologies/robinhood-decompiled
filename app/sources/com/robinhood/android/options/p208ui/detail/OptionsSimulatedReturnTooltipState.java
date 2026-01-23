package com.robinhood.android.options.p208ui.detail;

import com.robinhood.models.p320db.OptionTooltip;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageBodyState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "", "tooltip", "Lcom/robinhood/models/db/OptionTooltip;", "pageIndex", "", "accountNumber", "", "<init>", "(Lcom/robinhood/models/db/OptionTooltip;ILjava/lang/String;)V", "getTooltip", "()Lcom/robinhood/models/db/OptionTooltip;", "getPageIndex", "()I", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnTooltipState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final int pageIndex;
    private final OptionTooltip tooltip;

    public static /* synthetic */ OptionsSimulatedReturnTooltipState copy$default(OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState, OptionTooltip optionTooltip, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            optionTooltip = optionsSimulatedReturnTooltipState.tooltip;
        }
        if ((i2 & 2) != 0) {
            i = optionsSimulatedReturnTooltipState.pageIndex;
        }
        if ((i2 & 4) != 0) {
            str = optionsSimulatedReturnTooltipState.accountNumber;
        }
        return optionsSimulatedReturnTooltipState.copy(optionTooltip, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionTooltip getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionsSimulatedReturnTooltipState copy(OptionTooltip tooltip, int pageIndex, String accountNumber) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new OptionsSimulatedReturnTooltipState(tooltip, pageIndex, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnTooltipState)) {
            return false;
        }
        OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState = (OptionsSimulatedReturnTooltipState) other;
        return Intrinsics.areEqual(this.tooltip, optionsSimulatedReturnTooltipState.tooltip) && this.pageIndex == optionsSimulatedReturnTooltipState.pageIndex && Intrinsics.areEqual(this.accountNumber, optionsSimulatedReturnTooltipState.accountNumber);
    }

    public int hashCode() {
        return (((this.tooltip.hashCode() * 31) + Integer.hashCode(this.pageIndex)) * 31) + this.accountNumber.hashCode();
    }

    public String toString() {
        return "OptionsSimulatedReturnTooltipState(tooltip=" + this.tooltip + ", pageIndex=" + this.pageIndex + ", accountNumber=" + this.accountNumber + ")";
    }

    public OptionsSimulatedReturnTooltipState(OptionTooltip tooltip, int i, String accountNumber) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.tooltip = tooltip;
        this.pageIndex = i;
        this.accountNumber = accountNumber;
    }

    public final OptionTooltip getTooltip() {
        return this.tooltip;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
