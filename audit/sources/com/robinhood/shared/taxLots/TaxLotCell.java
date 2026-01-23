package com.robinhood.shared.taxLots;

import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.shared.taxLots.views.TaxLotDisplayCellState;
import com.robinhood.shared.taxLots.views.TaxLotTableHeaderCellState;
import com.robinhood.shared.taxLots.views.TaxLotTableInputCellState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsTable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/TaxLotCell;", "T", "Lcom/robinhood/android/generic/table/GenericCell;", "<init>", "()V", "HeaderCell", "DisplayCell", "InputCell", "Lcom/robinhood/shared/taxLots/TaxLotCell$DisplayCell;", "Lcom/robinhood/shared/taxLots/TaxLotCell$HeaderCell;", "Lcom/robinhood/shared/taxLots/TaxLotCell$InputCell;", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class TaxLotCell<T> implements GenericCell {
    public static final int $stable = 0;

    public /* synthetic */ TaxLotCell(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TaxLotCell() {
    }

    /* compiled from: TaxLotsTable.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/TaxLotCell$HeaderCell;", "T", "Lcom/robinhood/shared/taxLots/TaxLotCell;", "state", "Lcom/robinhood/shared/taxLots/views/TaxLotTableHeaderCellState;", "<init>", "(Lcom/robinhood/shared/taxLots/views/TaxLotTableHeaderCellState;)V", "getState", "()Lcom/robinhood/shared/taxLots/views/TaxLotTableHeaderCellState;", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HeaderCell<T> extends TaxLotCell<T> {
        public static final int $stable = 0;
        private final String key;
        private final int relativeWidth;
        private final TaxLotTableHeaderCellState state;

        public static /* synthetic */ HeaderCell copy$default(HeaderCell headerCell, TaxLotTableHeaderCellState taxLotTableHeaderCellState, int i, Object obj) {
            if ((i & 1) != 0) {
                taxLotTableHeaderCellState = headerCell.state;
            }
            return headerCell.copy(taxLotTableHeaderCellState);
        }

        /* renamed from: component1, reason: from getter */
        public final TaxLotTableHeaderCellState getState() {
            return this.state;
        }

        public final HeaderCell<T> copy(TaxLotTableHeaderCellState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new HeaderCell<>(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeaderCell) && Intrinsics.areEqual(this.state, ((HeaderCell) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "HeaderCell(state=" + this.state + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderCell(TaxLotTableHeaderCellState state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.key = "headerCell";
            this.relativeWidth = 1;
        }

        public final TaxLotTableHeaderCellState getState() {
            return this.state;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return this.relativeWidth;
        }
    }

    /* compiled from: TaxLotsTable.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0003J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/TaxLotCell$DisplayCell;", "T", "Lcom/robinhood/shared/taxLots/TaxLotCell;", "state", "Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState;", "<init>", "(Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState;)V", "getState", "()Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState;", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayCell<T> extends TaxLotCell<T> {
        public static final int $stable = BentoIcon4.$stable;
        private final String key;
        private final TaxLotDisplayCellState<T> state;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayCell copy$default(DisplayCell displayCell, TaxLotDisplayCellState taxLotDisplayCellState, int i, Object obj) {
            if ((i & 1) != 0) {
                taxLotDisplayCellState = displayCell.state;
            }
            return displayCell.copy(taxLotDisplayCellState);
        }

        public final TaxLotDisplayCellState<T> component1() {
            return this.state;
        }

        public final DisplayCell<T> copy(TaxLotDisplayCellState<T> state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new DisplayCell<>(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayCell) && Intrinsics.areEqual(this.state, ((DisplayCell) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "DisplayCell(state=" + this.state + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayCell(TaxLotDisplayCellState<T> state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.key = "displayCell";
        }

        public final TaxLotDisplayCellState<T> getState() {
            return this.state;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            String text;
            int length = this.state.getPrimaryTextContent().getText().length();
            TaxLotDisplayCellState.TextContent<T> secondaryTextContent = this.state.getSecondaryTextContent();
            return Math.max(length, (secondaryTextContent == null || (text = secondaryTextContent.getText()) == null) ? 0 : text.length());
        }
    }

    /* compiled from: TaxLotsTable.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0003J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/TaxLotCell$InputCell;", "T", "Lcom/robinhood/shared/taxLots/TaxLotCell;", "state", "Lcom/robinhood/shared/taxLots/views/TaxLotTableInputCellState;", "<init>", "(Lcom/robinhood/shared/taxLots/views/TaxLotTableInputCellState;)V", "getState", "()Lcom/robinhood/shared/taxLots/views/TaxLotTableInputCellState;", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputCell<T> extends TaxLotCell<T> {
        public static final int $stable = 0;
        private final String key;
        private final int relativeWidth;
        private final TaxLotTableInputCellState<T> state;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InputCell copy$default(InputCell inputCell, TaxLotTableInputCellState taxLotTableInputCellState, int i, Object obj) {
            if ((i & 1) != 0) {
                taxLotTableInputCellState = inputCell.state;
            }
            return inputCell.copy(taxLotTableInputCellState);
        }

        public final TaxLotTableInputCellState<T> component1() {
            return this.state;
        }

        public final InputCell<T> copy(TaxLotTableInputCellState<T> state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new InputCell<>(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InputCell) && Intrinsics.areEqual(this.state, ((InputCell) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "InputCell(state=" + this.state + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputCell(TaxLotTableInputCellState<T> state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.key = "inputCell";
            this.relativeWidth = 1;
        }

        public final TaxLotTableInputCellState<T> getState() {
            return this.state;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return this.relativeWidth;
        }
    }
}
