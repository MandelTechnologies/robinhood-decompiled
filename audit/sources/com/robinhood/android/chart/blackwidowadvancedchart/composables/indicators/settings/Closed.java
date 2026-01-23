package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import kotlin.Metadata;

/* compiled from: IndicatorSettingsScreen.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/Closed;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/SettingsKeyboardState;", "<init>", "()V", "showDelimiter", "", "getShowDelimiter", "()Z", "showMinusSign", "getShowMinusSign", "equals", "other", "", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Closed implements SettingsKeyboardState {
    public static final int $stable = 0;
    public static final Closed INSTANCE = new Closed();
    private static final boolean showDelimiter = false;
    private static final boolean showMinusSign = false;

    public boolean equals(Object other) {
        return this == other || (other instanceof Closed);
    }

    public int hashCode() {
        return -366784858;
    }

    public String toString() {
        return "Closed";
    }

    private Closed() {
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.SettingsKeyboardState
    public boolean getShowDelimiter() {
        return showDelimiter;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.SettingsKeyboardState
    public boolean getShowMinusSign() {
        return showMinusSign;
    }
}
