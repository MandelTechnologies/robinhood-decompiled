package com.robinhood.shared.order.type.timeInForce;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SelectTimeInForceViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceViewState;", "", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceViewState$RowState;", "selectedTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/OrderTimeInForce;)V", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RowState", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SelectTimeInForceViewState {
    public static final int $stable = StringResource.$stable;
    private final ImmutableList<RowState> rows;
    private final OrderTimeInForce selectedTimeInForce;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectTimeInForceViewState copy$default(SelectTimeInForceViewState selectTimeInForceViewState, ImmutableList immutableList, OrderTimeInForce orderTimeInForce, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = selectTimeInForceViewState.rows;
        }
        if ((i & 2) != 0) {
            orderTimeInForce = selectTimeInForceViewState.selectedTimeInForce;
        }
        return selectTimeInForceViewState.copy(immutableList, orderTimeInForce);
    }

    public final ImmutableList<RowState> component1() {
        return this.rows;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    public final SelectTimeInForceViewState copy(ImmutableList<RowState> rows, OrderTimeInForce selectedTimeInForce) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        return new SelectTimeInForceViewState(rows, selectedTimeInForce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectTimeInForceViewState)) {
            return false;
        }
        SelectTimeInForceViewState selectTimeInForceViewState = (SelectTimeInForceViewState) other;
        return Intrinsics.areEqual(this.rows, selectTimeInForceViewState.rows) && this.selectedTimeInForce == selectTimeInForceViewState.selectedTimeInForce;
    }

    public int hashCode() {
        return (this.rows.hashCode() * 31) + this.selectedTimeInForce.hashCode();
    }

    public String toString() {
        return "SelectTimeInForceViewState(rows=" + this.rows + ", selectedTimeInForce=" + this.selectedTimeInForce + ")";
    }

    public SelectTimeInForceViewState(ImmutableList<RowState> rows, OrderTimeInForce selectedTimeInForce) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        this.rows = rows;
        this.selectedTimeInForce = selectedTimeInForce;
    }

    public final ImmutableList<RowState> getRows() {
        return this.rows;
    }

    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    /* compiled from: SelectTimeInForceViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceViewState$RowState;", "", "timeInForceValue", "Lcom/robinhood/models/db/OrderTimeInForce;", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "isSelected", "", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getTimeInForceValue", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RowState {
        public static final int $stable = StringResource.$stable;
        private final StringResource description;
        private final boolean isSelected;
        private final OrderTimeInForce timeInForceValue;
        private final StringResource title;

        public static /* synthetic */ RowState copy$default(RowState rowState, OrderTimeInForce orderTimeInForce, StringResource stringResource, StringResource stringResource2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                orderTimeInForce = rowState.timeInForceValue;
            }
            if ((i & 2) != 0) {
                stringResource = rowState.title;
            }
            if ((i & 4) != 0) {
                stringResource2 = rowState.description;
            }
            if ((i & 8) != 0) {
                z = rowState.isSelected;
            }
            return rowState.copy(orderTimeInForce, stringResource, stringResource2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTimeInForce getTimeInForceValue() {
            return this.timeInForceValue;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final RowState copy(OrderTimeInForce timeInForceValue, StringResource title, StringResource description, boolean isSelected) {
            Intrinsics.checkNotNullParameter(timeInForceValue, "timeInForceValue");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new RowState(timeInForceValue, title, description, isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowState)) {
                return false;
            }
            RowState rowState = (RowState) other;
            return this.timeInForceValue == rowState.timeInForceValue && Intrinsics.areEqual(this.title, rowState.title) && Intrinsics.areEqual(this.description, rowState.description) && this.isSelected == rowState.isSelected;
        }

        public int hashCode() {
            return (((((this.timeInForceValue.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return "RowState(timeInForceValue=" + this.timeInForceValue + ", title=" + this.title + ", description=" + this.description + ", isSelected=" + this.isSelected + ")";
        }

        public RowState(OrderTimeInForce timeInForceValue, StringResource title, StringResource description, boolean z) {
            Intrinsics.checkNotNullParameter(timeInForceValue, "timeInForceValue");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.timeInForceValue = timeInForceValue;
            this.title = title;
            this.description = description;
            this.isSelected = z;
        }

        public final OrderTimeInForce getTimeInForceValue() {
            return this.timeInForceValue;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getDescription() {
            return this.description;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }
    }
}
