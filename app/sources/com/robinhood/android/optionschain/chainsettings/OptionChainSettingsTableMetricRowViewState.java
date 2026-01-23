package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsTableMetricRowViewState;", "", "metric", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "enabled", "", "<init>", "(Lcom/robinhood/models/db/OptionSideBySideChainMetric;Z)V", "getMetric", "()Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainSettingsTableMetricRowViewState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final OptionSideBySideChainMetric metric;

    public static /* synthetic */ OptionChainSettingsTableMetricRowViewState copy$default(OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState, OptionSideBySideChainMetric optionSideBySideChainMetric, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            optionSideBySideChainMetric = optionChainSettingsTableMetricRowViewState.metric;
        }
        if ((i & 2) != 0) {
            z = optionChainSettingsTableMetricRowViewState.enabled;
        }
        return optionChainSettingsTableMetricRowViewState.copy(optionSideBySideChainMetric, z);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionSideBySideChainMetric getMetric() {
        return this.metric;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final OptionChainSettingsTableMetricRowViewState copy(OptionSideBySideChainMetric metric, boolean enabled) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        return new OptionChainSettingsTableMetricRowViewState(metric, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainSettingsTableMetricRowViewState)) {
            return false;
        }
        OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState = (OptionChainSettingsTableMetricRowViewState) other;
        return this.metric == optionChainSettingsTableMetricRowViewState.metric && this.enabled == optionChainSettingsTableMetricRowViewState.enabled;
    }

    public int hashCode() {
        return (this.metric.hashCode() * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "OptionChainSettingsTableMetricRowViewState(metric=" + this.metric + ", enabled=" + this.enabled + ")";
    }

    public OptionChainSettingsTableMetricRowViewState(OptionSideBySideChainMetric metric, boolean z) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        this.metric = metric;
        this.enabled = z;
    }

    public final OptionSideBySideChainMetric getMetric() {
        return this.metric;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
