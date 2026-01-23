package com.robinhood.android.generic.table;

import com.robinhood.android.generic.table.GenericCell;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003JU\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericRow;", "T", "Lcom/robinhood/android/generic/table/GenericCell;", "", "key", "", "cells", "", "rowExpanded", "", "childRows", "Lcom/robinhood/android/generic/table/GenericChildRow;", "onClickAction", "Lcom/robinhood/android/generic/table/GenericTableAction;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/robinhood/android/generic/table/GenericTableAction;)V", "getKey", "()Ljava/lang/String;", "getCells", "()Ljava/util/List;", "getRowExpanded", "()Z", "getChildRows", "getOnClickAction", "()Lcom/robinhood/android/generic/table/GenericTableAction;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GenericRow<T extends GenericCell> {
    public static final int $stable = 8;
    private final List<T> cells;
    private final List<GenericChildRow<T>> childRows;
    private final String key;
    private final GenericTableAction onClickAction;
    private final boolean rowExpanded;

    public static /* synthetic */ GenericRow copy$default(GenericRow genericRow, String str, List list, boolean z, List list2, GenericTableAction genericTableAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericRow.key;
        }
        if ((i & 2) != 0) {
            list = genericRow.cells;
        }
        if ((i & 4) != 0) {
            z = genericRow.rowExpanded;
        }
        if ((i & 8) != 0) {
            list2 = genericRow.childRows;
        }
        if ((i & 16) != 0) {
            genericTableAction = genericRow.onClickAction;
        }
        GenericTableAction genericTableAction2 = genericTableAction;
        boolean z2 = z;
        return genericRow.copy(str, list, z2, list2, genericTableAction2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final List<T> component2() {
        return this.cells;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRowExpanded() {
        return this.rowExpanded;
    }

    public final List<GenericChildRow<T>> component4() {
        return this.childRows;
    }

    /* renamed from: component5, reason: from getter */
    public final GenericTableAction getOnClickAction() {
        return this.onClickAction;
    }

    public final GenericRow<T> copy(String key, List<? extends T> cells, boolean rowExpanded, List<GenericChildRow<T>> childRows, GenericTableAction onClickAction) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(childRows, "childRows");
        return new GenericRow<>(key, cells, rowExpanded, childRows, onClickAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericRow)) {
            return false;
        }
        GenericRow genericRow = (GenericRow) other;
        return Intrinsics.areEqual(this.key, genericRow.key) && Intrinsics.areEqual(this.cells, genericRow.cells) && this.rowExpanded == genericRow.rowExpanded && Intrinsics.areEqual(this.childRows, genericRow.childRows) && Intrinsics.areEqual(this.onClickAction, genericRow.onClickAction);
    }

    public int hashCode() {
        int iHashCode = ((((((this.key.hashCode() * 31) + this.cells.hashCode()) * 31) + Boolean.hashCode(this.rowExpanded)) * 31) + this.childRows.hashCode()) * 31;
        GenericTableAction genericTableAction = this.onClickAction;
        return iHashCode + (genericTableAction == null ? 0 : genericTableAction.hashCode());
    }

    public String toString() {
        return "GenericRow(key=" + this.key + ", cells=" + this.cells + ", rowExpanded=" + this.rowExpanded + ", childRows=" + this.childRows + ", onClickAction=" + this.onClickAction + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericRow(String key, List<? extends T> cells, boolean z, List<GenericChildRow<T>> childRows, GenericTableAction genericTableAction) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(childRows, "childRows");
        this.key = key;
        this.cells = cells;
        this.rowExpanded = z;
        this.childRows = childRows;
        this.onClickAction = genericTableAction;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<T> getCells() {
        return this.cells;
    }

    public final boolean getRowExpanded() {
        return this.rowExpanded;
    }

    public /* synthetic */ GenericRow(String str, List list, boolean z, List list2, GenericTableAction genericTableAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : genericTableAction);
    }

    public final List<GenericChildRow<T>> getChildRows() {
        return this.childRows;
    }

    public final GenericTableAction getOnClickAction() {
        return this.onClickAction;
    }
}
