package com.robinhood.android.generic.table;

import com.robinhood.android.generic.table.GenericCell;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericChildRow;", "T", "Lcom/robinhood/android/generic/table/GenericCell;", "", "cells", "", "onClickAction", "Lcom/robinhood/android/generic/table/GenericTableAction;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/generic/table/GenericTableAction;)V", "getCells", "()Ljava/util/List;", "getOnClickAction", "()Lcom/robinhood/android/generic/table/GenericTableAction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GenericChildRow<T extends GenericCell> {
    public static final int $stable = 8;
    private final List<T> cells;
    private final GenericTableAction onClickAction;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericChildRow copy$default(GenericChildRow genericChildRow, List list, GenericTableAction genericTableAction, int i, Object obj) {
        if ((i & 1) != 0) {
            list = genericChildRow.cells;
        }
        if ((i & 2) != 0) {
            genericTableAction = genericChildRow.onClickAction;
        }
        return genericChildRow.copy(list, genericTableAction);
    }

    public final List<T> component1() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final GenericTableAction getOnClickAction() {
        return this.onClickAction;
    }

    public final GenericChildRow<T> copy(List<? extends T> cells, GenericTableAction onClickAction) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new GenericChildRow<>(cells, onClickAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericChildRow)) {
            return false;
        }
        GenericChildRow genericChildRow = (GenericChildRow) other;
        return Intrinsics.areEqual(this.cells, genericChildRow.cells) && Intrinsics.areEqual(this.onClickAction, genericChildRow.onClickAction);
    }

    public int hashCode() {
        int iHashCode = this.cells.hashCode() * 31;
        GenericTableAction genericTableAction = this.onClickAction;
        return iHashCode + (genericTableAction == null ? 0 : genericTableAction.hashCode());
    }

    public String toString() {
        return "GenericChildRow(cells=" + this.cells + ", onClickAction=" + this.onClickAction + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericChildRow(List<? extends T> cells, GenericTableAction genericTableAction) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.onClickAction = genericTableAction;
    }

    public /* synthetic */ GenericChildRow(List list, GenericTableAction genericTableAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : genericTableAction);
    }

    public final List<T> getCells() {
        return this.cells;
    }

    public final GenericTableAction getOnClickAction() {
        return this.onClickAction;
    }
}
