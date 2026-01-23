package com.robinhood.android.settings.p254ui.recurring.detail;

import kotlin.Metadata;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/FrequencyRowState;", "", "metaTextRes", "", "enabled", "", "<init>", "(IZ)V", "getMetaTextRes", "()I", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FrequencyRowState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final int metaTextRes;

    public static /* synthetic */ FrequencyRowState copy$default(FrequencyRowState frequencyRowState, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = frequencyRowState.metaTextRes;
        }
        if ((i2 & 2) != 0) {
            z = frequencyRowState.enabled;
        }
        return frequencyRowState.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMetaTextRes() {
        return this.metaTextRes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final FrequencyRowState copy(int metaTextRes, boolean enabled) {
        return new FrequencyRowState(metaTextRes, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequencyRowState)) {
            return false;
        }
        FrequencyRowState frequencyRowState = (FrequencyRowState) other;
        return this.metaTextRes == frequencyRowState.metaTextRes && this.enabled == frequencyRowState.enabled;
    }

    public int hashCode() {
        return (Integer.hashCode(this.metaTextRes) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "FrequencyRowState(metaTextRes=" + this.metaTextRes + ", enabled=" + this.enabled + ")";
    }

    public FrequencyRowState(int i, boolean z) {
        this.metaTextRes = i;
        this.enabled = z;
    }

    public final int getMetaTextRes() {
        return this.metaTextRes;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
