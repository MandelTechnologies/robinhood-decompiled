package com.robinhood.android.equities.taxlots.table;

import androidx.compose.p011ui.state.ToggleableState;
import equity_trading_tax_lots.proto.p460v1.SelectionAction;
import equity_trading_tax_lots.proto.p460v1.TaxLotInformation;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectableTaxLot.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J'\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0018\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "", "taxLot", "Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "numberOfShares", "Ljava/math/BigDecimal;", "selectedState", "Landroidx/compose/ui/state/ToggleableState;", "<init>", "(Lequity_trading_tax_lots/proto/v1/TaxLotInformation;Ljava/math/BigDecimal;Landroidx/compose/ui/state/ToggleableState;)V", "getTaxLot", "()Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "getNumberOfShares", "()Ljava/math/BigDecimal;", "getSelectedState", "()Landroidx/compose/ui/state/ToggleableState;", "isSelected", "", "()Z", "id", "", "getId", "()Ljava/lang/String;", "isSelectable", "invalidNumberOfShares", "getInvalidNumberOfShares", "sharesEdited", "getSharesEdited", "checkboxAction", "Lequity_trading_tax_lots/proto/v1/SelectionAction;", "getCheckboxAction", "()Lequity_trading_tax_lots/proto/v1/SelectionAction;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectableTaxLot {
    public static final int $stable = 8;
    private final String id;
    private final BigDecimal numberOfShares;
    private final ToggleableState selectedState;
    private final TaxLotInformation taxLot;

    /* compiled from: SelectableTaxLot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f174On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ SelectableTaxLot copy$default(SelectableTaxLot selectableTaxLot, TaxLotInformation taxLotInformation, BigDecimal bigDecimal, ToggleableState toggleableState, int i, Object obj) {
        if ((i & 1) != 0) {
            taxLotInformation = selectableTaxLot.taxLot;
        }
        if ((i & 2) != 0) {
            bigDecimal = selectableTaxLot.numberOfShares;
        }
        if ((i & 4) != 0) {
            toggleableState = selectableTaxLot.selectedState;
        }
        return selectableTaxLot.copy(taxLotInformation, bigDecimal, toggleableState);
    }

    /* renamed from: component1, reason: from getter */
    public final TaxLotInformation getTaxLot() {
        return this.taxLot;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getNumberOfShares() {
        return this.numberOfShares;
    }

    /* renamed from: component3, reason: from getter */
    public final ToggleableState getSelectedState() {
        return this.selectedState;
    }

    public final SelectableTaxLot copy(TaxLotInformation taxLot, BigDecimal numberOfShares, ToggleableState selectedState) {
        Intrinsics.checkNotNullParameter(taxLot, "taxLot");
        Intrinsics.checkNotNullParameter(numberOfShares, "numberOfShares");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        return new SelectableTaxLot(taxLot, numberOfShares, selectedState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableTaxLot)) {
            return false;
        }
        SelectableTaxLot selectableTaxLot = (SelectableTaxLot) other;
        return Intrinsics.areEqual(this.taxLot, selectableTaxLot.taxLot) && Intrinsics.areEqual(this.numberOfShares, selectableTaxLot.numberOfShares) && this.selectedState == selectableTaxLot.selectedState;
    }

    public int hashCode() {
        return (((this.taxLot.hashCode() * 31) + this.numberOfShares.hashCode()) * 31) + this.selectedState.hashCode();
    }

    public String toString() {
        return "SelectableTaxLot(taxLot=" + this.taxLot + ", numberOfShares=" + this.numberOfShares + ", selectedState=" + this.selectedState + ")";
    }

    public SelectableTaxLot(TaxLotInformation taxLot, BigDecimal numberOfShares, ToggleableState selectedState) {
        Intrinsics.checkNotNullParameter(taxLot, "taxLot");
        Intrinsics.checkNotNullParameter(numberOfShares, "numberOfShares");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        this.taxLot = taxLot;
        this.numberOfShares = numberOfShares;
        this.selectedState = selectedState;
        this.id = taxLot.getId();
    }

    public final TaxLotInformation getTaxLot() {
        return this.taxLot;
    }

    public /* synthetic */ SelectableTaxLot(TaxLotInformation taxLotInformation, BigDecimal bigDecimal, ToggleableState toggleableState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(taxLotInformation, (i & 2) != 0 ? new BigDecimal(taxLotInformation.getAvailable_shares()) : bigDecimal, (i & 4) != 0 ? ToggleableState.Off : toggleableState);
    }

    public final BigDecimal getNumberOfShares() {
        return this.numberOfShares;
    }

    public final ToggleableState getSelectedState() {
        return this.selectedState;
    }

    public final boolean isSelected() {
        return this.selectedState != ToggleableState.Off;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean isSelectable() {
        return this.taxLot.getIs_selectable();
    }

    public final boolean getInvalidNumberOfShares() {
        return this.numberOfShares.compareTo(new BigDecimal(this.taxLot.getAvailable_shares())) > 0;
    }

    public final boolean getSharesEdited() {
        return !Intrinsics.areEqual(this.numberOfShares, new BigDecimal(this.taxLot.getAvailable_shares()));
    }

    public final SelectionAction getCheckboxAction() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.selectedState.ordinal()];
        if (i == 1) {
            return SelectionAction.DESELECT;
        }
        if (i == 2) {
            return SelectionAction.SELECT;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SelectionAction.SELECT;
    }
}
