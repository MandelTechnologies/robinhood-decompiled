package com.robinhood.shared.taxLots.views;

import com.robinhood.android.generic.table.GenericCell;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TaxLotLoadingTable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell;", "Lcom/robinhood/android/generic/table/GenericCell;", "<init>", "()V", "HeaderCell", "DisplayCell", "InputCell", "Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell$DisplayCell;", "Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell$HeaderCell;", "Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell$InputCell;", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.taxLots.views.TaxLotLoadingCell, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class TaxLotLoadingTable3 implements GenericCell {
    public static final int $stable = 0;

    public /* synthetic */ TaxLotLoadingTable3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TaxLotLoadingTable3() {
    }

    /* compiled from: TaxLotLoadingTable.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell$HeaderCell;", "Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "equals", "", "other", "", "hashCode", "toString", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.taxLots.views.TaxLotLoadingCell$HeaderCell */
    public static final /* data */ class HeaderCell extends TaxLotLoadingTable3 {
        public static final int $stable = 0;
        public static final HeaderCell INSTANCE = new HeaderCell();
        private static final String key = "headerCell";
        private static final int relativeWidth = 1;

        public boolean equals(Object other) {
            return this == other || (other instanceof HeaderCell);
        }

        public int hashCode() {
            return -1120974886;
        }

        public String toString() {
            return "HeaderCell";
        }

        private HeaderCell() {
            super(null);
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return relativeWidth;
        }
    }

    /* compiled from: TaxLotLoadingTable.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\rHÖ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell$DisplayCell;", "Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell;", "showSecondaryText", "", "<init>", "(Z)V", "getShowSecondaryText", "()Z", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "copy", "equals", "other", "", "hashCode", "toString", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.taxLots.views.TaxLotLoadingCell$DisplayCell, reason: from toString */
    public static final /* data */ class DisplayCell extends TaxLotLoadingTable3 {
        public static final int $stable = 0;
        private final String key;
        private final int relativeWidth;
        private final boolean showSecondaryText;

        public DisplayCell() {
            this(false, 1, null);
        }

        public static /* synthetic */ DisplayCell copy$default(DisplayCell displayCell, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = displayCell.showSecondaryText;
            }
            return displayCell.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowSecondaryText() {
            return this.showSecondaryText;
        }

        public final DisplayCell copy(boolean showSecondaryText) {
            return new DisplayCell(showSecondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayCell) && this.showSecondaryText == ((DisplayCell) other).showSecondaryText;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showSecondaryText);
        }

        public String toString() {
            return "DisplayCell(showSecondaryText=" + this.showSecondaryText + ")";
        }

        public DisplayCell(boolean z) {
            super(null);
            this.showSecondaryText = z;
            this.key = "displayCell";
            this.relativeWidth = 2;
        }

        public /* synthetic */ DisplayCell(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getShowSecondaryText() {
            return this.showSecondaryText;
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

    /* compiled from: TaxLotLoadingTable.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell$InputCell;", "Lcom/robinhood/shared/taxLots/views/TaxLotLoadingCell;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "equals", "", "other", "", "hashCode", "toString", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.taxLots.views.TaxLotLoadingCell$InputCell */
    public static final /* data */ class InputCell extends TaxLotLoadingTable3 {
        public static final int $stable = 0;
        public static final InputCell INSTANCE = new InputCell();
        private static final String key = "inputCell";
        private static final int relativeWidth = 2;

        public boolean equals(Object other) {
            return this == other || (other instanceof InputCell);
        }

        public int hashCode() {
            return -610241375;
        }

        public String toString() {
            return "InputCell";
        }

        private InputCell() {
            super(null);
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return relativeWidth;
        }
    }
}
