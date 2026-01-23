package com.robinhood.android.optionschain.chainsettings;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsTableMetricViewState;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsMetricViewState;", "enabledTableRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsTableMetricRowViewState;", "disabledTableRows", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getEnabledTableRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisabledTableRows", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainSettingsTableMetricViewState implements OptionChainSettingsViewState5 {
    public static final int $stable = 0;
    private final ImmutableList<OptionChainSettingsTableMetricRowViewState> disabledTableRows;
    private final ImmutableList<OptionChainSettingsTableMetricRowViewState> enabledTableRows;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionChainSettingsTableMetricViewState copy$default(OptionChainSettingsTableMetricViewState optionChainSettingsTableMetricViewState, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = optionChainSettingsTableMetricViewState.enabledTableRows;
        }
        if ((i & 2) != 0) {
            immutableList2 = optionChainSettingsTableMetricViewState.disabledTableRows;
        }
        return optionChainSettingsTableMetricViewState.copy(immutableList, immutableList2);
    }

    public final ImmutableList<OptionChainSettingsTableMetricRowViewState> component1() {
        return this.enabledTableRows;
    }

    public final ImmutableList<OptionChainSettingsTableMetricRowViewState> component2() {
        return this.disabledTableRows;
    }

    public final OptionChainSettingsTableMetricViewState copy(ImmutableList<OptionChainSettingsTableMetricRowViewState> enabledTableRows, ImmutableList<OptionChainSettingsTableMetricRowViewState> disabledTableRows) {
        Intrinsics.checkNotNullParameter(enabledTableRows, "enabledTableRows");
        Intrinsics.checkNotNullParameter(disabledTableRows, "disabledTableRows");
        return new OptionChainSettingsTableMetricViewState(enabledTableRows, disabledTableRows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainSettingsTableMetricViewState)) {
            return false;
        }
        OptionChainSettingsTableMetricViewState optionChainSettingsTableMetricViewState = (OptionChainSettingsTableMetricViewState) other;
        return Intrinsics.areEqual(this.enabledTableRows, optionChainSettingsTableMetricViewState.enabledTableRows) && Intrinsics.areEqual(this.disabledTableRows, optionChainSettingsTableMetricViewState.disabledTableRows);
    }

    public int hashCode() {
        return (this.enabledTableRows.hashCode() * 31) + this.disabledTableRows.hashCode();
    }

    public String toString() {
        return "OptionChainSettingsTableMetricViewState(enabledTableRows=" + this.enabledTableRows + ", disabledTableRows=" + this.disabledTableRows + ")";
    }

    public OptionChainSettingsTableMetricViewState(ImmutableList<OptionChainSettingsTableMetricRowViewState> enabledTableRows, ImmutableList<OptionChainSettingsTableMetricRowViewState> disabledTableRows) {
        Intrinsics.checkNotNullParameter(enabledTableRows, "enabledTableRows");
        Intrinsics.checkNotNullParameter(disabledTableRows, "disabledTableRows");
        this.enabledTableRows = enabledTableRows;
        this.disabledTableRows = disabledTableRows;
    }

    public final ImmutableList<OptionChainSettingsTableMetricRowViewState> getEnabledTableRows() {
        return this.enabledTableRows;
    }

    public final ImmutableList<OptionChainSettingsTableMetricRowViewState> getDisabledTableRows() {
        return this.disabledTableRows;
    }
}
