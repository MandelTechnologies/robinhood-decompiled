package com.robinhood.android.equities.taxlots.table;

import androidx.compose.p011ui.state.ToggleableState;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotShareAndCheckBoxCell.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003Jy\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001J\u0013\u00102\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\bHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/TaxLotsShareAndCheckBoxCell;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "lotId", "", "initialValue", "canEdit", "", "rowIndex", "", "originalShareValue", "Ljava/math/BigDecimal;", "onNumberChange", "Lkotlin/Function1;", "", "toggleableState", "Landroidx/compose/ui/state/ToggleableState;", "displayMaxLotAlert", "displayIntraDayAlert", "maxNumberOfTaxLots", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/math/BigDecimal;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/state/ToggleableState;ZZI)V", "getLotId", "()Ljava/lang/String;", "getInitialValue", "getCanEdit", "()Z", "getRowIndex", "()I", "getOriginalShareValue", "()Ljava/math/BigDecimal;", "getOnNumberChange", "()Lkotlin/jvm/functions/Function1;", "getToggleableState", "()Landroidx/compose/ui/state/ToggleableState;", "getDisplayMaxLotAlert", "getDisplayIntraDayAlert", "getMaxNumberOfTaxLots", "relativeWidth", "getRelativeWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaxLotsShareAndCheckBoxCell extends TaxLotsTableHelpers4 {
    public static final int $stable = 8;
    private final boolean canEdit;
    private final boolean displayIntraDayAlert;
    private final boolean displayMaxLotAlert;
    private final String initialValue;
    private final String lotId;
    private final int maxNumberOfTaxLots;
    private final Function1<BigDecimal, Unit> onNumberChange;
    private final BigDecimal originalShareValue;
    private final int relativeWidth;
    private final int rowIndex;
    private final ToggleableState toggleableState;

    public static /* synthetic */ TaxLotsShareAndCheckBoxCell copy$default(TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, String str, String str2, boolean z, int i, BigDecimal bigDecimal, Function1 function1, ToggleableState toggleableState, boolean z2, boolean z3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = taxLotsShareAndCheckBoxCell.lotId;
        }
        if ((i3 & 2) != 0) {
            str2 = taxLotsShareAndCheckBoxCell.initialValue;
        }
        if ((i3 & 4) != 0) {
            z = taxLotsShareAndCheckBoxCell.canEdit;
        }
        if ((i3 & 8) != 0) {
            i = taxLotsShareAndCheckBoxCell.rowIndex;
        }
        if ((i3 & 16) != 0) {
            bigDecimal = taxLotsShareAndCheckBoxCell.originalShareValue;
        }
        if ((i3 & 32) != 0) {
            function1 = taxLotsShareAndCheckBoxCell.onNumberChange;
        }
        if ((i3 & 64) != 0) {
            toggleableState = taxLotsShareAndCheckBoxCell.toggleableState;
        }
        if ((i3 & 128) != 0) {
            z2 = taxLotsShareAndCheckBoxCell.displayMaxLotAlert;
        }
        if ((i3 & 256) != 0) {
            z3 = taxLotsShareAndCheckBoxCell.displayIntraDayAlert;
        }
        if ((i3 & 512) != 0) {
            i2 = taxLotsShareAndCheckBoxCell.maxNumberOfTaxLots;
        }
        boolean z4 = z3;
        int i4 = i2;
        ToggleableState toggleableState2 = toggleableState;
        boolean z5 = z2;
        BigDecimal bigDecimal2 = bigDecimal;
        Function1 function12 = function1;
        return taxLotsShareAndCheckBoxCell.copy(str, str2, z, i, bigDecimal2, function12, toggleableState2, z5, z4, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLotId() {
        return this.lotId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getMaxNumberOfTaxLots() {
        return this.maxNumberOfTaxLots;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitialValue() {
        return this.initialValue;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanEdit() {
        return this.canEdit;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRowIndex() {
        return this.rowIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getOriginalShareValue() {
        return this.originalShareValue;
    }

    public final Function1<BigDecimal, Unit> component6() {
        return this.onNumberChange;
    }

    /* renamed from: component7, reason: from getter */
    public final ToggleableState getToggleableState() {
        return this.toggleableState;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDisplayMaxLotAlert() {
        return this.displayMaxLotAlert;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getDisplayIntraDayAlert() {
        return this.displayIntraDayAlert;
    }

    public final TaxLotsShareAndCheckBoxCell copy(String lotId, String initialValue, boolean canEdit, int rowIndex, BigDecimal originalShareValue, Function1<? super BigDecimal, Unit> onNumberChange, ToggleableState toggleableState, boolean displayMaxLotAlert, boolean displayIntraDayAlert, int maxNumberOfTaxLots) {
        Intrinsics.checkNotNullParameter(lotId, "lotId");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(originalShareValue, "originalShareValue");
        Intrinsics.checkNotNullParameter(onNumberChange, "onNumberChange");
        Intrinsics.checkNotNullParameter(toggleableState, "toggleableState");
        return new TaxLotsShareAndCheckBoxCell(lotId, initialValue, canEdit, rowIndex, originalShareValue, onNumberChange, toggleableState, displayMaxLotAlert, displayIntraDayAlert, maxNumberOfTaxLots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotsShareAndCheckBoxCell)) {
            return false;
        }
        TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell = (TaxLotsShareAndCheckBoxCell) other;
        return Intrinsics.areEqual(this.lotId, taxLotsShareAndCheckBoxCell.lotId) && Intrinsics.areEqual(this.initialValue, taxLotsShareAndCheckBoxCell.initialValue) && this.canEdit == taxLotsShareAndCheckBoxCell.canEdit && this.rowIndex == taxLotsShareAndCheckBoxCell.rowIndex && Intrinsics.areEqual(this.originalShareValue, taxLotsShareAndCheckBoxCell.originalShareValue) && Intrinsics.areEqual(this.onNumberChange, taxLotsShareAndCheckBoxCell.onNumberChange) && this.toggleableState == taxLotsShareAndCheckBoxCell.toggleableState && this.displayMaxLotAlert == taxLotsShareAndCheckBoxCell.displayMaxLotAlert && this.displayIntraDayAlert == taxLotsShareAndCheckBoxCell.displayIntraDayAlert && this.maxNumberOfTaxLots == taxLotsShareAndCheckBoxCell.maxNumberOfTaxLots;
    }

    public int hashCode() {
        return (((((((((((((((((this.lotId.hashCode() * 31) + this.initialValue.hashCode()) * 31) + Boolean.hashCode(this.canEdit)) * 31) + Integer.hashCode(this.rowIndex)) * 31) + this.originalShareValue.hashCode()) * 31) + this.onNumberChange.hashCode()) * 31) + this.toggleableState.hashCode()) * 31) + Boolean.hashCode(this.displayMaxLotAlert)) * 31) + Boolean.hashCode(this.displayIntraDayAlert)) * 31) + Integer.hashCode(this.maxNumberOfTaxLots);
    }

    public String toString() {
        return "TaxLotsShareAndCheckBoxCell(lotId=" + this.lotId + ", initialValue=" + this.initialValue + ", canEdit=" + this.canEdit + ", rowIndex=" + this.rowIndex + ", originalShareValue=" + this.originalShareValue + ", onNumberChange=" + this.onNumberChange + ", toggleableState=" + this.toggleableState + ", displayMaxLotAlert=" + this.displayMaxLotAlert + ", displayIntraDayAlert=" + this.displayIntraDayAlert + ", maxNumberOfTaxLots=" + this.maxNumberOfTaxLots + ")";
    }

    public final String getLotId() {
        return this.lotId;
    }

    public final String getInitialValue() {
        return this.initialValue;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final BigDecimal getOriginalShareValue() {
        return this.originalShareValue;
    }

    public final Function1<BigDecimal, Unit> getOnNumberChange() {
        return this.onNumberChange;
    }

    public final ToggleableState getToggleableState() {
        return this.toggleableState;
    }

    public final boolean getDisplayMaxLotAlert() {
        return this.displayMaxLotAlert;
    }

    public final boolean getDisplayIntraDayAlert() {
        return this.displayIntraDayAlert;
    }

    public final int getMaxNumberOfTaxLots() {
        return this.maxNumberOfTaxLots;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxLotsShareAndCheckBoxCell(String lotId, String initialValue, boolean z, int i, BigDecimal originalShareValue, Function1<? super BigDecimal, Unit> onNumberChange, ToggleableState toggleableState, boolean z2, boolean z3, int i2) {
        Intrinsics.checkNotNullParameter(lotId, "lotId");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(originalShareValue, "originalShareValue");
        Intrinsics.checkNotNullParameter(onNumberChange, "onNumberChange");
        Intrinsics.checkNotNullParameter(toggleableState, "toggleableState");
        this.lotId = lotId;
        this.initialValue = initialValue;
        this.canEdit = z;
        this.rowIndex = i;
        this.originalShareValue = originalShareValue;
        this.onNumberChange = onNumberChange;
        this.toggleableState = toggleableState;
        this.displayMaxLotAlert = z2;
        this.displayIntraDayAlert = z3;
        this.maxNumberOfTaxLots = i2;
        this.relativeWidth = 1;
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public int getRelativeWidth() {
        return this.relativeWidth;
    }
}
