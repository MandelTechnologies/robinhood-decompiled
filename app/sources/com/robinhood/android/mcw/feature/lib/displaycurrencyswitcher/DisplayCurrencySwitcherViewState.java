package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.p325fx.p326db.DisplayCurrency;
import com.robinhood.models.p325fx.p326db.McwDisplayCurrencies;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.rosetta.common.Currency;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DisplayCurrencySwitcherViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÂ\u0003JI\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;", "", "mcwDisplayCurrencies", "Lcom/robinhood/models/fx/db/McwDisplayCurrencies;", "mcwFxRates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/fx/db/McwFxRate;", "selectedCurrency", "Lcom/robinhood/rosetta/common/Currency;", "location", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherLocation;", "hasSeenFxSwitcherFtux", "", "<init>", "(Lcom/robinhood/models/fx/db/McwDisplayCurrencies;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/rosetta/common/Currency;Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherLocation;Z)V", "getMcwDisplayCurrencies", "()Lcom/robinhood/models/fx/db/McwDisplayCurrencies;", "getSelectedCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getLocation", "()Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherLocation;", "currencySymbols", "", "", "getCurrencySymbols", "()Ljava/util/List;", "canShowFxSwitcherDropdown", "getCanShowFxSwitcherDropdown", "()Z", "formattedDisplayCurrencies", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/FormattedDisplayCurrency;", "getFormattedDisplayCurrencies", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class DisplayCurrencySwitcherViewState {
    public static final int $stable = 8;
    private final boolean canShowFxSwitcherDropdown;
    private final List<String> currencySymbols;
    private final boolean hasSeenFxSwitcherFtux;
    private final DisplayCurrencySwitcherLocation location;
    private final McwDisplayCurrencies mcwDisplayCurrencies;
    private final ImmutableList<McwFxRate> mcwFxRates;
    private final Currency selectedCurrency;

    public DisplayCurrencySwitcherViewState() {
        this(null, null, null, null, false, 31, null);
    }

    private final ImmutableList<McwFxRate> component2() {
        return this.mcwFxRates;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getHasSeenFxSwitcherFtux() {
        return this.hasSeenFxSwitcherFtux;
    }

    public static /* synthetic */ DisplayCurrencySwitcherViewState copy$default(DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState, McwDisplayCurrencies mcwDisplayCurrencies, ImmutableList immutableList, Currency currency, DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            mcwDisplayCurrencies = displayCurrencySwitcherViewState.mcwDisplayCurrencies;
        }
        if ((i & 2) != 0) {
            immutableList = displayCurrencySwitcherViewState.mcwFxRates;
        }
        if ((i & 4) != 0) {
            currency = displayCurrencySwitcherViewState.selectedCurrency;
        }
        if ((i & 8) != 0) {
            displayCurrencySwitcherLocation = displayCurrencySwitcherViewState.location;
        }
        if ((i & 16) != 0) {
            z = displayCurrencySwitcherViewState.hasSeenFxSwitcherFtux;
        }
        boolean z2 = z;
        Currency currency2 = currency;
        return displayCurrencySwitcherViewState.copy(mcwDisplayCurrencies, immutableList, currency2, displayCurrencySwitcherLocation, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final McwDisplayCurrencies getMcwDisplayCurrencies() {
        return this.mcwDisplayCurrencies;
    }

    /* renamed from: component3, reason: from getter */
    public final Currency getSelectedCurrency() {
        return this.selectedCurrency;
    }

    /* renamed from: component4, reason: from getter */
    public final DisplayCurrencySwitcherLocation getLocation() {
        return this.location;
    }

    public final DisplayCurrencySwitcherViewState copy(McwDisplayCurrencies mcwDisplayCurrencies, ImmutableList<McwFxRate> mcwFxRates, Currency selectedCurrency, DisplayCurrencySwitcherLocation location, boolean hasSeenFxSwitcherFtux) {
        return new DisplayCurrencySwitcherViewState(mcwDisplayCurrencies, mcwFxRates, selectedCurrency, location, hasSeenFxSwitcherFtux);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayCurrencySwitcherViewState)) {
            return false;
        }
        DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState = (DisplayCurrencySwitcherViewState) other;
        return Intrinsics.areEqual(this.mcwDisplayCurrencies, displayCurrencySwitcherViewState.mcwDisplayCurrencies) && Intrinsics.areEqual(this.mcwFxRates, displayCurrencySwitcherViewState.mcwFxRates) && this.selectedCurrency == displayCurrencySwitcherViewState.selectedCurrency && this.location == displayCurrencySwitcherViewState.location && this.hasSeenFxSwitcherFtux == displayCurrencySwitcherViewState.hasSeenFxSwitcherFtux;
    }

    public int hashCode() {
        McwDisplayCurrencies mcwDisplayCurrencies = this.mcwDisplayCurrencies;
        int iHashCode = (mcwDisplayCurrencies == null ? 0 : mcwDisplayCurrencies.hashCode()) * 31;
        ImmutableList<McwFxRate> immutableList = this.mcwFxRates;
        int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        Currency currency = this.selectedCurrency;
        int iHashCode3 = (iHashCode2 + (currency == null ? 0 : currency.hashCode())) * 31;
        DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation = this.location;
        return ((iHashCode3 + (displayCurrencySwitcherLocation != null ? displayCurrencySwitcherLocation.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasSeenFxSwitcherFtux);
    }

    public String toString() {
        return "DisplayCurrencySwitcherViewState(mcwDisplayCurrencies=" + this.mcwDisplayCurrencies + ", mcwFxRates=" + this.mcwFxRates + ", selectedCurrency=" + this.selectedCurrency + ", location=" + this.location + ", hasSeenFxSwitcherFtux=" + this.hasSeenFxSwitcherFtux + ")";
    }

    public DisplayCurrencySwitcherViewState(McwDisplayCurrencies mcwDisplayCurrencies, ImmutableList<McwFxRate> immutableList, Currency currency, DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation, boolean z) {
        ArrayList arrayList;
        List<DisplayCurrency> displayCurrencies;
        this.mcwDisplayCurrencies = mcwDisplayCurrencies;
        this.mcwFxRates = immutableList;
        this.selectedCurrency = currency;
        this.location = displayCurrencySwitcherLocation;
        this.hasSeenFxSwitcherFtux = z;
        if (mcwDisplayCurrencies == null || (displayCurrencies = mcwDisplayCurrencies.getDisplayCurrencies()) == null) {
            arrayList = null;
        } else {
            List<DisplayCurrency> list = displayCurrencies;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((DisplayCurrency) it.next()).getSymbol());
            }
        }
        this.currencySymbols = arrayList;
        this.canShowFxSwitcherDropdown = this.location != DisplayCurrencySwitcherLocation.HOME_TAB || this.hasSeenFxSwitcherFtux;
    }

    public /* synthetic */ DisplayCurrencySwitcherViewState(McwDisplayCurrencies mcwDisplayCurrencies, ImmutableList immutableList, Currency currency, DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mcwDisplayCurrencies, (i & 2) != 0 ? null : immutableList, (i & 4) != 0 ? null : currency, (i & 8) != 0 ? null : displayCurrencySwitcherLocation, (i & 16) != 0 ? false : z);
    }

    public final McwDisplayCurrencies getMcwDisplayCurrencies() {
        return this.mcwDisplayCurrencies;
    }

    public final Currency getSelectedCurrency() {
        return this.selectedCurrency;
    }

    public final DisplayCurrencySwitcherLocation getLocation() {
        return this.location;
    }

    public final List<String> getCurrencySymbols() {
        return this.currencySymbols;
    }

    public final boolean getCanShowFxSwitcherDropdown() {
        return this.canShowFxSwitcherDropdown;
    }

    public final List<FormattedDisplayCurrency> getFormattedDisplayCurrencies() {
        McwFxRate next;
        BigDecimal markPrice;
        BigDecimal scale;
        McwDisplayCurrencies mcwDisplayCurrencies = this.mcwDisplayCurrencies;
        if (mcwDisplayCurrencies == null || this.mcwFxRates == null || this.selectedCurrency == null || this.location == null) {
            return null;
        }
        List<DisplayCurrency> displayCurrencies = mcwDisplayCurrencies.getDisplayCurrencies();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(displayCurrencies, 10));
        for (DisplayCurrency displayCurrency : displayCurrencies) {
            Currency currency = displayCurrency.getCurrency();
            String label = displayCurrency.getLabel();
            boolean z = displayCurrency.getCurrency() == this.selectedCurrency;
            String strSubstring = StringsKt.substring(displayCurrency.getLabel(), new PrimitiveRanges2(0, 2));
            StringBuilder sb = new StringBuilder();
            String strSubstring2 = displayCurrency.getLabel().substring(3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb.append(strSubstring2);
            sb.append(PlaceholderUtils.XXShortPlaceholderText);
            Iterator<McwFxRate> it = this.mcwFxRates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getSymbol(), displayCurrency.getSymbol())) {
                    break;
                }
            }
            McwFxRate mcwFxRate = next;
            sb.append((mcwFxRate == null || (markPrice = mcwFxRate.getMarkPrice()) == null || (scale = markPrice.setScale(4, RoundingMode.HALF_UP)) == null) ? null : scale.toPlainString());
            Unit unit = Unit.INSTANCE;
            arrayList.add(new FormattedDisplayCurrency(currency, label, z, strSubstring, sb.toString(), displayCurrency.getCurrencyCodeDisplay()));
        }
        return arrayList;
    }
}
