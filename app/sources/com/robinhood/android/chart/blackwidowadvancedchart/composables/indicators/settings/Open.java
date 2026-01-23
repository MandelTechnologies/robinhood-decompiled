package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IndicatorSettingsScreen.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/Open;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/SettingsKeyboardState;", "showDelimiter", "", "showMinusSign", "<init>", "(ZZ)V", "getShowDelimiter", "()Z", "getShowMinusSign", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Open implements SettingsKeyboardState {
    public static final int $stable = 0;
    private final boolean showDelimiter;
    private final boolean showMinusSign;

    /* JADX WARN: Illegal instructions before constructor call */
    public Open() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ Open copy$default(Open open, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = open.showDelimiter;
        }
        if ((i & 2) != 0) {
            z2 = open.showMinusSign;
        }
        return open.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowDelimiter() {
        return this.showDelimiter;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowMinusSign() {
        return this.showMinusSign;
    }

    public final Open copy(boolean showDelimiter, boolean showMinusSign) {
        return new Open(showDelimiter, showMinusSign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Open)) {
            return false;
        }
        Open open = (Open) other;
        return this.showDelimiter == open.showDelimiter && this.showMinusSign == open.showMinusSign;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.showDelimiter) * 31) + Boolean.hashCode(this.showMinusSign);
    }

    public String toString() {
        return "Open(showDelimiter=" + this.showDelimiter + ", showMinusSign=" + this.showMinusSign + ")";
    }

    public Open(boolean z, boolean z2) {
        this.showDelimiter = z;
        this.showMinusSign = z2;
    }

    public /* synthetic */ Open(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.SettingsKeyboardState
    public boolean getShowDelimiter() {
        return this.showDelimiter;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.SettingsKeyboardState
    public boolean getShowMinusSign() {
        return this.showMinusSign;
    }
}
