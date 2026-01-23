package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: DisplayCurrencySwitcherEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;", "", "ShowFtux", "ExpandFxRates", "ShowNoFxRatesDialog", "ShowStaleFxRatesDialog", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ExpandFxRates;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ShowFtux;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ShowNoFxRatesDialog;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ShowStaleFxRatesDialog;", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface DisplayCurrencySwitcherEvent {

    /* compiled from: DisplayCurrencySwitcherEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ShowFtux;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFtux implements DisplayCurrencySwitcherEvent {
        public static final int $stable = 0;
        public static final ShowFtux INSTANCE = new ShowFtux();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowFtux);
        }

        public int hashCode() {
            return 1804232506;
        }

        public String toString() {
            return "ShowFtux";
        }

        private ShowFtux() {
        }
    }

    /* compiled from: DisplayCurrencySwitcherEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ExpandFxRates;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExpandFxRates implements DisplayCurrencySwitcherEvent {
        public static final int $stable = 0;
        public static final ExpandFxRates INSTANCE = new ExpandFxRates();

        public boolean equals(Object other) {
            return this == other || (other instanceof ExpandFxRates);
        }

        public int hashCode() {
            return 1650920123;
        }

        public String toString() {
            return "ExpandFxRates";
        }

        private ExpandFxRates() {
        }
    }

    /* compiled from: DisplayCurrencySwitcherEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ShowNoFxRatesDialog;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowNoFxRatesDialog implements DisplayCurrencySwitcherEvent {
        public static final int $stable = 0;
        public static final ShowNoFxRatesDialog INSTANCE = new ShowNoFxRatesDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowNoFxRatesDialog);
        }

        public int hashCode() {
            return 1456506719;
        }

        public String toString() {
            return "ShowNoFxRatesDialog";
        }

        private ShowNoFxRatesDialog() {
        }
    }

    /* compiled from: DisplayCurrencySwitcherEvent.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ShowStaleFxRatesDialog;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;", "", "formattedFxRate", "j$/time/Instant", "lastUpdated", "<init>", "(Ljava/lang/String;Lj$/time/Instant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "copy", "(Ljava/lang/String;Lj$/time/Instant;)Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent$ShowStaleFxRatesDialog;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormattedFxRate", "Lj$/time/Instant;", "getLastUpdated", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowStaleFxRatesDialog implements DisplayCurrencySwitcherEvent {
        public static final int $stable = 8;
        private final String formattedFxRate;
        private final Instant lastUpdated;

        public static /* synthetic */ ShowStaleFxRatesDialog copy$default(ShowStaleFxRatesDialog showStaleFxRatesDialog, String str, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showStaleFxRatesDialog.formattedFxRate;
            }
            if ((i & 2) != 0) {
                instant = showStaleFxRatesDialog.lastUpdated;
            }
            return showStaleFxRatesDialog.copy(str, instant);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFormattedFxRate() {
            return this.formattedFxRate;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getLastUpdated() {
            return this.lastUpdated;
        }

        public final ShowStaleFxRatesDialog copy(String formattedFxRate, Instant lastUpdated) {
            Intrinsics.checkNotNullParameter(formattedFxRate, "formattedFxRate");
            Intrinsics.checkNotNullParameter(lastUpdated, "lastUpdated");
            return new ShowStaleFxRatesDialog(formattedFxRate, lastUpdated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowStaleFxRatesDialog)) {
                return false;
            }
            ShowStaleFxRatesDialog showStaleFxRatesDialog = (ShowStaleFxRatesDialog) other;
            return Intrinsics.areEqual(this.formattedFxRate, showStaleFxRatesDialog.formattedFxRate) && Intrinsics.areEqual(this.lastUpdated, showStaleFxRatesDialog.lastUpdated);
        }

        public int hashCode() {
            return (this.formattedFxRate.hashCode() * 31) + this.lastUpdated.hashCode();
        }

        public String toString() {
            return "ShowStaleFxRatesDialog(formattedFxRate=" + this.formattedFxRate + ", lastUpdated=" + this.lastUpdated + ")";
        }

        public ShowStaleFxRatesDialog(String formattedFxRate, Instant lastUpdated) {
            Intrinsics.checkNotNullParameter(formattedFxRate, "formattedFxRate");
            Intrinsics.checkNotNullParameter(lastUpdated, "lastUpdated");
            this.formattedFxRate = formattedFxRate;
            this.lastUpdated = lastUpdated;
        }

        public final String getFormattedFxRate() {
            return this.formattedFxRate;
        }

        public final Instant getLastUpdated() {
            return this.lastUpdated;
        }
    }
}
